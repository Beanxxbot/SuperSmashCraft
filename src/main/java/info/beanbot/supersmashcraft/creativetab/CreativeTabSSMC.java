package info.beanbot.supersmashcraft.creativetab;

import info.beanbot.supersmashcraft.init.ModItems;
import info.beanbot.supersmashcraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSSMC
{
    public static final CreativeTabs SSMC_LINK = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {return ModItems.linkCap;}

        @Override
        public String getTranslatedTabLabel() {return "Link's Items";}
    };
}
