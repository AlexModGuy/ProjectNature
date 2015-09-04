package com.github.alexthe666.projectnature.core;

import net.minecraft.block.Block;

import com.github.alexthe666.projectnature.block.*;

public class ModBlocks{

	public static Block leafLitter;
	public static Block campfireoff;
	public static Block campfireon;
	public static Block pitfall;
	public static Block minilog;
	public static Block snareoff;
	public static Block snareon;


	public static void init(){
		leafLitter = new BlockLeafLitter();
		campfireoff = new BlockCampfire(false);
		campfireon = new BlockCampfire(true);
		pitfall = new BlockPitfall();
		minilog = new BlockMiniLog();
		snareoff = new BlockSnare(false);
		snareon = new BlockSnare(true);

	}
}
