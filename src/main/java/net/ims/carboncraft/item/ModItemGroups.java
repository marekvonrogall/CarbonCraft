package net.ims.carboncraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ims.carboncraft.CarbonCraft;
import net.ims.carboncraft.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup CARBONCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CarbonCraft.MOD_ID, "steel_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.carboncraft"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.COKE);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.STEEL_FURNACE);
                    }).build());
    public static void registerItemGroups() {
        CarbonCraft.LOGGER.info("Registering Item Groups for " + CarbonCraft.MOD_ID);

    }
}
