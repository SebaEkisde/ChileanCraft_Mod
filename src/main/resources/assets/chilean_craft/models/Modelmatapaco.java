//Made with Blockbench
//Paste this code into your mod.

public static class Modelmatapaco extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer upperBody;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer tail;

	public Modelmatapaco() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, 13.5F, -7.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -3.0F, -2.0F, 6, 6,
				4, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 16, 14, 1.0F, -5.0F, 0.0F, 2, 2,
				1, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 16, 14, -3.0F, -5.0F, 0.0F, 2, 2,
				1, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 10, -1.5F, -0.02F, -5.0F, 3, 3,
				4, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 14.0F, 2.0F);
		setRotationAngle(body, -1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 18, 14, -2.0F, -6.0F, -3.0F, 6, 9,
				6, 0.0F, true));

		upperBody = new ModelRenderer(this);
		upperBody.setRotationPoint(1.0F, 14.0F, 2.0F);
		setRotationAngle(upperBody, 1.5708F, 0.0F, 0.0F);
		upperBody.cubeList.add(new ModelBox(upperBody, 21, 0, -4.0F, -7.0F,
				-3.0F, 8, 6, 7, 0.0F, true));

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(2.5F, 16.0F, 7.0F);
		leg0.cubeList.add(new ModelBox(leg0, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8,
				2, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-0.5F, 16.0F, 7.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8,
				2, 0.0F, true));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(2.5F, 16.0F, -4.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8,
				2, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-0.5F, 16.0F, -4.0F);
		leg3.cubeList.add(new ModelBox(leg3, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8,
				2, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(1.0F, 12.0F, 8.0F);
		tail.cubeList.add(new ModelBox(tail, 9, 18, -1.0F, 0.0F, -1.0F, 2, 8,
				2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		head.render(f5);
		body.render(f5);
		upperBody.render(f5);
		leg0.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		tail.render(f5);
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
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tail.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}