
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedirtystuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.thedirtystuff.world.inventory.WorkstationGUIMenu;
import net.mcreator.thedirtystuff.TheDirtyStuffMod;

public class TheDirtyStuffModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TheDirtyStuffMod.MODID);
	public static final RegistryObject<MenuType<WorkstationGUIMenu>> WORKSTATION_GUI = REGISTRY.register("workstation_gui", () -> IForgeMenuType.create(WorkstationGUIMenu::new));
}
