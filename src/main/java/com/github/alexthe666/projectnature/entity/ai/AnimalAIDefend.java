package com.github.alexthe666.projectnature.entity.ai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;

import com.github.alexthe666.projectnature.api.EnumOrder;
import com.github.alexthe666.projectnature.entity.EntityProjectNatureMob;

public class AnimalAIDefend extends EntityAITarget
{
    EntityProjectNatureMob mob;
    EntityLivingBase theOwnerAttacker;
    private int field_142051_e;
    private static final String __OBFID = "CL_00001624";

    public AnimalAIDefend(EntityProjectNatureMob mob)
    {
        super(mob, false);
        this.mob = mob;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if(mob.riddenByEntity != null){
        	 if(mob.riddenByEntity == mob.getOwner()){
             	return false;
             }	
        }

        if (!this.mob.isTamed())
        {
            return false;
        }
        else
        {
            EntityLivingBase entitylivingbase = (EntityLivingBase) this.mob.getOwner();

            if (entitylivingbase == null)
            {
                return false;
            }
            else
            {
                this.theOwnerAttacker = entitylivingbase.getAITarget();
                int i =  entitylivingbase.getRevengeTimer();
                return i != this.field_142051_e && this.isSuitableTarget(this.theOwnerAttacker, false) && this.mob.func_142018_a(this.theOwnerAttacker, entitylivingbase);
            }
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
    	 if(mob.worldObj.getClosestPlayerToEntity(mob, 16) != null){
         	if(mob.worldObj.getClosestPlayerToEntity(mob, 16) == mob.getOwner()){
         		if(mob.currentOrder == EnumOrder.SIT){
         			mob.currentOrder = EnumOrder.WANDER;
         		}
         	}
         }
        this.taskOwner.setAttackTarget(this.theOwnerAttacker);
        EntityLivingBase entitylivingbase = (EntityLivingBase) this.mob.getOwner();

        if (entitylivingbase != null)
        {
            this.field_142051_e = entitylivingbase.getRevengeTimer();
        }
       

        super.startExecuting();
    }
}