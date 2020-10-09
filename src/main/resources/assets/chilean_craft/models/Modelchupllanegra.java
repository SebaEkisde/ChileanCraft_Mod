// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelchupllanegra extends EntityModel<Entity> {
	private final ModelRenderer head;

	public Modelchupllanegra() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 19).addBox(-4.5F, -7.5F, -4.5F, 9.0F, 1.0F, 9.0F, 0.0F, true);
		head.setTextureOffset(0, 19).addBox(-4.5F, -10.5F, -4.5F, 9.0F, 1.0F, 9.0F, 0.0F, true);
		head.setTextureOffset(0, 21).addBox(-4.5F, -9.5F, -4.5F, 9.0F, 2.0F, 9.0F, 0.0F, true);
		head.setTextureOffset(3, 21).addBox(-7.5F, -7.0F, 0.5F, 7.0F, 1.0F, 7.0F, 0.0F, true);
		head.setTextureOffset(1, 20).addBox(-7.5F, -7.0F, -7.5F, 7.0F, 1.0F, 8.0F, 0.0F, true);
		head.setTextureOffset(0, 20).addBox(-0.5F, -7.0F, -7.5F, 8.0F, 1.0F, 8.0F, 0.0F, true);
		head.setTextureOffset(0, 19).addBox(-0.5F, -7.0F, -0.5F, 8.0F, 1.0F, 8.0F, 0.0F, true);
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