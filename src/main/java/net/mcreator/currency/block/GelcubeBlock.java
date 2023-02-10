
package net.mcreator.currency.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class GelcubeBlock extends Block {

	public GelcubeBlock() {
		super(BlockBehaviour.Properties.of(Material.DECORATION).sound(SoundType.SLIME_BLOCK).strength(0.5f, 10f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));

	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(CurrencyModBlocks.GELCUBE.get(), renderType -> renderType == RenderType.translucent());
	}

}
