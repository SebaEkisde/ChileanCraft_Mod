
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class EntityJiva extends ElementsChileanCraftMod.ModElement {
	public static final int ENTITYID = 58;
	public static final int ENTITYID_RANGED = 59;
	public EntityJiva(ElementsChileanCraftMod instance) {
		super(instance, 238);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("chilean_craft", "jiva"), ENTITYID)
				.name("jiva").tracker(64, 3, true).egg(-13434829, -13434880).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Biome[] spawnBiomes = {Biome.REGISTRY.getObject(new ResourceLocation("beaches")), Biome.REGISTRY.getObject(new ResourceLocation("beaches")),
				Biome.REGISTRY.getObject(new ResourceLocation("beaches")), Biome.REGISTRY.getObject(new ResourceLocation("stone_beach")),
				Biome.REGISTRY.getObject(new ResourceLocation("stone_beach")),};
		EntityRegistry.addSpawn(EntityCustom.class, 1000, 3, 4, EnumCreatureType.AMBIENT, spawnBiomes);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modeljaivaca(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("chilean_craft:textures/jaivacad.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityCreature {
		public EntityCustom(World world) {
			super(world);
			setSize(0.4f, 0.7000000000000001f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIWander(this, 1));
			this.tasks.addTask(2, new EntityAIWander(this, 1));
			this.tasks.addTask(3, new EntityAILookIdle(this));
			this.tasks.addTask(4, new EntityAILeapAtTarget(this, (float) 0.5));
			this.tasks.addTask(5, new EntityAILeapAtTarget(this, (float) 0.5));
			this.tasks.addTask(6, new EntityAIWander(this, 0.8));
			this.tasks.addTask(7, new EntityAIPanic(this, 1.2));
			this.tasks.addTask(8, new EntityAIAvoidEntity(this, EntityCabra.EntityCustom.class, (float) 6, 1, 1.2));
			this.tasks.addTask(9, new EntityAIAvoidEntity(this, EntityPlayer.class, (float) 6, 1, 1.2));
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.ARTHROPOD;
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
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(9D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}
	}

	// Made with Blockbench 3.5.2
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modeljaivaca extends ModelBase {
		private final ModelRenderer cuerpo;
		private final ModelRenderer patis;
		private final ModelRenderer pata1;
		private final ModelRenderer pata2;
		private final ModelRenderer pata3;
		private final ModelRenderer pata4;
		private final ModelRenderer payaa;
		private final ModelRenderer pataiz3;
		private final ModelRenderer pataiz2;
		private final ModelRenderer pataiz1;
		private final ModelRenderer pataiz4;
		private final ModelRenderer bone;
		private final ModelRenderer rgrgr;
		private final ModelRenderer bone10;
		private final ModelRenderer rhr;
		private final ModelRenderer trj;
		private final ModelRenderer bone4;
		private final ModelRenderer rdr;
		private final ModelRenderer rthr;
		public Modeljaivaca() {
			textureWidth = 32;
			textureHeight = 32;
			cuerpo = new ModelRenderer(this);
			cuerpo.setRotationPoint(0.0F, 24.0F, 0.0F);
			cuerpo.cubeList.add(new ModelBox(cuerpo, 3, 4, -2.499F, -2.75F, 1.25F, 5, 1, 3, 0.0F, false));
			cuerpo.cubeList.add(new ModelBox(cuerpo, 3, 4, -3.5F, -3.002F, -1.5F, 7, 2, 4, 0.0F, false));
			cuerpo.cubeList.add(new ModelBox(cuerpo, 3, 4, -3.0F, -3.0F, 1.35F, 6, 2, 2, 0.0F, false));
			cuerpo.cubeList.add(new ModelBox(cuerpo, 3, 4, -3.0F, -3.0F, -2.0F, 6, 1, 4, 0.0F, false));
			cuerpo.cubeList.add(new ModelBox(cuerpo, 3, 4, -2.5F, -2.25F, 1.25F, 5, 1, 3, 0.0F, false));
			cuerpo.cubeList.add(new ModelBox(cuerpo, 3, 4, -2.99F, -2.25F, -2.01F, 6, 1, 4, 0.0F, false));
			cuerpo.cubeList.add(new ModelBox(cuerpo, 28, 18, -1.5F, -2.75F, -2.5F, 1, 1, 1, 0.0F, false));
			cuerpo.cubeList.add(new ModelBox(cuerpo, 3, 4, -3.0F, -3.252F, -1.5F, 6, 2, 4, 0.0F, false));
			cuerpo.cubeList.add(new ModelBox(cuerpo, 28, 18, 0.5F, -2.75F, -2.5F, 1, 1, 1, 0.0F, false));
			cuerpo.cubeList.add(new ModelBox(cuerpo, 3, 4, -2.5F, -3.1F, 1.0F, 5, 2, 2, 0.0F, false));
			patis = new ModelRenderer(this);
			patis.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(patis, -0.1745F, -0.1745F, 0.6981F);
			pata1 = new ModelRenderer(this);
			pata1.setRotationPoint(1.0F, -3.5F, 0.0F);
			patis.addChild(pata1);
			pata1.cubeList.add(new ModelBox(pata1, 17, 12, -0.5F, 0.08F, 1.7076F, 3, 1, 1, 0.0F, false));
			pata2 = new ModelRenderer(this);
			pata2.setRotationPoint(1.0F, -3.5F, 0.0F);
			patis.addChild(pata2);
			pata2.cubeList.add(new ModelBox(pata2, 3, 14, 0.6217F, -0.57F, 0.3576F, 3, 1, 1, 0.0F, false));
			pata3 = new ModelRenderer(this);
			pata3.setRotationPoint(1.0F, -3.5F, 0.0F);
			patis.addChild(pata3);
			pata3.cubeList.add(new ModelBox(pata3, 3, 14, 0.6217F, -0.57F, -0.8924F, 3, 1, 1, 0.0F, false));
			pata4 = new ModelRenderer(this);
			pata4.setRotationPoint(1.0F, -3.5F, 0.0F);
			patis.addChild(pata4);
			pata4.cubeList.add(new ModelBox(pata4, 3, 14, 0.6217F, -0.57F, -2.1424F, 3, 1, 1, 0.0F, false));
			payaa = new ModelRenderer(this);
			payaa.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(payaa, -0.1745F, 0.1745F, -0.6981F);
			pataiz3 = new ModelRenderer(this);
			pataiz3.setRotationPoint(-1.0F, -3.5F, 0.0F);
			payaa.addChild(pataiz3);
			pataiz3.cubeList.add(new ModelBox(pataiz3, 11, 14, -3.3649F, -0.5725F, -0.7125F, 3, 1, 1, 0.0F, false));
			pataiz2 = new ModelRenderer(this);
			pataiz2.setRotationPoint(-1.0F, -3.5F, 0.0F);
			payaa.addChild(pataiz2);
			pataiz2.cubeList.add(new ModelBox(pataiz2, 11, 14, -3.3649F, -0.5725F, 0.5375F, 3, 1, 1, 0.0F, false));
			pataiz1 = new ModelRenderer(this);
			pataiz1.setRotationPoint(-1.0F, -3.5F, 0.0F);
			payaa.addChild(pataiz1);
			pataiz1.cubeList.add(new ModelBox(pataiz1, 24, 12, -2.5989F, 0.0702F, 1.7875F, 3, 1, 1, 0.0F, false));
			pataiz4 = new ModelRenderer(this);
			pataiz4.setRotationPoint(-1.0F, -3.5F, 0.0F);
			payaa.addChild(pataiz4);
			pataiz4.cubeList.add(new ModelBox(pataiz4, 11, 14, -3.3649F, -0.5725F, -1.9625F, 3, 1, 1, 0.0F, false));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone, 0.0F, 0.3491F, 0.0F);
			bone.cubeList.add(new ModelBox(bone, 6, 9, -3.658F, -2.7501F, -3.9397F, 1, 1, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 6, 9, -3.408F, -2.751F, -3.9397F, 1, 1, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 6, 9, -3.908F, -2.752F, -3.9497F, 1, 1, 1, 0.0F, false));
			rgrgr = new ModelRenderer(this);
			rgrgr.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(rgrgr);
			setRotationAngle(rgrgr, 0.0F, 0.3491F, 0.0F);
			rgrgr.cubeList.add(new ModelBox(rgrgr, 11, 29, -2.4175F, -2.75F, -6.766F, 1, 1, 2, 0.0F, false));
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
			rgrgr.addChild(bone10);
			rhr = new ModelRenderer(this);
			rhr.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(rhr);
			setRotationAngle(rhr, 0.0F, -0.3491F, 0.0F);
			rhr.cubeList.add(new ModelBox(rhr, 26, 29, -4.3913F, -2.75F, -4.2347F, 1, 1, 2, 0.0F, false));
			trj = new ModelRenderer(this);
			trj.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(trj);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone4, 0.0F, -0.3491F, 0.0F);
			bone4.cubeList.add(new ModelBox(bone4, 10, 4, 2.658F, -2.7501F, -3.9397F, 1, 1, 3, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 10, 4, 2.908F, -2.751F, -3.9397F, 1, 1, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 10, 4, 2.408F, -2.752F, -3.9497F, 1, 1, 1, 0.0F, false));
			rdr = new ModelRenderer(this);
			rdr.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone4.addChild(rdr);
			setRotationAngle(rdr, 0.0F, 0.3491F, 0.0F);
			rdr.cubeList.add(new ModelBox(rdr, 16, 29, 3.5175F, -2.75F, -4.23F, 1, 1, 2, 0.0F, false));
			rthr = new ModelRenderer(this);
			rthr.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone4.addChild(rthr);
			setRotationAngle(rthr, 0.0F, -0.3491F, 0.0F);
			rthr.cubeList.add(new ModelBox(rthr, 13, 29, 1.5437F, -2.75F, -6.766F, 1, 1, 2, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			cuerpo.render(f5);
			patis.render(f5);
			payaa.render(f5);
			bone.render(f5);
			bone4.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.pata1.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
			this.pata2.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.pata3.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
			this.pata4.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.pataiz1.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
			this.pataiz2.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.pataiz3.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
			this.pataiz4.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
