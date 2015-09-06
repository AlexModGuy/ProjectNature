package com.github.alexthe666.projectnature.item;

import net.ilexiconn.llibrary.common.item.SpawnEgg;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPNSpawnEgg extends SpawnEgg{

	public ItemPNSpawnEgg(CreativeTabs creativeTab) {
		super(creativeTab);
		GameRegistry.registerItem(this, "spawnEgg");
	}

}
