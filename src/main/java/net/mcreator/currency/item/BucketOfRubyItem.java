
package net.mcreator.currency.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.currency.init.CurrencyModTabs;

public class BucketOfRubyItem extends Item {
	public BucketOfRubyItem() {
		super(new Item.Properties().tab(CurrencyModTabs.TAB_HYRION).stacksTo(64).rarity(Rarity.COMMON));
	}
}
