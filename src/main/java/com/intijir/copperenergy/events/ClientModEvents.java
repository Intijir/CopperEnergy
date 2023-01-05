package com.intijir.copperenergy.events;

import com.intijir.copperenergy.CopperEnergy;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = CopperEnergy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public void onWaterPotion(ProjectileImpactEvent event){
        System.out.println("Aaa");
        if (event.getProjectile().equals(ThrownPotion.class)){
            event.getEntity().getCommandSenderWorld().getNearestPlayer(event.getEntity(),1);
            event.getEntity().getDisplayName();
        }
    }
}
