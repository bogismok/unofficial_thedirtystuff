package net.mcreator.thedirtystuff.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;

public class CropCanBoneMealBeUsedOnThisBlockProcedure {
	public static boolean execute(BlockState blockstate) {
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) < 7) {
			return true;
		}
		return false;
	}
}
