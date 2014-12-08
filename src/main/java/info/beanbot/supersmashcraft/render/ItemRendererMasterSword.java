package info.beanbot.supersmashcraft.render;

import info.beanbot.supersmashcraft.model.ModelMasterSword;
import info.beanbot.supersmashcraft.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRendererMasterSword implements IItemRenderer
{
    protected ModelMasterSword modelMasterSword;
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "/textures/models/masterSword.png");

    public ItemRendererMasterSword()
    {
        modelMasterSword = new ModelMasterSword();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        switch(type)
        {
            case ENTITY: return true;
            case EQUIPPED_FIRST_PERSON: return true;
            case INVENTORY: return true;
            case EQUIPPED: return true;
            default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return helper == ItemRendererHelper.INVENTORY_BLOCK || helper == ItemRendererHelper.ENTITY_BOBBING || helper == ItemRendererHelper.ENTITY_ROTATION;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch(type)
        {
            case ENTITY:
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale1 = 1.5f;
                GL11.glScalef(scale1, scale1, scale1);
                GL11.glRotatef(-180F,1.0F,0.0F,0.0F);
                GL11.glRotatef(90f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(0.0F,-0.4F,0.0F);

                modelMasterSword.renderModel(0.0625F);

                GL11.glPopMatrix();
                break;
            case EQUIPPED_FIRST_PERSON:
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale2 = 3.0f;
                GL11.glScalef(scale2, scale2, scale2);
                GL11.glTranslatef(0.2f, 0.6f, 0.3f);
                GL11.glRotatef(180f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(90f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(-45f, 1.0f, 0.0f, 0.0f);

                modelMasterSword.renderModel(0.0625f);
                GL11.glPopMatrix();
                break;
            case EQUIPPED:
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale3 = 1.6f;
                GL11.glScalef(scale3, scale3, scale3);

                GL11.glRotatef(180f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(90f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(-45f, 1.0f, 0.0f, 0.0f);

                GL11.glTranslatef(0.0f, -0.6f, -0.4f);

                modelMasterSword.renderModel(0.0625f);
                GL11.glPopMatrix();
                break;
            case INVENTORY:
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale4 = 1.5f;
                GL11.glScalef(scale4, scale4, scale4);

                GL11.glRotatef(180f, 1.0f,0.0f,0.0f);
                GL11.glRotatef(45f, 0.0f,1.0f,0.0f);
                GL11.glRotatef(-45f, 1.0f,0.0f,0.0f);

                GL11.glTranslatef(-0.9f,0.0f,0.4f);

                modelMasterSword.renderModel(0.0625f);
                GL11.glPopMatrix();
                break;
            default:
                break;
        }
    }


}
