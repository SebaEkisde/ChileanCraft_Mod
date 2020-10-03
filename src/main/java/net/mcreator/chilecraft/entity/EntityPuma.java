
package net.mcreator.chilecraft.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Iterator;
import java.util.ArrayList;

@ElementsChileanCraftMod.ModElement.Tag
public class EntityPuma extends ElementsChileanCraftMod.ModElement {
	public static final int ENTITYID = 90;
	public static final int ENTITYID_RANGED = 91;
	public EntityPuma(ElementsChileanCraftMod instance) {
		super(instance, 249);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("chilean_craft", "puma"), ENTITYID)
				.name("puma").tracker(82, 3, true).egg(-39424, -26368).build());
	}

	private Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext())
			ls.add(itr.next());
		return ls.toArray(new Biome[ls.size()]);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modelpu(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("chilean_craft:textures/ocelot.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAILeapAtTarget(this, (float) 0.5));
			this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityCabra.EntityCustom.class, false, false));
			this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.2, false));
			this.tasks.addTask(5, new EntityAIBreakDoor(this));
			this.tasks.addTask(6, new EntityAIWander(this, 1));
			this.tasks.addTask(7, new EntityAIAttackMelee(this, 1.2, false));
			this.targetTasks.addTask(8, new EntityAIHurtByTarget(this, true));
			this.tasks.addTask(9, new EntityAIPanic(this, 1.2));
			this.targetTasks.addTask(10, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(11, new EntityAILookIdle(this));
			this.tasks.addTask(12, new EntityAISwimming(this));
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6D);
		}
	}

	// Made with Blockbench
	// Paste this code into your mod.
	public static class Modelpu extends ModelBase {
		private final ModelRenderer BodyAll;
		private final ModelRenderer Body;
		private final ModelRenderer Butt;
		private final ModelRenderer bone;
		private final ModelRenderer Chestup;
		private final ModelRenderer Chestdown;
		private final ModelRenderer TailBase;
		private final ModelRenderer TailMedium;
		private final ModelRenderer TailEnd;
		private final ModelRenderer Neck;
		private final ModelRenderer Head;
		private final ModelRenderer Nose;
		private final ModelRenderer EarL;
		private final ModelRenderer Mouth;
		private final ModelRenderer EarR;
		private final ModelRenderer NeckDown;
		private final ModelRenderer ArmL;
		private final ModelRenderer ForearmL;
		private final ModelRenderer HandL;
		private final ModelRenderer ArmL2;
		private final ModelRenderer ForearmL2;
		private final ModelRenderer HandL2;
		private final ModelRenderer HipL;
		private final ModelRenderer ThoughL;
		private final ModelRenderer LegL;
		private final ModelRenderer FeetL;
		private final ModelRenderer HipL2;
		private final ModelRenderer ThoughL2;
		private final ModelRenderer LegL2;
		private final ModelRenderer FeetL2;
		public Modelpu() {
			textureWidth = 64;
			textureHeight = 32;
			BodyAll = new ModelRenderer(this);
			BodyAll.setRotationPoint(0.0F, -25.0F, 0.0F);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -4.0F, 0.0F);
			BodyAll.addChild(Body);
			Body.cubeList.add(new ModelBox(Body, 14, 8, -2.0F, 36.0F, -9.0F, 8, 7, 17, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 9, 15, -2.0F, 38.2F, 7.2F, 8, 3, 3, 0.0F, false));
			Butt = new ModelRenderer(this);
			Butt.setRotationPoint(0.0F, 0.0F, 23.0F);
			setRotationAngle(Butt, -0.8044F, 0.0F, 0.0F);
			Body.addChild(Butt);
			Butt.cubeList.add(new ModelBox(Butt, 11, 16, -1.99F, 35.75F, 15.55F, 8, 6, 3, 0.0F, false));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 4.0F, -23.0F);
			setRotationAngle(bone, 1.5708F, 0.0F, 0.0F);
			Butt.addChild(bone);
			bone.cubeList.add(new ModelBox(bone, 8, 15, -1.99F, 41.8F, -36.9F, 8, 2, 3, 0.0F, false));
			Chestup = new ModelRenderer(this);
			Chestup.setRotationPoint(0.0F, 0.0F, -24.0F);
			setRotationAngle(Chestup, -0.5463F, 0.0F, 0.0F);
			Body.addChild(Chestup);
			Chestup.cubeList.add(new ModelBox(Chestup, 6, 15, -1.991F, 22.0089F, 31.539F, 7, 5, 7, 0.0F, false));
			Chestdown = new ModelRenderer(this);
			Chestdown.setRotationPoint(0.0F, -3.0F, 0.0F);
			setRotationAngle(Chestdown, -0.5009F, 0.0F, 0.0F);
			Chestup.addChild(Chestdown);
			Chestdown.cubeList.add(new ModelBox(Chestdown, 9, 22, -2.0F, 5.2F, 42.1321F, 8, 6, 4, 0.0F, false));
			TailBase = new ModelRenderer(this);
			TailBase.setRotationPoint(0.0F, -1.0F, 31.0F);
			setRotationAngle(TailBase, -0.5463F, 0.0F, 0.0F);
			BodyAll.addChild(TailBase);
			TailBase.cubeList.add(new ModelBox(TailBase, 18, 20, 1.01F, 40.6894F, -1.8385F, 2, 2, 7, 0.0F, false));
			TailMedium = new ModelRenderer(this);
			TailMedium.setRotationPoint(0.0F, 3.0F, 17.0F);
			setRotationAngle(TailMedium, 0.6829F, 0.0F, 0.0F);
			TailBase.addChild(TailMedium);
			TailMedium.cubeList.add(new ModelBox(TailMedium, 56, 7, 1.0F, 21.8221F, -34.9362F, 2, 8, 2, 0.0F, false));
			TailEnd = new ModelRenderer(this);
			TailEnd.setRotationPoint(0.0F, 30.0F, -2.0F);
			setRotationAngle(TailEnd, -0.3187F, 0.0F, 0.0F);
			TailMedium.addChild(TailEnd);
			TailEnd.cubeList.add(new ModelBox(TailEnd, 1, 28, 1.01F, 8.1859F, -26.2545F, 2, 2, 2, 0.0F, false));
			TailEnd.cubeList.add(new ModelBox(TailEnd, 49, 8, 1.01F, 8.1859F, -31.2545F, 2, 2, 5, 0.0F, false));
			Neck = new ModelRenderer(this);
			Neck.setRotationPoint(0.0F, -3.0F, -17.0F);
			setRotationAngle(Neck, 1.2292F, 0.0F, 0.0F);
			BodyAll.addChild(Neck);
			Neck.cubeList.add(new ModelBox(Neck, 8, 17, -0.5F, 15.6699F, -32.8845F, 5, 9, 4, 0.0F, false));
			Head = new ModelRenderer(this);
			Head.setRotationPoint(2.0F, 16.0F, -33.0F);
			setRotationAngle(Head, 0.4098F, 0.0F, 0.0F);
			Neck.addChild(Head);
			Head.cubeList.add(new ModelBox(Head, 2, 0, -3.0F, -3.9553F, -0.1143F, 6, 6, 5, 0.0F, false));
			Nose = new ModelRenderer(this);
			Nose.setRotationPoint(-2.0F, -50.1F, 30.9F);
			setRotationAngle(Nose, 0.5918F, 0.0F, 0.0F);
			Head.addChild(Nose);
			Nose.cubeList.add(new ModelBox(Nose, 49, 7, 0.5F, 21.1941F, -50.9084F, 3, 4, 2, 0.0F, false));
			EarL = new ModelRenderer(this);
			EarL.setRotationPoint(2.0F, -41.6F, 31.5F);
			setRotationAngle(EarL, 0.0F, 0.0F, -0.2731F);
			Head.addChild(EarL);
			EarL.cubeList.add(new ModelBox(EarL, 42, 7, -12.0085F, 38.9419F, -27.0638F, 1, 2, 2, 0.0F, false));
			Mouth = new ModelRenderer(this);
			Mouth.setRotationPoint(-2.0F, -74.6F, 15.0F);
			setRotationAngle(Mouth, 0.2731F, 0.0F, 0.0F);
			Head.addChild(Mouth);
			Mouth.cubeList.add(new ModelBox(Mouth, 4, 8, 0.0F, 63.2792F, -33.9759F, 4, 5, 3, 0.0F, false));
			EarR = new ModelRenderer(this);
			EarR.setRotationPoint(-6.1F, -41.6F, 31.5F);
			setRotationAngle(EarR, 0.0F, 0.0F, 0.2731F);
			Head.addChild(EarR);
			EarR.cubeList.add(new ModelBox(EarR, 45, 6, 14.9567F, 37.8704F, -26.903F, 1, 2, 2, 0.0F, false));
			NeckDown = new ModelRenderer(this);
			NeckDown.setRotationPoint(0.0F, -18.0F, -13.0F);
			setRotationAngle(NeckDown, -0.4554F, 0.0F, 0.0F);
			Neck.addChild(NeckDown);
			NeckDown.cubeList.add(new ModelBox(NeckDown, 19, 11, 0.01F, 39.4304F, -2.3978F, 4, 8, 3, 0.0F, false));
			ArmL = new ModelRenderer(this);
			ArmL.setRotationPoint(1.0F, 36.0F, -8.0F);
			setRotationAngle(ArmL, 0.0456F, 0.0F, 0.0F);
			BodyAll.addChild(ArmL);
			ArmL.cubeList.add(new ModelBox(ArmL, 48, 14, 2.0F, -2.8665F, -1.1397F, 4, 8, 4, 0.0F, false));
			ForearmL = new ModelRenderer(this);
			ForearmL.setRotationPoint(6.0F, -7.0F, -13.0F);
			setRotationAngle(ForearmL, -0.0911F, 0.0F, 0.0F);
			ArmL.addChild(ForearmL);
			ForearmL.cubeList.add(new ModelBox(ForearmL, 51, 14, -3.5F, 9.1741F, 13.49F, 3, 9, 3, 0.0F, false));
			HandL = new ModelRenderer(this);
			HandL.setRotationPoint(-1.0F, 13.0F, 1.5F);
			setRotationAngle(HandL, 0.0456F, 0.0F, 0.0F);
			ForearmL.addChild(HandL);
			HandL.cubeList.add(new ModelBox(HandL, 48, 0, -3.0F, 4.4F, 10.9F, 4, 2, 4, 0.0F, false));
			ArmL2 = new ModelRenderer(this);
			ArmL2.setRotationPoint(1.0F, 36.0F, -8.0F);
			setRotationAngle(ArmL2, 0.0456F, 0.0F, 0.0F);
			BodyAll.addChild(ArmL2);
			ArmL2.cubeList.add(new ModelBox(ArmL2, 12, 18, -4.0F, -2.8665F, -1.1397F, 4, 8, 4, 0.0F, false));
			ForearmL2 = new ModelRenderer(this);
			ForearmL2.setRotationPoint(0.0F, -7.0F, -13.0F);
			setRotationAngle(ForearmL2, -0.0911F, 0.0F, 0.0F);
			ArmL2.addChild(ForearmL2);
			ForearmL2.cubeList.add(new ModelBox(ForearmL2, 52, 10, -3.5F, 9.1741F, 13.49F, 3, 9, 3, 0.0F, false));
			HandL2 = new ModelRenderer(this);
			HandL2.setRotationPoint(-1.0F, 13.0F, 1.5F);
			setRotationAngle(HandL2, 0.0456F, 0.0F, 0.0F);
			ForearmL2.addChild(HandL2);
			HandL2.cubeList.add(new ModelBox(HandL2, 48, 0, -3.0F, 4.3F, 10.9F, 4, 2, 4, 0.0F, false));
			HipL = new ModelRenderer(this);
			HipL.setRotationPoint(1.0F, 35.0F, 6.0F);
			setRotationAngle(HipL, -0.0911F, 0.0F, 0.0F);
			BodyAll.addChild(HipL);
			HipL.cubeList.add(new ModelBox(HipL, 48, 10, 2.7F, -1.9222F, -2.6007F, 3, 7, 5, 0.0F, false));
			ThoughL = new ModelRenderer(this);
			ThoughL.setRotationPoint(7.6F, -14.0F, 12.0F);
			setRotationAngle(ThoughL, 0.9561F, 0.0F, 0.0F);
			HipL.addChild(ThoughL);
			ThoughL.cubeList.add(new ModelBox(ThoughL, 50, 7, -5.0F, -0.8735F, -24.0584F, 3, 6, 4, 0.0F, false));
			LegL = new ModelRenderer(this);
			LegL.setRotationPoint(0.0F, 16.0F, 0.0F);
			setRotationAngle(LegL, -0.8652F, 0.0F, 0.0F);
			ThoughL.addChild(LegL);
			LegL.cubeList.add(new ModelBox(LegL, 23, 12, -5.1F, 8.3003F, -24.2498F, 3, 7, 3, 0.0F, false));
			FeetL = new ModelRenderer(this);
			FeetL.setRotationPoint(-0.6F, 11.0F, 1.0F);
			LegL.addChild(FeetL);
			FeetL.cubeList.add(new ModelBox(FeetL, 46, 0, -5.0F, 3.5F, -26.1998F, 4, 2, 4, 0.0F, false));
			HipL2 = new ModelRenderer(this);
			HipL2.setRotationPoint(1.0F, 35.0F, 6.0F);
			setRotationAngle(HipL2, -0.0911F, 0.0F, 0.0F);
			BodyAll.addChild(HipL2);
			HipL2.cubeList.add(new ModelBox(HipL2, 47, 11, -3.5F, -2.1083F, -2.518F, 3, 7, 5, 0.0F, false));
			ThoughL2 = new ModelRenderer(this);
			ThoughL2.setRotationPoint(0.6F, -15.0F, 10.0F);
			setRotationAngle(ThoughL2, 0.9561F, 0.0F, 0.0F);
			HipL2.addChild(ThoughL2);
			ThoughL2.cubeList.add(new ModelBox(ThoughL2, 18, 10, -4.09F, 1.2973F, -23.55F, 3, 6, 4, 0.0F, false));
			LegL2 = new ModelRenderer(this);
			LegL2.setRotationPoint(0.0F, 16.0F, 0.0F);
			setRotationAngle(LegL2, -0.8652F, 0.0F, 0.0F);
			ThoughL2.addChild(LegL2);
			LegL2.cubeList.add(new ModelBox(LegL2, 47, 11, -4.1F, 9.3F, -22.2497F, 3, 7, 3, 0.0F, false));
			FeetL2 = new ModelRenderer(this);
			FeetL2.setRotationPoint(-0.6F, 11.0F, 1.0F);
			LegL2.addChild(FeetL2);
			FeetL2.cubeList.add(new ModelBox(FeetL2, 46, 0, -4.0F, 4.5F, -24.1997F, 4, 2, 4, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			BodyAll.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.ArmL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.HipL.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.ArmL2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.HipL2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
