
package net.mcreator.currency.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.currency.init.CurrencyModTabs;

public class RubyItem extends Item {
	public RubyItem() {
		super(new Item.Properties().tab(CurrencyModTabs.TAB_HYRION).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
