// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelmerluza extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer pierna;
	private final ModelRenderer head;
	private final ModelRenderer leftFin;
	private final ModelRenderer rightFin;

	public Modelmerluza() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 23.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 23, 0.0F, -6.0F, 0.0F, 0, 1, 5, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 16, 23, 0.0F, -5.0F, 5.0F, 0, 1, 3, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 23, 29, -0.002F, -5.5F, 5.0F, 0, 1, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 24, 24, 0.0F, -6.0F, -2.0F, 0, 1, 2, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 24, 24, 0.0F, -5.5F, -3.01F, 0, 2, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 24, 24, -0.003F, -6.5F, -1.01F, 0, 1, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 24, 24, 0.0F, 0.75F, -0.01F, 0, 1, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 24, 24, 0.0F, 0.0F, 4.98F, 0, 1, 1, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 24, 24, 0.0F, -0.5F, 0.99F, 0, 2, 4, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 24, 24, 0.0F, -1.5F, 3.99F, 0, 2, 4, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -2.0F, 4.0F);
		body.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 1, 17, -1.0F, -2.0F, 1.0F, 2, 4, 3, 0.0F, true));

		pierna = new ModelRenderer(this);
		pierna.setRotationPoint(0.0F, 0.0F, 4.0F);
		bone.addChild(pierna);
		pierna.cubeList.add(new ModelBox(pierna, 0, 17, -0.5F, -1.5F, 0.0F, 1, 3, 2, 0.0F, true));
		pierna.cubeList.add(new ModelBox(pierna, 18, 15, -0.5F, -1.0F, 2.0F, 1, 2, 1, 0.0F, true));
		pierna.cubeList.add(new ModelBox(pierna, 26, 24, 0.0F, -2.0F, 3.0F, 0, 4, 1, 0.0F, true));
		pierna.cubeList.add(new ModelBox(pierna, 25, 26, 0.0F, -2.0F, 4.0F, 0, 1, 1, 0.0F, true));
		pierna.cubeList.add(new ModelBox(pierna, 25, 24, 0.0F, 1.0F, 4.0F, 0, 1, 1, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 21.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 20, 15, -0.491F, -2.5F, -4.0F, 1, 4, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 26, 15, -0.399F, -2.5F, -4.0F, 1, 4, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 23, 14, -0.399F, 1.5F, -4.0F, 1, 1, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 22, 15, -0.499F, 1.0F, -4.5F, 1, 1, 1, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 22, 15, -0.499F, -2.3F, -4.5F, 1, 3, 1, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 22, 15, -0.5F, -1.3F, -4.8F, 1, 2, 1, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 6, 18, -1.0F, 0.0F, -2.0F, 2, 3, 3, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 17, 12, -1.0F, -3.0F, -2.0F, 2, 3, 3, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 11, 16, -1.0F, -1.0F, 1.0F, 2, 4, 4, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 3, 17, -1.0F, -2.0F, 1.0F, 2, 1, 4, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 3, 17, -1.0F, -3.0F, 1.0F, 2, 1, 4, 0.0F, true));

		leftFin = new ModelRenderer(this);
		leftFin.setRotationPoint(-1.0F, 22.0F, 0.0F);
		setRotationAngle(leftFin, 0.0F, 0.0F, -1.6581F);
		leftFin.cubeList.add(new ModelBox(leftFin, 22, 27, -0.5F, -1.0654F, -2.0F, 1, 1, 4, 0.0F, true));

		rightFin = new ModelRenderer(this);
		rightFin.setRotationPoint(1.0F, 22.0F, 0.0F);
		setRotationAngle(rightFin, 0.0F, 0.0F, 1.5708F);
		rightFin.cubeList.add(new ModelBox(rightFin, 22, 26, -0.5F, -1.0F, -2.0F, 1, 1, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		head.render(f5);
		leftFin.render(f5);
		rightFin.render(f5);
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