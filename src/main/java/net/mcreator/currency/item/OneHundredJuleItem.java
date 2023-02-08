
package net.mcreator.currency.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.currency.init.CurrencyModTabs;

import java.util.List;

public class OneHundredJuleItem extends Item {
	public OneHundredJuleItem() {
		super(new Item.Properties().tab(CurrencyModTabs.TAB_HYRION).stacksTo(5).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("One Hundred Jules"));
	}
}
