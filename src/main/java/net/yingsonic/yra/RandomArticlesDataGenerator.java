package net.yingsonic.yra;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.yingsonic.yra.data.RALootTableGenerator;
import net.yingsonic.yra.data.RAModelProvider;
import net.yingsonic.yra.data.RARecipeGenerator;
import net.yingsonic.yra.data.RAWorldGenerator;

public class RandomArticlesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(RALootTableGenerator::new);
        pack.addProvider(RAModelProvider::new);
        pack.addProvider(RARecipeGenerator::new);
        pack.addProvider(RAWorldGenerator::new);
    }
}
