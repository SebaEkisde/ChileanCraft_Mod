
package net.mcreator.chilecraft.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.procedure.ProcedureZombiequinteroPlayerCollidesWithThisEntity;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class EntityZombiequintero extends ElementsChileanCraftMod.ModElement {
	public static final int ENTITYID = 66;
	public static final int ENTITYID_RANGED = 67;
	public EntityZombiequintero(ElementsChileanCraftMod instance) {
		super(instance, 242);
	}

	@Override
	public void initElements() {
		elements.entities.add(
				() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("chilean_craft", "zombiequintero"), ENTITYID)
						.name("zombiequintero").tracker(64, 3, true).egg(-16750951, -13369600).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Biome[] spawnBiomes = {Biome.REGISTRY.getObject(new ResourceLocation("beaches")),};
		EntityRegistry.addSpawn(EntityCustom.class, 1, 1, 1, EnumCreatureType.MONSTER, spawnBiomes);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modelxombiemutant(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("chilean_craft:textures/zombieq.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityZombie {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 8;
			this.isImmuneToFire = true;
			setNoAI(!true);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.2, false));
			this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(3, new EntityAIWander(this, 0.8));
			this.tasks.addTask(4, new EntityAILookIdle(this));
			this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityPlayer.class, false, false));
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEAD;
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
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof EntityPotion)
				return false;
			if (source == DamageSource.DROWN)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public void onCollideWithPlayer(EntityPlayer entity) {
			super.onCollideWithPlayer(entity);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureZombiequinteroPlayerCollidesWithThisEntity.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.5D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}
	}

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
}
