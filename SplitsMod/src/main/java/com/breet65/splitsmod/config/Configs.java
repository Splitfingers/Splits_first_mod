package com.breet65.splitsmod.config;

import org.apache.logging.log4j.Level;

import com.breet65.splitsmod.proxy.CommonProxy;
import com.breet65.splitsmod.util.Reference;

import jline.internal.Log;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.LangKey;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

	
@LangKey("reference.MOD_ID.config.title")

public class Config {
	
	@Comment("Requires an Iron Block for crafting.")
	public boolean rBlockIron = false;
	
	@Comment("Requires a Ruby Block for crafting.")
	public boolean rBlockRuby = false;
	
	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			//initGeneralConfig(cfg);
		} catch (Exception e1) {
			Log.error(Level.ERROR, "Problem loading confige file!", e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
		
	}
	
	/*private static void initGeneralConfig(Configuration cfg) {
		
	}*/
}