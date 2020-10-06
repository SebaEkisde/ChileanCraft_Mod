// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelsaco12 extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public Modelsaco12() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 12.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 37, 4, 6.0F, -4.0F, -5.0F, 1, 16, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 43, 4, -7.0F, -4.0F, -6.0F, 14, 16, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 3, -7.0F, -4.0F, -5.0F, 1, 16, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 43, 4, -8.0F, -4.0F, -3.0F, 1, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 4, 2.0F, 11.1F, -5.0F, 4, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 4, -2.0F, 11.1F, -5.0F, 4, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 35, 4, -6.0F, 11.1F, -5.0F, 4, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 43, 4, -7.0F, -4.0F, 5.0F, 14, 16, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 43, 4, 7.0F, -4.0F, -3.0F, 1, 1, 6, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 12.0F, 1.0F);
		bone.addChild(bone2);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
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