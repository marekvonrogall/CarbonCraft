package net.ims.carboncraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;



public enum ModTools implements ToolMaterial {
    STEEL(500, 6.0f, 2.5f, 14);



    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int merchantability;


    ModTools(int itemDurability, float miningSpeed, float attackDamage, int merchantability) {

        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.merchantability = merchantability;

    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_IRON_TOOL;
    }

    @Override
    public int getEnchantability() {
        return this.merchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.STEEL_INGOT);
    }
}
