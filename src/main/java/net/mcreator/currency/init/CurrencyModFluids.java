
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.currency.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.currency.fluid.HyrionRubyFluid;
import net.mcreator.currency.CurrencyMod;

public class CurrencyModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CurrencyMod.MODID);
	public static final RegistryObject<Fluid> HYRION_RUBY = REGISTRY.register("hyrion_ruby", () -> new HyrionRubyFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_HYRION_RUBY = REGISTRY.register("flowing_hyrion_ruby", () -> new HyrionRubyFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HYRION_RUBY.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HYRION_RUBY.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
