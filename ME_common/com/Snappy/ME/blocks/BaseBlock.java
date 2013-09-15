package com.Snappy.ME.blocks;

import com.Snappy.ME.helpers.MyStrings;
import com.Snappy.ME.helpers.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BaseBlock extends Block {
	
	public BaseBlock(int id){
		
		super(id, Material.rock);
		this.setHardness(25f);
		this.setResistance(25f);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(MyStrings.BASEBLOCK_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister) {
		
		//sets the generic texture for block from file. can be copied/pasted.
		blockIcon = iconregister.registerIcon(String.format("%s:%s", References.MODID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String name) {
		
		//parses out unlocalized name of block
		return name.substring(name.indexOf(".") + 1); 
	}

}
