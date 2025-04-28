package net.mcreator.thedirtystuff.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.thedirtystuff.network.TheDirtyStuffModVariables;
import net.mcreator.thedirtystuff.init.TheDirtyStuffModItems;
import net.mcreator.thedirtystuff.TheDirtyStuffMod;

public class CocaineRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double ypos = 0;
		double zpos = 0;
		double xpos = 0;
		{
			boolean _setval = true;
			entity.getCapability(TheDirtyStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.cocaine = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		itemstack.shrink(1);
		if (!world.isClientSide()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 4));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0));
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(TheDirtyStuffModItems.COCAINE.get(), 900);
		TheDirtyStuffMod.queueServerWork(600, () -> {
			if ((entity.getCapability(TheDirtyStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TheDirtyStuffModVariables.PlayerVariables())).cocaine) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 300, 0));
			}
		});
	}
}
