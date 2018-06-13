package com.breet65.splitsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.breet65.splitsmod.items.ItemBase;
import com.breet65.splitsmod.items.armor.ArmorBase;
import com.breet65.splitsmod.items.tools.ToolAxe;
import com.breet65.splitsmod.items.tools.ToolHoe;
import com.breet65.splitsmod.items.tools.ToolPickaxe;
import com.breet65.splitsmod.items.tools.ToolShears;
import com.breet65.splitsmod.items.tools.ToolSpade;
import com.breet65.splitsmod.items.tools.ToolSword;
import com.breet65.splitsmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 1561, 8.0f, 3.0f, 10);
	public static final ToolMaterial MATERIAL_CLAY = EnumHelper.addToolMaterial("material_clay", 1, 96, 3.0f, 0.5f, 10);
	public static final ToolMaterial MATERIAL_HCLAY = EnumHelper.addToolMaterial("material_hardened_clay", 1, 132, 4.0F, 1.0f, 5);
	
	//ArmorMaterials
	public static final ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial("ruby_armor", Reference.MOD_ID + ":ruby", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	//items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item RUBY = new ItemBase("ruby");
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL =	new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE =	new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY); 
	public static final ItemAxe RUBY_AXE =	new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE =	new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	public static final ItemShears RUBY_SHEARS = new ToolShears("ruby_shears", MATERIAL_RUBY);
	public static final ItemPickaxe CLAY_PICKAXE = new ToolPickaxe("clay_pickaxe", MATERIAL_CLAY);
	public static final ItemPickaxe HARDENED_CLAY_PICKAXE = new ToolPickaxe("hardened_clay_pickaxe", MATERIAL_HCLAY);
	public static final ItemPickaxe BLACK_HARDENED_CLAY_PICKAXE = new ToolPickaxe("black_hardened_clay_pickaxe", MATERIAL_HCLAY);

		
	//Armor
	public static final ItemArmor RUBY_HELMET = new ArmorBase("ruby_helmet", RUBY_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", RUBY_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor RUBY_LEGGINGS = new ArmorBase("ruby_leggings", RUBY_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor RUBY_BOOTS = new ArmorBase("ruby_boots", RUBY_ARMOR, 1, EntityEquipmentSlot.FEET);
}
