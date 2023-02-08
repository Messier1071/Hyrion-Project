
package net.mcreator.currency.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

public class HyrionDesertsBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(0.785714285714f, 1.214285714286f),
			Climate.Parameter.span(-0.214285714286f, 0.214285714286f), Climate.Parameter.span(0.295714285714f, 0.724285714286f),
			Climate.Parameter.span(0.685714285714f, 1.114285714286f), Climate.Parameter.point(0),
			Climate.Parameter.span(0.380911671288f, 0.80948309986f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-6715896).waterColor(4159204).waterFogColor(-6723857)
				.skyColor(-6715896).foliageColorOverride(10387789).grassColorOverride(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCrystalFormations(biomeGenerationSettings);
		BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.NONE).temperature(2f).downfall(0.5f)
				.specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
