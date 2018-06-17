package com.breet65.splitsmod.items.tools;

import com.breet65.splitsmod.Main;
import com.breet65.splitsmod.init.ModItems;
import com.breet65.splitsmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
public ToolPickaxe(String name, ToolMaterial material)
	
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventoy");
				
	}
}
