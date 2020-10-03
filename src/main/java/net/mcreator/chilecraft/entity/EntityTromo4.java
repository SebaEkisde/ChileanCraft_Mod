
package net.mcreator.chilecraft.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.procedure.ProcedureTrompPlayerCollidesWithThisEntity;
import net.mcreator.chilecraft.procedure.ProcedureTrompOnInitialEntitySpawn;
import net.mcreator.chilecraft.procedure.ProcedureTrompOnEntityTickUpdate;
import net.mcreator.chilecraft.procedure.ProcedureTrompEntityDies;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsChileanCraftMod.ModElement.Tag
public class EntityTromo4 extends ElementsChileanCraftMod.ModElement {
	public static final int ENTITYID = 97;
	public static final int ENTITYID_RANGED = 98;
	public EntityTromo4(ElementsChileanCraftMod instance) {
		super(instance, 717);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("chilean_craft", "tromo_4"), ENTITYID).name("tromo_4").tracker(73, 3, true).build());
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
			return new RenderLiving(renderManager, new Modeltrompo(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("chilean_craft:textures/trompox4.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.2f, 0.5f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
			enablePersistence();
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.2, false));
			this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(3, new EntityAIWander(this, 0.8));
			this.tasks.addTask(4, new EntityAILookIdle(this));
			this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true, false));
			this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityPlayerMP.class, true, false));
			this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityTromp.EntityCustom.class, true, false));
			this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntityTrompo1.EntityCustom.class, true, false));
			this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntityTrompo2.EntityCustom.class, true, false));
			this.tasks.addTask(10, new EntityAIBreakDoor(this));
			this.targetTasks.addTask(11, new EntityAINearestAttackableTarget(this, EntityTrompo3.EntityCustom.class, true, false));
			this.targetTasks.addTask(12, new EntityAINearestAttackableTarget(this, EntityTromo4.EntityCustom.class, true, false));
			this.targetTasks.addTask(13, new EntityAINearestAttackableTarget(this, EntityTrompo5.EntityCustom.class, true, false));
			this.tasks.addTask(14, new EntityAIAttackMelee(this, 1.2, false));
			this.targetTasks.addTask(15, new EntityAINearestAttackableTarget(this, EntityTrompofuego.EntityCustom.class, true, false));
			this.targetTasks.addTask(16, new EntityAINearestAttackableTarget(this, EntityTromposespinas.EntityCustom.class, true, false));
			this.tasks.addTask(18, new EntityAIWander(this, 1));
			this.targetTasks.addTask(19, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(20, new EntityAILookIdle(this));
			this.tasks.addTask(21, new EntityAISwimming(this));
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
		public void onDeath(DamageSource source) {
			super.onDeath(source);
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
				ProcedureTrompEntityDies.executeProcedure($_dependencies);
			}
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
				ProcedureTrompOnInitialEntitySpawn.executeProcedure($_dependencies);
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
				ProcedureTrompOnEntityTickUpdate.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onCollideWithPlayer(EntityPlayer entity) {
			super.onCollideWithPlayer(entity);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				ProcedureTrompPlayerCollidesWithThisEntity.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}
	}

	// Made with Blockbench 3.5.2
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modeltrompo extends ModelBase {
		private final ModelRenderer bone;
		public Modeltrompo() {
			textureWidth = 16;
			textureHeight = 16;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 23.0F, 0.0F);
			bone.cubeList.add(new ModelBox(bone, 5, 0, -2.0F, -4.0F, 0.0F, 2, 3, 2, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 4, 0, -2.5F, -3.3F, -0.5F, 3, 1, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 4, 0, -2.5F, -8.3F, -0.5F, 3, 1, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -3.0F, 0.5F, 1, 4, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, -7.5F, -1.5F, 5, 1, 5, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 4, 0, -3.0F, -4.0F, -1.0F, 4, 1, 2, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 4, 0, -3.0F, -4.0F, 1.0F, 4, 1, 2, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 5, -3.0F, -8.0F, -1.0F, 4, 1, 4, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -8.5F, 0.5F, 1, 4, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 7, -4.0F, -7.0F, -2.0F, 6, 3, 6, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			bone.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.bone.rotateAngleY = f2;
		}
	}
}
