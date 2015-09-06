package com.github.alexthe666.projectnature.entity.ai;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.MathHelper;

import com.github.alexthe666.projectnature.entity.EntityProjectNatureMob;

public class AnimalAIAge extends EntityAIBase
{
	protected EntityProjectNatureMob mob;

	public AnimalAIAge(EntityProjectNatureMob mob)
	{
		this.mob = mob;
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	public boolean shouldExecute()
	{

		if (this.mob.getAnimalAge() < 999)
		{
			this.mob.increaseAnimalAgeTick();
			return this.mob.getAnimalAgeTick() >= 12000;
		}

		return false;
	}

	/**
	 * Returns whether an in-progress EntityAIBase should continue executing
	 */
	public boolean continueExecuting()
	{
		return this.shouldExecute();
	}

	/**
	 * Updates the task
	 */
	public void startExecuting()
	{
		if (!this.mob.worldObj.isRemote)
		{
			this.mob.setPosition(this.mob.posX, this.mob.posY + 1, this.mob.posZ);
			if (!this.mob.isEntityInsideOpaqueBlock()){
				this.mob.setAnimalAgeTick(0);
				this.mob.increaseAnimalAge();
				this.mob.worldObj.setEntityState(this.mob, (byte)37);
				this.mob.updateSize();

				if (this.mob.getMaxHealth() < this.mob.getHealth())
				{
					this.mob.heal(MathHelper.ceiling_double_int(this.mob.getHealth() * 0.15f));
				}

			}
		}
	}
}
