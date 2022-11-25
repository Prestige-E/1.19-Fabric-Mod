package net.nodnarb.noob.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.nodnarb.noob.Noob;
import net.nodnarb.noob.block.custom.BouncerBlock;
import net.nodnarb.noob.block.custom.PathBlock;
import net.nodnarb.noob.block.custom.RubyLampBlock;
import net.nodnarb.noob.block.custom.TomatoCropBlock;
import net.nodnarb.noob.item.ModItemGroup;

public class ModBlocks {
    public static final Block BOUNCER = registerBlock("bouncer",
            new BouncerBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.RUBY);

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.RUBY);

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), ModItemGroup.RUBY);

    public static final Block PATH = registerBlock("path",
            new PathBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_LAMP = registerBlock("ruby_lamp",
            new RubyLampBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()
                    .luminance(state -> state.get(RubyLampBlock.LIT) ? 15 : 0)), ModItemGroup.RUBY);

    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop",
            new TomatoCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Noob.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
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
