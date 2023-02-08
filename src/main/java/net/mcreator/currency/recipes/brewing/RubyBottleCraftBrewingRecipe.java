
package net.mcreator.currency.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.ItemStack;

import net.mcreator.currency.init.CurrencyModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RubyBottleCraftBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new RubyBottleCraftBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		return input.getItem() == CurrencyModItems.PLASMA_BOTTLE.get();
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return ingredient.getItem() == CurrencyModItems.PLASMA.get();
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(CurrencyModItems.BOTTLED_RUBY.get());
		}
		return ItemStack.EMPTY;
	}
}
