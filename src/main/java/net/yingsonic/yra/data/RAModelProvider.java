package net.yingsonic.yra.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.yingsonic.yra.block.RABlocks;
import net.yingsonic.yra.block.fluid.RAFluids;
import net.yingsonic.yra.item.RAItems;

public class RAModelProvider extends FabricModelProvider {
    public RAModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(RABlocks.ZIRCONIUM_ORE);

        blockStateModelGenerator.registerLog(RABlocks.DESERT_WILLOW_LOG)
                .log(RABlocks.DESERT_WILLOW_LOG).wood(RABlocks.DESERT_WILLOW_WOOD);
        blockStateModelGenerator.registerLog(RABlocks.STRIPPED_DESERT_WILLOW_LOG)
                .log(RABlocks.STRIPPED_DESERT_WILLOW_LOG).wood(RABlocks.STRIPPED_DESERT_WILLOW_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(RABlocks.DESERT_WILLOW_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(RABlocks.DESERT_WILLOW_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(RABlocks.DESERT_WILLOW_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(RAItems.RAW_ZIRCONIUM, Models.GENERATED);
        itemModelGenerator.register(RAItems.ZIRCONIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(RAFluids.HEALING_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(RABlocks.DESERT_WILLOW_SAPLING.asItem(), Models.GENERATED);
    }
}
