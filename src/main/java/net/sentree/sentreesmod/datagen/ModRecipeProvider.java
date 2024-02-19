package net.sentree.sentreesmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.sentree.sentreesmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SERPENTBONE_BLADE.get())
                .pattern("BBE")
                .pattern("BNB")
                .pattern("SBB")
                .define('S', Items.NETHERITE_SWORD)
                .define('N', Items.NETHER_STAR)
                .define('B', Items.BONE)
                .define('E', Items.SPIDER_EYE)
                .unlockedBy(getHasName(Items.BONE), has(Items.SPIDER_EYE))
                .save(pWriter);

    }
}
