
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcpp.minecraftplusplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcpp.minecraftplusplus.item.NetheriteHammerItem;
import net.mcpp.minecraftplusplus.item.IronHammerItem;
import net.mcpp.minecraftplusplus.item.DiamondHammerItem;
import net.mcpp.minecraftplusplus.MinecraftplusplusMod;

public class MinecraftplusplusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftplusplusMod.MODID);
	public static final RegistryObject<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", () -> new IronHammerItem());
	public static final RegistryObject<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", () -> new DiamondHammerItem());
	public static final RegistryObject<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", () -> new NetheriteHammerItem());
}
