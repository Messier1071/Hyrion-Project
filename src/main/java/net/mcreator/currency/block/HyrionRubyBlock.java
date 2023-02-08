
package net.mcreator.currency.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.currency.init.CurrencyModFluids;

public class HyrionRubyBlock extends LiquidBlock {
	public HyrionRubyBlock() {
		super(() -> (FlowingFluid) CurrencyModFluids.HYRION_RUBY.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
