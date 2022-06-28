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

    public static final RegistryObject<Item> WOODENCASING = ITEMS.register("wooden_casing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WROUGHTIRONCASING = ITEMS.register("wrought_casing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BRASSCASING = ITEMS.register("brass_casing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REGALCASING = ITEMS.register("regal_casing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> TEMPORALCASING = ITEMS.register("temporal_casing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);



    }

}
