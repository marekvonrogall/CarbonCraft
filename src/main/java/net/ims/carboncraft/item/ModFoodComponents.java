package net.ims.carboncraft.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {

    public class FoodList {
        public static final FoodComponent COKE = (new FoodComponent.Builder())
                .nutrition(20)
                .saturationModifier(1.2F)
                .statusEffect(new StatusEffectInstance(
                        StatusEffects.REGENERATION, 20 * 10, 10), 1.0F)
                .statusEffect(new StatusEffectInstance(
                        StatusEffects.NAUSEA, 20 * 10, 10), 1.0F)
                .statusEffect(new StatusEffectInstance(
                        StatusEffects.FIRE_RESISTANCE, 20 * 10, 0), 1.0F)
                .statusEffect(new StatusEffectInstance(
                        StatusEffects.ABSORPTION, 20 * 10, 10), 1.0F)
                .statusEffect(new StatusEffectInstance(
                        StatusEffects.SPEED, 20 * 10, 10), 1.0F)
                .statusEffect(new StatusEffectInstance(
                        StatusEffects.JUMP_BOOST, 20 * 10, 10), 1.0F)
                .statusEffect(new StatusEffectInstance(
                        StatusEffects.DARKNESS, 20 * 10, 10), 1.0F)
                .statusEffect(new StatusEffectInstance(
                        StatusEffects.ABSORPTION, 20 * 10, 10), 1.0F)
                .alwaysEdible()
                .build();

    }

}
