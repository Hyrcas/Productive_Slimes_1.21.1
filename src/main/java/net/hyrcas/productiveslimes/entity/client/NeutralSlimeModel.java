package net.hyrcas.productiveslimes.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.hyrcas.productiveslimes.ProductiveSlimes;
import net.hyrcas.productiveslimes.entity.custom.NeutralSlimeEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class neutralslime<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neutralslime"), "main");
    private final ModelPart Body;

    public neutralslime(ModelPart root) {
        this.Body = root.getChild("Body");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(7, 29).addBox(-5.0F, -8.25F, -11.4F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(7, 29).addBox(3.0F, -8.25F, -11.4F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(3, 47).addBox(-2.0F, -6.25F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 97).addBox(-10.0F, -9.0F, -11.0F, 20.0F, 9.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 68).addBox(-8.0F, -5.0F, -10.0F, 17.0F, 5.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.25F, 0.0F, -0.048F, 0.0F, 0.0F));

        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-7.0F, -5.0F, -8.0F, 14.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.25F, 0.0F, -0.0611F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }


        @Override
        public ModelPart root() {
            return Body;
        }
}
