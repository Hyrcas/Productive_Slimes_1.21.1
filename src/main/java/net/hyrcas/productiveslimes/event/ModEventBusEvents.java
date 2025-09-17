package net.hyrcas.productiveslimes.event;

import net.hyrcas.productiveslimes.ProductiveSlimes;
import net.hyrcas.productiveslimes.entity.ModEntities;
import net.hyrcas.productiveslimes.entity.client.NeutralSlimeModel;
import net.hyrcas.productiveslimes.entity.custom.NeutralSlimeEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = ProductiveSlimes.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(NeutralSlimeModel.LAYER_LOCATION, NeutralSlimeModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.NEUTRAL_SLIME.get(), NeutralSlimeEntity.createAttributes().build());
    }

}
