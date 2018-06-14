package com.breet65.splitsmod.config;

import java.util.List;
import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class SmConfigGuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasConfigGui() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static class SmConfigGui extends GuiConfig {

		public SmConfigGui(GuiScreen parentScreen, List<IConfigElement> configElements, String modID,
				boolean allRequireWorldRestart, boolean allRequireMcRestart, String title) {
			super(parentScreen, configElements, modID, allRequireWorldRestart, allRequireMcRestart, title);
			// TODO Auto-generated constructor stub
		}
		
		
	}
}
