
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedirtystuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thedirtystuff.item.TobaccoPackageItem;
import net.mcreator.thedirtystuff.item.TobaccoLeafsPackageItem;
import net.mcreator.thedirtystuff.item.TobaccoLeafsItem;
import net.mcreator.thedirtystuff.item.TobaccoLeafItem;
import net.mcreator.thedirtystuff.item.TobaccoItem;
import net.mcreator.thedirtystuff.item.OpiumPackageItem;
import net.mcreator.thedirtystuff.item.OpiumItem;
import net.mcreator.thedirtystuff.item.OpiumHeadsPackageItem;
import net.mcreator.thedirtystuff.item.OpiumHeadItem;
import net.mcreator.thedirtystuff.item.OpiumBottleItem;
import net.mcreator.thedirtystuff.item.MethamphetaminePackageItem;
import net.mcreator.thedirtystuff.item.MethamphetamineItem;
import net.mcreator.thedirtystuff.item.JointItem;
import net.mcreator.thedirtystuff.item.EphedraStemsPackageItem;
import net.mcreator.thedirtystuff.item.EphedraStemsItem;
import net.mcreator.thedirtystuff.item.EphedraBottleItem;
import net.mcreator.thedirtystuff.item.DriedTobaccoLeafsPackageItem;
import net.mcreator.thedirtystuff.item.DriedTobaccoLeafItem;
import net.mcreator.thedirtystuff.item.CocainePackageItem;
import net.mcreator.thedirtystuff.item.CocaineLeafsPackageItem;
import net.mcreator.thedirtystuff.item.CocaineLeafsItem;
import net.mcreator.thedirtystuff.item.CocaineItem;
import net.mcreator.thedirtystuff.item.CigaretteItem;
import net.mcreator.thedirtystuff.item.CigarItem;
import net.mcreator.thedirtystuff.item.CannabisPackageItem;
import net.mcreator.thedirtystuff.item.CannabisItem;
import net.mcreator.thedirtystuff.item.CannabisBudsPackageItem;
import net.mcreator.thedirtystuff.item.CannabisBudItem;
import net.mcreator.thedirtystuff.item.AmphetaminePackageItem;
import net.mcreator.thedirtystuff.item.AmphetamineItem;
import net.mcreator.thedirtystuff.TheDirtyStuffMod;

