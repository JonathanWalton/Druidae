package com.druidae.common;

import com.druidae.common.core.proxy.IProxy;
import com.druidae.common.lib.LibMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LibMod.MOD_ID, name = LibMod.MOD_NAME, version = LibMod.MOD_VERSION)
public class Druidae {
	
	@Instance(LibMod.MOD_ID)
	public static Druidae instance;
	
	@SidedProxy(serverSide = LibMod.PROXY_SERVER, clientSide = LibMod.PROXY_CLIENT)
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}
