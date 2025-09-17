package net.hyrcas.productiveslimes.entity;

import net.hyrcas.productiveslimes.ProductiveSlimes;
import net.hyrcas.productiveslimes.entity.custom.NeutralSlimeEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, ProductiveSlimes.MOD_ID);

    public static final Supplier<EntityType<NeutralSlimeEntity>> NEUTRAL_SLIME =
            ENTITY_TYPES.register("neutralslime", () -> EntityType.Builder.of(NeutralSlimeEntity::new, MobCategory.CREATURE)
                    .sized(1.25f,0.75f).build("neutralslime"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);

    }
}

