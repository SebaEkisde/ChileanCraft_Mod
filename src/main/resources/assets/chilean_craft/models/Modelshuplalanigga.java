//Made with Blockbench
//Paste this code into your mod.

public static class Modelshuplalanigga extends ModelBase {
	private final ModelRenderer head;

	public Modelshuplalanigga() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 19, -4.5F, -7.5F, -4.5F, 9, 1, 9, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 19, -4.5F, -10.5F, -4.5F, 9, 1, 9, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 21, -4.5F, -9.5F, -4.5F, 9, 2, 9, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 3, 21, -7.5F, -7.0F, 0.5F, 7, 1, 7, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 1, 20, -7.5F, -7.0F, -7.5F, 7, 1, 8, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 20, -0.5F, -7.0F, -7.5F, 8, 1, 8, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 19, -0.5F, -7.0F, -0.5F, 8, 1, 8, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}