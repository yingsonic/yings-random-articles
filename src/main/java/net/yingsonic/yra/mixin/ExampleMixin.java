package net.yingsonic.yra.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class ExampleMixin {

	@Inject(at = @At("HEAD"), method = "baseTick")
	private void healingWaterEffect(CallbackInfo ci) {

	}
}