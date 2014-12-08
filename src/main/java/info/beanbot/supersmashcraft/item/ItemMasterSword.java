package info.beanbot.supersmashcraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import info.beanbot.supersmashcraft.creativetab.CreativeTabSSMC;

public class ItemMasterSword extends ItemSSMC
{
    public ItemMasterSword()
    {
        super();
        this.setCreativeTab(CreativeTabSSMC.SSMC_LINK);
        this.setUnlocalizedName("masterSword");
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {return true;}
}
