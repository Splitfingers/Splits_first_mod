package com.breet65.splitsmod.config;

import com.breet65.splitsmod.util.Reference;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Config(modid = Reference.MOD_ID, category = "")
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class Configs {
	
	public static ConfigItem crafting = new ConfigItem();
	
	public static class ConfigItem {
		
		//https://github.com/TechReborn/RebornCore/blob/1.12/src/main/java/reborncore/common/config/ConfigGuiFactory.java
		@Config.Comment({"Requires an Iron Block for crafting.", "Default:false"})
		public boolean rBlockIron = false;
		
		@Config.Comment({"Requires a Ruby Block for crafting.", "Default:false"})
		public boolean rBlockRuby = false;
	
	}
	
	@SubscribeEvent
	public static void onConfigReload(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (Reference.MOD_ID.equals(event.getModID()))
			ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
	}
}
	
