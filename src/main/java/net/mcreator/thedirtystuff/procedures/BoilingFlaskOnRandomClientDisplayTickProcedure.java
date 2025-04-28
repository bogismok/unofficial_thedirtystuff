package net.mcreator.thedirtystuff.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class BoilingFlaskOnRandomClientDisplayTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 0) > 0) {
			world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0.5), (y + 1), (z + 0.5), (Mth.nextDouble(RandomSource.create(), 0, 0.01)), 0.05, (Mth.nextDouble(RandomSource.create(), 0, 0.01)));
			world.addParticle(ParticleTypes.FLAME, (x + 0.5), (y + 0.1), (z + 0.5), 0, 0, 0);
		}
	}
}
