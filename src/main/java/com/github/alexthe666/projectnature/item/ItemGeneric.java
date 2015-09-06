package com.github.alexthe666.projectnature.item;

import com.github.alexthe666.projectnature.ProjectNature;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemGeneric extends Item {
	public ItemGeneric(String name){
		super();
		this.setCreativeTab(ProjectNature.tab_items);
		GameRegistry.registerItem(this, name);
	}
}
