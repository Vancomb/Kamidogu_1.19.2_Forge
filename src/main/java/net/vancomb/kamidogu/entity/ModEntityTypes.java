package net.vancomb.kamidogu.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vancomb.kamidogu.entity.custom.SubzeroEntity;
import net.vancomb.kamidogu.kamidogu;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, kamidogu.MOD_ID);

    public static final RegistryObject<EntityType<SubzeroEntity>> SUBZERO =
            ENTITY_TYPES.register("subzero",
                    () -> EntityType.Builder.of(SubzeroEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(kamidogu.MOD_ID, "subzero").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
