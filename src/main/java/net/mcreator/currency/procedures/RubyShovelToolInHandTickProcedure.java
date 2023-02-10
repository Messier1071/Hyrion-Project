package net.mcreator.currency.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RubyShovelToolInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)) {
			(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 1);
		}
	}
}
