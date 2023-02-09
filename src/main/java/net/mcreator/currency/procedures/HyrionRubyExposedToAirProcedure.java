package net.mcreator.currency.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.currency.init.CurrencyModBlocks;

public class HyrionRubyExposedToAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if ((world.getBlockState(new BlockPos(x, y, z))).getFluidState().isSource()) {
					if ((world.getBlockState(new BlockPos(x + 1, y + 0, z + 0))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y, z), CurrencyModBlocks.GELCUBE.get().defaultBlockState(), 3);
					} else {
						if ((world.getBlockState(new BlockPos(x + -1, y + 0, z + 0))).getBlock() == Blocks.AIR) {
							world.setBlock(new BlockPos(x, y, z), CurrencyModBlocks.GELCUBE.get().defaultBlockState(), 3);
						} else {
							if ((world.getBlockState(new BlockPos(x + 0, y + 1, z + 0))).getBlock() == Blocks.AIR) {
								world.setBlock(new BlockPos(x, y, z), CurrencyModBlocks.GELCUBE.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(new BlockPos(x + 0, y + -1, z + 0))).getBlock() == Blocks.AIR) {
									world.setBlock(new BlockPos(x, y, z), CurrencyModBlocks.GELCUBE.get().defaultBlockState(), 3);
								} else {
									if ((world.getBlockState(new BlockPos(x + 0, y + 0, z + 1))).getBlock() == Blocks.AIR) {
										world.setBlock(new BlockPos(x, y, z), CurrencyModBlocks.GELCUBE.get().defaultBlockState(), 3);
									} else {
										if ((world.getBlockState(new BlockPos(x + 0, y + 0, z + -1))).getBlock() == Blocks.AIR) {
											world.setBlock(new BlockPos(x, y, z), CurrencyModBlocks.GELCUBE.get().defaultBlockState(), 3);
										}
									}
								}
							}
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 20);
	}
}
