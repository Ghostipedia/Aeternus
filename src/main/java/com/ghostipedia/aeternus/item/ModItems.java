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
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WROUGHTIRONCASING = ITEMS.register("wrought_casing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BRASSCASING = ITEMS.register("brass_casing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REGALCASING = ITEMS.register("regal_casing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> TEMPORALCASING = ITEMS.register("temporal_casing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Gears
    public static final RegistryObject<Item> WOODENGEARS = ITEMS.register("wooden_gears",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WROUGHTIRONGEARS = ITEMS.register("wrought_gears",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BRASSGEARS = ITEMS.register("brass_gears",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REGALGEARS = ITEMS.register("regal_gears",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> TEMPORALGEARS = ITEMS.register("temporal_gears",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Hands
    public static final RegistryObject<Item> WOODENHANDS = ITEMS.register("wooden_hands",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WROUGHTIRONHANDS = ITEMS.register("wrought_hands",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BRASSHANDS = ITEMS.register("brass_hands",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REGALHANDS = ITEMS.register("regal_hands",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> TEMPORALHANDS = ITEMS.register("temporal_hands",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    // Springs
    public static final RegistryObject<Item> WOODENSPRING = ITEMS.register("wooden_springs",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WROUGHTIRONSPRING = ITEMS.register("wrought_springs",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BRASSSPRING = ITEMS.register("brass_springs",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REGALSPRING = ITEMS.register("regal_springs",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> TEMPORALSPRING = ITEMS.register("temporal_springs",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Crystal Cores
    public static final RegistryObject<Item> MUNDANETIMECRYSTAL = ITEMS.register("mundane_time_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> POORLYMADETIMECRYSTAL = ITEMS.register("weak_time_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> REFINEDTIMECRYSTAL = ITEMS.register("refined_time_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ELEGANTTIMECRYSTAL = ITEMS.register("elegant_time_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> TEMPORALSPRINGS = ITEMS.register("perfect_time_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);



    }

}
