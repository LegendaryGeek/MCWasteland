package geek.mcwasteland.weapons;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class Pistol10mm extends Item {
	
	public Pistol10mm() {
		int LoadedAmmo;
	}
 /**
  * Called when the equipped item is right clicked.
  */
 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
	 RayTraceResult RTResult = this.rayTrace(worldIn, playerIn, false);
	 if (RTResult.typeOfHit == RayTraceResult.Type.ENTITY ) {
		 RTResult.entityHit.attackEntityFrom(new EntityDamageSource("mcwasteland.gunshot", playerIn), 3);
	 } else if (RTResult.typeOfHit == RayTraceResult.Type.BLOCK) {
		 
	 }
	return null;
 }

}