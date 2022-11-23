package net.nodnarb.noob.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nodnarb.noob.Noob;
import net.nodnarb.noob.item.custom.EightBallItem;
import net.nodnarb.noob.item.custom.IceChunkItem;

public class ModItems {
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.RUBY).maxCount(1)));

    public static final Item ICE_CHUNK = registerItem("ice_chunk",
            new IceChunkItem(new FabricItemSettings().group(ModItemGroup.RUBY).maxCount(16)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Noob.MOD_ID, name), item);
    }

    public static void registerModItems() {
         Noob.LOGGER.debug("Registering Mod Items for " + Noob.MOD_ID);
    }
}
