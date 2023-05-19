package net.vancomb.kamidogu.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.vancomb.kamidogu.entity.ModEntityTypes;
import net.vancomb.kamidogu.entity.custom.SubzeroEntity;
import net.vancomb.kamidogu.kamidogu;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = kamidogu.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.SUBZERO.get(), SubzeroEntity.setAttributes());
        }
    }
}
