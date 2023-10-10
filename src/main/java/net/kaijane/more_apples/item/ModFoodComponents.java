package net.kaijane.more_apples.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent IRON_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 0), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent DIAMOND_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 2), 1.0f)
            .alwaysEdible()
            .build();
}
