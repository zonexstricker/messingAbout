package net.ololololivia.messingabout.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MESSING_ABOUT_TAB = new CreativeModeTab("messingabouttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TOPAZ.get());
        }
    };
}
