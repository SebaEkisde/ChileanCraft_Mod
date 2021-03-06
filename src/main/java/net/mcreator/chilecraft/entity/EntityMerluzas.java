
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
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.procedure.ProcedureReinetaOnInitialEntitySpawn;
import net.mcreator.chilecraft.procedure.ProcedureReinetaOnEntityTickUpdate;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class EntityMerluzas extends ElementsChileanCraftMod.ModElement {
	public static final int ENTITYID = 62;
	public static final int ENTITYID_RANGED = 63;
	public EntityMerluzas(ElementsChileanCraftMod instance) {
		super(instance, 240);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("chilean_craft", "merluzas"), ENTITYID).name("merluzas").tracker(64, 3, true).egg(-1, -1).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Biome[] spawnBiomes = {Biome.REGISTRY.getObject(new ResourceLocation("ocean")),
				Biome.REGISTRY.getObject(new ResourceLocation("frozen_ocean")), Biome.REGISTRY.getObject(new ResourceLocation("deep_ocean")),};
		EntityRegistry.addSpawn(EntityCustom.class, 1000, 4, 12, EnumCreatureType.CREATURE, spawnBiomes);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modelreineta(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("chilean_craft:textures/code.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityCreature {
		public EntityCustom(World world) {
			super(world);
			setSize(0.3f, 1.0999999999999999f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(3, new EntityAILeapAtTarget(this, (float) 0.5));
			this.tasks.addTask(4, new EntityAILookIdle(this));
			this.tasks.addTask(5, new EntityAIPanic(this, 1.2));
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
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.DROWN)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
			IEntityLivingData retval = super.onInitialSpawn(difficulty, livingdata);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureReinetaOnInitialEntitySpawn.executeProcedure($_dependencies);
			}
			return retval;
		}

		@Override
		public void onEntityUpdate() {
			super.onEntityUpdate();
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureReinetaOnEntityTickUpdate.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.7999999999999999D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(7D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}

		@Override
		public boolean canBreatheUnderwater() {
			return true;
		}

		@Override
		public boolean getCanSpawnHere() {
			return true;
		}

		@Override
		public boolean isNotColliding() {
			return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
		}

		@Override
		public boolean isPushedByWater() {
			return false;
		}
	}

	// Made with Blockbench
	// Paste this code into your mod.
	public static class Modelreineta extends ModelBase {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer leftFin;
		private final ModelRenderer rightFin;
		private final ModelRenderer pierna;
		public Modelreineta() {
			textureWidth = 32;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.cubeList.add(new ModelBox(body, 6, 13, -1.0F, -4.0F, 1.0F, 2, 4, 7, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 16, 23, 0.0F, -5.0F, 1.0F, 0, 1, 6, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 24, 24, 0.0F, -5.0F, -2.0F, 0, 1, 2, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 24, 24, 0.0F, -5.5F, -3.01F, 0, 2, 1, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 16, 23, 0.0F, 0.0F, -1.0F, 0, 1, 8, 0.0F, true));
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 22.0F, 0.0F);
			head.cubeList.add(new ModelBox(head, 6, 12, -0.5F, -1.0F, -7.0F, 1, 2, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 22, 15, -1.0F, -1.5F, -5.0F, 2, 3, 3, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 9, 17, -1.0F, -2.0F, -2.0F, 2, 4, 3, 0.0F, true));
			leftFin = new ModelRenderer(this);
			leftFin.setRotationPoint(-1.0F, 23.0F, 0.0F);
			setRotationAngle(leftFin, 0.0F, 0.0F, -1.6581F);
			leftFin.cubeList.add(new ModelBox(leftFin, 22, 27, -0.5F, -1.0654F, -2.0F, 1, 1, 3, 0.0F, true));
			rightFin = new ModelRenderer(this);
			rightFin.setRotationPoint(1.0F, 23.0F, 0.0F);
			setRotationAngle(rightFin, 0.0F, 0.0F, 1.5708F);
			rightFin.cubeList.add(new ModelBox(rightFin, 22, 26, -0.5F, -1.0F, -2.0F, 1, 1, 3, 0.0F, true));
			pierna = new ModelRenderer(this);
			pierna.setRotationPoint(0.0F, 22.0F, 8.0F);
			pierna.cubeList.add(new ModelBox(pierna, 0, 17, -0.5F, -1.5F, 0.0F, 1, 3, 4, 0.0F, true));
			pierna.cubeList.add(new ModelBox(pierna, 18, 15, -0.5F, -1.0F, 4.0F, 1, 2, 1, 0.0F, true));
			pierna.cubeList.add(new ModelBox(pierna, 26, 24, 0.0F, -2.0F, 5.0F, 0, 4, 1, 0.0F, true));
			pierna.cubeList.add(new ModelBox(pierna, 25, 26, 0.0F, -2.0F, 6.0F, 0, 1, 1, 0.0F, true));
			pierna.cubeList.add(new ModelBox(pierna, 25, 24, 0.0F, 1.0F, 6.0F, 0, 1, 1, 0.0F, true));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			body.render(f5);
			head.render(f5);
			leftFin.render(f5);
			rightFin.render(f5);
			pierna.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.leftFin.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.rightFin.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
			this.pierna.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
