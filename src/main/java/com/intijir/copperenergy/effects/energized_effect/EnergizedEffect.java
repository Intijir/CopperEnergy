package com.intijir.copperenergy.effects.energized_effect;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class EnergizedEffect extends MobEffect {
    public EnergizedEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity livingEntity, int pAmplifier) {
        if (livingEntity instanceof Player){
            Player player = (Player) livingEntity;
            if (player.isInWater()){
                player.removeEffect(EnergizedEffect.this);
                player.sendSystemMessage(Component.nullToEmpty(String.valueOf(MobEffect.getId(EnergizedEffect.this))));
            }
        }
        super.applyEffectTick(livingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }


}
