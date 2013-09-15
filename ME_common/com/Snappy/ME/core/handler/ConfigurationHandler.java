package com.Snappy.ME.core.handler;

import java.io.File;
import java.util.logging.Level;

import com.Snappy.ME.helpers.BlockIDs;
import com.Snappy.ME.helpers.MyStrings;
import com.Snappy.ME.helpers.References;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	
	static Configuration config = new Configuration();
	
	public static void init(File file) {
		
		config = new Configuration(file);
		
		try {
			config.load();
			
			//sets block ids based on config
			BlockIDs.BASEBLOCK_ID = config.get(config.CATEGORY_BLOCK, MyStrings.BASEBLOCK_NAME, BlockIDs.BASEBLOCK_ID_DEFAULT).getInt(BlockIDs.BASEBLOCK_ID_DEFAULT);
		}
		catch(Exception e) {
			FMLLog.log(Level.SEVERE, e, References.MODID + " cannot load config.");
		}
		finally {
			config.save();
		}
	}
}
