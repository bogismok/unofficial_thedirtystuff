
package net.mcreator.thedirtystuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.thedirtystuff.init.TheDirtyStuffModTabs;

public class TobaccoLeafItem extends Item {
	public TobaccoLeafItem() {
		super(new Item.Properties().tab(TheDirtyStuffModTabs.TAB_THE_DIRTY_STUFF_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
