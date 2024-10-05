package org.hastar.hastar.items;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.hastar.hastar.HastarMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HastarMod.MOD_ID);

    public static final RegistryObject<Item> LADDOO = ITEMS.register("laddoo", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                .nutrition(20)
                .saturationMod(1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 1), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 1), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.JUMP, 6000, 1), 1.0f)
                .build())));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
