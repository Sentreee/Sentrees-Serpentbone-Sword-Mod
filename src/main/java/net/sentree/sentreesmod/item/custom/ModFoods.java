package net.sentree.sentreesmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public  static final FoodProperties BLOOD_VIAL = new FoodProperties.Builder().alwaysEat().fast().nutrition(0)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.HEAL, 20,1),1).build();

}
