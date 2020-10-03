//Made with Blockbench
//Paste this code into your mod.

public static class Modelmacha extends ModelBase {
	private final ModelRenderer bb_main;

	public Modelmacha() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 7, -1.9F, -1.01F, -0.3F, 5, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 6, -2.1F, -1.0F, -0.91F, 4, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 7, 1.4F, -1.001F, 0.1F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 6, -2.11F, -1.001F, -1.21F, 3, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}