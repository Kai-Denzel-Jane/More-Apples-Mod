package net.kaijane.more_apples.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kaijane.more_apples.MoreApples;
import net.kaijane.more_apples.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MORE_APPLES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreApples.MOD_ID, "more_apples"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.more_apples"))
                    .icon(() -> new ItemStack(ModItems.IRON_APPLE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.IRON_APPLE);
                        entries.add(ModItems.ENCHANTED_GOLDEN_APPLE_STAGE_1);
                        entries.add(ModItems.ENCHANTED_GOLDEN_APPLE_STAGE_2);
                        entries.add(ModItems.ENCHANTED_GOLDEN_APPLE_STAGE_3);
                        entries.add(ModBlocks.APPLE_LEAVES);
                        entries.add(ModBlocks.APPLE_SAPLING);
                    }).build());

    public static void registerItemGroups() {
        MoreApples.LOGGER.info("Registering Item Groups for " + MoreApples.MOD_ID);
    }
}
