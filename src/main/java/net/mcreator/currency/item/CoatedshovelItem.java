
package net.mcreator.currency.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CoatedshovelItem extends ShovelItem {
	public CoatedshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 5;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				1, -3f,

				new Item.Properties().tab(CurrencyModTabs.TAB_HYRION));
	}

}
