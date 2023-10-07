package net.kaijane.more_apples.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.kaijane.more_apples.block.ModBlocks;
import net.kaijane.more_apples.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

import static net.kaijane.more_apples.block.ModBlocks.APPLE_LEAVES;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.APPLE_SAPLING);

        addDrop(APPLE_LEAVES,
                modLeavesDrops(APPLE_LEAVES,
                        ModBlocks.APPLE_SAPLING,
                        Items.APPLE, LEAVES_STICK_DROP_CHANCE));

    }

    public LootTable.Builder modLeavesDrops(Block leaves, Block drop, Item food, float ... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0f)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS)
                .with(((LeafEntry.Builder<?>)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(food)))
                        .conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, 0.33f, 0.33f, 0.33f, 0.33f, 0.33f))));
    }

}

