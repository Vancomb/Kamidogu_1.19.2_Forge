package net.vancomb.kamidogu.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.vancomb.kamidogu.entity.custom.SubzeroEntity;
import net.vancomb.kamidogu.kamidogu;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SubzeroModel extends AnimatedGeoModel<SubzeroEntity> {
    @Override
    public ResourceLocation getModelResource(SubzeroEntity object) {
        return new ResourceLocation(kamidogu.MOD_ID, "geo/subzero.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SubzeroEntity object) {
        return new ResourceLocation(kamidogu.MOD_ID, "textures/entity/subzero_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SubzeroEntity animatable) {
        return new ResourceLocation(kamidogu.MOD_ID, "animations/subzero.animation.json");
    }
}
