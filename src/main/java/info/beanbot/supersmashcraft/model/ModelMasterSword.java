package info.beanbot.supersmashcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * MasterSword - Beanxxbot
 * Created using Tabula 4.0.2
 */
public class ModelMasterSword extends ModelBase {
    public ModelRenderer handle;
    public ModelRenderer handlebutt;
    public ModelRenderer Hilt;
    public ModelRenderer hilt3;
    public ModelRenderer hilt4;
    public ModelRenderer Hilt2;
    public ModelRenderer handlebutttip;
    public ModelRenderer blade1;

    public ModelMasterSword() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.handle = new ModelRenderer(this, 17, 0);
        this.handle.setRotationPoint(-0.5F, 10.0F, -0.5F);
        this.handle.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.hilt4 = new ModelRenderer(this, 34, 0);
        this.hilt4.setRotationPoint(-0.5F, 8.2F, -2.4F);
        this.hilt4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
        this.setRotateAngle(hilt4, -1.0471975511965976F, 0.0F, 0.0F);
        this.handlebutt = new ModelRenderer(this, 9, 0);
        this.handlebutt.setRotationPoint(-1.0F, 15.0F, -1.0F);
        this.handlebutt.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2);
        this.Hilt2 = new ModelRenderer(this, 22, 0);
        this.Hilt2.setRotationPoint(-0.5F, 8.9F, -0.4F);
        this.Hilt2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
        this.setRotateAngle(Hilt2, -0.3490658503988659F, 0.0F, 0.0F);
        this.blade1 = new ModelRenderer(this, 31, 0);
        this.blade1.setRotationPoint(-0.4F, -4.0F, -0.5F);
        this.blade1.addBox(0.4F, 0.0F, 0.0F, 0, 14, 1);
        this.handlebutttip = new ModelRenderer(this, 5, 0);
        this.handlebutttip.setRotationPoint(-0.5F, 15.5F, -0.5F);
        this.handlebutttip.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.hilt3 = new ModelRenderer(this, 34, 0);
        this.hilt3.setRotationPoint(-0.5F, 9.9F, 1.3F);
        this.hilt3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
        this.setRotateAngle(hilt3, 1.0471975511965976F, 0.0F, 0.0F);
        this.Hilt = new ModelRenderer(this, 22, 0);
        this.Hilt.setRotationPoint(-0.5F, 9.9F, -2.5F);
        this.Hilt.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
        this.setRotateAngle(Hilt, 0.3490658503988659F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.handle.render(f5);
        this.hilt4.render(f5);
        this.handlebutt.render(f5);
        this.Hilt2.render(f5);
        this.blade1.render(f5);
        this.handlebutttip.render(f5);
        this.hilt3.render(f5);
        this.Hilt.render(f5);
    }

    public void renderModel(float f)
    {
        this.handle.render(f);
        this.hilt4.render(f);
        this.handlebutt.render(f);
        this.Hilt2.render(f);
        this.blade1.render(f);
        this.handlebutttip.render(f);
        this.hilt3.render(f);
        this.Hilt.render(f);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
