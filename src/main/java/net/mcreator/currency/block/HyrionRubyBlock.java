
package net.mcreator.currency.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.currency.procedures.HyrionRubyExposedToAirProcedure;
import net.mcreator.currency.init.CurrencyModFluids;

public class HyrionRubyBlock extends LiquidBlock {
	public HyrionRubyBlock() {
		super(() -> (FlowingFluid) CurrencyModFluids.HYRION_RUBY.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		HyrionRubyExposedToAirProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
