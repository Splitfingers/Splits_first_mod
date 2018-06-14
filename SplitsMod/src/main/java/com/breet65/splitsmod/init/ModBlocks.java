package com.breet65.splitsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.breet65.splitsmod.blocks.BlockBase;
import com.breet65.splitsmod.blocks.RubyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	
	//Ore Generation for blocks
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
}
