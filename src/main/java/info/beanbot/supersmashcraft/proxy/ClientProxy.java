package info.beanbot.supersmashcraft.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import info.beanbot.supersmashcraft.init.ModItems;
import info.beanbot.supersmashcraft.render.ItemRendererMasterSword;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public static void initMod()
    {
        MinecraftForgeClient.registerItemRenderer(ModItems.masterSword, new ItemRendererMasterSword());
    }
}
