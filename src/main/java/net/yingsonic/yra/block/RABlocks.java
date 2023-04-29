package net.yingsonic.yra.block;

import net.yingsonic.yra.RAConstants;
import net.yingsonic.yra.RandomArticles;
import net.yingsonic.yra.block.fluid.HealingWaterBlock;
import net.yingsonic.yra.block.fluid.RAFluids;
import net.yingsonic.yra.item.RAItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class RABlocks {

    // Regular
    public static final Block ZIRCONIUM_ORE = register(RAConstants.Blocks.ZIRCONIUM_ORE,
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(1,3)), RAItemGroup.RA_MAIN);

    private static Block register(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(RAConstants.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(RAConstants.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks() {
        RandomArticles.LOGGER.info("Registering Blocks for " + RAConstants.MOD_ID);
    }
}
