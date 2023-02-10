
package net.mcreator.currency.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ShovelheadItem extends Item {

	public ShovelheadItem() {
		super(new Item.Properties().tab(CurrencyModTabs.TAB_HYRION).stacksTo(64).rarity(Rarity.COMMON));
	}

}
