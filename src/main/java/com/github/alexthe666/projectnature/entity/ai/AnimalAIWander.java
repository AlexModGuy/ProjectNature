package com.github.alexthe666.projectnature.entity.ai;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.Vec3;

import com.github.alexthe666.projectnature.api.EnumOrder;
import com.github.alexthe666.projectnature.entity.EntityProjectNatureMob;

public class AnimalAIWander extends EntityAIBase
{
    private EntityProjectNatureMob mob;
    private double xPosition;
    private double yPosition;
    private double zPosition;

    public AnimalAIWander(EntityProjectNatureMob mob)
    {
        this.mob = mob;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (this.mob.currentOrder == null)
        {
            this.mob.currentOrder = EnumOrder.WANDER;
        }

        if (this.mob.getRNG().nextInt(120) != 0)
        {
            return false;
        }
        else if (this.mob.isTamed() && this.mob.currentOrder != EnumOrder.WANDER)
        {
            return false;
        }
        else
        {
            Vec3 vec3 = RandomPositionGenerator.findRandomTarget(this.mob, 10, 7);

            if (vec3 == null)
            {
                return false;
            }
            else
            {
                this.xPosition = vec3.xCoord;
                this.yPosition = vec3.yCoord;
                this.zPosition = vec3.zCoord;
                return true;
            }
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return !this.mob.getNavigator().noPath();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.mob.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, 1);
    }
}
