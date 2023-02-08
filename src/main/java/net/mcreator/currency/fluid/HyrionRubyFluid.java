
package net.mcreator.currency.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.currency.init.CurrencyModItems;
import net.mcreator.currency.init.CurrencyModFluids;
import net.mcreator.currency.init.CurrencyModBlocks;

public abstract class HyrionRubyFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CurrencyModFluids.HYRION_RUBY,
			CurrencyModFluids.FLOWING_HYRION_RUBY,
			FluidAttributes.builder(new ResourceLocation("currency:blocks/rubywater"), new ResourceLocation("currency:blocks/flowingruby"))

					.rarity(Rarity.EPIC))
			.explosionResistance(100f)

			.bucket(CurrencyModItems.HYRION_RUBY_BUCKET).block(() -> (LiquidBlock) CurrencyModBlocks.HYRION_RUBY.get());

	private HyrionRubyFluid() {
		super(PROPERTIES);
	}

	public static class Source extends HyrionRubyFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HyrionRubyFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
