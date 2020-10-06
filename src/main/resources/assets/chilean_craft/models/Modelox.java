// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelox extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;

	public Modelox() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 21, 5, -1.5F, 0.8F, 2.5F, 3, 1, 3, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 0, 10, -1.249F, 10.746F, 2.25F, 3, 1, 3, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 21, 5, -1.0F, 0.5F, 3.0F, 2, 1, 2, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 21, 5, -0.5F, -1.5F, 3.5F, 1, 2, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 10, 0, 0.5F, -2.0F, 3.0F, 1, 2, 2, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 3, 12, -0.249F, -0.5F, 3.249F, 1, 1, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 6, 14, -0.75F, -0.51F, 3.75F, 1, 1, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 5, 14, -0.25F, -0.501F, 3.75F, 1, 1, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 2, 10, -0.75F, -0.501F, 3.25F, 1, 1, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 16, 1, -2.0F, 1.5F, 2.0F, 4, 9, 4, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 0, 10, -2.0F, 10.5F, 2.0F, 4, 1, 4, 0.0F, true));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 10, -1.5F, -13.1F, 2.5F, 3, 1, 3, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 0, 12, -1.749F, -13.25F, 2.749F, 3, 1, 3, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 0, 10, -1.25F, -13.251F, 2.75F, 3, 1, 3, 0.0F, true));
		bone3.cubeList.add(new ModelBox(bone3, 0, 11, -1.75F, -13.252F, 2.25F, 3, 1, 3, 0.0F, true));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.5F, -22.75F, 2.5F, 3, 1, 3, 0.0F, true));
		bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.749F, -22.75F, 2.749F, 3, 1, 3, 0.0F, true));
		bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.25F, -22.75F, 2.75F, 3, 1, 3, 0.0F, true));
		bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.25F, -22.75F, 2.25F, 3, 1, 3, 0.0F, true));
		bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.75F, -22.75F, 2.25F, 3, 1, 3, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 4, 1.1F, -16.502F, 1.899F, 1, 1, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 4, -1.899F, -16.503F, 5.1F, 4, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 4, -2.099F, -16.501F, 5.099F, 4, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 4, -2.1F, -16.5F, 1.9F, 4, 1, 4, 0.0F, true));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 23.0F, 0.0F);
		body.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 2, 1.1F, -19.502F, 1.899F, 1, 1, 4, 0.0F, true));
		bone2.cubeList.add(new ModelBox(bone2, 0, 2, -1.899F, -19.503F, 5.1F, 4, 1, 1, 0.0F, true));
		bone2.cubeList.add(new ModelBox(bone2, 0, 2, -2.099F, -19.501F, 5.099F, 4, 1, 1, 0.0F, true));
		bone2.cubeList.add(new ModelBox(bone2, 0, 2, -2.1F, -19.5F, 1.9F, 4, 1, 4, 0.0F, true));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(bone5);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -1.0F, -16.0F, 5.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		bone6.render(f5);
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