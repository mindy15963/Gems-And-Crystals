package com.coliwogg.gemsandcrystals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {
	public static ForgeConfigSpec.IntValue ruby_chance, sapphire_chance, topaz_chance, amethyst_chance, quartz_chance;
	public static ForgeConfigSpec.BooleanValue generate_ruby, generate_sapphire, generate_topaz, generate_amethyst, generate_quartz;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {
		
		server.comment("OreGen Config");
		
		ruby_chance = server.comment("Maximum number of ore veins of ruby ore that can spawn in one chunk").defineInRange("oregen.ruby_chance", 7, 8, 10);
		sapphire_chance = server.comment("Maximum number of ore veins of sapphire ore that can spawn in one chunk").defineInRange("oregen.sapphire_chance", 7, 8, 10);
		topaz_chance = server.comment("Maximum number of ore veins of topaz ore that can spawn in one chunk").defineInRange("oregen.topaz_chance", 8, 7, 10);
		amethyst_chance = server.comment("Maximum number of ore veins of amethyst ore that can spawn in one chunk").defineInRange("oregen.amethyst_chance", 8, 7, 11);
		quartz_chance = server.comment("Maximum number of ore veins of quartz ore that can spawn in one chunk").defineInRange("oregen.quartz_chance", 11, 9, 13);

		generate_ruby = server.comment("Decide if you want ruby ore to spawn in the overworld").define("oregen.generate_ruby", true);
		generate_sapphire = server.comment("Decide if you want sapphire ore to spawn in the overworld").define("oregen.generate_sapphire", true);
		generate_topaz = server.comment("Decide if you want topaz ore to spawn in the overworld").define("oregen.generate_topaz", true);
		generate_amethyst = server.comment("Decide if you want amethyst ore to spawn in the overworld").define("oregen.generate_amethyst", true);
		generate_quartz = server.comment("Decide if you want quartz ore to spawn in the overworld").define("oregen.generate_quartz", false);
				
	}
}
