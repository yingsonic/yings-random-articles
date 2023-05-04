package net.yingsonic.yra.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yingsonic.yra.RAConstants;
import net.yingsonic.yra.RandomArticles;
import net.yingsonic.yra.effect.RAEffects;
import net.yingsonic.yra.item.RAItemGroups;

public class RAPotions {

    public static Potion HEALING_WATER_POTION = register(RAConstants.Potions.HEALING_WATER_POTION,
            new Potion(new StatusEffectInstance(RAEffects.HEALING, 64, 0)), RAItemGroups.RA_MAIN);

    private static Potion register(String name, Potion potion, ItemGroup group) {
        return Registry.register(Registries.POTION, new Identifier(RAConstants.MOD_ID, name), potion);
    }

    public static void registerModPotions() {
        RandomArticles.LOGGER.info("Registering Potions for " + RAConstants.MOD_ID);
    }
}
