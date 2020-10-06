// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modeltrompoespsinas extends ModelBase {
	private final ModelRenderer bone;

	public Modeltrompoespsinas() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 23.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 5, 0, -2.0F, -4.0F, 0.0F, 2, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 0, -2.5F, -3.3F, -0.5F, 3, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 0, -2.5F, -8.3F, -0.5F, 3, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -3.0F, 0.5F, 1, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -3.5F, -7.5F, -1.5F, 5, 1, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 1, -3.0F, -4.0F, -1.0F, 4, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 1, -3.0F, -4.0F, 1.0F, 4, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 5, -3.0F, -8.0F, -1.0F, 4, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -8.5F, 0.5F, 1, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -10.5F, 0.5F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 7, -4.0F, -7.0F, -2.0F, 6, 3, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.25F, -6.5F, 4.0F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -6.25F, -4.0F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 1, -6.0F, -6.0F, 0.5F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 1, 2.0F, -6.0F, 0.25F, 2, 1, 1, 0.0F, false));
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
		this.bone.rotateAngleY = f2;
	}
}