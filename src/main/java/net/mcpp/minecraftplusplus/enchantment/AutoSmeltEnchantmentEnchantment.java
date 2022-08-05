
package net.mcpp.minecraftplusplus.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcpp.minecraftplusplus.init.MinecraftplusplusModItems;

public class AutoSmeltEnchantmentEnchantment extends Enchantment {
	public AutoSmeltEnchantmentEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == Items.WOODEN_PICKAXE)
			return true;
		if (stack.getItem() == Items.STONE_PICKAXE)
			return true;
		if (stack.getItem() == Items.IRON_PICKAXE)
			return true;
		if (stack.getItem() == Items.GOLDEN_PICKAXE)
			return true;
		if (stack.getItem() == Items.DIAMOND_PICKAXE)
			return true;
		if (stack.getItem() == Items.NETHERITE_PICKAXE)
			return true;
		if (stack.getItem() == MinecraftplusplusModItems.IRON_HAMMER.get())
			return true;
		if (stack.getItem() == MinecraftplusplusModItems.DIAMOND_HAMMER.get())
			return true;
		if (stack.getItem() == MinecraftplusplusModItems.NETHERITE_HAMMER.get())
			return true;
		return false;
	}
}
