package com.breet65.splitsmod.config;

import org.apache.logging.log4j.Level;

import com.breet65.splitsmod.proxy.CommonProxy;
import com.breet65.splitsmod.util.Reference;

import jline.internal.Log;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class Configs {
	
	public static Configuration config;
	
	public static Property rBlockIron;
	public static Property rBlockRuby;
	private static final String CAT_GENERAL = "General";
	
	public static void readConfig(){
		
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e1) {
			Log.error(Level.ERROR, "Problem with loading config file!", e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}	
	
	private static void initGeneralConfig(Configuration cfg) {
		
		cfg.addCustomCategoryComment(CAT_GENERAL, "General setttings");
		rBlockIron = cfg.get(CAT_GENERAL, "Requires an Iron block for crafting (Default false).", false);
		rBlockRuby = cfg.get(CAT_GENERAL, "Requires a Ruby block for crafting (Default false).", false);
	
	}
}
	
