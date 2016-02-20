package com.github.alexthe666.projectnature.client.model;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelBase;
import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.minecraft.entity.Entity;

import com.github.alexthe666.projectnature.utils.ModelUtils;

public class ModelPNRabbit extends MowzieModelBase {

    public MowzieModelRenderer Body;
    public MowzieModelRenderer headpivot;
    public MowzieModelRenderer LegL1;
    public MowzieModelRenderer LowerBody;
    public MowzieModelRenderer Neck1;
    public MowzieModelRenderer LegR1;
    public MowzieModelRenderer LegL2;
    public MowzieModelRenderer Tail;
    public MowzieModelRenderer BackLegR1;
    public MowzieModelRenderer BackLegL1;
    public MowzieModelRenderer BackLegR2;
    public MowzieModelRenderer BackLegL2;
    public MowzieModelRenderer HeadBase;
    public MowzieModelRenderer HeadFront;
    public MowzieModelRenderer Jaw;
    public MowzieModelRenderer EarR;
    public MowzieModelRenderer EarL;
    public MowzieModelRenderer WhiskerR1;
    public MowzieModelRenderer WhiskerR2;
    public MowzieModelRenderer WhiskerL1;
    public MowzieModelRenderer WhiskerL2;
    public MowzieModelRenderer Nose;
    public MowzieModelRenderer LegR2;

