package net.nodnarb.noob;

import net.fabricmc.api.ModInitializer;
import net.nodnarb.noob.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Noob implements ModInitializer {
	public static final String MOD_ID = "noob";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
