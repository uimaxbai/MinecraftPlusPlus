
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcpp.minecraftplusplus.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftplusplusModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> AUTOSMELTRULE = GameRules.register("autoSmeltRule", GameRules.Category.PLAYER,
			GameRules.BooleanValue.create(false));
}