    public ModelPNRabbit() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BackLegR2 = new MowzieModelRenderer(this, 0, 43);
        this.BackLegR2.mirror = true;
        this.BackLegR2.setRotationPoint(0.0F, 5.1F, 2.2F);
        this.BackLegR2.addBox(-1.01F, -1.4F, -0.7F, 2, 8, 2, 0.0F);
        this.setRotateAngle(BackLegR2, -1.0297442586766543F, 0.0F, 0.0F);
        this.Jaw = new MowzieModelRenderer(this, 17, 11);
        this.Jaw.setRotationPoint(0.0F, 1.5F, -2.9F);
        this.Jaw.addBox(-1.5F, -0.7F, -2.7F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Jaw, -0.045553093477052F, 0.0F, 0.0F);
        this.HeadFront = new MowzieModelRenderer(this, 0, 9);
        this.HeadFront.setRotationPoint(0.0F, -0.5F, -3.2F);
        this.HeadFront.addBox(-1.5F, -1.7F, -2.6F, 3, 3, 3, 0.0F);
        this.setRotateAngle(HeadFront, 0.091106186954104F, 0.0F, 0.0F);
        this.Neck1 = new MowzieModelRenderer(this, 0, 27);
        this.Neck1.setRotationPoint(0.0F, 0.4F, -3.7F);
        this.Neck1.addBox(-2.0F, -2.0F, -6.0F, 4, 5, 8, 0.0F);
        this.setRotateAngle(Neck1, -0.5918411493512771F, 0.0F, 0.0F);
        this.EarR = new MowzieModelRenderer(this, 3, 0);
        this.EarR.setRotationPoint(-2.0F, -2.2F, 0.0F);
        this.EarR.addBox(-1.4F, -1.1F, -5.7F, 2, 1, 6, 0.0F);
        this.setRotateAngle(EarR, -2.792526803190927F, 0.12217304763960307F, -1.0471975511965976F);
        this.LegR2 = new MowzieModelRenderer(this, 11, 54);
        this.LegR2.setRotationPoint(0.0F, 3.9F, 0.7F);
        this.LegR2.addBox(-0.99F, 0.0F, -1.6F, 2, 5, 2, 0.0F);
        this.setRotateAngle(LegR2, -0.19198621771937624F, 0.0F, 0.0F);
        this.LegL1 = new MowzieModelRenderer(this, 0, 54);
        this.LegL1.mirror = true;
        this.LegL1.setRotationPoint(2.5F, 1.0F, -3.5F);
        this.LegL1.addBox(-1.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
        this.LegL2 = new MowzieModelRenderer(this, 11, 54);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0F, 3.9F, 0.7F);
        this.LegL2.addBox(-1.01F, 0.0F, -1.6F, 2, 5, 2, 0.0F);
        this.setRotateAngle(LegL2, -0.19198621771937624F, 0.0F, 0.0F);
        this.LegR1 = new MowzieModelRenderer(this, 0, 54);
        this.LegR1.setRotationPoint(-2.5F, 1.0F, -3.5F);
        this.LegR1.addBox(-1.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
        this.EarL = new MowzieModelRenderer(this, 3, 0);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(2.0F, -2.2F, 0.0F);
        this.EarL.addBox(-0.6F, -1.1F, -5.7F, 2, 1, 6, 0.0F);
        this.setRotateAngle(EarL, -2.792526803190927F, -0.12217304763960307F, 1.0471975511965976F);
        this.Body = new MowzieModelRenderer(this, 34, 47);
        this.Body.setRotationPoint(0.0F, 14.5F, -2.0F);
        this.Body.addBox(-2.5F, -3.0F, -4.9F, 5, 8, 7, 0.0F);
        this.setRotateAngle(Body, -0.045553093477052F, 0.0F, 0.0F);
        this.WhiskerR1 = new MowzieModelRenderer(this, 0, 2);
        this.WhiskerR1.mirror = true;
        this.WhiskerR1.setRotationPoint(-0.5F, -0.2F, -2.1F);
        this.WhiskerR1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(WhiskerR1, -0.136659280431156F, 1.5481070465189704F, 0.0F);
        this.WhiskerR2 = new MowzieModelRenderer(this, 0, 2);
        this.WhiskerR2.mirror = true;
        this.WhiskerR2.setRotationPoint(-0.4F, 0.3F, -2.6F);
        this.WhiskerR2.addBox(-1.0F, -0.5F, -1.9F, 1, 1, 2, 0.0F);
        this.setRotateAngle(WhiskerR2, 0.091106186954104F, 1.5481070465189704F, 0.0F);
        this.BackLegR1 = new MowzieModelRenderer(this, 20, 52);
        this.BackLegR1.mirror = true;
        this.BackLegR1.setRotationPoint(3.8F, 0.6F, 6.6F);
        this.BackLegR1.addBox(-1.0F, 0.0F, -1.5F, 2, 6, 4, 0.0F);
        this.setRotateAngle(BackLegR1, -0.08726646259971647F, 0.0F, 0.0F);

        this.headpivot = new MowzieModelRenderer(this, 0, 0);
        this.headpivot.setRotationPoint(0.0F, 0.3F, -5.2F);
        this.headpivot.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(headpivot, 0.9105382707654417F, 0.0F, 0.0F);
        this.HeadBase = new MowzieModelRenderer(this, 0, 16);
        this.HeadBase.setRotationPoint(0,0,0);
        this.HeadBase.addBox(-2.5F, -2.51F, -3.0F, 5, 5, 4, 0.0F);
        this.Tail = new MowzieModelRenderer(this, 51, 18);
        this.Tail.setRotationPoint(0.0F, -0.9F, 9.9F);
        this.Tail.addBox(-1.5F, -2.0F, -0.9F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Tail, -2.0488420089161434F, 0.0F, 0.0F);
        this.BackLegL1 = new MowzieModelRenderer(this, 20, 52);
        this.BackLegL1.setRotationPoint(-3.8F, 0.6F, 6.6F);
        this.BackLegL1.addBox(-1.0F, 0.0F, -1.5F, 2, 6, 4, 0.0F);
        this.setRotateAngle(BackLegL1, -0.08726646259971647F, 0.0F, 0.0F);
        this.LowerBody = new MowzieModelRenderer(this, 30, 25);
        this.LowerBody.setRotationPoint(0.0F, -0.7F, 0.2F);
        this.LowerBody.addBox(-3.0F, -2.9F, 0.6F, 6, 8, 9, 0.0F);
        this.setRotateAngle(LowerBody, -0.40980330836826856F, 0.0F, 0.0F);
        this.BackLegL2 = new MowzieModelRenderer(this, 0, 43);
        this.BackLegL2.setRotationPoint(0.0F, 5.1F, 2.2F);
        this.BackLegL2.addBox(-0.99F, -1.4F, -0.7F, 2, 8, 2, 0.0F);
        this.setRotateAngle(BackLegL2, -1.0297442586766543F, 0.0F, 0.0F);
        this.Nose = new MowzieModelRenderer(this, 0, 0);
        this.Nose.setRotationPoint(0.0F, -0.4F, -2.2F);
        this.Nose.addBox(-1.0F, -0.9F, -0.6F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Nose, -0.136659280431156F, 0.0F, 0.0F);
        this.WhiskerL2 = new MowzieModelRenderer(this, 0, 2);
        this.WhiskerL2.setRotationPoint(0.4F, 0.3F, -2.6F);
        this.WhiskerL2.addBox(0.0F, -0.5F, -1.9F, 1, 1, 2, 0.0F);
        this.setRotateAngle(WhiskerL2, 0.091106186954104F, -1.5481070465189704F, 0.0F);
        this.WhiskerL1 = new MowzieModelRenderer(this, 0, 2);
        this.WhiskerL1.setRotationPoint(0.5F, -0.2F, -2.1F);
        this.WhiskerL1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(WhiskerL1, -0.136659280431156F, -1.5481070465189704F, 0.0F);
        this.BackLegR1.addChild(this.BackLegR2);
        this.HeadBase.addChild(this.Jaw);
        this.HeadBase.addChild(this.HeadFront);
        this.Body.addChild(this.Neck1);
        this.HeadBase.addChild(this.EarR);
        this.LegR1.addChild(this.LegR2);
        this.Body.addChild(this.LegL1);
        this.LegL1.addChild(this.LegL2);
        this.Body.addChild(this.LegR1);
        this.HeadBase.addChild(this.EarL);
        this.HeadFront.addChild(this.WhiskerR1);
        this.HeadFront.addChild(this.WhiskerR2);
        this.LowerBody.addChild(this.BackLegR1);
        this.Neck1.addChild(this.headpivot);
        this.headpivot.addChild(this.HeadBase);
        this.LowerBody.addChild(this.Tail);
        this.LowerBody.addChild(this.BackLegL1);
        this.Body.addChild(this.LowerBody);
        this.BackLegL1.addChild(this.BackLegL2);
        this.HeadFront.addChild(this.Nose);
        this.HeadFront.addChild(this.WhiskerL2);
        this.HeadFront.addChild(this.WhiskerL1);
		ModelUtils.doMowzieStuff(boxList, false);
    }


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		ModelUtils.doMowzieStuff(boxList, true);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		ModelUtils.renderAll(boxList);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		MowzieModelRenderer[] tailParts = {this.Tail};
		
		this.faceTarget(HeadBase, 1, f3, f4);
		this.faceTarget(Neck1, 2, f3, f4);
		float speed = 0.5F;
		float speed2 = 0.2F;
		this.bob(Body, speed, 6.8F, false, f, f1);
		this.walk(LegR1, speed, 0.8F, true, 0F, -0.4F, f, f1);
		this.walk(LegL1, speed, 0.8F, true, 0F, -0.4F, f, f1);
		this.walk(LegR2, speed, 0.2F, true, 0F, -0.4F, f, f1);
		this.walk(LegL2, speed, 0.2F, true, 0F, -0.4F, f, f1);
		this.walk(BackLegR1, speed, -0.8F, true, 0F, -0.4F, f, -f1);
		this.walk(BackLegL1, speed, -0.8F, true, 0F, -0.4F, f, -f1);
		this.walk(BackLegR2, speed, 0.2F, true, 0F, 0.4F, f, f1);
		this.walk(BackLegL2, speed, 0.2F, true, 0F, 0.4F, f, f1);
		this.chainWave(tailParts, speed2, 0.05F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed2, 0.15F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed, 0.25F, -3, f, f1);
	}

	public void setRotateAngle(MowzieModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
