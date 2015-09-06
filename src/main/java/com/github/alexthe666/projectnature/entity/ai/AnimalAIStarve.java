package com.github.alexthe666.projectnature.entity.ai;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.DamageSource;

import com.github.alexthe666.projectnature.entity.EntityProjectNatureMob;

public class AnimalAIStarve extends EntityAIBase
{
	EntityProjectNatureMob mob = null;

	public AnimalAIStarve(EntityProjectNatureMob mob)
	{
		this.mob = mob;
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	public boolean shouldExecute()
	{
		//if (fossilOptions.DinoHunger)
		//{
		this.mob.decreaseHungerTick();
		return this.mob.getHungerTick() <= 0 && mob.isTamed();
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	public void startExecuting()
	{
		this.mob.setHungerTick(300);
		this.mob.decreaseHunger();
		if (this.mob.getHunger() <= 0)
		{
			this.handleStarvation();
		}
	}


	private void handleStarvation()
	{
		if (this.mob.getHealth() <= 5 && mob.isTamed())
		{
			this.mob.attackEntityFrom(DamageSource.starve, 1);
		}

	}
}
