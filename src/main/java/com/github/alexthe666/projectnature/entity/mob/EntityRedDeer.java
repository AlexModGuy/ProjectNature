package com.github.alexthe666.projectnature.entity.mob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIActivity;
import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIAttack;
import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIMoving;
import com.github.alexthe666.projectnature.api.AnimalAI.AnimalAIResponse;
import com.github.alexthe666.projectnature.entity.EntityProjectNatureMob;

public class EntityRedDeer extends EntityProjectNatureMob{

	public EntityRedDeer(World worldIn) {
		super(worldIn);
		this.setSize(1.9F, 1.8F);
		shadowMultiplier = 0.6F;
	}
 
	public String getTexture() {
		if(this.isChild()){
			return "pn:textures/models/reddeer/reddeer_baby.png";
		}else if(this.getGender() == 1){
			return "pn:textures/models/reddeer/reddeer_male.png";	
		}else{
			return "pn:textures/models/reddeer/reddeer_female.png";	
		}
	}

	@Override
	public AnimalAIMoving movingType() {
		return AnimalAIMoving.TERESTIAL;
	}

	@Override
	public AnimalAIAttack attackType() {
		return AnimalAIAttack.CHARGE;
	}

	@Override
	public AnimalAIActivity activityType() {
		return AnimalAIActivity.DURINAL;
	}

	@Override
	public AnimalAIResponse responseType() {
		if(this.getGender() == 1){
			return AnimalAIResponse.TERRATIRIAL;

		}else{
			return AnimalAIResponse.AFRAID;
	
		}
	}

	@Override
	public boolean canBeTamed(ItemStack stackObj, EntityPlayer player) {
		return false;
	}

	@Override
	public int maxSubtypes() {
		return 0;
	}

	@Override
	public float maxSize() {
		return 10F;
	}

	@Override
	public float minSize() {
		return 0.5F;
	}

	@Override
	public int adultAge() {
		return 10;
	}

	@Override
	public void onSpawn() {
		this.setGender(this.getRNG().nextInt(2));
		this.setAnimalAge(this.adultAge());
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityRedDeer(worldObj);
	}

	@Override
	public float femaleSizeDifference() {
		return 0.8F;
	}


}
