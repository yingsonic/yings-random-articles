package net.yingsonic.yra.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;

public class HealingEffect extends StatusEffect {
    int i;

    protected HealingEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

        for (StatusEffectInstance effect : entity.getStatusEffects()) {
            if (effect.getEffectType().getCategory() == StatusEffectCategory.HARMFUL) {
                entity.removeStatusEffect(effect.getEffectType());
            }
        }
        if (i < 60) {
            i++;
            return;
        }
        i = 0;
        if (entity.getHealth() < entity.getMaxHealth()) {
            entity.heal(1f);
        }

    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
