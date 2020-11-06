
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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumHand;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.procedure.ProcedureMototRightClickedOnEntity;
import net.mcreator.chilecraft.procedure.ProcedureMototOnEntityTickUpdate;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Random;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsChileanCraftMod.ModElement.Tag
public class EntityMotot extends ElementsChileanCraftMod.ModElement {
	public static final int ENTITYID = 107;
	public static final int ENTITYID_RANGED = 108;
	public EntityMotot(ElementsChileanCraftMod instance) {
		super(instance, 794);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("chilean_craft", "motot"), ENTITYID).name("motot").tracker(64, 3, true).egg(-1, -1).build());
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
			return new RenderLiving(renderManager, new Modelmotot(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("chilean_craft:textures/ox.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityCreature {
		public EntityCustom(World world) {
			super(world);
			setSize(0.7999999999999999f, 0.8f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
			enablePersistence();
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected boolean canDespawn() {
			return false;
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
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof EntityPotion)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			if (source == DamageSource.DROWN)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public boolean processInteract(EntityPlayer entity, EnumHand hand) {
			super.processInteract(entity, hand);
			entity.startRiding(this);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			ItemStack itemstack = entity.getHeldItem(hand);
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				ProcedureMototRightClickedOnEntity.executeProcedure($_dependencies);
			}
			return true;
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
				ProcedureMototOnEntityTickUpdate.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(1D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0D);
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

		@Override
		public void travel(float ti, float tj, float tk) {
			Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
			if (this.isBeingRidden()) {
				this.rotationYaw = entity.rotationYaw;
				this.prevRotationYaw = this.rotationYaw;
				this.rotationPitch = entity.rotationPitch * 0.5F;
				this.setRotation(this.rotationYaw, this.rotationPitch);
				this.jumpMovementFactor = this.getAIMoveSpeed() * 0.15F;
				this.renderYawOffset = entity.rotationYaw;
				this.rotationYawHead = entity.rotationYaw;
				this.stepHeight = 1.0F;
				if (entity instanceof EntityLivingBase) {
					this.setAIMoveSpeed((float) this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue());
					float forward = ((EntityLivingBase) entity).moveForward;
					float strafe = 0;
					super.travel(strafe, 0, forward);
				}
				this.prevLimbSwingAmount = this.limbSwingAmount;
				double d1 = this.posX - this.prevPosX;
				double d0 = this.posZ - this.prevPosZ;
				float f1 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;
				if (f1 > 1.0F)
					f1 = 1.0F;
				this.limbSwingAmount += (f1 - this.limbSwingAmount) * 0.4F;
				this.limbSwing += this.limbSwingAmount;
				return;
			}
			this.stepHeight = 0.5F;
			this.jumpMovementFactor = 0.02F;
			super.travel(ti, tj, tk);
		}

		public void onLivingUpdate() {
			super.onLivingUpdate();
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			Random random = this.rand;
			if (true)
				for (int l = 0; l < 1; ++l) {
					double d0 = (i + random.nextFloat());
					double d1 = (j + random.nextFloat());
					double d2 = (k + random.nextFloat());
					int i1 = random.nextInt(2) * 2 - 1;
					double d3 = (random.nextFloat() - 0.5D) * 0.4000000014901161D;
					double d4 = (random.nextFloat() - 0.5D) * 0.4000000014901161D;
					double d5 = (random.nextFloat() - 0.5D) * 0.4000000014901161D;
					world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, d3, d4, d5);
				}
		}
	}

	// Made with Blockbench 3.5.2
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelmotot extends ModelBase {
		private final ModelRenderer bone38;
		private final ModelRenderer bone;
		private final ModelRenderer bone17;
		private final ModelRenderer bone35;
		private final ModelRenderer bone36;
		private final ModelRenderer bone34;
		private final ModelRenderer bone33;
		private final ModelRenderer bone9;
		private final ModelRenderer bone13;
		private final ModelRenderer bone2;
		private final ModelRenderer bone14;
		private final ModelRenderer bone15;
		private final ModelRenderer bone16;
		private final ModelRenderer bone3;
		private final ModelRenderer bone12;
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone7;
		private final ModelRenderer bone8;
		private final ModelRenderer bone10;
		private final ModelRenderer bone11;
		private final ModelRenderer bone19;
		private final ModelRenderer bone21;
		private final ModelRenderer bone18;
		private final ModelRenderer bone20;
		private final ModelRenderer bone22;
		private final ModelRenderer bone23;
		private final ModelRenderer bone24;
		private final ModelRenderer bone25;
		private final ModelRenderer bone26;
		private final ModelRenderer bone27;
		private final ModelRenderer bone28;
		private final ModelRenderer bone30;
		private final ModelRenderer bone31;
		private final ModelRenderer bone29;
		private final ModelRenderer bone32;
		private final ModelRenderer bone37;
		public Modelmotot() {
			textureWidth = 128;
			textureHeight = 128;
			bone38 = new ModelRenderer(this);
			bone38.setRotationPoint(0.0F, 24.0F, -3.0F);
			bone38.cubeList.add(new ModelBox(bone38, 2, 56, -4.99F, -5.0F, -0.001F, 10, 2, 3, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 0, 57, -4.0F, -5.001F, -6.0F, 8, 2, 6, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 0, 43, -4.499F, -12.6F, 1.0F, 9, 1, 1, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 11, 51, -2.99F, -6.0F, 6.999F, 1, 3, 5, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 35, 43, -3.01F, -12.1F, 3.925F, 7, 3, 4, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 0, 45, -3.99F, -5.8F, 4.8F, 8, 1, 3, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 0, 52, -3.995F, -9.7F, 6.0F, 8, 4, 3, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 35, 43, -3.99F, -12.1F, 3.925F, 1, 3, 4, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 2, 56, -4.99F, -5.0F, 2.999F, 10, 2, 5, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 0, 45, -3.2F, -15.201F, 13.3F, 6, 1, 3, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 41, 50, -3.998F, -14.601F, 16.9F, 8, 1, 1, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 3, 50, 2.2F, -15.202F, 13.3F, 1, 1, 3, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 40, 39, -3.999F, -14.6F, 14.2F, 8, 1, 3, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 35, 43, -4.0F, -14.1F, 13.925F, 8, 2, 4, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 0, 54, -4.5F, -13.6F, 1.0F, 9, 1, 8, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 0, 55, -4.5F, -12.6F, 1.5F, 9, 1, 8, 0.0F, false));
			bone38.cubeList.add(new ModelBox(bone38, 45, 22, -2.499F, -9.43F, -12.85F, 5, 2, 4, 0.0F, false));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone, -0.4363F, 0.0F, 0.0F);
			bone.cubeList.add(new ModelBox(bone, 0, 55, -4.0F, -9.9F, 2.0F, 8, 3, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 47, -3.0F, -13.8063F, 3.5774F, 7, 4, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 32, 47, -3.0F, -13.8063F, -0.4226F, 7, 4, 4, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 4, 47, -3.97F, -13.9F, 4.0F, 1, 5, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 30, 42, -3.97F, -13.9F, -2.0F, 1, 5, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 17, 18, 1.5F, -9.6F, 3.5F, 1, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 38, 37, 1.0F, -10.1163F, 3.8289F, 2, 2, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 14, 23, -3.501F, -5.6F, 1.6F, 1, 1, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 11, 47, -1.5F, -9.6F, 8.5F, 3, 1, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 10, 27, -2.5F, -9.6F, 3.5F, 1, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 39, 40, -2.0F, -10.9F, -18.2F, 4, 4, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 39, 40, 1.99F, -11.1F, -18.2F, 2, 4, 4, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 39, 40, -3.99F, -11.1F, -18.2F, 2, 4, 4, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 11, 17, -2.0F, -6.8648F, -18.2611F, 4, 2, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 11, 35, -4.0F, -7.8648F, -18.2611F, 2, 3, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 11, 35, -4.0F, -8.2874F, -17.3548F, 2, 3, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 1, 44, -4.01F, -9.13F, -16.4485F, 4, 6, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 10, 34, 2.0F, -7.8648F, -18.2611F, 2, 3, 2, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 9, 35, 3.001F, -8.71F, -16.4485F, 1, 4, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 9, 46, 0.0F, -9.1326F, -15.5421F, 4, 6, 2, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 47, -4.0F, -5.1F, -18.2F, 8, 1, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 20, 24, 1.5F, -2.8F, -15.7F, 1, 6, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 23, 24, -2.5F, -2.8F, -15.7F, 1, 6, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 18, 57, -1.5F, 2.2F, -15.7F, 3, 1, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 38, 37, -3.0F, -3.0937F, -16.25F, 2, 4, 2, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 38, 37, 1.0F, -3.0F, -16.25F, 2, 4, 2, 0.0F, false));
			bone17 = new ModelRenderer(this);
			bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone17);
			setRotationAngle(bone17, 0.1745F, 0.0F, 0.0F);
			bone17.cubeList.add(new ModelBox(bone17, 38, 37, -2.999F, -14.0F, -15.1246F, 6, 4, 3, 0.0F, false));
			bone17.cubeList.add(new ModelBox(bone17, 2, 51, -2.999F, -9.8434F, -15.3141F, 6, 3, 3, 0.0F, false));
			bone17.cubeList.add(new ModelBox(bone17, 38, 37, -1.0F, -15.3103F, -15.0341F, 2, 7, 2, 0.0F, false));
			bone17.cubeList.add(new ModelBox(bone17, 38, 37, -3.0F, -18.7588F, -16.5F, 1, 4, 4, 0.0F, false));
			bone17.cubeList.add(new ModelBox(bone17, 38, 37, -7.9F, -23.1409F, -14.85F, 2, 2, 1, 0.0F, false));
			bone17.cubeList.add(new ModelBox(bone17, 38, 37, 5.8F, -22.9659F, -14.85F, 2, 2, 1, 0.0F, false));
			bone17.cubeList.add(new ModelBox(bone17, 38, 37, 2.0F, -18.7588F, -16.5F, 1, 4, 4, 0.0F, false));
			bone17.cubeList.add(new ModelBox(bone17, 38, 37, -2.0F, -16.7588F, -16.5F, 4, 2, 4, 0.0F, false));
			bone17.cubeList.add(new ModelBox(bone17, 0, 50, -2.0F, -19.1F, -16.8F, 4, 3, 4, 0.0F, false));
			bone35 = new ModelRenderer(this);
			bone35.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone17.addChild(bone35);
			setRotationAngle(bone35, 0.0F, 0.0F, 0.8727F);
			bone35.cubeList.add(new ModelBox(bone35, 38, 37, -20.7423F, -9.7037F, -14.7941F, 6, 1, 1, 0.0F, false));
			bone36 = new ModelRenderer(this);
			bone36.setRotationPoint(1.0F, 0.0F, 0.0F);
			bone17.addChild(bone36);
			setRotationAngle(bone36, 0.0F, 0.0F, -0.8727F);
			bone36.cubeList.add(new ModelBox(bone36, 38, 37, 13.9005F, -10.4698F, -14.7941F, 6, 1, 1, 0.0F, false));
			bone34 = new ModelRenderer(this);
			bone34.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone17.addChild(bone34);
			setRotationAngle(bone34, 0.0F, 0.4363F, 0.0F);
			bone34.cubeList.add(new ModelBox(bone34, 38, 37, 2.1063F, -18.2412F, -15.7774F, 3, 3, 3, 0.0F, false));
			bone33 = new ModelRenderer(this);
			bone33.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone17.addChild(bone33);
			setRotationAngle(bone33, 0.0F, -0.4363F, 0.0F);
			bone33.cubeList.add(new ModelBox(bone33, 38, 37, -4.2F, -18.24F, -16.1F, 2, 3, 3, 0.0F, false));
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone9);
			setRotationAngle(bone9, 0.1745F, 0.0F, 0.0F);
			bone9.cubeList.add(new ModelBox(bone9, 0, 49, -3.998F, -10.0351F, -2.567F, 8, 6, 5, 0.0F, false));
			bone9.cubeList.add(new ModelBox(bone9, 0, 56, -4.0F, -6.0351F, -1.5696F, 8, 3, 1, 0.0F, false));
			bone13 = new ModelRenderer(this);
			bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone9.addChild(bone13);
			setRotationAngle(bone13, 0.6109F, 0.0F, 0.0F);
			bone13.cubeList.add(new ModelBox(bone13, 0, 53, -3.999F, -11.35F, 2.5599F, 8, 6, 3, 0.0F, false));
			bone13.cubeList.add(new ModelBox(bone13, 0, 50, -4.001F, -11.35F, 2.558F, 8, 6, 3, 0.0F, false));
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone2);
			setRotationAngle(bone2, -0.6109F, 0.0F, 0.0F);
			bone2.cubeList.add(new ModelBox(bone2, 38, 37, -3.01F, -19.0F, -5.0603F, 7, 17, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 7, 37, -3.01F, -19.0F, -4.0603F, 7, 17, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 38, 37, -3.99F, -19.0F, -5.0603F, 1, 17, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 3, 45, -3.99F, -19.0F, -4.0603F, 1, 6, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 38, 37, -3.99F, -19.0F, -5.0603F, 1, 17, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 38, 37, -1.98F, -16.8F, -3.2F, 4, 11, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 2, 51, -3.15F, -19.1F, -6.46F, 6, 3, 2, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 5, 48, 2.201F, -19.101F, -6.46F, 1, 3, 2, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 38, 37, -3.98F, -17.0F, -7.0603F, 8, 5, 3, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 41, 39, -1.98F, -17.7321F, -3.3282F, 4, 1, 4, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 10, 24, -0.98F, -18.0F, -2.7F, 2, 1, 2, 0.0F, false));
			bone14 = new ModelRenderer(this);
			bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone2.addChild(bone14);
			setRotationAngle(bone14, -0.1745F, 0.0F, 0.0F);
			bone14.cubeList.add(new ModelBox(bone14, 9, 46, -3.2F, -14.9F, -10.75F, 6, 3, 2, 0.0F, false));
			bone14.cubeList.add(new ModelBox(bone14, 0, 49, 2.2F, -14.9F, -10.751F, 1, 3, 2, 0.0F, false));
			bone15 = new ModelRenderer(this);
			bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone14.addChild(bone15);
			setRotationAngle(bone15, 0.0F, 0.0F, 0.2618F);
			bone15.cubeList.add(new ModelBox(bone15, 0, 49, -6.95F, -13.5F, -10.725F, 5, 5, 2, 0.0F, false));
			bone16 = new ModelRenderer(this);
			bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone14.addChild(bone16);
			setRotationAngle(bone16, 0.0F, 0.0F, -0.2618F);
			bone16.cubeList.add(new ModelBox(bone16, 6, 43, 1.951F, -13.502F, -10.72F, 5, 5, 2, 0.0F, false));
			bone16.cubeList.add(new ModelBox(bone16, 38, 37, 1.95F, -11.8F, -10.71F, 5, 3, 2, 0.0F, false));
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone3, 0.6109F, 0.0F, 0.0F);
			bone3.cubeList.add(new ModelBox(bone3, 5, 40, -3.99F, -17.7F, -5.6F, 2, 10, 2, 0.0F, false));
			bone3.cubeList.add(new ModelBox(bone3, 7, 39, 1.99F, -17.7F, -5.6F, 2, 10, 2, 0.0F, false));
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(bone12);
			setRotationAngle(bone12, -0.2618F, 0.0F, 0.0F);
			bone12.cubeList.add(new ModelBox(bone12, 6, 40, -2.99F, -14.1626F, -7.2237F, 6, 8, 2, 0.0F, false));
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone4, 0.0F, 0.1745F, 0.0F);
			bone4.cubeList.add(new ModelBox(bone4, 0, 47, 3.4F, -5.01F, -7.7551F, 2, 2, 6, 0.0F, false));
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone5, 0.0F, -0.1745F, 0.0F);
			bone5.cubeList.add(new ModelBox(bone5, 0, 47, -5.4F, -5.01F, -7.7F, 2, 2, 6, 0.0F, false));
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone6, 0.3491F, 0.0F, 0.0F);
			bone6.cubeList.add(new ModelBox(bone6, 0, 56, -5.0F, -3.85F, 1.0F, 10, 1, 6, 0.0F, false));
			bone6.cubeList.add(new ModelBox(bone6, 0, 0, -4.0F, -1.5F, 8.5175F, 2, 2, 9, 0.0F, false));
			bone6.cubeList.add(new ModelBox(bone6, 0, 0, -3.5F, -1.0F, 6.5175F, 1, 1, 4, 0.0F, false));
			bone6.cubeList.add(new ModelBox(bone6, 0, 0, -3.999F, -3.85F, 7.0F, 8, 1, 3, 0.0F, false));
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(6.3868F, -3.2652F, 7.1044F);
			bone6.addChild(bone7);
			setRotationAngle(bone7, 0.0F, -0.3491F, 0.0F);
			bone7.cubeList.add(new ModelBox(bone7, 4, 40, -3.3568F, -0.5648F, 0.2956F, 2, 1, 3, 0.0F, false));
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(6.3868F, -3.2652F, 7.1044F);
			bone6.addChild(bone8);
			setRotationAngle(bone8, 0.0F, 0.3491F, 0.0F);
			bone8.cubeList.add(new ModelBox(bone8, 0, 41, -10.6568F, -0.5648F, -4.0044F, 2, 1, 3, 0.0F, false));
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(0.0F, 20.0F, -15.0F);
			bone10.cubeList.add(new ModelBox(bone10, 4, 49, -2.0F, -1.55F, 2.95F, 4, 3, 1, 0.0F, false));
			bone10.cubeList.add(new ModelBox(bone10, 4, 49, -1.0F, -1.55F, 1.95F, 2, 3, 1, 0.0F, false));
			bone10.cubeList.add(new ModelBox(bone10, 4, 49, -2.0F, -1.5F, -4.0F, 4, 3, 1, 0.0F, false));
			bone10.cubeList.add(new ModelBox(bone10, 4, 49, -1.0F, -1.5F, -3.0F, 2, 3, 1, 0.0F, false));
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(0.0F, 4.0F, 15.0F);
			bone10.addChild(bone11);
			bone11.cubeList.add(new ModelBox(bone11, 4, 49, -2.0F, -1.0F, -16.5F, 4, 1, 3, 0.0F, false));
			bone11.cubeList.add(new ModelBox(bone11, 4, 49, -1.0F, -2.0F, -16.5F, 2, 1, 3, 0.0F, false));
			bone11.cubeList.add(new ModelBox(bone11, 4, 49, -1.0F, -4.0F, -15.5F, 2, 2, 1, 0.0F, false));
			bone11.cubeList.add(new ModelBox(bone11, 4, 49, -2.0F, -8.0F, -16.5F, 4, 1, 3, 0.0F, false));
			bone11.cubeList.add(new ModelBox(bone11, 4, 49, -1.0F, -7.9F, -16.5F, 2, 2, 3, 0.0F, false));
			bone19 = new ModelRenderer(this);
			bone19.setRotationPoint(0.0F, 4.0F, 15.0F);
			bone10.addChild(bone19);
			setRotationAngle(bone19, 0.7854F, 0.0F, 0.0F);
			bone19.cubeList.add(new ModelBox(bone19, 4, 49, -1.999F, -14.7424F, -4.9F, 4, 3, 1, 0.0F, false));
			bone19.cubeList.add(new ModelBox(bone19, 4, 49, -0.999F, -15.4495F, -5.6071F, 2, 4, 1, 0.0F, false));
			bone19.cubeList.add(new ModelBox(bone19, 4, 49, -1.999F, -14.6787F, -11.6787F, 4, 3, 1, 0.0F, false));
			bone19.cubeList.add(new ModelBox(bone19, 4, 49, -0.999F, -15.3858F, -10.9716F, 2, 3, 1, 0.0F, false));
			bone19.cubeList.add(new ModelBox(bone19, 4, 49, -1.999F, -15.1287F, -11.6787F, 4, 1, 1, 0.0F, false));
			bone19.cubeList.add(new ModelBox(bone19, 4, 49, -1.998F, -15.1287F, -4.9007F, 4, 1, 1, 0.0F, false));
			bone21 = new ModelRenderer(this);
			bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone19.addChild(bone21);
			setRotationAngle(bone21, -0.0873F, 0.0F, 0.0F);
			bone21.cubeList.add(new ModelBox(bone21, 4, 49, -0.997F, -13.0F, -8.957F, 2, 1, 3, 0.0F, false));
			bone18 = new ModelRenderer(this);
			bone18.setRotationPoint(0.0F, 4.0F, 15.0F);
			bone10.addChild(bone18);
			setRotationAngle(bone18, -0.7854F, 0.0F, 0.0F);
			bone18.cubeList.add(new ModelBox(bone18, 4, 49, -1.999F, 6.5F, -17.3F, 4, 3, 1, 0.0F, false));
			bone18.cubeList.add(new ModelBox(bone18, 4, 49, -0.999F, 6.2071F, -16.5929F, 2, 4, 1, 0.0F, false));
			bone18.cubeList.add(new ModelBox(bone18, 4, 49, -1.999F, 6.0787F, -17.3037F, 4, 1, 1, 0.0F, false));
			bone18.cubeList.add(new ModelBox(bone18, 4, 49, -1.999F, 6.5F, -10.6F, 4, 3, 1, 0.0F, false));
			bone18.cubeList.add(new ModelBox(bone18, 4, 49, -0.999F, 5.7929F, -11.3071F, 2, 3, 1, 0.0F, false));
			bone18.cubeList.add(new ModelBox(bone18, 4, 49, -1.998F, 6.0F, -10.6F, 4, 1, 1, 0.0F, false));
			bone20 = new ModelRenderer(this);
			bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone18.addChild(bone20);
			setRotationAngle(bone20, 0.0873F, 0.0F, 0.0F);
			bone20.cubeList.add(new ModelBox(bone20, 4, 49, -0.998F, 6.3F, -16.5286F, 2, 1, 3, 0.0F, false));
			bone22 = new ModelRenderer(this);
			bone22.setRotationPoint(0.0F, 20.0F, 12.0F);
			bone22.cubeList.add(new ModelBox(bone22, 10, 44, -2.0F, -1.55F, 2.95F, 4, 3, 1, 0.0F, false));
			bone22.cubeList.add(new ModelBox(bone22, 10, 44, -1.0F, -1.55F, 1.95F, 2, 3, 1, 0.0F, false));
			bone22.cubeList.add(new ModelBox(bone22, 10, 44, -2.0F, -1.5F, -4.0F, 4, 3, 1, 0.0F, false));
			bone22.cubeList.add(new ModelBox(bone22, 10, 44, -1.0F, -1.5F, -3.0F, 2, 3, 1, 0.0F, false));
			bone23 = new ModelRenderer(this);
			bone23.setRotationPoint(0.0F, 4.0F, -12.0F);
			bone22.addChild(bone23);
			bone23.cubeList.add(new ModelBox(bone23, 10, 44, -2.0F, -1.0F, 10.5F, 4, 1, 3, 0.0F, false));
			bone23.cubeList.add(new ModelBox(bone23, 10, 44, -1.0F, -2.0F, 10.5F, 2, 1, 3, 0.0F, false));
			bone23.cubeList.add(new ModelBox(bone23, 10, 44, -1.0F, -4.0F, 11.5F, 2, 2, 1, 0.0F, false));
			bone23.cubeList.add(new ModelBox(bone23, 10, 44, -2.0F, -8.0F, 10.5F, 4, 1, 3, 0.0F, false));
			bone23.cubeList.add(new ModelBox(bone23, 10, 44, -1.0F, -7.9F, 10.5F, 2, 2, 3, 0.0F, false));
			bone24 = new ModelRenderer(this);
			bone24.setRotationPoint(0.0F, 4.0F, -12.0F);
			bone22.addChild(bone24);
			setRotationAngle(bone24, 0.7854F, 0.0F, 0.0F);
			bone24.cubeList.add(new ModelBox(bone24, 10, 44, -1.999F, 4.3495F, 14.1919F, 4, 3, 1, 0.0F, false));
			bone24.cubeList.add(new ModelBox(bone24, 10, 44, -0.999F, 3.6424F, 13.4848F, 2, 4, 1, 0.0F, false));
			bone24.cubeList.add(new ModelBox(bone24, 10, 44, -1.999F, 4.4132F, 7.4132F, 4, 3, 1, 0.0F, false));
			bone24.cubeList.add(new ModelBox(bone24, 10, 44, -0.999F, 3.7061F, 8.1203F, 2, 3, 1, 0.0F, false));
			bone24.cubeList.add(new ModelBox(bone24, 10, 44, -1.999F, 3.9632F, 7.4132F, 4, 1, 1, 0.0F, false));
			bone24.cubeList.add(new ModelBox(bone24, 10, 44, -1.998F, 3.9632F, 14.1912F, 4, 1, 1, 0.0F, false));
			bone25 = new ModelRenderer(this);
			bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone24.addChild(bone25);
			setRotationAngle(bone25, -0.0873F, 0.0F, 0.0F);
			bone25.cubeList.add(new ModelBox(bone25, 10, 44, -0.995F, 4.3553F, 11.7262F, 2, 1, 3, 0.0F, false));
			bone26 = new ModelRenderer(this);
			bone26.setRotationPoint(0.0F, 4.0F, -12.0F);
			bone22.addChild(bone26);
			setRotationAngle(bone26, -0.7854F, 0.0F, 0.0F);
			bone26.cubeList.add(new ModelBox(bone26, 10, 44, -1.999F, -12.5919F, 1.7919F, 4, 3, 1, 0.0F, false));
			bone26.cubeList.add(new ModelBox(bone26, 10, 44, -0.999F, -12.8848F, 2.499F, 2, 4, 1, 0.0F, false));
			bone26.cubeList.add(new ModelBox(bone26, 10, 44, -1.999F, -13.0132F, 1.7882F, 4, 1, 1, 0.0F, false));
			bone26.cubeList.add(new ModelBox(bone26, 10, 44, -1.999F, -12.5919F, 8.4919F, 4, 3, 1, 0.0F, false));
			bone26.cubeList.add(new ModelBox(bone26, 10, 44, -0.999F, -13.299F, 7.7848F, 2, 3, 1, 0.0F, false));
			bone26.cubeList.add(new ModelBox(bone26, 10, 44, -1.998F, -13.0919F, 8.4919F, 4, 1, 1, 0.0F, false));
			bone27 = new ModelRenderer(this);
			bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone26.addChild(bone27);
			setRotationAngle(bone27, 0.0873F, 0.0F, 0.0F);
			bone27.cubeList.add(new ModelBox(bone27, 10, 44, -0.998F, -11.0553F, 4.1546F, 2, 1, 3, 0.0F, false));
			bone28 = new ModelRenderer(this);
			bone28.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone28, 0.3491F, 0.0F, 0.0F);
			bone28.cubeList.add(new ModelBox(bone28, 38, 23, -0.9F, -14.15F, -13.2685F, 2, 1, 2, 0.0F, false));
			bone30 = new ModelRenderer(this);
			bone30.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone28.addChild(bone30);
			setRotationAngle(bone30, 0.0F, -0.3491F, 0.0873F);
			bone30.cubeList.add(new ModelBox(bone30, 38, 23, -7.4F, -14.0128F, -12.8121F, 2, 1, 3, 0.0F, false));
			bone31 = new ModelRenderer(this);
			bone31.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone28.addChild(bone31);
			setRotationAngle(bone31, 0.0F, 0.3491F, -0.0873F);
			bone31.cubeList.add(new ModelBox(bone31, 38, 23, 5.45F, -14.0F, -12.75F, 2, 1, 3, 0.0F, false));
			bone29 = new ModelRenderer(this);
			bone29.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone29, 0.3491F, 0.0F, 0.0F);
			bone29.cubeList.add(new ModelBox(bone29, 46, 28, -1.35F, -14.2F, -14.55F, 2, 1, 2, 0.0F, false));
			bone32 = new ModelRenderer(this);
			bone32.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone32, 0.3491F, 0.0F, 0.0F);
			bone32.cubeList.add(new ModelBox(bone32, 54, 35, 0.4F, -14.201F, -14.5501F, 1, 1, 2, 0.0F, false));
			bone37 = new ModelRenderer(this);
			bone37.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone32.addChild(bone37);
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			bone38.render(f5);
			bone.render(f5);
			bone3.render(f5);
			bone4.render(f5);
			bone5.render(f5);
			bone6.render(f5);
			bone10.render(f5);
			bone22.render(f5);
			bone28.render(f5);
			bone29.render(f5);
			bone32.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.bone22.rotateAngleX = f2;
			this.bone10.rotateAngleX = f2;
		}
	}
}
