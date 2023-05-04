package net.yingsonic.yra.block;

import net.yingsonic.yra.RAConstants;
import net.yingsonic.yra.RandomArticles;
import net.yingsonic.yra.item.RAItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class RABlocks {

    // Wood
    public static final Block DESERT_WILLOW_LOG = register(RAConstants.Blocks.DESERT_WILLOW_LOG,
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), RAItemGroups.RA_MAIN);
    public static final Block DESERT_WILLOW_WOOD = register(RAConstants.Blocks.DESERT_WILLOW_WOOD,
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), RAItemGroups.RA_MAIN);

    public static final Block STRIPPED_DESERT_WILLOW_LOG = register(RAConstants.Blocks.STRIPPED_DESERT_WILLOW_LOG,
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), RAItemGroups.RA_MAIN);
    public static final Block STRIPPED_DESERT_WILLOW_WOOD = register(RAConstants.Blocks.STRIPPED_DESERT_WILLOW_WOOD,
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), RAItemGroups.RA_MAIN);

    public static final Block DESERT_WILLOW_PLANKS = register(RAConstants.Blocks.DESERT_WILLOW_PLANKS,
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), RAItemGroups.RA_MAIN);

    // Tree Part
    public static final Block DESERT_WILLOW_LEAVES = register(RAConstants.Blocks.DESERT_WILLOW_LEAVES,
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()), RAItemGroups.RA_MAIN);
    public static final Block DESERT_WILLOW_SAPLING = register(RAConstants.Blocks.DESERT_WILLOW_SAPLING,
            new SaplingBlock(null, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), RAItemGroups.RA_MAIN);

    // Ore
    public static final Block ZIRCONIUM_ORE = register(RAConstants.Blocks.ZIRCONIUM_ORE,
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(1,3)), RAItemGroups.RA_MAIN);

    private static Block register(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(RAConstants.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(RAConstants.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModBlocks() {
        RandomArticles.LOGGER.info("Registering Blocks for " + RAConstants.MOD_ID);
    }
}
