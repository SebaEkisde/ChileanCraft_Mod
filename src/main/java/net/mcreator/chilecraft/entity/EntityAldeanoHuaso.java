
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.procedure.ProcedureAldeanoHuasoRightClickedOnEntity;
import net.mcreator.chilecraft.procedure.ProcedureAldeanoHuasoItIsStruckByLightning;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class EntityAldeanoHuaso extends ElementsChileanCraftMod.ModElement {
	public static final int ENTITYID = 40;
	public static final int ENTITYID_RANGED = 41;
	public EntityAldeanoHuaso(ElementsChileanCraftMod instance) {
		super(instance, 227);
	}

	@Override
	public void initElements() {
		elements.entities
				.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("chilean_craft", "aldeanohuaso"), ENTITYID)
						.name("aldeanohuaso").tracker(64, 3, true).egg(-13421569, -65485).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Biome[] spawnBiomes = {Biome.REGISTRY.getObject(new ResourceLocation("plains")),
				Biome.REGISTRY.getObject(new ResourceLocation("extreme_hills")),};
		EntityRegistry.addSpawn(EntityCustom.class, 1, 1, 1, EnumCreatureType.CREATURE, spawnBiomes);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modelasdasdasdas(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("chilean_craft:textures/aldeano_huaso_rojo.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.95f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
			enablePersistence();
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIWander(this, 1));
			this.tasks.addTask(2, new EntityAILookIdle(this));
			this.tasks.addTask(3, new EntityAISwimming(this));
			this.tasks.addTask(4, new EntityAIPanic(this, 1.2));
			this.tasks.addTask(5, new EntityAIOpenDoor(this, false));
			this.tasks.addTask(6, new EntityAIOpenDoor(this, true));
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
		public void onStruckByLightning(EntityLightningBolt entityLightningBolt) {
			super.onStruckByLightning(entityLightningBolt);
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
				ProcedureAldeanoHuasoItIsStruckByLightning.executeProcedure($_dependencies);
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
				ProcedureAldeanoHuasoRightClickedOnEntity.executeProcedure($_dependencies);
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
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0D);
		}
	}

	// Made with Blockbench
	// Paste this code into your mod.
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
}
