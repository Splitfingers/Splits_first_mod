package com.breet65.splitsmod.items.armor;

import com.breet65.splitsmod.Main;
import com.breet65.splitsmod.init.ModItems;
import com.breet65.splitsmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel 
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.MATERIALS);
			
			ModItems.ITEMS.add(this);
		}
		
		@Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(this, 0, "inventoy");
					
		}
	}


