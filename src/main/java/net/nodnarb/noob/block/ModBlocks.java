package net.nodnarb.noob.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.nodnarb.noob.Noob;
import net.nodnarb.noob.item.ModItemGroup;

public class ModBlocks {
    public static final Block POOP_BLOCK = registerBlock("poop_block",
            new Block(FabricBlockSettings.of(Material.CARPET).strength(3f).requiresTool()), ModItemGroup.POOP);

    public static final Block NEON_PURPLE = registerBlock("neon_purple",
            new Block(FabricBlockSettings.of(Material.CARPET).strength(3f).requiresTool()), ModItemGroup.POOP);

    public static final Block POOP_ORE = registerBlock("poop_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
            UniformIntProvider.create(2, 5)), ModItemGroup.POOP);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Noob.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Noob.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Noob.LOGGER.debug("Registering ModBlocks for " + Noob.MOD_ID);
    }
}
