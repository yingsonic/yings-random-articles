package net.yingsonic.yra.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yingsonic.yra.RAConstants;
import net.yingsonic.yra.RandomArticles;

public class RAEffects {
    public static StatusEffect HEALING = register(RAConstants.Effects.HEALING,
            new HealingEffect(StatusEffectCategory.BENEFICIAL, 899999999));

    public static StatusEffect register(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(RAConstants.MOD_ID, name), effect);
    }

    public static void registerModEffects() {
        RandomArticles.LOGGER.info("Registering Effects for " + RAConstants.MOD_ID);
    }

}
