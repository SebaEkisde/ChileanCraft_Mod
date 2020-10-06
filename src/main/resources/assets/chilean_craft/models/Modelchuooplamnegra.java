// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelchuooplamnegra extends EntityModel {
	private final ModelRenderer head;

	public Modelchuooplamnegra() {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}