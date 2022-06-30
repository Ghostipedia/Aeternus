package com.ghostipedia.aeternus.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AETERNUS_TAB = new CreativeModeTab("aeternus_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REGALCASING.get());
        }
    };





}
