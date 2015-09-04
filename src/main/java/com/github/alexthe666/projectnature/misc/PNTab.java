package com.github.alexthe666.projectnature.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class PNTab extends CreativeTabs{

	public PNTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(Blocks.sapling);
	}
	
}
