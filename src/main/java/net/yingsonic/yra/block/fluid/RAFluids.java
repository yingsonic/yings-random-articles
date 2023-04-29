package net.yingsonic.yra.block.fluid;

import net.minecraft.block.Blocks;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.yingsonic.yra.RAConstants;
import net.yingsonic.yra.RandomArticles;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RAFluids {
    public static final FlowableFluid HEALING_WATER = new HealingWaterFluid.Still();
    public static final FlowableFluid FLOWING_HEALING_WATER = new HealingWaterFluid.Flowing();

    public static final Block HEALING_WATER_BLOCK = new HealingWaterBlock(RAFluids.HEALING_WATER,
            FabricBlockSettings.copyOf(Blocks.WATER));

    public static final Item HEALING_WATER_BUCKET = new BucketItem(RAFluids.HEALING_WATER, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));

    public static void registerModFluids() {
        Registry.register(Registries.FLUID, new Identifier(RAConstants.MOD_ID, RAConstants.Fluids.HEALING_WATER), HEALING_WATER);
        Registry.register(Registries.FLUID, new Identifier(RAConstants.MOD_ID, RAConstants.Fluids.FLOWING_HEALING_WATER), FLOWING_HEALING_WATER);

        Registry.register(Registries.BLOCK, new Identifier(RAConstants.MOD_ID, RAConstants.Blocks.HEALING_WATER_BLOCK), HEALING_WATER_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(RAConstants.MOD_ID, RAConstants.Items.HEALING_WATER_BUCKET), HEALING_WATER_BUCKET);

        RandomArticles.LOGGER.info("Registering Fluids for " + RAConstants.MOD_ID);
    }
}
