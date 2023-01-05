package com.intijir.copperenergy.events;

import com.intijir.copperenergy.CopperEnergy;
import com.intijir.copperenergy.effects.energized_effect.EnergizedEffect;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.event.entity.living.LivingDestroyBlockEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Consumer;

@Mod.EventBusSubscriber(modid = CopperEnergy.MODID)
public class ModEvents {
    @SubscribeEvent
    public void onWaterPotion(LivingEntityUseItemEvent event) throws InstantiationException, IllegalAccessException {
        if (event.getEntity() instanceof Player){
            Player player = (Player) event.getEntity();
            if (event.getItem().getDisplayName().contains(Component.nullToEmpty("Water Bottle"))){
            }
        }
    }
}
