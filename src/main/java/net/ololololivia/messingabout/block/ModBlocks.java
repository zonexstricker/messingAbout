package net.ololololivia.messingabout.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ololololivia.messingabout.block.custom.JumpyBlock;
import net.ololololivia.messingabout.block.custom.TopazLamp;
import net.ololololivia.messingabout.item.ModCreativeModeTab;
import net.ololololivia.messingabout.item.ModItems;
import net.ololololivia.messingabout.messingAbout;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, messingAbout.MOD_ID);

    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MESSING_ABOUT_TAB);

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.MESSING_ABOUT_TAB);

    public static final RegistryObject<Block> DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.MESSING_ABOUT_TAB);


    public static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block",
            ()-> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MESSING_ABOUT_TAB);

    public static final RegistryObject<Block> TOPAZ_LAMP = registerBlock("topaz_lamp",
            ()-> new TopazLamp(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(TopazLamp.LIT)? 15 : 0)), ModCreativeModeTab.MESSING_ABOUT_TAB); //the light level that this block emits should be 15 when LIT


private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab);
    return toReturn;
}

private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
}
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
