package net.yingsonic.yra;
import net.yingsonic.yra.block.RABlocks;
import net.yingsonic.yra.block.fluid.RAFluids;
import net.yingsonic.yra.item.RAItemGroup;
import net.yingsonic.yra.item.RAItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomArticles implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("yra");
    @Override
    public void onInitialize() {
        long startInitTime = System.currentTimeMillis();
        LOGGER.info("Initializing YRA.");

        RAItemGroup.registerItemGroups();
        RAFluids.registerModFluids();
        RABlocks.registerModBlocks();
        RAItems.registerModItems();

        LOGGER.info("YRA initialization complete. (Took {}ms.)", System.currentTimeMillis() - startInitTime);
    }
}