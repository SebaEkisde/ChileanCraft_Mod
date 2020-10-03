
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
import net.minecraft.util.EnumHand;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.procedure.ProcedureMatapacosAtackRightClickedOnEntity7;
import net.mcreator.chilecraft.item.ItemBona;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsChileanCraftMod.ModElement.Tag
public class EntityMatapacosAtack extends ElementsChileanCraftMod.ModElement {
	public static final int ENTITYID = 22;
	public static final int ENTITYID_RANGED = 23;
	public EntityMatapacosAtack(ElementsChileanCraftMod instance) {
		super(instance, 514);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("chilean_craft", "matapacosatack"), ENTITYID).name("matapacosatack").tracker(128, 3, true).build());
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
			return new RenderLiving(renderManager, new Modelmatapaco(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("chilean_craft:textures/atapacosttack.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 5;
			this.isImmuneToFire = false;
			setNoAI(!true);
			setCustomNameTag("WIP");
			setAlwaysRenderNameTag(true);
			enablePersistence();
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
			this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.2, true));
			this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityCabra.EntityCustom.class, true, false));
			this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityMob.class, true, false));
			this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityHusk.class, true, false));
			this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityCabra.EntityCustom.class, true, false));
			this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityEndermite.class, true, false));
			this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, true, false));
			this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntitySpider.class, true, false));
			this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntityEnderman.class, true, false));
			this.targetTasks.addTask(11, new EntityAINearestAttackableTarget(this, EntitySlime.class, true, false));
			this.tasks.addTask(12, new EntityAIWander(this, 1));
			this.tasks.addTask(13, new EntityAILookIdle(this));
			this.tasks.addTask(14, new EntityAISwimming(this));
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
			return new ItemStack(ItemBona.block, (int) (1)).getItem();
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.wolf.growl"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.wolf.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.wolf.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
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
				ProcedureMatapacosAtackRightClickedOnEntity7.executeProcedure($_dependencies);
			}
			return true;
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7D);
		}
	}

	// Made with Blockbench
	// Paste this code into your mod.
	public static class Modelmatapaco extends ModelBase {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer upperBody;
		private final ModelRenderer leg0;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer tail;
		public Modelmatapaco() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(1.0F, 13.5F, -7.0F);
			head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 16, 14, 1.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 16, 14, -3.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 0, 10, -1.5F, -0.02F, -5.0F, 3, 3, 4, 0.0F, true));
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 14.0F, 2.0F);
			setRotationAngle(body, -1.5708F, 0.0F, 0.0F);
			body.cubeList.add(new ModelBox(body, 18, 14, -2.0F, -6.0F, -3.0F, 6, 9, 6, 0.0F, true));
			upperBody = new ModelRenderer(this);
			upperBody.setRotationPoint(1.0F, 14.0F, 2.0F);
			setRotationAngle(upperBody, 1.5708F, 0.0F, 0.0F);
			upperBody.cubeList.add(new ModelBox(upperBody, 21, 0, -4.0F, -7.0F, -3.0F, 8, 6, 7, 0.0F, true));
			leg0 = new ModelRenderer(this);
			leg0.setRotationPoint(2.5F, 16.0F, 7.0F);
			leg0.cubeList.add(new ModelBox(leg0, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, true));
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(-0.5F, 16.0F, 7.0F);
			leg1.cubeList.add(new ModelBox(leg1, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, true));
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(2.5F, 16.0F, -4.0F);
			leg2.cubeList.add(new ModelBox(leg2, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, true));
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(-0.5F, 16.0F, -4.0F);
			leg3.cubeList.add(new ModelBox(leg3, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, true));
			tail = new ModelRenderer(this);
			tail.setRotationPoint(1.0F, 12.0F, 8.0F);
			tail.cubeList.add(new ModelBox(tail, 9, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, true));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			head.render(f5);
			body.render(f5);
			upperBody.render(f5);
			leg0.render(f5);
			leg1.render(f5);
			leg2.render(f5);
			leg3.render(f5);
			tail.render(f5);
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
			this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tail.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
