package com.github.alexthe666.projectnature.misc;

import com.github.alexthe666.projectnature.core.ModBlocks;
import com.github.alexthe666.projectnature.core.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class PNTab extends CreativeTabs{

	private int item;
	
	public PNTab(String label, int item) {
		super(label);
		this.item = item;
	}

	@Override
	public Item getTabIconItem() {
		switch(item){
		default:
			return Item.getItemFromBlock(ModBlocks.campfireon);
		case 1:
			return ModItems.leaf;
		case 2:
			return Items.spawn_egg;
		}
	}
	
}
