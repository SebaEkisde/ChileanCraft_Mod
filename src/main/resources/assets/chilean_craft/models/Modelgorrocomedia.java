// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelgorrocomedia extends EntityModel<Entity> {
	private final ModelRenderer head;

	public Modelgorrocomedia() {
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