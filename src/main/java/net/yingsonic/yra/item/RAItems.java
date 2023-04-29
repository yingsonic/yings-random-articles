package net.yingsonic.yra.item;

import net.yingsonic.yra.RAConstants;
import net.yingsonic.yra.RandomArticles;
import net.yingsonic.yra.block.fluid.RAFluids;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class RAItems {

    public static final Item ZIRCONIUM_INGOT = register(RAConstants.Items.ZIRCONIUM_INGOT,
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RAW_ZIRCONIUM = register(RAConstants.Items.RAW_ZIRCONIUM,
            new Item(new FabricItemSettings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RAConstants.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(RAItemGroup.RA_MAIN, RAW_ZIRCONIUM);
        addToItemGroup(RAItemGroup.RA_MAIN, ZIRCONIUM_INGOT);
        addToItemGroup(RAItemGroup.RA_MAIN, RAFluids.HEALING_WATER_BUCKET);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        RandomArticles.LOGGER.info("Registering Items for " + RAConstants.MOD_ID);

        addItemsToItemGroup();
    }
}
