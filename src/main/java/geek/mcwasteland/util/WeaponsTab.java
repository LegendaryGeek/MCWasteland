package geek.mcwasteland.util;


import geek.mcwasteland.init.MCWastelandItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WeaponsTab extends CreativeTabs {

	public static WeaponsTab instance = null;
	public WeaponsTab() {
		super("MCWasteland Weapons");
		
	}
	
	public static void init()
	{
		instance = new WeaponsTab();
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
