//Made with Blockbench
//Paste this code into your mod.

public static class Modelasdasdasdas extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer body;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer arms;

	public Modelasdasdasdas() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 5, 5, -3.0F, -8.0F, -5.0F, 8, 1, 3, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 8, 2, -5.0F, -8.0F, 3.0F, 2, 1, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 8, 2, -5.0F, -8.0F, 1.0F, 2, 1, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 8, 2, -5.0F, -8.0F, -1.0F, 2, 1, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 8, 2, -5.0F, -8.0F, -3.0F, 2, 1, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 8, 2, -5.0F, -8.0F, -5.0F, 2, 1, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 6, 5, -4.0F, -8.0F, -2.0F, 9, 1, 3, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 6, 5, -4.0F, -8.0F, 1.0F, 9, 1, 3, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 6, 6, -3.0F, -8.0F, 3.0F, 8, 1, 2, 0.0F, true));

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, -2.0F, 0.0F);
		nose.cubeList.add(new ModelBox(nose, 24, 0, -1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 20, -4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 0, 38, -4.0F, 0.0F, -3.0F, 8, 18, 6, 0.5F, true));

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(2.0F, 12.0F, 0.0F);
		leg0.cubeList.add(new ModelBox(leg0, 0, 22, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-2.0F, 12.0F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 22, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 2.0F, 0.0F);
		setRotationAngle(arms, -0.9599F, 0.0F, 0.0F);
		arms.cubeList.add(new ModelBox(arms, 40, 38, -4.0F, 2.0F, -2.0F, 8, 4, 4, 0.0F, true));
		arms.cubeList.add(new ModelBox(arms, 44, 22, 4.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F, true));
		arms.cubeList.add(new ModelBox(arms, 44, 22, -8.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		nose.render(f5);
		body.render(f5);
		leg0.render(f5);
		leg1.render(f5);
		arms.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.nose.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.nose.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}