package net.hyrcas.productiveslimes.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.hyrcas.productiveslimes.ProductiveSlimes;
import net.hyrcas.productiveslimes.entity.custom.NeutralSlimeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NeutralSlimeRenderer extends MobRenderer<NeutralSlimeEntity, NeutralSlimeModel<NeutralSlimeEntity>> {

    public NeutralSlimeRenderer(EntityRendererProvider.Context context) {
        super(context, new NeutralSlimeModel<>(context.bakeLayer(NeutralSlimeModel.LAYER_LOCATION)), .25f);
    }

    @Override
    public ResourceLocation getTextureLocation(NeutralSlimeEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(ProductiveSlimes.MOD_ID, "textures/entity/neutralslime/texture.png");
    }

    @Override
    public void render(NeutralSlimeEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.45f, 0.45f, 0.45f);
        } else {
            poseStack.scale(1f, 1f, 1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }

    @Override
    protected RenderType getRenderType(NeutralSlimeEntity entity,
                                       boolean bodyVisible,
                                       boolean translucent,
                                       boolean glowing) {
        return RenderType.entityTranslucent(getTextureLocation(entity));
    }
}
