package com.Snappy.ME.blocks;

import com.Snappy.ME.helpers.BlockIDs;
import com.Snappy.ME.helpers.MyStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block BaseBlock;
	
	public static void init() {
		
		//this is where all block, te, item registries occur
		
		BaseBlock = new BaseBlock(BlockIDs.BASEBLOCK_ID);
		
		GameRegistry.registerBlock(BaseBlock, MyStrings.BASEBLOCK_NAME);
	}

}
