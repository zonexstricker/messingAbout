package net.ololololivia.messingabout.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.ololololivia.messingabout.item.ModItems;

public class RadishCropBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);
    public RadishCropBlock(Properties properties) {
        super(properties);
    }

    protected ItemLike getBaseSeed(){
        return ModItems.RADISH_SEEDS.get();
    }

    public IntegerProperty getAgeProperty(){
        return AGE;
    }

    public int getMaxAge(){
        return 6;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder){
        builder.add(AGE);
    }

}
