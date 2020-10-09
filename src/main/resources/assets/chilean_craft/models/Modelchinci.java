// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelchinci extends ModelBase {
	private final ModelRenderer bone11;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;

	public Modelchinci() {
		textureWidth = 64;
		textureHeight = 64;

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 6.0F, 0.0F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 8.0F, 0.0F);
		bone11.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 18, 0, -3.0F, -7.01F, 4.0F, 6, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 10, 28, 2.2F, -7.02F, 4.0F, 1, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 10, 28, 2.2F, 2.2F, 4.0F, 1, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 10, 28, -3.1F, 2.2F, 4.0F, 1, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 10, 28, -3.1F, -7.02F, 4.0F, 1, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 45, 45, -1.0F, -7.5F, 6.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 60, 60, -0.5F, -10.01F, 6.5F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 50, -2.0F, -8.4F, 5.0F, 4, 0, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 56, -2.0F, -9.1F, 5.0F, 4, 0, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 56, -2.0F, -8.75F, 5.0F, 4, 0, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 56, -1.0F, -9.25F, 6.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 29, 0, -3.0F, -4.9F, 11.01F, 6, 6, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 29, -2.5F, -4.0F, 3.0F, 5, 4, 8, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 41, 27, -2.498F, -5.95F, 5.0F, 5, 8, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 0, -3.0F, 2.1F, 4.0F, 6, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 1, -3.0F, -4.85F, 1.9F, 6, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 27, 2.1F, -4.85F, 1.8F, 1, 6, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 27, -3.1F, -4.85F, 1.8F, 1, 6, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 27, 2.1F, -4.9F, 11.1F, 1, 6, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 27, -3.1F, -4.9F, 11.1F, 1, 6, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 1, -2.99F, 0.0F, 1.91F, 6, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 12.0F, 18.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.7854F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 18, 0, -2.99F, -19.2F, 6.7F, 6, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 25, 31, 2.1F, -19.2F, 6.8F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 25, 31, -3.1F, -19.2F, 6.8F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 37, 24, -2.497F, -19.2F, 4.3358F, 5, 3, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.7071F, 3.5355F);
		bone2.addChild(bone5);
		setRotationAngle(bone5, 0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 21, 28, -2.99F, -27.9071F, 3.8645F, 2, 5, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(5.0F, -0.7071F, 2.1213F);
		bone2.addChild(bone6);
		setRotationAngle(bone6, 0.1745F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 11, 26, -4.01F, -26.2929F, 5.0787F, 2, 5, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(5.0F, 0.0F, 11.3137F);
		bone2.addChild(bone7);
		setRotationAngle(bone7, 0.9599F, 0.0F, 0.0F);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 2.8284F, 1.4142F);
		bone2.addChild(bone8);
		setRotationAngle(bone8, 0.4363F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 20, 24, -2.97F, -25.6284F, 5.8858F, 2, 3, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 28, 0.99F, -25.6284F, 5.8858F, 2, 3, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 21, 28, 0.99F, -22.8284F, 5.8858F, 2, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 19.0F, 10.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.7854F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 16, 0, -2.99F, -18.5F, 7.0F, 6, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 20, 26, 2.1F, -18.5F, 6.9F, 1, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 20, 26, -3.1F, -18.5F, 6.9F, 1, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 43, 30, -2.499F, -18.49F, 7.03F, 5, 3, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 8.0F, -7.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 36, 2, -2.99F, -17.5F, 7.55F, 6, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 48, 29, -2.499F, -18.5F, 5.1358F, 5, 3, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 14, 0, -2.99F, -18.4F, -2.8F, 6, 3, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 29, -3.101F, -18.41F, -2.81F, 1, 3, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 29, 2.1F, -18.41F, -2.81F, 1, 3, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 29, 2.1F, -17.4F, 7.65F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 29, -3.1F, -17.4F, 7.65F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 29, 2.1F, -18.35F, 7.65F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 29, -3.1F, -18.35F, 7.65F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 48, 25, -2.497F, -18.45F, -2.75F, 5, 3, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -2.98F, -18.3F, 7.551F, 6, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 24.0F, 0.0F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone11.render(f5);
		bone9.render(f5);
		bone10.render(f5);
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