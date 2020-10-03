// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelgorrocokmedia extends EntityModel {
	private final ModelRenderer head;

	public Modelgorrocokmedia() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 40, 53, -6.0F, -8.0F, 0.0F, 6, 1, 6, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 40, 53, 0.0F, -8.0F, 0.0F, 6, 1, 6, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 40, 53, 0.0F, -8.0F, -6.0F, 6, 1, 6, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 40, 53, -6.0F, -8.0F, -6.0F, 6, 1, 6, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 37, 38, -0.5F, -18.0F, -4.5F, 5, 10, 4, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 44, 49, -0.5F, -18.0F, -0.5F, 5, 10, 5, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 37, 33, -4.5F, -18.0F, -4.5F, 4, 10, 9, 0.0F, true));
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