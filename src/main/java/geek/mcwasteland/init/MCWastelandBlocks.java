package geek.mcwasteland.init;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import geek.mcwasteland.block.*;
import geek.mcwasteland.*;

@GameRegistry.ObjectHolder(MCWasteland.MODID)
public class MCWastelandBlocks {



	/**
	 *
 	 */
	@ObjectHolder("mcwasteland:terminal")
	public static final Block Terminal = new Terminal();
	

	/**
	 *
	 */
	public static final Block EXAMPLE_FLUID = null;
}

