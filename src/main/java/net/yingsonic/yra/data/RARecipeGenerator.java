package net.yingsonic.yra.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.yingsonic.yra.block.RABlocks;
import net.yingsonic.yra.item.RAItems;

import java.util.List;
import java.util.function.Consumer;

public class RARecipeGenerator extends FabricRecipeProvider {
    public RARecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(RAItems.RAW_ZIRCONIUM), RecipeCategory.MISC, RAItems.ZIRCONIUM_INGOT,
                0.7f, 200, "zirconium");
        offerSmelting(exporter, List.of(RABlocks.ZIRCONIUM_ORE), RecipeCategory.MISC, RAItems.ZIRCONIUM_INGOT,
                0.7f, 200, "zirconium");

        offerBlasting(exporter, List.of(RAItems.RAW_ZIRCONIUM), RecipeCategory.MISC, RAItems.ZIRCONIUM_INGOT,
                0.7f, 100, "zirconium");
        offerBlasting(exporter, List.of(RABlocks.ZIRCONIUM_ORE), RecipeCategory.MISC, RAItems.ZIRCONIUM_INGOT,
                0.7f, 100, "zirconium");
    }
}
