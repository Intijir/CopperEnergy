package com.intijir.copperenergy.effects;

import com.intijir.copperenergy.CopperEnergy;
import com.intijir.copperenergy.effects.energized_effect.EnergizedEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CopperEnergy.MODID);

    public static final RegistryObject<MobEffect> ENERGIZED = MOB_EFFECTS.register("energized",
            () -> new EnergizedEffect(MobEffectCategory.NEUTRAL, 3599308));

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
