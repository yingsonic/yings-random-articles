package net.yingsonic.yra.item;

import net.yingsonic.yra.RAConstants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RAItemGroup {
    public static ItemGroup RA_MAIN;

    public static void registerItemGroups() {
        RA_MAIN = FabricItemGroup.builder(new Identifier(RAConstants.MOD_ID, "yra_main"))
                .displayName(Text.translatable("itemgroup.yra_main"))
                .icon(() -> new ItemStack(RAItems.ZIRCONIUM_INGOT)).build();
    }
}
