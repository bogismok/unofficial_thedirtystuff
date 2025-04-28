
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.thedirtystuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TheDirtyStuffModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(TheDirtyStuffModBlocks.TOBACCO_SEEDS.get()), 1, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(TheDirtyStuffModBlocks.COCAINE_SEEDS.get()), 1, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(TheDirtyStuffModBlocks.OPIUM_SEEDS.get()), 1, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(TheDirtyStuffModBlocks.EPHEDRA_SEEDS.get()), 1, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(TheDirtyStuffModBlocks.CANNABIS_SEEDS.get()), 1, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.TOBACCO_LEAFS_PACKAGE.get()),

					new ItemStack(Items.EMERALD, 2), 4, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.CANNABIS_BUDS_PACKAGE.get()),

					new ItemStack(Items.EMERALD, 4), 4, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.OPIUM_HEADS_PACKAGE.get()),

					new ItemStack(Items.EMERALD, 8), 4, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.COCAINE_LEAFS_PACKAGE.get()),

					new ItemStack(Items.EMERALD, 10), 4, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.EPHEDRA_STEMS_PACKAGE.get()),

					new ItemStack(Items.EMERALD), 8, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.CIGARETTE.get(), 12),

					new ItemStack(Items.EMERALD, 7), 4, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.CIGAR.get(), 4),

					new ItemStack(Items.EMERALD, 7), 2, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.SHEPHERD) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.JOINT.get()),

					new ItemStack(Items.EMERALD, 5), 3, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.OPIUM.get()),

					new ItemStack(Items.EMERALD, 5), 3, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.AMPHETAMINE.get()),

					new ItemStack(Items.EMERALD, 4), 2, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.METHAMPHETAMINE.get()),

					new ItemStack(Items.EMERALD, 4), 3, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(TheDirtyStuffModItems.COCAINE.get()),

					new ItemStack(Items.EMERALD, 8), 3, 5, 0.05f));
		}
	}
}
