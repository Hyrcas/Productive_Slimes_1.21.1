package net.hyrcas.productiveslimes.entity.client;

import net.hyrcas.productiveslimes.entity.custom.NeutralSlimeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class NeutralSlimeRenderer extends GeoEntityRenderer<NeutralSlimeEntity> {

    public NeutralSlimeRenderer(EntityRendererProvider.Context context) {
        super(context, new NeutralSlimeModel());
    }

    @Override
    public ResourceLocation getTextureLocation(NeutralSlimeEntity animatable) {
        return super.getTextureLocation(animatable);
    }
}
