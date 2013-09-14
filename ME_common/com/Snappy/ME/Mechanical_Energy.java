package com.Snappy.ME;

import com.Snappy.ME.blocks.ModBlocks;
import com.Snappy.ME.core.proxy.CommonProxy;
import com.Snappy.ME.helpers.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(
		name = References.MODNAME,
		modid = References.MODID,
		version = References.VERSION)

@NetworkMod(
		clientSideRequired = true,
		serverSideRequired = false)


public class Mechanical_Energy {
	
	@SidedProxy(
			clientSide = References.CLIENT_PROXY_LOCATION,
			serverSide = References.SERVER_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModBlocks.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	

}
