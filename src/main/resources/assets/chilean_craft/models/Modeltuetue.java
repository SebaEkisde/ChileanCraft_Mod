// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modeltuetue extends ModelBase {
	private final ModelRenderer aladere;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer alaizq;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone;

	public Modeltuetue() {
		textureWidth = 64;
		textureHeight = 32;

		aladere = new ModelRenderer(this);
		aladere.setRotationPoint(-5.0F, 19.0F, 0.0F);
		aladere.cubeList.add(new ModelBox(aladere, 4, 23, -19.0F, 0.0F, -2.0F, 20, 2, 5, 0.0F, false));
		aladere.cubeList.add(new ModelBox(aladere, 4, 23, -21.0F, 0.0F, 2.7F, 17, 2, 3, 0.0F, false));
		aladere.cubeList.add(new ModelBox(aladere, 4, 23, -23.0F, 0.0F, 5.7F, 17, 2, 3, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(4.0F, 5.0F, 17.0F);
		aladere.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.6109F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 4, 23, -29.0F, -5.0F, -28.69F, 21, 2, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 4, 23, -27.1161F, -5.0F, -26.1501F, 17, 2, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 4, 23, -24.0204F, -5.0F, -23.2822F, 10, 2, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 4, 23, -19.9246F, -5.0F, -20.4144F, 10, 2, 3, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.3491F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 4, 23, -9.2756F, -5.0F, -22.1351F, 10, 2, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.3491F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 4, 23, -7.5549F, -5.0F, -19.6776F, 10, 2, 3, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.3491F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 4, 23, -5.2606F, -5.0F, -17.401F, 10, 2, 3, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 4, 23, -2.7207F, -5.0F, -14.5171F, 12, 2, 2, 0.0F, false));

		alaizq = new ModelRenderer(this);
		alaizq.setRotationPoint(6.0F, 21.0F, 1.0F);
		alaizq.cubeList.add(new ModelBox(alaizq, 15, 21, -1.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-4.0F, 3.0F, 16.0F);
		alaizq.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 3.1416F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 21, -23.0F, 3.0F, -19.0F, 21, 2, 5, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 21, -25.0F, 3.0F, -14.3F, 17, 2, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 21, -27.0F, 3.0F, -11.3F, 17, 2, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.6109F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 21, -29.0F, 3.0F, -28.69F, 21, 2, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 21, -27.1161F, 3.0F, -26.1501F, 17, 2, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 21, -24.0204F, 3.0F, -23.2822F, 10, 2, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 21, -19.9246F, 3.0F, -20.4144F, 10, 2, 3, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.3491F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 21, -9.2756F, 3.0F, -22.1351F, 10, 2, 3, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.3491F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 0, 21, -7.5549F, 3.0F, -19.6776F, 10, 2, 3, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.3491F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 0, 21, -5.2606F, 3.0F, -17.401F, 10, 2, 3, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 0, 21, -2.7207F, 3.0F, -14.5171F, 12, 2, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 24.0F, 17.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -8.0F, -20.0F, 8, 8, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		aladere.render(f5);
		alaizq.render(f5);
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.aladere.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.alaizq.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}