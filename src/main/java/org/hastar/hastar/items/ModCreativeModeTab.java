package org.hastar.hastar.items;

import org.hastar.hastar.HastarMod;
import org.hastar.hastar.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HastarMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HASTAR_TAB = CREATIVE_MODE_TABS.register("hastar_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LADDOO.get()))
                    .title(Component.translatable("creativetab.hastar_mod"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LADDOO.get());

                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModBlocks.FLESH_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}