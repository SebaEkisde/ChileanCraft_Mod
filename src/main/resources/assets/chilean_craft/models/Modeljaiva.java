//Made with Blockbench
//Paste this code into your mod.

public static class Modeljaiva extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;

	public Modeljaiva() {
		textureWidth = 128;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 57, 32, -3.0F, -3.0F, -2.0F, 6, 2, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 58, 32, -2.5F, -3.001F, 1.5F, 5, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 69, 39, -2.5F, -3.251F, 1.0F, 5, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 61, 34, -3.5F, -3.002F, -1.5F, 7, 2, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 69, 32, -3.0F, -3.252F, -1.5F, 6, 2, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 76, 34, 0.5F, -2.75F, -2.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 64, 39, -1.5F, -2.75F, -2.5F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 92, 31, -4.0F, -2.7501F, -3.0F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 116, 23, -3.75F, -2.751F, -3.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 112, 25, -4.25F, -2.752F, -3.01F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.3491F, 0.0F);
		bone.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -3.0603F, -2.75F, -6.0F, 1, 1, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, -0.3491F, 0.0F);
		bone.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -4.3913F, -2.75F, -3.2347F, 1, 1, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 92, 32, 3.0F, -2.7501F, -3.0F, 1, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 114, 27, 3.25F, -2.751F, -3.0F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 108, 24, 2.75F, -2.752F, -3.01F, 1, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.3491F, 0.0F);
		bone4.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, 3.5175F, -2.75F, -3.23F, 1, 1, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone6, 0.0F, -0.3491F, 0.0F);
		bone4.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, 2.1865F, -2.75F, -6.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
		bone.render(f5);
		bone4.render(f5);
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