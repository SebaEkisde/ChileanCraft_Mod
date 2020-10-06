//Made with Blockbench
//Paste this code into your mod.

public static class Modelshuplala extends ModelBase {
	private final ModelRenderer head;

	public Modelshuplala() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 67, 105, -4.5F, -9.0F, -4.5F, 9,
				4, 9, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 67, 105, -7.5F, -6.0F, -7.5F, 15,
				1, 15, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		head.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y,
			float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}