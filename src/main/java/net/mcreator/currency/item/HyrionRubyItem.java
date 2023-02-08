
package net.mcreator.currency.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.currency.init.CurrencyModTabs;
import net.mcreator.currency.init.CurrencyModFluids;

public class HyrionRubyItem extends BucketItem {
	public HyrionRubyItem() {
		super(CurrencyModFluids.HYRION_RUBY,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC).tab(CurrencyModTabs.TAB_HYRION));
	}
}
