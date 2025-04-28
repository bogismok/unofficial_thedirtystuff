
package net.mcreator.thedirtystuff.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.thedirtystuff.procedures.OpiumRightclickedProcedure;
import net.mcreator.thedirtystuff.init.TheDirtyStuffModTabs;

public class OpiumItem extends Item {
	public OpiumItem() {
		super(new Item.Properties().tab(TheDirtyStuffModTabs.TAB_THE_DIRTY_STUFF_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		OpiumRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}
