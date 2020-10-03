// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeldoncomedia extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public Modeldoncomedia() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(40, 53).addBox(-6.0F, -8.0F, 0.0F, 6.0F, 1.0F, 6.0F, 0.0F, true);
		head.setTextureOffset(40, 53).addBox(0.0F, -8.0F, 0.0F, 6.0F, 1.0F, 6.0F, 0.0F, true);
		head.setTextureOffset(40, 53).addBox(0.0F, -8.0F, -6.0F, 6.0F, 1.0F, 6.0F, 0.0F, true);
		head.setTextureOffset(40, 53).addBox(-6.0F, -8.0F, -6.0F, 6.0F, 1.0F, 6.0F, 0.0F, true);
		head.setTextureOffset(37, 38).addBox(-0.5F, -18.0F, -4.5F, 5.0F, 10.0F, 4.0F, 0.0F, true);
		head.setTextureOffset(44, 49).addBox(-0.5F, -18.0F, -0.5F, 5.0F, 10.0F, 5.0F, 0.0F, true);
		head.setTextureOffset(37, 33).addBox(-4.5F, -18.0F, -4.5F, 4.0F, 10.0F, 9.0F, 0.0F, true);
		head.setTextureOffset(0, 33).addBox(-4.5F, -7.0F, -4.5F, 9.0F, 7.0F, 9.0F, 0.0F, true);
		head.setTextureOffset(3, 33).addBox(-3.5F, -8.0F, 4.7F, 2.0F, 8.0F, 0.0F, 0.0F, true);
		head.setTextureOffset(29, 30).addBox(-4.7F, -8.0F, 1.5F, 0.0F, 8.0F, 3.0F, 0.0F, true);
		head.setTextureOffset(5, 53).addBox(-0.2F, -7.0F, -5.48F, 5.0F, 5.0F, 5.0F, 0.0F, true);
		head.setTextureOffset(13, 59).addBox(-1.2F, -5.0F, -5.48F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(11, 53).addBox(-4.5F, -7.0F, -5.5F, 4.0F, 5.0F, 5.0F, 0.0F, true);
		head.setTextureOffset(23, 53).addBox(-4.75F, -6.0F, -3.5F, 1.0F, 4.0F, 5.0F, 0.0F, true);
		head.setTextureOffset(26, 56).addBox(-4.75F, -6.0F, -5.5F, 1.0F, 4.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(0, 54).addBox(3.75F, -6.0F, -3.5F, 1.0F, 4.0F, 4.0F, 0.0F, true);
		head.setTextureOffset(2, 56).addBox(3.75F, -6.0F, -5.5F, 1.0F, 4.0F, 2.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.addChild(bone);
		bone.setTextureOffset(29, 30).addBox(4.7F, -32.0F, 1.5F, 0.0F, 8.0F, 3.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 3.1416F, 0.0F);
		bone2.setTextureOffset(3, 33).addBox(-3.4F, -32.0F, -4.7F, 2.0F, 8.0F, 0.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}