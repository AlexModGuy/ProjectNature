package com.github.alexthe666.projectnature.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.github.alexthe666.projectnature.ProjectNature;
import com.github.alexthe666.projectnature.core.ModItems;

public class BlockLeafLitter extends Block {

	public BlockLeafLitter() {
		super(Material.plants);
		this.setHardness(0.2F);
		this.setBlockBounds(0, 0, 0, 1, 0.125F, 1);
		this.setTickRandomly(true);
		this.setStepSound(soundTypeGrass);
		this.setCreativeTab(ProjectNature.tab_blocks);
		this.setUnlocalizedName("pn.leafLitter");
		GameRegistry.registerBlock(this, "leaflitter");
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
		int chance = rand.nextInt(100);
		if(chance < 40){
			return ModItems.leaf;
		}
		else if(chance > 40 && chance > 50){
			return Items.stick;
		}else{
			return null;
		}
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
	public int getBlockColor()
	{
		return ColorizerFoliage.getFoliageColor(0.5D, 1.0D);
	}

	@SideOnly(Side.CLIENT)
	public int getRenderColor(IBlockState state)
	{
		return ColorizerFoliage.getFoliageColorBasic();
	}
	
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass)
	{
		return BiomeColorHelper.getFoliageColorAtPos(worldIn, pos);
	}
	
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();

      
            if (worldIn.getBlockState(pos.offset(side.getOpposite())) != iblockstate)
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }

        return block == this ? false : super.shouldSideBeRendered(worldIn, pos, side);
    }

}
