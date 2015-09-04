package com.github.alexthe666.projectnature.core;

import com.github.alexthe666.projectnature.item.ItemGeneric;

import net.minecraft.item.Item;

public class ModItems{

	public static Item leaf;
	
	public static void init(){
		leaf = new ItemGeneric("leaf").setUnlocalizedName("pn.leaf");
	}
}
