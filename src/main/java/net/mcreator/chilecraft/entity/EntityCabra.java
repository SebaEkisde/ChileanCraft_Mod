
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
import net.minecraft.util.EnumHand;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.procedure.ProcedureCabraRightClickedOnEntity;
import net.mcreator.chilecraft.procedure.ProcedureCabraEntityDies;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class EntityCabra extends ElementsChileanCraftMod.ModElement {
	public static final int ENTITYID = 1;
	public static final int ENTITYID_RANGED = 2;
	public EntityCabra(ElementsChileanCraftMod instance) {
		super(instance, 228);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("chilean_craft", "cabra"), ENTITYID).name("cabra").tracker(64, 3, true).egg(-10066330, -16777216).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Biome[] spawnBiomes = {Biome.REGISTRY.getObject(new ResourceLocation("extreme_hills")),
				Biome.REGISTRY.getObject(new ResourceLocation("ice_flats")), Biome.REGISTRY.getObject(new ResourceLocation("ice_mountains")),
				Biome.REGISTRY.getObject(new ResourceLocation("desert")),};
		EntityRegistry.addSpawn(EntityCustom.class, 7, 2, 5, EnumCreatureType.CREATURE, spawnBiomes);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modelcabra(), 0.3f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("chilean_craft:textures/aaaa.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityAnimal {
		public EntityCustom(World world) {
			super(world);
			setSize(0.4f, 0.8f);
			experienceValue = 5;
			this.isImmuneToFire = false;
			setNoAI(!true);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIWander(this, 1));
			this.tasks.addTask(2, new EntityAILookIdle(this));
			this.tasks.addTask(4, new EntityAISwimming(this));
			this.tasks.addTask(5, new EntityAILeapAtTarget(this, (float) 0.8));
			this.tasks.addTask(6, new EntityAIPanic(this, 1.2));
			this.tasks.addTask(7, new EntityAIEatGrass(this));
			this.tasks.addTask(8, new EntityAITempt(this, 1, new ItemStack(Blocks.WHEAT, (int) (1)).getItem(), false));
			this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
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
			if (source == DamageSource.FALL)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public void onDeath(DamageSource source) {
			super.onDeath(source);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureCabraEntityDies.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean processInteract(EntityPlayer entity, EnumHand hand) {
			super.processInteract(entity, hand);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			ItemStack itemstack = entity.getHeldItem(hand);
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureCabraRightClickedOnEntity.executeProcedure($_dependencies);
			}
			return true;
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}

		@Override
		public EntityCustom createChild(EntityAgeable ageable) {
			return new EntityCustom(world);
		}

		@Override
		public float getEyeHeight() {
			return this.isChild() ? this.height : 1.3F;
		}

		@Override
		public boolean isBreedingItem(ItemStack stack) {
			if (stack == null)
				return false;
			if (new ItemStack(Blocks.WHEAT, (int) (1)).getItem() == stack.getItem())
				return true;
			if (new ItemStack(Items.WHEAT, (int) (1)).getItem() == stack.getItem())
				return true;
			return false;
		}
	}

	// Made with Blockbench
	// Paste this code into your mod.
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
			patadere2.cubeList.add(new ModelBox(patadere2, 24, 23, -0.6F, -1.0F, -1.0F, 2, 7, 2, 0.0F, false));
			pataizq1 = new ModelRenderer(this);
			pataizq1.setRotationPoint(0.0F, 18.0F, -1.0F);
			pataizq1.cubeList.add(new ModelBox(pataizq1, 24, 23, 0.6F, -1.0F, -1.1F, 2, 7, 2, 0.0F, false));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.cubeList.add(new ModelBox(bone, 2, 9, -2.5F, -10.0F, -3.0F, 5, 5, 10, 0.0F, false));
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
			bone4.cubeList.add(new ModelBox(bone4, 19, 23, -1.495F, -13.0F, 2.3F, 3, 2, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 23, 22, -1.495F, -13.0F, 1.3F, 3, 2, 1, 0.0F, false));
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone5, -0.4363F, 0.0F, 0.0F);
			bone4.addChild(bone5);
			bone5.cubeList.add(new ModelBox(bone5, 0, 28, -0.5F, -12.0F, -3.0F, 1, 3, 1, 0.0F, false));
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone6, -0.6109F, 0.0F, 0.0F);
			bone5.addChild(bone6);
			bone6.cubeList.add(new ModelBox(bone6, 1, 28, 0.51F, -14.0F, -9.0F, 1, 3, 1, 0.0F, false));
			bone6.cubeList.add(new ModelBox(bone6, 0, 27, -1.51F, -14.0F, -9.0F, 1, 3, 1, 0.0F, false));
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone7, 0.1745F, 0.0F, -0.1745F);
			bone6.addChild(bone7);
			bone7.cubeList.add(new ModelBox(bone7, 78, 25, -0.8368F, -12.9707F, -6.1761F, 2, 1, 1, 0.0F, false));
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone2.addChild(bone9);
			bone9.cubeList.add(new ModelBox(bone9, 7, 23, -1.5F, -14.0F, 1.0F, 2, 6, 3, 0.0F, false));
			bone9.cubeList.add(new ModelBox(bone9, 8, 23, -0.45F, -14.0F, 1.0F, 2, 6, 3, 0.0F, false));
			e = new ModelRenderer(this);
			e.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(e, -0.0873F, 0.0F, 0.1745F);
			e.cubeList.add(new ModelBox(e, 64, 9, -1.6736F, -13.4811F, -5.0858F, 2, 1, 1, 0.0F, false));
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone10, 0.0F, 0.0F, -0.1745F);
			e.addChild(bone10);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone10.addChild(bone11);
			bone11.cubeList.add(new ModelBox(bone11, 0, 0, -1.5007F, -6.9963F, 2.9142F, 3, 2, 3, 0.0F, false));
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
			pata2izq.cubeList.add(new ModelBox(pata2izq, 24, 23, -2.4F, -1.0F, -1.0F, 2, 7, 2, 0.0F, false));
			coola = new ModelRenderer(this);
			coola.setRotationPoint(0.0F, 14.5F, 7.0F);
			setRotationAngle(coola, 0.5236F, 0.0F, 0.0F);
			coola.cubeList.add(new ModelBox(coola, 0, 27, -1.0F, -0.2321F, -0.5F, 2, 4, 1, 0.0F, false));
			patadere1 = new ModelRenderer(this);
			patadere1.setRotationPoint(-2.0F, 18.0F, -1.25F);
			patadere1.cubeList.add(new ModelBox(patadere1, 24, 23, -0.6F, -1.0F, -0.85F, 2, 7, 2, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			patadere2.render(f5);
			pataizq1.render(f5);
			bone.render(f5);
			bone2.render(f5);
			e.render(f5);
			pata2izq.render(f5);
			coola.render(f5);
			patadere1.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.patadere2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.pata2izq.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.patadere1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.pataizq1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
