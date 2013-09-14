package com.Snappy.ME.blocks;

import com.Snappy.ME.helpers.MyStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block BaseBlock;
	
	public static void init() {
		
		BaseBlock = new BaseBlock(3000);
		
		GameRegistry.registerBlock(BaseBlock, MyStrings.BASEBLOCK_NAME);
	}

}
