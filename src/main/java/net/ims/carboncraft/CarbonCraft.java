package net.ims.carboncraft;

import net.fabricmc.api.ModInitializer;

import net.ims.carboncraft.block.ModBlocks;
import net.ims.carboncraft.item.ModArmorMaterials;
import net.ims.carboncraft.item.ModItemGroups;
import net.ims.carboncraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarbonCraft implements ModInitializer {
	public static final String MOD_ID = "carboncraft";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}