package net.nodnarb.noob.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nodnarb.noob.Noob;

public class ModItemGroup {
    public static final ItemGroup RUBY = FabricItemGroupBuilder.build(
            new Identifier(Noob.MOD_ID, "ruby"), () -> new ItemStack(ModItems.RUBY));
}
