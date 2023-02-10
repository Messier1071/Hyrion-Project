
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.currency.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.currency.block.entity.ExtractorBlockEntity;
import net.mcreator.currency.block.entity.CreativePowerBlockEntity;
import net.mcreator.currency.CurrencyMod;

public class CurrencyModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, CurrencyMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> EXTRACTOR = register("extractor", CurrencyModBlocks.EXTRACTOR, ExtractorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CREATIVE_POWER = register("creative_power", CurrencyModBlocks.CREATIVE_POWER,
			CreativePowerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
