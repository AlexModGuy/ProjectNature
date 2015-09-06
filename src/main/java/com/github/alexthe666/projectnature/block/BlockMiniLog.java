package com.github.alexthe666.projectnature.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.github.alexthe666.projectnature.ProjectNature;
import com.github.alexthe666.projectnature.entity.EntityMoutableLog;

public class BlockMiniLog extends Block{

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	public BlockMiniLog() {
		super(Material.wood);
		this.setHardness(0.8F);
		this.setTickRandomly(true);
		this.setStepSound(soundTypeWood);
		this.setCreativeTab(ProjectNature.tab_blocks);
		this.setUnlocalizedName("pn.minilog");
		GameRegistry.registerBlock(this, "minilog");
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
	@Override
	public int getRenderType() {
	  return 3;
	}
	 public MovingObjectPosition collisionRayTrace(World worldIn, BlockPos pos, Vec3 start, Vec3 end)
	    {
	        EnumFacing enumfacing = (EnumFacing)worldIn.getBlockState(pos).getValue(FACING);
	        if (enumfacing == EnumFacing.EAST)
	        {
	            this.setBlockBounds(0.0625F * 4, 0.0F, 0, 1 - (0.0625F * 4F), 0.5F, 1);
	        }
	        else if (enumfacing == EnumFacing.WEST)
	        {
	            this.setBlockBounds(0.0625F * 4, 0.0F, 0, 1 - (0.0625F * 4F), 0.5F, 1);
	        }
	        else if (enumfacing == EnumFacing.SOUTH)
	        {
	            this.setBlockBounds(0.0F, 0.0F, 0.0625F * 4, 1F, 0.5F, 1 - (0.0625F * 4F));
	        }
	        else if (enumfacing == EnumFacing.NORTH)
	        {
	            this.setBlockBounds(0.0F, 0.0F, 0.0625F * 4, 1F, 0.5F, 1 - (0.0625F * 4F));
	        }

	        return super.collisionRayTrace(worldIn, pos, start, end);
	    }

	   public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ)
	    {
	        if (!world.isRemote)
	        {
	            List<EntityMoutableLog> mountableBlocks = world.getEntitiesWithinAABB(EntityMoutableLog.class, AxisAlignedBB.fromBounds(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1f, pos.getY() + 1f, pos.getZ() + 1f).expand(1f, 1f, 1f));
	            for (EntityMoutableLog mountableBlock : mountableBlocks)
	                if (mountableBlock.blockPos == pos)
	                    return mountableBlock.interactFirst(player);

	            float mountX = pos.getX() + 0.5F;
	            float mountY = pos.getY() + 0.3F;
	            float mountZ = pos.getZ() + 0.5F;

	            EntityMoutableLog mountableBlock = new EntityMoutableLog(world, pos, mountX, mountY, mountZ);
	            world.spawnEntityInWorld(mountableBlock);
	            return mountableBlock.interactFirst(player);
	        }

	        return true;
	    }

	    public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state)
	    {
	        if (!world.isRemote)
	        {
	            List<EntityMoutableLog> mountableBlocks = world.getEntitiesWithinAABB(EntityMoutableLog.class, AxisAlignedBB.fromBounds(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1f, pos.getY() + 1f, pos.getZ() + 1f).expand(1f, 1f, 1f));
	            for (EntityMoutableLog mountableBlock : mountableBlocks)
	                mountableBlock.setDead();
	        }
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
}
