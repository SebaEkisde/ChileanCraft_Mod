// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelbotashuaso extends EntityModel<Entity> {
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;

	public Modelbotashuaso() {
		textureWidth = 64;
		textureHeight = 32;

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 12.0F, 0.0F);
		bone2.setTextureOffset(54, 0).addBox(-4.1F, 10.01F, -3.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(54, 0).addBox(-4.2F, 3.75F, -1.75F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		bone2.setTextureOffset(54, 0).addBox(-4.201F, 3.75F, -2.2F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(48, 1).addBox(-3.849F, 3.749F, -1.751F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		bone2.setTextureOffset(51, 1).addBox(-3.85F, 3.748F, -2.201F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(54, 0).addBox(-4.1025F, 9.01F, -0.9F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		bone2.setTextureOffset(54, 0).addBox(-4.11F, 9.02F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		bone2.setTextureOffset(54, 0).addBox(-4.1003F, 9.01F, 0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(54, 0).addBox(-4.101F, 9.0F, -2.05F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 27.0F, 0.0F);
		bone2.addChild(bone);
		setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
		bone.setTextureOffset(40, 2).addBox(-0.7F, -17.9889F, 4.3823F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(40, 2).addBox(-4.3F, -17.9889F, 4.3823F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(40, 2).addBox(-3.502F, -17.9899F, 6.3833F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(40, 2).addBox(-2.5F, -17.9899F, 7.3823F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(40, 2).addBox(-2.502F, -18.4889F, 7.8823F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(51, 2).addBox(-4.1001F, -16.7389F, 2.9323F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 1.0472F, 0.0F, 0.0F);
		bone3.setTextureOffset(40, 2).addBox(-2.5F, -1.9823F, 18.5889F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, -1.0472F, 0.0F, 0.0F);
		bone4.setTextureOffset(40, 2).addBox(-2.501F, -17.4066F, -11.7066F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 12.0F, 0.0F);
		bone5.setTextureOffset(54, 0).addBox(0.01F, 10.01F, -3.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		bone5.setTextureOffset(54, 0).addBox(-0.2F, 3.75F, -1.75F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		bone5.setTextureOffset(54, 0).addBox(-0.201F, 3.75F, -2.2F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(48, 0).addBox(0.121F, 3.749F, -1.751F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		bone5.setTextureOffset(54, 0).addBox(0.2F, 3.748F, -2.201F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(54, 0).addBox(0.01F, 9.01F, -0.9F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		bone5.setTextureOffset(54, 0).addBox(-0.01F, 9.02F, -0.901F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		bone5.setTextureOffset(54, 0).addBox(-0.1003F, 9.01F, 0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(54, 0).addBox(0.0F, 9.0F, -2.05F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 27.0F, 0.0F);
		bone5.addChild(bone6);
		setRotationAngle(bone6, 0.2618F, 0.0F, 0.0F);
		bone6.setTextureOffset(40, 2).addBox(3.3F, -17.9889F, 4.3823F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bone6.setTextureOffset(40, 2).addBox(-0.3F, -17.9889F, 4.3823F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bone6.setTextureOffset(40, 2).addBox(0.498F, -17.9899F, 6.3833F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(40, 2).addBox(1.5F, -17.9899F, 7.3823F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(40, 2).addBox(1.498F, -18.4889F, 7.8823F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone6.setTextureOffset(51, 2).addBox(0.0F, -16.7389F, 2.9323F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 1.0472F, 0.0F, 0.0F);
		bone7.setTextureOffset(40, 2).addBox(1.5F, -1.9823F, 18.5889F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone8);
		setRotationAngle(bone8, -1.0472F, 0.0F, 0.0F);
		bone8.setTextureOffset(40, 2).addBox(1.499F, -17.4066F, -11.7066F, 1.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone5.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}