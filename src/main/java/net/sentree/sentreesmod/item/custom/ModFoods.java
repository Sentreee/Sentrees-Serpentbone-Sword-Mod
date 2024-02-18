package net.sentree.sentreesmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public  static final FoodProperties BLOOD_VIAL = new FoodProperties.Builder().alwaysEat().meat().nutrition(0)
            .saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 10,30),1).build();

}