public class TheDirtyStuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheDirtyStuffMod.MODID);
	public static final RegistryObject<Item> TOBACCO_SEEDS = block(TheDirtyStuffModBlocks.TOBACCO_SEEDS);
	public static final RegistryObject<Item> CANNABIS_SEEDS = block(TheDirtyStuffModBlocks.CANNABIS_SEEDS);
	public static final RegistryObject<Item> COCAINE_SEEDS = block(TheDirtyStuffModBlocks.COCAINE_SEEDS);
	public static final RegistryObject<Item> OPIUM_SEEDS = block(TheDirtyStuffModBlocks.OPIUM_SEEDS);
	public static final RegistryObject<Item> EPHEDRA_SEEDS = block(TheDirtyStuffModBlocks.EPHEDRA_SEEDS);
	public static final RegistryObject<Item> TOBACCO_LEAF = REGISTRY.register("tobacco_leaf", () -> new TobaccoLeafItem());
	public static final RegistryObject<Item> TOBACCO_LEAFS = REGISTRY.register("tobacco_leafs", () -> new TobaccoLeafsItem());
	public static final RegistryObject<Item> DRIED_TOBACCO_LEAF = REGISTRY.register("dried_tobacco_leaf", () -> new DriedTobaccoLeafItem());
	public static final RegistryObject<Item> TOBACCO = REGISTRY.register("tobacco", () -> new TobaccoItem());
	public static final RegistryObject<Item> CANNABIS_BUD = REGISTRY.register("cannabis_bud", () -> new CannabisBudItem());
	public static final RegistryObject<Item> CANNABIS = REGISTRY.register("cannabis", () -> new CannabisItem());
	public static final RegistryObject<Item> COCAINE_LEAFS = REGISTRY.register("cocaine_leafs", () -> new CocaineLeafsItem());
	public static final RegistryObject<Item> OPIUM_HEAD = REGISTRY.register("opium_head", () -> new OpiumHeadItem());
	public static final RegistryObject<Item> OPIUM_BOTTLE = REGISTRY.register("opium_bottle", () -> new OpiumBottleItem());
	public static final RegistryObject<Item> EPHEDRA_STEMS = REGISTRY.register("ephedra_stems", () -> new EphedraStemsItem());
	public static final RegistryObject<Item> EPHEDRA_BOTTLE = REGISTRY.register("ephedra_bottle", () -> new EphedraBottleItem());
	public static final RegistryObject<Item> CIGARETTE = REGISTRY.register("cigarette", () -> new CigaretteItem());
	public static final RegistryObject<Item> CIGAR = REGISTRY.register("cigar", () -> new CigarItem());
	public static final RegistryObject<Item> JOINT = REGISTRY.register("joint", () -> new JointItem());
	public static final RegistryObject<Item> COCAINE = REGISTRY.register("cocaine", () -> new CocaineItem());
	public static final RegistryObject<Item> OPIUM = REGISTRY.register("opium", () -> new OpiumItem());
	public static final RegistryObject<Item> AMPHETAMINE = REGISTRY.register("amphetamine", () -> new AmphetamineItem());
	public static final RegistryObject<Item> METHAMPHETAMINE = REGISTRY.register("methamphetamine", () -> new MethamphetamineItem());
	public static final RegistryObject<Item> TOBACCO_LEAFS_PACKAGE = REGISTRY.register("tobacco_leafs_package", () -> new TobaccoLeafsPackageItem());
	public static final RegistryObject<Item> DRIED_TOBACCO_LEAFS_PACKAGE = REGISTRY.register("dried_tobacco_leafs_package", () -> new DriedTobaccoLeafsPackageItem());
	public static final RegistryObject<Item> TOBACCO_PACKAGE = REGISTRY.register("tobacco_package", () -> new TobaccoPackageItem());
	public static final RegistryObject<Item> CANNABIS_BUDS_PACKAGE = REGISTRY.register("cannabis_buds_package", () -> new CannabisBudsPackageItem());
	public static final RegistryObject<Item> CANNABIS_PACKAGE = REGISTRY.register("cannabis_package", () -> new CannabisPackageItem());
	public static final RegistryObject<Item> OPIUM_HEADS_PACKAGE = REGISTRY.register("opium_heads_package", () -> new OpiumHeadsPackageItem());
	public static final RegistryObject<Item> OPIUM_PACKAGE = REGISTRY.register("opium_package", () -> new OpiumPackageItem());
	public static final RegistryObject<Item> COCAINE_LEAFS_PACKAGE = REGISTRY.register("cocaine_leafs_package", () -> new CocaineLeafsPackageItem());
	public static final RegistryObject<Item> COCAINE_PACKAGE = REGISTRY.register("cocaine_package", () -> new CocainePackageItem());
	public static final RegistryObject<Item> EPHEDRA_STEMS_PACKAGE = REGISTRY.register("ephedra_stems_package", () -> new EphedraStemsPackageItem());
	public static final RegistryObject<Item> AMPHETAMINE_PACKAGE = REGISTRY.register("amphetamine_package", () -> new AmphetaminePackageItem());
	public static final RegistryObject<Item> METHAMPHETAMINE_PACKAGE = REGISTRY.register("methamphetamine_package", () -> new MethamphetaminePackageItem());
	public static final RegistryObject<Item> WORKSTATION = block(TheDirtyStuffModBlocks.WORKSTATION);
	public static final RegistryObject<Item> MORTAR_AND_PESTLE = block(TheDirtyStuffModBlocks.MORTAR_AND_PESTLE);
	public static final RegistryObject<Item> BOILING_FLASK = block(TheDirtyStuffModBlocks.BOILING_FLASK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
