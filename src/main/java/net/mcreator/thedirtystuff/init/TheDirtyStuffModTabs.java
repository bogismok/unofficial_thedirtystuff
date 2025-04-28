
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedirtystuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thedirtystuff.TheDirtyStuffMod;

public class TheDirtyStuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheDirtyStuffMod.MODID);
	public static final RegistryObject<CreativeModeTab> THE_DIRTY_STUFF_TAB = REGISTRY.register("the_dirty_stuff_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_dirty_stuff.the_dirty_stuff_tab")).icon(() -> new ItemStack(Blocks.DIRT)).displayItems((parameters, tabData) -> {
				tabData.accept(TheDirtyStuffModBlocks.TOBACCO_SEEDS.get().asItem());
				tabData.accept(TheDirtyStuffModBlocks.CANNABIS_SEEDS.get().asItem());
				tabData.accept(TheDirtyStuffModBlocks.COCAINE_SEEDS.get().asItem());
				tabData.accept(TheDirtyStuffModBlocks.OPIUM_SEEDS.get().asItem());
				tabData.accept(TheDirtyStuffModBlocks.EPHEDRA_SEEDS.get().asItem());
				tabData.accept(TheDirtyStuffModItems.TOBACCO_LEAF.get());
				tabData.accept(TheDirtyStuffModItems.TOBACCO_LEAFS.get());
				tabData.accept(TheDirtyStuffModItems.DRIED_TOBACCO_LEAF.get());
				tabData.accept(TheDirtyStuffModItems.TOBACCO.get());
				tabData.accept(TheDirtyStuffModItems.CANNABIS_BUD.get());
				tabData.accept(TheDirtyStuffModItems.CANNABIS.get());
				tabData.accept(TheDirtyStuffModItems.COCAINE_LEAFS.get());
				tabData.accept(TheDirtyStuffModItems.OPIUM_HEAD.get());
				tabData.accept(TheDirtyStuffModItems.OPIUM_BOTTLE.get());
				tabData.accept(TheDirtyStuffModItems.EPHEDRA_STEMS.get());
				tabData.accept(TheDirtyStuffModItems.EPHEDRA_BOTTLE.get());
				tabData.accept(TheDirtyStuffModItems.CIGARETTE.get());
				tabData.accept(TheDirtyStuffModItems.CIGAR.get());
				tabData.accept(TheDirtyStuffModItems.JOINT.get());
				tabData.accept(TheDirtyStuffModItems.COCAINE.get());
				tabData.accept(TheDirtyStuffModItems.OPIUM.get());
				tabData.accept(TheDirtyStuffModItems.AMPHETAMINE.get());
				tabData.accept(TheDirtyStuffModItems.METHAMPHETAMINE.get());
				tabData.accept(TheDirtyStuffModItems.TOBACCO_LEAFS_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.DRIED_TOBACCO_LEAFS_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.TOBACCO_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.CANNABIS_BUDS_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.CANNABIS_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.OPIUM_HEADS_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.OPIUM_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.COCAINE_LEAFS_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.COCAINE_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.EPHEDRA_STEMS_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.AMPHETAMINE_PACKAGE.get());
				tabData.accept(TheDirtyStuffModItems.METHAMPHETAMINE_PACKAGE.get());
				tabData.accept(TheDirtyStuffModBlocks.WORKSTATION.get().asItem());
				tabData.accept(TheDirtyStuffModBlocks.MORTAR_AND_PESTLE.get().asItem());
				tabData.accept(TheDirtyStuffModBlocks.BOILING_FLASK.get().asItem());
			})

					.build());
}
