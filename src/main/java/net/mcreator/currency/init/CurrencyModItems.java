
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.currency.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.currency.item.TwentyFiveJuleItem;
import net.mcreator.currency.item.RubyShovelItem;
import net.mcreator.currency.item.RubyPickaxeItem;
import net.mcreator.currency.item.RubyItem;
import net.mcreator.currency.item.RubyAxeItem;
import net.mcreator.currency.item.PlasmaItem;
import net.mcreator.currency.item.PlasmaBottleItem;
import net.mcreator.currency.item.OneHundredJuleItem;
import net.mcreator.currency.item.JuleItem;
import net.mcreator.currency.item.HyrionRubyItem;
import net.mcreator.currency.item.FiveJuleItem;
import net.mcreator.currency.item.FiftyJuleItem;
import net.mcreator.currency.item.BottledRubyItem;
import net.mcreator.currency.CurrencyMod;

public class CurrencyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CurrencyMod.MODID);
	public static final RegistryObject<Item> JULE = REGISTRY.register("jule", () -> new JuleItem());
	public static final RegistryObject<Item> HYRION_RUBY_BUCKET = REGISTRY.register("hyrion_ruby_bucket", () -> new HyrionRubyItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> ONE_HUNDRED_JULE = REGISTRY.register("one_hundred_jule", () -> new OneHundredJuleItem());
	public static final RegistryObject<Item> FIVE_JULE = REGISTRY.register("five_jule", () -> new FiveJuleItem());
	public static final RegistryObject<Item> FIFTY_JULE = REGISTRY.register("fifty_jule", () -> new FiftyJuleItem());
	public static final RegistryObject<Item> TWENTY_FIVE_JULE = REGISTRY.register("twenty_five_jule", () -> new TwentyFiveJuleItem());
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> BOTTLED_RUBY = REGISTRY.register("bottled_ruby", () -> new BottledRubyItem());
	public static final RegistryObject<Item> PLASMA = REGISTRY.register("plasma", () -> new PlasmaItem());
	public static final RegistryObject<Item> PLASMA_BOTTLE = REGISTRY.register("plasma_bottle", () -> new PlasmaBottleItem());
	public static final RegistryObject<Item> GELCUBE = block(CurrencyModBlocks.GELCUBE, CurrencyModTabs.TAB_HYRION);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
