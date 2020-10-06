// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelgorronegro extends EntityModel<Entity> {
	private final ModelRenderer head;

	public Modelgorronegro() {
		textureWidth = 30;
		textureHeight = 30;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, 0.0F);
		head.setTextureOffset(17, 15).addBox(-4.5F, -10.0F, -1.5F, 1.0F, 3.0F, 5.0F, 0.0F, true);
		head.setTextureOffset(17, 18).addBox(-4.5F, -10.0F, -3.5F, 1.0F, 3.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(17, 16).addBox(3.5F, -10.0F, -3.5F, 1.0F, 3.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(7, 27).addBox(-4.0F, -10.0F, -4.5F, 8.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(6, 16).addBox(-3.5F, -9.95F, -4.45F, 8.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(6, 16).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(15, 16).addBox(3.5F, -10.0F, -1.5F, 1.0F, 3.0F, 5.0F, 0.0F, true);
		head.setTextureOffset(2, 19).addBox(-4.0F, -10.5F, -4.0F, 8.0F, 1.0F, 6.0F, 0.0F, true);
		head.setTextureOffset(5, 22).addBox(-4.0F, -10.5F, 2.0F, 8.0F, 1.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(22, 17).addBox(1.5F, -10.0F, 3.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(17, 17).addBox(-4.5F, -10.0F, 3.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(22, 27).addBox(-1.5F, -8.1F, 3.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(6, 16).addBox(-1.5F, -10.0F, 3.5F, 3.0F, 1.0F, 0.0F, 0.0F, true);
		head.setTextureOffset(6, 16).addBox(-4.5F, -8.0F, -6.5F, 9.0F, 1.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(7, 22).addBox(-4.0F, -8.0F, -7.5F, 8.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(6, 16).addBox(-3.0F, -8.001F, -8.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
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