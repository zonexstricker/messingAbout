package net.ololololivia.messingabout.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ololololivia.messingabout.item.custom.EightBallItem;
import net.ololololivia.messingabout.messingAbout;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, messingAbout.MOD_ID);

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MESSING_ABOUT_TAB)));
    public static final RegistryObject<Item> UNCUT_TOPAZ = ITEMS.register("uncut_topaz",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MESSING_ABOUT_TAB)));


    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.MESSING_ABOUT_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
