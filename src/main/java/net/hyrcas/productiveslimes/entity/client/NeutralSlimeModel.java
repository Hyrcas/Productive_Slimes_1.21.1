package net.hyrcas.productiveslimes.entity.client;

import net.hyrcas.productiveslimes.ProductiveSlimes;
import net.hyrcas.productiveslimes.entity.custom.NeutralSlimeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NeutralSlimeModel extends GeoModel<NeutralSlimeEntity> {

    @Override
    public ResourceLocation getModelResource(NeutralSlimeEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ProductiveSlimes.MOD_ID, "geo/neutralslime.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NeutralSlimeEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ProductiveSlimes.MOD_ID, "textures/neutralslime.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NeutralSlimeEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ProductiveSlimes.MOD_ID, "animations/neutralslime.animation.json");
    }
}
