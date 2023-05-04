package net.yingsonic.yra;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.yingsonic.yra.block.RABlocks;
import net.yingsonic.yra.block.fluid.RAFluids;

public class RandomArticlesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(RAFluids.HEALING_WATER, RAFluids.FLOWING_HEALING_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0x9387CDFF
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                RAFluids.HEALING_WATER, RAFluids.FLOWING_HEALING_WATER);
        BlockRenderLayerMap.INSTANCE.putBlock(RABlocks.DESERT_WILLOW_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RABlocks.DESERT_WILLOW_SAPLING, RenderLayer.getCutout());
    }
}