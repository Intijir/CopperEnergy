package com.intijir.copperenergy.items;

import com.intijir.copperenergy.CopperEnergy;
import com.intijir.copperenergy.armor.ModArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CopperEnergy.MODID);

    public static final RegistryObject<Item> BASE_COPPER_HELMET = ITEMS.register("base_copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.BASE_COPPER, EquipmentSlot.HEAD,
                    new Item.Properties()));

    public static final RegistryObject<Item> BASE_COPPER_CHESTPLATE = ITEMS.register("base_copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BASE_COPPER, EquipmentSlot.CHEST,
                    new Item.Properties()));

    public static final RegistryObject<Item> BASE_COPPER_LEGGINGS = ITEMS.register("base_copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.BASE_COPPER, EquipmentSlot.LEGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> BASE_COPPER_BOOTS = ITEMS.register("base_copper_boots",
            () -> new ArmorItem(ModArmorMaterials.BASE_COPPER, EquipmentSlot.FEET,
                    new Item.Properties()));

    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}
}
