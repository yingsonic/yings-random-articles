package net.yingsonic.yra.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.yingsonic.yra.block.RABlocks;
import net.yingsonic.yra.item.RAItemGroups;
import net.yingsonic.yra.item.RAItems;

public class RALootTableGenerator extends FabricBlockLootTableProvider {
    public RALootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(RABlocks.ZIRCONIUM_ORE, oreDrops(RABlocks.ZIRCONIUM_ORE, RAItems.RAW_ZIRCONIUM));

        addDrop(RABlocks.DESERT_WILLOW_LOG);
        addDrop(RABlocks.DESERT_WILLOW_WOOD);
        addDrop(RABlocks.STRIPPED_DESERT_WILLOW_LOG);
        addDrop(RABlocks.STRIPPED_DESERT_WILLOW_WOOD);
        addDrop(RABlocks.DESERT_WILLOW_PLANKS);
    }
}
