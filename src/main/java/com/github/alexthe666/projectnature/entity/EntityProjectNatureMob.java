package com.github.alexthe666.projectnature.entity;

import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

import com.github.alexthe666.projectnature.api.AnimalAI.*;

public abstract class EntityProjectNatureMob extends EntityTameable{

	public EntityProjectNatureMob(World worldIn) {
		super(worldIn);
	}

	public abstract String getTexture();
	
	public abstract AnimalAIMoving movingType();
	
	public abstract AnimalAIAttack attackType();

	public abstract AnimalAIActivity activityType();

	public abstract AnimalAIResponse responseType();

}
