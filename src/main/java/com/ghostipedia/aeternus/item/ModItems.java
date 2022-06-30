package com.ghostipedia.aeternus.item;

import com.ghostipedia.aeternus.Aeternus;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Aeternus.MOD_ID);
    //Casings
    public static final RegistryObject<Item> WOODENCASING = ITEMS.register("wooden_casing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));
    public static final RegistryObject<Item> WROUGHTIRONCASING = ITEMS.register("wrought_casing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));
    public static final RegistryObject<Item> BRASSCASING = ITEMS.register("brass_casing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));
    public static final RegistryObject<Item> REGALCASING = ITEMS.register("regal_casing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));
    public static final RegistryObject<Item> TEMPORALCASING = ITEMS.register("temporal_casing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));


    //Crystal Cores
    public static final RegistryObject<Item> MUNDANETIMECRYSTAL = ITEMS.register("mundane_time_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));
    public static final RegistryObject<Item> POORLYMADETIMECRYSTAL = ITEMS.register("weak_time_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));
    public static final RegistryObject<Item> REFINEDTIMECRYSTAL = ITEMS.register("refined_time_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));
    public static final RegistryObject<Item> ELEGANTTIMECRYSTAL = ITEMS.register("elegant_time_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));
    public static final RegistryObject<Item> TEMPORALSPRINGS = ITEMS.register("perfect_time_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));

    public static final RegistryObject<Item> PECULIARQUARTZ = ITEMS.register("peculiar_quartz",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AETERNUS_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);



    }

}
