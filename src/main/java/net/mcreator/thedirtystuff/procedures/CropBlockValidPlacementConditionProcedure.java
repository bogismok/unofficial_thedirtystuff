package net.mcreator.thedirtystuff.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CropBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + -1, z))).getBlock() == Blocks.FARMLAND) {
			return true;
		}
		return false;
	}
}
