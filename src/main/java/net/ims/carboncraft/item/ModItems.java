package net.ims.carboncraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ims.carboncraft.CarbonCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item KOKS = registerItem("koks", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CarbonCraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CarbonCraft.LOGGER.info("Registering Mod Items for " + CarbonCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(STEEL_INGOT);
            entries.add(KOKS);
        });
    }
}
