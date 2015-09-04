package com.github.alexthe666.projectnature.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.github.alexthe666.projectnature.ProjectNature;
import com.github.alexthe666.projectnature.core.ModBlocks;
import com.github.alexthe666.projectnature.core.ModItems;
import com.github.alexthe666.projectnature.misc.WorldUtils;

public class BlockSnare extends Block{

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public BlockSnare(boolean isAttacking) {
		super(Material.wood);
		this.setHardness(0.3F);
		this.setBlockBounds(0F, 0f, 0F, 1, 0.0625F * 4, 1);
		this.setTickRandomly(true);
		this.setStepSound(soundTypeWood);
		if(!isAttacking){
			this.setCreativeTab(ProjectNature.tab);
		}
		this.setUnlocalizedName("pn.snare");
		String i = isAttacking ? "on" : "off";
		GameRegistry.registerBlock(this, "snare" + i);
	}
	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean isFullCube()
	{
		return false;
	}
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, Entity entity) {
		if (entity instanceof EntityLivingBase && !world.isRemote && this == ModBlocks.snareoff)
		{
			((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 15 * 20, 5));
			((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.wither.id, 15 * 20, 1));
			((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 15 * 20, 1));
			EnumFacing enumfacing = (EnumFacing)world.getBlockState(pos).getValue(FACING);
			if (enumfacing == EnumFacing.EAST)
			{
				WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareon, 3, 3);
			}
			else if (enumfacing == EnumFacing.WEST)
			{
				WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareon, 1, 3);
			}
			else if (enumfacing == EnumFacing.SOUTH)
			{
				WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareon, 0, 3);
			}
			else if (enumfacing == EnumFacing.NORTH)
			{
				WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareon, 2, 3);

			}
		}
	}
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		EnumFacing enumfacing = (EnumFacing)world.getBlockState(pos).getValue(FACING);
		if(!player.isSneaking()){
			if(this == ModBlocks.snareon){
				if (enumfacing == EnumFacing.EAST)
				{
					WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareoff, 3, 3);
				}
				else if (enumfacing == EnumFacing.WEST)
				{
					WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareoff, 1, 3);
				}
				else if (enumfacing == EnumFacing.SOUTH)
				{
					WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareoff, 0, 3);
				}
				else if (enumfacing == EnumFacing.NORTH)
				{
					WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareoff, 2, 3);

				}	
			}else{
				if (enumfacing == EnumFacing.EAST)
				{
					WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareon, 3, 3);
				}
				else if (enumfacing == EnumFacing.WEST)
				{
					WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareon, 1, 3);
				}
				else if (enumfacing == EnumFacing.SOUTH)
				{
					WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareon, 0, 3);
				}
				else if (enumfacing == EnumFacing.NORTH)
				{
					WorldUtils.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), ModBlocks.snareon, 2, 3);

				}	
			}
			return true;
		}
		return super.onBlockActivated(world, pos, state, player, side, hitX, hitY, hitZ);
	}
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}
	/**
	 * Convert the BlockState into the correct metadata value
	 */
	public int getMetaFromState(IBlockState state)
	{
		return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
	}

	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] {FACING});
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(ModBlocks.snareoff);
	}
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(ModBlocks.snareoff);
	}
}
