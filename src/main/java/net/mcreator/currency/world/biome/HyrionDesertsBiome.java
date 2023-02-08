
package net.mcreator.currency.world.biome;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import java.util.List;

public class HyrionDesertsBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(0.785714285714f, 1.214285714286f),
			Climate.Parameter.span(-0.214285714286f, 0.214285714286f), Climate.Parameter.span(0.295714285714f, 0.724285714286f),
			Climate.Parameter.span(0.685714285714f, 1.114285714286f), Climate.Parameter.point(0),
			Climate.Parameter.span(0.380911671288f, 0.80948309986f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-6715896).waterColor(4159204).waterFogColor(-6723857)
				.skyColor(-6715896).foliageColorOverride(10387789).grassColorOverride(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("currency:brown_mushroom_hyrion_deserts", VegetationFeatures.PATCH_BROWN_MUSHROOM,
						List.of(CountPlacement.of(10), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("currency:red_mushroom_hyrion_deserts", VegetationFeatures.PATCH_RED_MUSHROOM, List.of(CountPlacement.of(10),
						RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("currency:disk_sand_hyrion_deserts",
						FeatureUtils.register("currency:disk_sand_hyrion_deserts", Feature.DISK,
								new DiskConfiguration(Blocks.SAND.defaultBlockState(), UniformInt.of(2, 6), 2,
										List.of(Blocks.SAND.defaultBlockState(), Blocks.SMOOTH_SANDSTONE.defaultBlockState()))),
						List.of(CountPlacement.of(15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCrystalFormations(biomeGenerationSettings);
		BiomeDefaultFeatures.addDesertExtraDecoration(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.NONE).temperature(2f).downfall(0.5f)
				.specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
