package geek.mcwasteland.util;


import geek.mcwasteland.MCWasteland;
import geek.mcwasteland.init.MCWastelandItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GeekTab extends CreativeTabs {

	public static GeekTab instance = null;
	public GeekTab() {
		super(MCWasteland.MODID);
		
		// TODO Auto-generated constructor stub
	}
	
	public static void init()
	{
		instance = new GeekTab();
	}
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(MCWastelandItems.Stimpack);
	}
	
	public CreativeTabs getCTab() {
		return this;
	}

}
