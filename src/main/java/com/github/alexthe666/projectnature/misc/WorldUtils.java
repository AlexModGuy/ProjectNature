package com.github.alexthe666.projectnature.misc;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class WorldUtils {

	public static Block getBlock(World world, int x, int y, int z){
		return world.getBlockState(new BlockPos(x, y, z)).getBlock();
	}
	public static void setBlock(World world, int x, int y, int z, Block block, int meta, int flags){
		BlockPos pos = new BlockPos(x, y, z);
        world.setBlockState(pos, block.getStateFromMeta(meta), flags);
	}
}
