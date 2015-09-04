package com.github.alexthe666.projectnature.entity.mob;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

import com.github.alexthe666.projectnature.entity.EntityProjectNatureMob;

public class EntityRedDeer extends EntityProjectNatureMob{

	public EntityRedDeer(World worldIn) {
		super(worldIn);
		this.setSize(2, 2);
	}
	public int i = new Random().nextInt(1);
	@Override
	public String getTexture() {
		if(this.isChild()){
			return "pn:textures/models/reddeer/reddeer_baby.png";
		}else if(i == 0){
			return "pn:textures/models/reddeer/reddeer_male.png";	
		}else{
			return "pn:textures/models/reddeer/reddeer_male.png";	
		}
	}
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityRedDeer(worldObj);
	}

}
