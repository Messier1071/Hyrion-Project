
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.currency.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.currency.block.HyrionRubyBlock;
import net.mcreator.currency.CurrencyMod;

public class CurrencyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CurrencyMod.MODID);
	public static final RegistryObject<Block> HYRION_RUBY = REGISTRY.register("hyrion_ruby", () -> new HyrionRubyBlock());
}
