package com.github.alexthe666.projectnature.core;

import net.minecraft.item.Item;

import com.github.alexthe666.projectnature.ProjectNature;
import com.github.alexthe666.projectnature.item.ItemGeneric;

public class ModItems{

	public static Item leaf;
	
	public static void init(){
		leaf = new ItemGeneric("leaf").setUnlocalizedName("pn.leaf");
	}
}
