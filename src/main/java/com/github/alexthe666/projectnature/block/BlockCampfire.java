package com.github.alexthe666.projectnature.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.github.alexthe666.projectnature.ProjectNature;
import com.github.alexthe666.projectnature.core.ModBlocks;

public class BlockCampfire extends Block {

	private boolean isLighted;

	public BlockCampfire(boolean isLighted) {
		super(Material.wood);
		this.isLighted = isLighted;
		this.setHardness(0.6F);
		this.setLightLevel(isLighted ? 0.7F : 0F);
		this.setBlockBounds(0.0625F, 0, 0.0625F, 1 - 0.0625F, 0.0625F * 3, 1 - 0.0625F);
		this.setTickRandomly(true);
		this.setStepSound(soundTypeWood);
		this.setCreativeTab(ProjectNature.tab);
		this.setUnlocalizedName(isLighted ? "pn.campfireOn" : "pn.campfireOff");
		GameRegistry.registerBlock(this, isLighted ? "campfireon" : "campfireoff");

	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean isFullCube()
	{
		return false;
	}

	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		IBlockState iblockstate = worldIn.getBlockState(pos.down());
		Block block = iblockstate.getBlock();
		return block.isOpaqueCube();
	}

	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
	{
		this.checkAndDropBlock(worldIn, pos, state);
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(ModBlocks.campfireoff);
	}
	private boolean checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state)
	{
		if (!this.canPlaceBlockAt(worldIn, pos))
		{
			worldIn.destroyBlock(pos, true);
			return false;
		}
		else
		{
			return true;
		}
	}
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if(this.isLighted){
			if (rand.nextInt(24) == 0)
			{
				worldIn.playSound((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), "fire.fire", 1.0F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.3F, false);
			}

			int i;
			for (i = 0; i < 3; ++i)
			{
				double d0 = (double)pos.getX() + 0.5D;
				double d1 = (double)pos.getY() + 0.3D;
				double d2 = (double)pos.getZ() + 0.5D;
				worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
			}
		}
	}
	public void onLanded(World worldIn, Entity entityIn)
	{
		super.onLanded(worldIn, entityIn);
		if(isLighted){
			entityIn.setFire(5);
		}
	}
}


