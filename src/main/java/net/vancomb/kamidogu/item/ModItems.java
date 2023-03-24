package net.vancomb.kamidogu.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vancomb.kamidogu.kamidogu;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, kamidogu.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.KAMIDOGU_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.KAMIDOGU_TAB)));

    //Sword
    public static final RegistryObject<SwordItem> DRAKESWORD = ITEMS.register("drakesword",
            () -> new SwordItem(Tiers.EXAMPLE, 0, 0, new Item.Properties().tab(ModCreativeTab.KAMIDOGU_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static class Tiers {
        public static final Tier EXAMPLE = new ForgeTier(
                4,
                800,
                1.5f,
                4,
                350,
                null, () -> Ingredient.EMPTY);
    }

}
