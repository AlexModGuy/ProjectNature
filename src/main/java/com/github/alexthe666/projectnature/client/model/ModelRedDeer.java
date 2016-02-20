package com.github.alexthe666.projectnature.client.model;

import com.github.alexthe666.projectnature.utils.ModelUtils;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelBase;
import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRedDeer extends MowzieModelBase {
    public MowzieModelRenderer Body;
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
    public MowzieModelRenderer Neck2;
    public MowzieModelRenderer HeadBase;
    public MowzieModelRenderer HeadPivot;
    public MowzieModelRenderer HeadFront;
    public MowzieModelRenderer Jaw;
    public MowzieModelRenderer EarR;
    public MowzieModelRenderer EarL;
    public MowzieModelRenderer LAntlerBase;
    public MowzieModelRenderer RAntlerBase;
    public MowzieModelRenderer Nose;
    public MowzieModelRenderer LAntlerProng1;
    public MowzieModelRenderer LAntlerProng2;
    public MowzieModelRenderer LAntlerProng3;
    public MowzieModelRenderer RAntlerProng1;
    public MowzieModelRenderer RAntlerProng2;
    public MowzieModelRenderer RAntlerProng3;
    public MowzieModelRenderer LegR2;

    public ModelRedDeer() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Tail = new MowzieModelRenderer(this, 50, 17);
        this.Tail.setRotationPoint(0.0F, -1.6F, 11.2F);
        this.Tail.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Tail, -1.0016444577195458F, 0.0F, 0.0F);
        this.EarL = new MowzieModelRenderer(this, 3, 3);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(2.0F, -2.2F, 0.0F);
        this.EarL.addBox(-0.6F, -1.1F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(EarL, -1.9198621771937625F, 0.13962634015954636F, 1.0471975511965976F);
        this.RAntlerProng1 = new MowzieModelRenderer(this, 13, 1);
        this.RAntlerProng1.setRotationPoint(0.0F, -0.6F, -2.1F);
        this.RAntlerProng1.addBox(-0.5F, -0.5F, 0.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(RAntlerProng1, -2.6179938779914944F, 1.2292353921796064F, 0.22759093446006054F);
        this.RAntlerProng2 = new MowzieModelRenderer(this, 17, 1);
        this.RAntlerProng2.setRotationPoint(0.0F, -0.8F, -4.1F);
        this.RAntlerProng2.addBox(0.0F, -0.3F, 0.7F, 1, 1, 6, 0.0F);
        this.setRotateAngle(RAntlerProng2, 0.5918411493512771F, 2.5497515042385164F, -3.141592653589793F);
        this.RAntlerBase = new MowzieModelRenderer(this, 30, 3);
        this.RAntlerBase.setRotationPoint(-0.8F, -2.0F, -1.5F);
        this.RAntlerBase.addBox(-0.4F, -1.0F, -5.8F, 1, 1, 7, 0.0F);
        this.setRotateAngle(RAntlerBase, -2.0943951023931953F, -0.03490658503988659F, -0.6283185307179586F);
        this.Jaw = new MowzieModelRenderer(this, 17, 11);
        this.Jaw.setRotationPoint(0.0F, 0.8F, -2.9F);
        this.Jaw.addBox(-1.5F, -0.7F, -5.3F, 3, 1, 6, 0.0F);
        this.setRotateAngle(Jaw, -0.045553093477052F, 0.0F, 0.0F);
        this.HeadFront = new MowzieModelRenderer(this, 0, 9);
        this.HeadFront.setRotationPoint(0.0F, -0.7F, -2.9F);
        this.HeadFront.addBox(-1.5F, -1.4F, -5.4F, 3, 2, 5, 0.0F);
        this.setRotateAngle(HeadFront, 0.091106186954104F, 0.0F, 0.0F);
        this.Neck1 = new MowzieModelRenderer(this, 0, 27);
        this.Neck1.setRotationPoint(0.0F, 0.4F, -4.7F);
        this.Neck1.addBox(-2.0F, -2.0F, -6.0F, 4, 5, 8, 0.0F);
        this.setRotateAngle(Neck1, -0.7285004297824331F, 0.0F, 0.0F);
        this.HeadPivot = new MowzieModelRenderer(this, 0, 0);
        this.HeadPivot.setRotationPoint(0.0F, -0.6F, -4.8F);
        this.setRotateAngle(HeadPivot, 1.3658946726107624F, 0.0F, 0.0F);
        this.HeadBase = new MowzieModelRenderer(this, 0, 16);
        this.HeadBase.addBox(-2.5F, -2.51F, -3.8F, 5, 4, 5, 0.0F);
        this.Body = new MowzieModelRenderer(this, 34, 47);
        this.Body.setRotationPoint(0.0F, 8.7F, -4.0F);
        this.Body.addBox(-3.0F, -3.0F, -6.0F, 6, 8, 9, 0.0F);
        this.EarR = new MowzieModelRenderer(this, 3, 3);
        this.EarR.setRotationPoint(-2.0F, -2.2F, 0.0F);
        this.EarR.addBox(-1.4F, -1.1F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(EarR, -1.9198621771937625F, -0.13962634015954636F, -1.0471975511965976F);
        this.LowerBody = new MowzieModelRenderer(this, 30, 25);
        this.LowerBody.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.LowerBody.addBox(-2.5F, -2.7F, -0.1F, 5, 7, 12, 0.0F);
        this.LAntlerProng2 = new MowzieModelRenderer(this, 17, 1);
        this.LAntlerProng2.mirror = true;
        this.LAntlerProng2.setRotationPoint(0.0F, -0.8F, -4.1F);
        this.LAntlerProng2.addBox(-1.0F, -0.3F, 0.7F, 1, 1, 6, 0.0F);
        this.setRotateAngle(LAntlerProng2, 0.5918411493512771F, -2.5497515042385164F, 3.141592653589793F);
        this.LAntlerProng1 = new MowzieModelRenderer(this, 13, 1);
        this.LAntlerProng1.mirror = true;
        this.LAntlerProng1.setRotationPoint(0.0F, -0.6F, -2.1F);
        this.LAntlerProng1.addBox(-0.5F, -0.5F, 0.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(LAntlerProng1, -2.6179938779914944F, -1.2210323446952327F, -0.22759093446006054F);
        this.LAntlerBase = new MowzieModelRenderer(this, 30, 3);
        this.LAntlerBase.mirror = true;
        this.LAntlerBase.setRotationPoint(0.8F, -2.0F, -1.5F);
        this.LAntlerBase.addBox(-0.6F, -1.1F, -5.8F, 1, 1, 7, 0.0F);
        this.setRotateAngle(LAntlerBase, -2.0943951023931953F, -0.03490658503988659F, 0.6283185307179586F);
        this.Nose = new MowzieModelRenderer(this, 0, 3);
        this.Nose.setRotationPoint(0.0F, -1.2F, -4.4F);
        this.Nose.addBox(-0.5F, -0.4F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Nose, 0.136659280431156F, 0.0F, 0.0F);
        this.RAntlerProng3 = new MowzieModelRenderer(this, 40, 6);
        this.RAntlerProng3.setRotationPoint(0.5F, -0.5F, -5.5F);
        this.RAntlerProng3.addBox(-0.5F, -0.1F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(RAntlerProng3, 0.4553564018453205F, -3.096039560112741F, 1.5025539530419183F);
        this.Neck2 = new MowzieModelRenderer(this, 21, 25);
        this.Neck2.setRotationPoint(0.0F, 0.8F, -5.3F);
        this.Neck2.addBox(-2.01F, -2.21F, -5.01F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Neck2, -0.27314402793711257F, 0.0F, 0.0F);
        this.LAntlerProng3 = new MowzieModelRenderer(this, 40, 6);
        this.LAntlerProng3.mirror = true;
        this.LAntlerProng3.setRotationPoint(-0.5F, -0.5F, -5.5F);
        this.LAntlerProng3.addBox(-0.5F, -0.1F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(LAntlerProng3, 0.4553564018453205F, 3.096039560112741F, -1.5025539530419183F);
        this.BackLegL1 = new MowzieModelRenderer(this, 20, 52);
        this.BackLegL1.setRotationPoint(-2.5F, 8.2F, 6.699999999999999F);
        this.BackLegL1.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 4, 0.0F);
        this.BackLegR1 = new MowzieModelRenderer(this, 20, 52);
        this.BackLegR1.mirror = true;
        this.BackLegR1.setRotationPoint(2.5F, 8.2F, 6.699999999999999F);
        this.BackLegR1.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 4, 0.0F);
        this.BackLegR2 = new MowzieModelRenderer(this, 0, 43);
        this.BackLegR2.mirror = true;
        this.BackLegR2.setRotationPoint(0.0F, 7.7F, 1.3F);
        this.BackLegR2.addBox(-1.01F, 0.0F, -0.7F, 2, 8, 2, 0.0F);
        this.BackLegL2 = new MowzieModelRenderer(this, 0, 43);
        this.BackLegL2.setRotationPoint(0.0F, 7.7F, 1.3F);
        this.BackLegL2.addBox(-1.01F, 0.0F, -0.7F, 2, 8, 2, 0.0F);
        this.LegL1 = new MowzieModelRenderer(this, 0, 54);
        this.LegL1.mirror = true;
        this.LegL1.setRotationPoint(2.5F, 9.7F, -7.5F);
        this.LegL1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.LegL2 = new MowzieModelRenderer(this, 11, 54);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0F, 6.4F, 0.0F);
        this.LegL2.addBox(-1.01F, 0.0F, -1.6F, 2, 8, 2, 0.0F);
        this.LegR1 = new MowzieModelRenderer(this, 0, 54);
        this.LegR1.setRotationPoint(-2.5F, 9.7F, -7.5F);
        this.LegR1.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.LegR2 = new MowzieModelRenderer(this, 11, 54);
        this.LegR2.setRotationPoint(0.0F, 6.4F, 0.0F);
        this.LegR2.addBox(-1.01F, 0.0F, -1.6F, 2, 8, 2, 0.0F);
        this.LowerBody.addChild(this.Tail);
        this.HeadBase.addChild(this.EarL);
        this.RAntlerBase.addChild(this.RAntlerProng1);
        this.RAntlerBase.addChild(this.RAntlerProng2);
        this.BackLegR1.addChild(this.BackLegR2);
        this.HeadBase.addChild(this.RAntlerBase);
        this.HeadBase.addChild(this.Jaw);
        this.HeadBase.addChild(this.HeadFront);
        this.Body.addChild(this.Neck1);
        this.Neck2.addChild(this.HeadPivot);
        this.HeadPivot.addChild(this.HeadBase);
        this.LegL1.addChild(this.LegL2);
        this.BackLegL1.addChild(this.BackLegL2);
        this.HeadBase.addChild(this.EarR);
        this.LegR1.addChild(this.LegR2);
        this.Body.addChild(this.LowerBody);
        this.LAntlerBase.addChild(this.LAntlerProng2);
        this.LAntlerBase.addChild(this.LAntlerProng1);
        this.HeadBase.addChild(this.LAntlerBase);
        this.HeadFront.addChild(this.Nose);
        this.RAntlerBase.addChild(this.RAntlerProng3);
        this.Neck1.addChild(this.Neck2);
        this.LAntlerBase.addChild(this.LAntlerProng3);
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
		MowzieModelRenderer[] neckParts = {this.Neck1, this.Neck2};

		this.faceTarget(HeadBase, 2, f3, f4);
		this.faceTarget(Neck1, 2, f3, f4);

		float speed = 0.1F;
		float speed2 = 0.5F;
		this.bob(Body, speed, 0.2F, false, entity.ticksExisted, 1);
		this.walk(BackLegL1, speed2, 0.8F, false, 0F, 0.4F, f, f1);
		this.walk(BackLegL2, speed2, 0.2F, false, 0F, -0.6F, f, f1);
		this.walk(BackLegR1, speed2, 0.8F, true, 0F, 0.4F, f, f1);
		this.walk(BackLegR2, speed2, 0.2F, true, 0F, -0.6F, f, f1);
		this.walk(LegR1, speed2, 0.8F, true, 0F, -0.4F, f, f1);
		this.walk(LegR2, speed2, 0.2F, true, 0F, 0.6F, f, f1);
		this.walk(LegL1, speed2, 0.8F, false, 0F, -0.4F, f, f1);
		this.walk(LegL2, speed2, 0.2F, false, 0F, 0.6F, f, f1);
		this.chainWave(tailParts, speed, 0.05F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed, 0.15F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed2, 0.25F, -3, f, f1);
		this.chainWave(neckParts, speed, 0.05F, 4, entity.ticksExisted, 1);

    }


    public void setRotateAngle(MowzieModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
