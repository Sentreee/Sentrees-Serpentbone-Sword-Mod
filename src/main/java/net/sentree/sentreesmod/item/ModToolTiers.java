package net.sentree.sentreesmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.sentree.sentreesmod.SentreesSerpentboneBladeMod;
import net.sentree.sentreesmod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier SERPENTBONE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 5092, 0.8f, 5f, 25,
                    ModTags.Blocks.PLACEHOLDER, () -> Ingredient.of(Items.BONE)),
            new ResourceLocation(SentreesSerpentboneBladeMod.MOD_ID, "serpentbone_blade"), List.of(Tiers.NETHERITE), List.of());

}
