
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.currency.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CurrencyModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.JULE.get(), 5),

					new ItemStack(CurrencyModItems.FIVE_JULE.get()), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.FIVE_JULE.get(), 5),

					new ItemStack(CurrencyModItems.TWENTY_FIVE_JULE.get()), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.TWENTY_FIVE_JULE.get(), 2),

					new ItemStack(CurrencyModItems.FIFTY_JULE.get()), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.TWENTY_FIVE_JULE.get(), 4),

					new ItemStack(CurrencyModItems.ONE_HUNDRED_JULE.get()), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.JULE.get(), 25),

					new ItemStack(CurrencyModItems.TWENTY_FIVE_JULE.get()), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.JULE.get(), 50),

					new ItemStack(CurrencyModItems.FIFTY_JULE.get()), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.FIVE_JULE.get(), 10),

					new ItemStack(CurrencyModItems.FIFTY_JULE.get()), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.ONE_HUNDRED_JULE.get()),

					new ItemStack(CurrencyModItems.TWENTY_FIVE_JULE.get(), 4), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.ONE_HUNDRED_JULE.get()),

					new ItemStack(CurrencyModItems.FIFTY_JULE.get(), 2), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.FIFTY_JULE.get()),

					new ItemStack(CurrencyModItems.FIVE_JULE.get(), 5), 9999, 5, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CurrencyModItems.FIFTY_JULE.get()),

					new ItemStack(CurrencyModItems.JULE.get(), 50), 10, 5, 0f));
		}
	}
}
