package com.github.alexthe666.projectnature.core;

import java.util.Random;

import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.github.alexthe666.projectnature.ProjectNature;
import com.github.alexthe666.projectnature.entity.mob.EntityRedDeer;

public class ModEntites{

	public static void init(){
		registerSpawnable(EntityRedDeer.class, "pn.reddeer", 0X593817, 0X795C3D);
	}
	
	public static void registerSpawnable(Class entityClass, String name, int mainColor, int subColor){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.registerModEntity(entityClass, name, entityId, ProjectNature.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}
	
	public static void registerUnspawnable(Class entityClass, String name){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.registerModEntity(entityClass, name, entityId, ProjectNature.instance, 64, 1, true);

	}
	
}
