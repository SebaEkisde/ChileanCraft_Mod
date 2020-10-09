//Made with Blockbench
//Paste this code into your mod.

public static class Modelbuceoo extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public Modelbuceoo() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 11, 19, -4.0F, -6.85F, -5.0F, 8, 1, 1, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 11, 19, -5.0F, -11.5F, -2.75F, 1, 11, 1, 0.0F, true));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -4.5F, -25.5F, -5.001F, 5, 1, 1, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -0.99F, -26.251F, -5.5F, 2, 2, 1, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -4.001F, -29.85F, -5.0F, 1, 4, 1, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -5.01F, -25.5F, -5.01F, 1, 1, 3, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -3.799F, -29.501F, 3.2F, 8, 2, 1, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -1.0F, -26.25F, -5.0F, 2, 2, 1, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -5.201F, -29.5F, -2.6F, 1, 2, 1, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -4.2F, -29.502F, -4.2F, 1, 2, 8, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, 3.01F, -29.85F, -5.0F, 1, 4, 1, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 0, 16, -3.0F, -29.85F, -4.5F, 6, 3, 1, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, 3.2F, -29.5F, -4.2F, 1, 2, 8, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -4.201F, -29.5F, 3.201F, 1, 2, 1, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 11, 19, -5.202F, -29.501F, -2.901F, 1, 2, 1, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 2.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, -0.2618F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 11, 19, 0.5F, -5.501F, -5.002F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 11, 19, -1.9F, -5.5F, -5.001F, 3, 1, 1, 0.0F, true));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 2.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.2618F);
		head.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 11, 19, -0.9F, -5.5F, -5.001F, 3, 1, 1, 0.0F, true));
		bone2.cubeList.add(new ModelBox(bone2, 11, 19, -1.502F, -5.501F, -5.003F, 1, 1, 1, 0.0F, true));
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