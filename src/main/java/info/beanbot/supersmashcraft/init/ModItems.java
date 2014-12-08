package info.beanbot.supersmashcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import info.beanbot.supersmashcraft.item.ItemLinkCap;
import info.beanbot.supersmashcraft.item.ItemMasterSword;
import info.beanbot.supersmashcraft.item.ItemSSMC;
import info.beanbot.supersmashcraft.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Declare Items
    public static ItemSSMC linkCap = new ItemLinkCap();
    public static ItemSSMC masterSword = new ItemMasterSword();


    //Initialize Items
    public static void init()
    {
        GameRegistry.registerItem(linkCap, "linkCap");
        GameRegistry.registerItem(masterSword, "masterSword");
    }

}
