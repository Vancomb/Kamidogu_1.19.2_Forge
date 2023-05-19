package net.vancomb.kamidogu.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.vancomb.kamidogu.entity.custom.SubzeroEntity;
import net.vancomb.kamidogu.kamidogu;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SubzeroRenderer extends GeoEntityRenderer<SubzeroEntity> {
    public SubzeroRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SubzeroModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public ResourceLocation getTextureLocation(SubzeroEntity animatable) {
        return new ResourceLocation(kamidogu.MOD_ID, "textures/entity/subzero_texture.png");

    }

    @Override
    public RenderType getRenderType(SubzeroEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight,
                                    ResourceLocation texture) {

        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
