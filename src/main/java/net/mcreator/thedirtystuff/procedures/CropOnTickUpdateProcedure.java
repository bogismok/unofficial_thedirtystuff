package net.mcreator.thedirtystuff.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class CropOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double f = 0;
		double f1 = 0;
		double i = 0;
		double j = 0;
		double random = 0;
		f = 1;
		i = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			j = -1;
			for (int index1 = 0; index1 < 3; index1++) {
				f1 = 0;
				if (((world.getBlockState(new BlockPos(x + i, y - 1, z + j))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip1
						? (world.getBlockState(new BlockPos(x + i, y - 1, z + j))).getValue(_getip1)
						: -1) < 7) {
					f1 = 1;
				} else if (((world.getBlockState(new BlockPos(x + i, y - 1, z + j))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip3
						? (world.getBlockState(new BlockPos(x + i, y - 1, z + j))).getValue(_getip3)
						: -1) == 7) {
					f1 = 3;
				}
				if (i != 0 || j != 0) {
					f1 = f1 / 4;
				}
				f = f + f1;
				j = j + 1;
			}
			i = i + 1;
		}
		if (((world.getBlockState(new BlockPos(x + -1, y, z))).getBlock() == blockstate.getBlock() || (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == blockstate.getBlock())
				&& ((world.getBlockState(new BlockPos(x, y, z + -1))).getBlock() == blockstate.getBlock() || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == blockstate.getBlock())) {
			f = f / 2;
		} else {
			if ((world.getBlockState(new BlockPos(x + -1, y, z + -1))).getBlock() == blockstate.getBlock() || (world.getBlockState(new BlockPos(x + 1, y, z + -1))).getBlock() == blockstate.getBlock()
					|| (world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == blockstate.getBlock() || (world.getBlockState(new BlockPos(x + -1, y, z + 1))).getBlock() == blockstate.getBlock()) {
				f = f / 2;
			}
		}
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip29 ? blockstate.getValue(_getip29) : -1) < 7 && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 9) {
			random = Mth.nextInt(RandomSource.create(), 0, (int) (25 / f));
			if (random == 0) {
				{
					int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip33 ? blockstate.getValue(_getip33) : -1) + 1);
					BlockPos _pos = new BlockPos(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
	}
}
