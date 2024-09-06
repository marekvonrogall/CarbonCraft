package net.ims.carboncraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ims.carboncraft.CarbonCraft;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item COKE = registerItem("coke", new Item(new Item.Settings()));


    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModTools.STEEL, new Item.Settings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModTools.STEEL, new Item.Settings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModTools.STEEL, new Item.Settings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModTools.STEEL, new Item.Settings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModTools.STEEL, new Item.Settings()));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CarbonCraft.MOD_ID, name), item);

    }

    public static void registerModItems(){
        CarbonCraft.LOGGER.info("Registering Mod Items for " + CarbonCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(STEEL_INGOT);
            entries.add(COKE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register(
                        (itemGroup) -> {
                            itemGroup.add(ModItems.STEEL_AXE);
                            itemGroup.add(ModItems.STEEL_PICKAXE);
                            itemGroup.add(ModItems.STEEL_HOE);
                            itemGroup.add(ModItems.STEEL_SHOVEL);
                            itemGroup.add(ModItems.STEEL_SWORD);

                        });


    }
}
