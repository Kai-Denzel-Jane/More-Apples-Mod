package net.kaijane.more_apples;

import net.fabricmc.api.ModInitializer;

import net.kaijane.more_apples.block.ModBlocks;
import net.kaijane.more_apples.item.ModItemGroups;
import net.kaijane.more_apples.item.ModItems;
import net.kaijane.more_apples.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreApples implements ModInitializer {
	public static final String MOD_ID = "more_apples";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}