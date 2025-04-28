
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedirtystuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.thedirtystuff.block.entity.WorkstationBlockEntity;
import net.mcreator.thedirtystuff.block.entity.TobaccoSeedsBlockEntity;
import net.mcreator.thedirtystuff.block.entity.OpiumSeedsBlockEntity;
import net.mcreator.thedirtystuff.block.entity.MortarAndPestleBlockEntity;
import net.mcreator.thedirtystuff.block.entity.EphedraSeedsBlockEntity;
import net.mcreator.thedirtystuff.block.entity.CocaineSeedsBlockEntity;
import net.mcreator.thedirtystuff.block.entity.CannabisSeedsBlockEntity;
import net.mcreator.thedirtystuff.block.entity.BoilingFlaskBlockEntity;
import net.mcreator.thedirtystuff.TheDirtyStuffMod;

public class TheDirtyStuffModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TheDirtyStuffMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TOBACCO_SEEDS = register("tobacco_seeds", TheDirtyStuffModBlocks.TOBACCO_SEEDS, TobaccoSeedsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CANNABIS_SEEDS = register("cannabis_seeds", TheDirtyStuffModBlocks.CANNABIS_SEEDS, CannabisSeedsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COCAINE_SEEDS = register("cocaine_seeds", TheDirtyStuffModBlocks.COCAINE_SEEDS, CocaineSeedsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPIUM_SEEDS = register("opium_seeds", TheDirtyStuffModBlocks.OPIUM_SEEDS, OpiumSeedsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EPHEDRA_SEEDS = register("ephedra_seeds", TheDirtyStuffModBlocks.EPHEDRA_SEEDS, EphedraSeedsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WORKSTATION = register("workstation", TheDirtyStuffModBlocks.WORKSTATION, WorkstationBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MORTAR_AND_PESTLE = register("mortar_and_pestle", TheDirtyStuffModBlocks.MORTAR_AND_PESTLE, MortarAndPestleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOILING_FLASK = register("boiling_flask", TheDirtyStuffModBlocks.BOILING_FLASK, BoilingFlaskBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
