package net.kaijane.more_apples.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kaijane.more_apples.MoreApples;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item IRON_APPLE = registerItem("iron_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.IRON_APPLE)));

    public static final Item ENCHANTED_GOLDEN_APPLE_STAGE_1 = registerItem("enchanted_golden_apple_stage_1",
            new Item(new FabricItemSettings()));
    public static final Item ENCHANTED_GOLDEN_APPLE_STAGE_2 = registerItem("enchanted_golden_apple_stage_2",
            new Item(new FabricItemSettings()));
    public static final Item ENCHANTED_GOLDEN_APPLE_STAGE_3 = registerItem("enchanted_golden_apple_stage_3",
            new Item(new FabricItemSettings()));

    public static final Item DIAMOND_APPLE = registerItem("diamond_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.DIAMOND_APPLE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreApples.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreApples.LOGGER.info("Registering Mod Items for " + MoreApples.MOD_ID);
    }
}
