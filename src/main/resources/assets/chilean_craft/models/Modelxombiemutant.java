// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelxombiemutant extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightArm2;
	private final ModelRenderer leftArm2;

	public Modelxombiemutant() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(head, 0.2618F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 11, 8, -3.0F, -2.0F, -2.5F, 6, 4, 4, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -1.0F, -1.0F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -7.2588F, -3.9659F, 8, 8, 8, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 13, 6, 4.0F, -5.7753F, -1.2929F, 1, 5, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 18, 9, 0.0F, -7.7753F, -1.2929F, 2, 2, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, 24.0F, 1.0F, 1, 1, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 18, -4.0F, 11.0F, -1.25F, 4, 1, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 20, 0.0F, 11.0F, -1.25F, 4, 1, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(bone2);
		setRotationAngle(bone2, 0.3491F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 16, 19, -4.0F, -22.2035F, 4.8596F, 6, 5, 6, 0.0F, true));
		bone2.cubeList.add(new ModelBox(bone2, 26, 19, -5.0F, -22.2035F, 4.8596F, 1, 5, 6, 0.0F, true));
		bone2.cubeList.add(new ModelBox(bone2, 20, 20, 2.0F, -22.2035F, 4.8596F, 3, 5, 6, 0.0F, true));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 27.0F, -8.0F);
		body.addChild(bone3);
		setRotationAngle(bone3, -0.0873F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 16, 20, -3.99F, -23.4F, 5.35F, 8, 7, 4, 0.0F, true));

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(leftArm, -1.5708F, 0.0F, 0.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 40, 16, -4.0F, -1.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(rightArm, -1.5708F, 0.0F, 0.0F);
		rightArm.cubeList.add(new ModelBox(rightArm, 40, 16, 0.0F, -1.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(-1.9F, 12.0F, 0.75F);
		leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(0.9F, 12.0F, 0.75F);
		rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 16, -1.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		rightArm2 = new ModelRenderer(this);
		rightArm2.setRotationPoint(5.0F, 6.0F, 0.0F);
		setRotationAngle(rightArm2, -1.5708F, 0.0F, 0.0F);
		rightArm2.cubeList.add(new ModelBox(rightArm2, 42, 17, -1.0F, -1.0F, -0.5F, 3, 11, 3, 0.0F, true));

		leftArm2 = new ModelRenderer(this);
		leftArm2.setRotationPoint(-5.0F, 6.0F, 0.0F);
		setRotationAngle(leftArm2, -1.5708F, 0.0F, 0.0F);
		leftArm2.cubeList.add(new ModelBox(leftArm2, 42, 17, -2.0F, -1.0F, -0.5F, 3, 11, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		leftArm.render(f5);
		rightArm.render(f5);
		leftLeg.render(f5);
		rightLeg.render(f5);
		rightArm2.render(f5);
		leftArm2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightArm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftArm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.bone.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.bone.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}