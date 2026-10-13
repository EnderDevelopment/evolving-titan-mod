package com.crafterephraimmiazi.parasiticoverlordmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParasiticOverlordMod implements ModInitializer {
    public static final String MOD_ID = "parasiticoverlordmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Parasitic Overlord Mod");
        // Register items, blocks, and entities here
    }
}
