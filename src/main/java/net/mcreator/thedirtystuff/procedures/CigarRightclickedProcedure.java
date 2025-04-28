package net.mcreator.thedirtystuff.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.thedirtystuff.network.TheDirtyStuffModVariables;
import net.mcreator.thedirtystuff.init.TheDirtyStuffModItems;
import net.mcreator.thedirtystuff.TheDirtyStuffMod;

public class CigarRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double ypos = 0;
		double zpos = 0;
		double xpos = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
			{
				boolean _setval = true;
				entity.getCapability(TheDirtyStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cigar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			itemstack.shrink(1);
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 4));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(TheDirtyStuffModItems.CIGAR.get(), 900);
			TheDirtyStuffMod.queueServerWork(600, () -> {
				if ((entity.getCapability(TheDirtyStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TheDirtyStuffModVariables.PlayerVariables())).cigar) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 300, 0));
				}
			});
			xpos = x + 0.4 * Math.sin(entity.getYRot() / ((-180) / Math.PI)) * Math.cos(entity.getXRot() / ((-180) / Math.PI));
			ypos = y + 0.4 * Math.sin(entity.getXRot() / ((-180) / Math.PI));
			zpos = z + 0.4 * Math.cos(entity.getYRot() / ((-180) / Math.PI)) * Math.cos(entity.getXRot() / ((-180) / Math.PI));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, xpos, (ypos + entity.getBbHeight()), zpos, 5, 0.05, 0.1, 0.05, 0.05);
			if (!world.isClientSide()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x + 0.5, y + entity.getBbHeight(), z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, (float) 0.2, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + entity.getBbHeight()), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, (float) 0.2, 1, false);
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You need to hold a flint and steel in your off hand"), true);
		}
	}
}
