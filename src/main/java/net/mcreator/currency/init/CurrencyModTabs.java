
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.currency.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CurrencyModTabs {
	public static CreativeModeTab TAB_HYRION;

	public static void load() {
		TAB_HYRION = new CreativeModeTab("tabhyrion") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CurrencyModItems.JULE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
