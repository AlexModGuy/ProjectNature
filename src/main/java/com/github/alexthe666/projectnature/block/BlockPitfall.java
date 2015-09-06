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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.github.alexthe666.projectnature.ProjectNature;
import com.github.alexthe666.projectnature.core.ModBlocks;
import com.github.alexthe666.projectnature.core.ModItems;
import com.github.alexthe666.projectnature.misc.WorldUtils;

public class BlockPitfall extends Block{

	public BlockPitfall() {
		super(Material.grass);
		this.setHardness(0.3F);
		this.setBlockBounds(0F, 1 - (0.0625F * 3), 0F, 1, 1, 1);
		this.setTickRandomly(true);
		this.setStepSound(soundTypeWood);
		this.setCreativeTab(ProjectNature.tab_blocks);
		this.setUnlocalizedName("pn.pitfall");
		GameRegistry.registerBlock(this, "pitfall");
	}
	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean isFullCube()
	{
		return false;
	}
	public int quantityDropped(Random random)
	{
		return new Random().nextInt(1) + 1;
	}
	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos) {
		return canBlockStay(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block block) {
		if (!canBlockStay(world, pos.getX(), pos.getY(), pos.getZ())) {
			world.destroyBlock(pos, true);
			world.spawnParticle(EnumParticleTypes.BLOCK_CRACK, pos.getX() + ((double)new Random().nextFloat() - 0.5D), pos.getY() + 0.9D, pos.getX() + ((double)new Random().nextFloat() - 0.5D), 4.0D * ((double)new Random().nextFloat() - 0.5D), 0.5D, ((double)new Random().nextFloat() - 0.5D) * 4.0D);
            world.playSound(pos.getX(), pos.getY(), pos.getZ(), block.stepSound.getBreakSound(), 0.15F, 1.0F, false);
			world.markBlockForUpdate(pos);
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
	public boolean canBlockStay(World world, int x, int y, int z) {
		boolean flag = false;

		if (WorldUtils.getBlock(world, x, y, z - 1).getMaterial().isSolid() || WorldUtils.getBlock(world, x, y, z - 1) == this) {
			flag = true;
		}

		if (WorldUtils.getBlock(world, x, y, z + 1).getMaterial().isSolid() || WorldUtils.getBlock(world, x, y, z + 1) == this) {
			flag = true;
		}

		if (WorldUtils.getBlock(world, x - 1, y, z).getMaterial().isSolid() || WorldUtils.getBlock(world, x - 1, y, z) == this) {
			flag = true;
		}

		if (WorldUtils.getBlock(world, x + 1, y, z).getMaterial().isSolid() || WorldUtils.getBlock(world, x + 1, y, z) == this) {
			flag = true;
		}

		return flag;
	}
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, Entity entity) {
		if (entity instanceof EntityLivingBase && !world.isRemote)
		{
			world.setBlockToAir(pos);
			EntityItem entityitem = new EntityItem(world, (double)pos.getX()+ 0.5, (double)pos.getY() + 0.7, (double)pos.getZ() + 0.5, new ItemStack(getDrops(), new Random().nextInt(1) + 1));
			world.spawnEntityInWorld(entityitem);
		}
	}
	private Item getDrops(){
		Random rand= new Random();
		if(rand.nextInt(1) == 0){
			return ModItems.leaf;
		}else{
			return Items.stick;
		}
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return this.getDrops();
	}
}
