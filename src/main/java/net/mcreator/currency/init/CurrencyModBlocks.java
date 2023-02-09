
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.currency.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.currency.block.HyrionRubyBlock;
import net.mcreator.currency.block.GelcubeBlock;
import net.mcreator.currency.CurrencyMod;

public class CurrencyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CurrencyMod.MODID);
	public static final RegistryObject<Block> HYRION_RUBY = REGISTRY.register("hyrion_ruby", () -> new HyrionRubyBlock());
	public static final RegistryObject<Block> GELCUBE = REGISTRY.register("gelcube", () -> new GelcubeBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			GelcubeBlock.registerRenderLayer();
		}
	}
}
