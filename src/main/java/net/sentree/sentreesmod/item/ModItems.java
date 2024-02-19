package net.sentree.sentreesmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sentree.sentreesmod.SentreesSerpentboneBladeMod;
import net.sentree.sentreesmod.item.custom.SerpentboneBlade;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SentreesSerpentboneBladeMod.MOD_ID);

    public static final RegistryObject<Item> SERPENTBONE_BLADE = ITEMS.register("serpentbone_blade",
            () -> new SerpentboneBlade(ModToolTiers.SERPENTBONE, 4,-2.4f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
