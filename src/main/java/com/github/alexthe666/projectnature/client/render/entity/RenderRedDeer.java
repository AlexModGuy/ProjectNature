package com.github.alexthe666.projectnature.client.render.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.github.alexthe666.projectnature.client.model.ModelRedDeer;
import com.github.alexthe666.projectnature.entity.EntityProjectNatureMob;

public class RenderRedDeer extends RenderLiving {

	public RenderRedDeer(RenderManager renderManager) {
		super(renderManager, new ModelRedDeer(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		if(entity instanceof EntityProjectNatureMob){
			return new ResourceLocation(((EntityProjectNatureMob)entity).getTexture());
		}
		return null;
	}

}
