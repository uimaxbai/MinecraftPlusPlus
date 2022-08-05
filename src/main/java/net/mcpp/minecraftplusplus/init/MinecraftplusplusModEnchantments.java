
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcpp.minecraftplusplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcpp.minecraftplusplus.enchantment.AutoSmeltEnchantmentEnchantment;
import net.mcpp.minecraftplusplus.MinecraftplusplusMod;

public class MinecraftplusplusModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MinecraftplusplusMod.MODID);
	public static final RegistryObject<Enchantment> AUTO_SMELT_ENCHANTMENT = REGISTRY.register("auto_smelt_enchantment",
			() -> new AutoSmeltEnchantmentEnchantment());
}
