package net.nodnarb.noob.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nodnarb.noob.Noob;
import net.nodnarb.noob.item.custom.EightBallItem;

public class ModItems {
    public static final Item SMASHED_POOP = registerItem("smashed_poop",
            new Item(new FabricItemSettings().group(ModItemGroup.POOP)));
    public static final Item POOP = registerItem("poop",
            new Item(new FabricItemSettings().group(ModItemGroup.POOP)));
    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Noob.MOD_ID, name), item);
    }

    public static void registerModItems() {
         Noob.LOGGER.debug("Registering Mod Items for " + Noob.MOD_ID);
    }
}
