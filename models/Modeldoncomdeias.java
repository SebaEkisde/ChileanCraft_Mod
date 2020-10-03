//Made with Blockbench
//Paste this code into your mod.

public static class Modeldoncomdeias extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public Modeldoncomdeias() {
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
		head.cubeList.add(new ModelBox(head, 0, 33, -4.5F, -7.0F, -4.5F, 9, 7, 9, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 3, 33, -3.5F, -8.0F, 4.7F, 2, 8, 0, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 29, 30, -4.7F, -8.0F, 1.5F, 0, 8, 3, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 5, 53, -0.2F, -7.0F, -5.48F, 5, 5, 5, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 13, 59, -1.2F, -5.0F, -5.48F, 2, 1, 1, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 11, 53, -4.5F, -7.0F, -5.5F, 4, 5, 5, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 23, 53, -4.75F, -6.0F, -3.5F, 1, 4, 5, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 26, 56, -4.75F, -6.0F, -5.5F, 1, 4, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 54, 3.75F, -6.0F, -3.5F, 1, 4, 4, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 2, 56, 3.75F, -6.0F, -5.5F, 1, 4, 2, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 29, 30, 4.7F, -32.0F, 1.5F, 0, 8, 3, 0.0F, true));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 3.1416F, 0.0F);
		bone.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 3, 33, -3.4F, -32.0F, -4.7F, 2, 8, 0, 0.0F, true));
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