
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedirtystuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thedirtystuff.block.WorkstationBlock;
import net.mcreator.thedirtystuff.block.TobaccoSeedsBlock;
import net.mcreator.thedirtystuff.block.OpiumSeedsBlock;
import net.mcreator.thedirtystuff.block.MortarAndPestleBlock;
import net.mcreator.thedirtystuff.block.EphedraSeedsBlock;
import net.mcreator.thedirtystuff.block.CocaineSeedsBlock;
import net.mcreator.thedirtystuff.block.CannabisSeedsBlock;
import net.mcreator.thedirtystuff.block.BoilingFlaskBlock;
import net.mcreator.thedirtystuff.TheDirtyStuffMod;

public class TheDirtyStuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheDirtyStuffMod.MODID);
	public static final RegistryObject<Block> TOBACCO_SEEDS = REGISTRY.register("tobacco_seeds", () -> new TobaccoSeedsBlock());
	public static final RegistryObject<Block> CANNABIS_SEEDS = REGISTRY.register("cannabis_seeds", () -> new CannabisSeedsBlock());
	public static final RegistryObject<Block> COCAINE_SEEDS = REGISTRY.register("cocaine_seeds", () -> new CocaineSeedsBlock());
	public static final RegistryObject<Block> OPIUM_SEEDS = REGISTRY.register("opium_seeds", () -> new OpiumSeedsBlock());
	public static final RegistryObject<Block> EPHEDRA_SEEDS = REGISTRY.register("ephedra_seeds", () -> new EphedraSeedsBlock());
	public static final RegistryObject<Block> WORKSTATION = REGISTRY.register("workstation", () -> new WorkstationBlock());
	public static final RegistryObject<Block> MORTAR_AND_PESTLE = REGISTRY.register("mortar_and_pestle", () -> new MortarAndPestleBlock());
	public static final RegistryObject<Block> BOILING_FLASK = REGISTRY.register("boiling_flask", () -> new BoilingFlaskBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
