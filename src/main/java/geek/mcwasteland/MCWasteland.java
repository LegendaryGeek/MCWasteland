package geek.mcwasteland;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import geek.mcwasteland.proxy.Proxy;
import geek.mcwasteland.util.WeaponsTab;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 */
@Mod(
	modid = MCWasteland.MODID,
	name = MCWasteland.NAME,
	version = MCWasteland.VERSION,
	dependencies = "required-after:forge@[14.23.4.2705,)",
	acceptedMinecraftVersions = "[1.12.2]",
	acceptableRemoteVersions = MCWasteland.VERSION)
public final class MCWasteland {

	/* The Mod's Instance. */
	//@Mod.Instance
	//private static ExampleMod instance = null

	/** ID of this Mod. */
	public static final String MODID = "mcwasteland";

	/** Display name of this Mod. */
	public static final String NAME = "";

	/** Version of this Mod. */
	public static final String VERSION = "1.0.0";
//	public static final String VERSION = "@MOD_VERSION@"

	/**
	 *
	 */
	public static final Logger LOGGER = LogManager.getLogger(MCWasteland.MODID);

	/**
	 *
	 */
	private static final class InstanceHolder {

		/**
		 * The Instance.
		 */
		private static final MCWasteland INSTANCE = new MCWasteland();
	}

	/**
	 *
	 * @return The Mod's Instance.
	 */
	@Mod.InstanceFactory
	public static MCWasteland instance() {
		return InstanceHolder.INSTANCE;
	}

	/**
	 *
 	 */
	@SidedProxy(
				clientSide = "geek.mcwasteland.proxy.ClientProxy",
				serverSide = "geek.mcwasteland.proxy.ServerProxy")
	private static Proxy proxy = null;

	/**
	 *
 	 * @param event The Event.
	 */
	@Mod.EventHandler
	public static void onFingerprintViolation(final FMLFingerprintViolationEvent event) {
		// This complains if jar not signed, even if certificateFingerprint is blank
		LOGGER.warn("Invalid Fingerprint");
	}

	/**
	 *
 	 * @param event The Event.
	 */
	@Mod.EventHandler
	public static void preInit(final FMLPreInitializationEvent event) {
		// Instead of setting the logger above, you can set it like this instead.
		// logger = event.getModLog()
		proxy.preInit(event);
	}

	/**
	 *
 	 * @param event The Event.
	 */
	@Mod.EventHandler
	public static void init(final FMLInitializationEvent event) {
		proxy.init(event);
		WeaponsTab.init();
	}

	/**
	 *
 	 * @param event The Event.
	 */
	@Mod.EventHandler
	public static void receiveIMC(final IMCEvent event) {
		proxy.receiveIMC(event);
	}

	/**
	 *
 	 * @param event The Event.
	 */
	@Mod.EventHandler
	public static void postInit(final FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	public static World getWorld() {
		return proxy.getWorld();
	}

	/*
	// Before 1.12
	@Mod.EventHandler
	public static void onRemap(final FMLMissingMappingsEvent event) {
		proxy.onRemap(event);
	}
	*/
}

