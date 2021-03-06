package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.config.OreGenConfig;
import com.coliwogg.gemsandcrystals.init.BlockInit;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

public class OreGeneration {
	
	private static final CountRangeConfig RUBY = new CountRangeConfig(OreGenConfig.ruby_chance.get(), 3, 0, 14);
	private static final CountRangeConfig SAPPHIRE = new CountRangeConfig(OreGenConfig.sapphire_chance.get(), 3, 0, 14);
	private static final CountRangeConfig TOPAZ = new CountRangeConfig(OreGenConfig.topaz_chance.get(), 4, 0, 32);
	private static final CountRangeConfig AMETHYST = new CountRangeConfig(OreGenConfig.amethyst_chance.get(), 4, 0, 32);
	private static final CountRangeConfig QUARTZ = new CountRangeConfig(OreGenConfig.quartz_chance.get(), 6, 0, 40);
	
	static ConfiguredPlacement<CountRangeConfig> customConfig = null;

	public static void generateOre() {

		for (Biome biome : ForgeRegistries.BIOMES) {
			
			if(OreGenConfig.generate_ruby.get()) {
				customConfig = Placement.COUNT_RANGE.configure(RUBY);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUBY_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 2, 4))).withPlacement(customConfig));
			}
			
			if(OreGenConfig.generate_sapphire.get()) {
				customConfig = Placement.COUNT_RANGE.configure(SAPPHIRE);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SAPPHIRE_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 2, 4))).withPlacement(customConfig));
			}
			
			if(OreGenConfig.generate_topaz.get()) {
				customConfig = Placement.COUNT_RANGE.configure(TOPAZ);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TOPAZ_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 2, 5))).withPlacement(customConfig));
			}
			
			if(OreGenConfig.generate_amethyst.get()) {
				customConfig = Placement.COUNT_RANGE.configure(AMETHYST);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.AMETHYST_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 3, 5))).withPlacement(customConfig));
			}
			
			if(OreGenConfig.generate_quartz.get()) {
				customConfig = Placement.COUNT_RANGE.configure(QUARTZ);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.QUARTZ_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 3, 7))).withPlacement(customConfig));
			}
		}	
	}
}
