//Made with Blockbench
//Paste this code into your mod.

public static class Modelcabra extends ModelBase {
	private final ModelRenderer patadere2;
	private final ModelRenderer pataizq1;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone9;
	private final ModelRenderer e;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer pata2izq;
	private final ModelRenderer coola;
	private final ModelRenderer patadere1;

	public Modelcabra() {
		textureWidth = 32;
		textureHeight = 32;

		patadere2 = new ModelRenderer(this);
		patadere2.setRotationPoint(-2.0F, 18.0F, 5.5F);
		patadere2.cubeList.add(new ModelBox(patadere2, 24, 23, -0.6F, -1.0F,
				-1.0F, 2, 7, 2, 0.0F, false));

		pataizq1 = new ModelRenderer(this);
		pataizq1.setRotationPoint(0.0F, 18.0F, -1.0F);
		pataizq1.cubeList.add(new ModelBox(pataizq1, 24, 23, 0.6F, -1.0F,
				-1.1F, 2, 7, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 2, 9, -2.5F, -10.0F, -3.0F, 5, 5,
				10, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone2, 0.5236F, 0.0F, 0.0F);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone3);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone4, 0.1745F, 0.0F, 0.0F);
		bone2.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 19, 23, -1.495F, -13.0F, 2.3F,
				3, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 23, 22, -1.495F, -13.0F, 1.3F,
				3, 2, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, -0.4363F, 0.0F, 0.0F);
		bone4.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 28, -0.5F, -12.0F, -3.0F, 1,
				3, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone6, -0.6109F, 0.0F, 0.0F);
		bone5.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 1, 28, 0.51F, -14.0F, -9.0F, 1,
				3, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 27, -1.51F, -14.0F, -9.0F, 1,
				3, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone7, 0.1745F, 0.0F, -0.1745F);
		bone6.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 78, 25, -0.8368F, -12.9707F,
				-6.1761F, 2, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 7, 23, -1.5F, -14.0F, 1.0F, 2,
				6, 3, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 8, 23, -0.45F, -14.0F, 1.0F, 2,
				6, 3, 0.0F, false));

		e = new ModelRenderer(this);
		e.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(e, -0.0873F, 0.0F, 0.1745F);
		e.cubeList.add(new ModelBox(e, 64, 9, -1.6736F, -13.4811F, -5.0858F, 2,
				1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone10, 0.0F, 0.0F, -0.1745F);
		e.addChild(bone10);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 0, 0, -1.5007F, -6.9963F,
				2.9142F, 3, 2, 3, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(bone12);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(bone13);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone14, 0.0873F, 0.0F, 0.0F);
		bone13.addChild(bone14);

		pata2izq = new ModelRenderer(this);
		pata2izq.setRotationPoint(3.0F, 18.0F, 5.5F);
		pata2izq.cubeList.add(new ModelBox(pata2izq, 24, 23, -2.4F, -1.0F,
				-1.0F, 2, 7, 2, 0.0F, false));

		coola = new ModelRenderer(this);
		coola.setRotationPoint(0.0F, 14.5F, 7.0F);
		setRotationAngle(coola, 0.5236F, 0.0F, 0.0F);
		coola.cubeList.add(new ModelBox(coola, 0, 27, -1.0F, -0.2321F, -0.5F,
				2, 4, 1, 0.0F, false));

		patadere1 = new ModelRenderer(this);
		patadere1.setRotationPoint(-2.0F, 18.0F, -1.25F);
		patadere1.cubeList.add(new ModelBox(patadere1, 24, 23, -0.6F, -1.0F,
				-0.85F, 2, 7, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		patadere2.render(f5);
		pataizq1.render(f5);
		bone.render(f5);
		bone2.render(f5);
		e.render(f5);
		pata2izq.render(f5);
		coola.render(f5);
		patadere1.render(f5);
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
		this.patadere2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.pata2izq.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.patadere1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.pataizq1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}