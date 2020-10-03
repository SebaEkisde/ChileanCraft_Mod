
package net.mcreator.chilecraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.procedure.ProcedureBuceoHelmetTickEvent;
import net.mcreator.chilecraft.procedure.ProcedureBuceoBodyTickEvent;
import net.mcreator.chilecraft.creativetab.TabChilecraft;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ItemBuceo extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:buceohelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:buceobody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:buceolegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:buceoboots")
	public static final Item boots = null;
	public ItemBuceo(ElementsChileanCraftMod instance) {
		super(instance, 155);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BUCEO", "chilean_craft:diamond__", 95, new int[]{2, 5, 0, 0}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new Modelbuceoo().head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/buzo.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureBuceoHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("buceohelmet").setRegistryName("buceohelmet").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new Modelox().body;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/ox.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureBuceoBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("buceobody").setRegistryName("buceobody").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:buceohelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("chilean_craft:buceobody", "inventory"));
	}
	// Made with Blockbench
	// Paste this code into your mod.
	public static class Modelbuceoo extends ModelBase {
		private final ModelRenderer head;
		private final ModelRenderer bone3;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		public Modelbuceoo() {
			textureWidth = 32;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.cubeList.add(new ModelBox(head, 11, 19, -4.0F, -6.85F, -5.0F, 8, 1, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 11, 19, -5.0F, -11.5F, -2.75F, 1, 11, 1, 0.0F, true));
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
			head.addChild(bone3);
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -4.5F, -25.5F, -5.001F, 5, 1, 1, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -0.99F, -26.251F, -5.5F, 2, 2, 1, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -4.001F, -29.85F, -5.0F, 1, 4, 1, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -5.01F, -25.5F, -5.01F, 1, 1, 3, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -3.799F, -29.501F, 3.2F, 8, 2, 1, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -1.0F, -26.25F, -5.0F, 2, 2, 1, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -5.201F, -29.5F, -2.6F, 1, 2, 1, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -4.2F, -29.502F, -4.2F, 1, 2, 8, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, 3.01F, -29.85F, -5.0F, 1, 4, 1, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 0, 16, -3.0F, -29.85F, -4.5F, 6, 3, 1, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, 3.2F, -29.5F, -4.2F, 1, 2, 8, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -4.201F, -29.5F, 3.201F, 1, 2, 1, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 11, 19, -5.202F, -29.501F, -2.901F, 1, 2, 1, 0.0F, true));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 2.0F, 0.0F);
			setRotationAngle(bone, 0.0F, 0.0F, -0.2618F);
			head.addChild(bone);
			bone.cubeList.add(new ModelBox(bone, 11, 19, 0.5F, -5.501F, -5.002F, 1, 1, 1, 0.0F, true));
			bone.cubeList.add(new ModelBox(bone, 11, 19, -1.9F, -5.5F, -5.001F, 3, 1, 1, 0.0F, true));
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 2.0F, 0.0F);
			setRotationAngle(bone2, 0.0F, 0.0F, 0.2618F);
			head.addChild(bone2);
			bone2.cubeList.add(new ModelBox(bone2, 11, 19, -0.9F, -5.5F, -5.001F, 3, 1, 1, 0.0F, true));
			bone2.cubeList.add(new ModelBox(bone2, 11, 19, -1.502F, -5.501F, -5.003F, 1, 1, 1, 0.0F, true));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			head.render(f5);
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

	// Made with Blockbench 3.5.2
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelox extends ModelBase {
		private final ModelRenderer body;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		public Modelox() {
			textureWidth = 64;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.cubeList.add(new ModelBox(body, 21, 5, -1.5F, 0.8F, 2.5F, 3, 1, 3, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 0, 10, -1.249F, 10.746F, 2.25F, 3, 1, 3, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 21, 5, -1.0F, 0.5F, 3.0F, 2, 1, 2, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 21, 5, -0.5F, -1.5F, 3.5F, 1, 2, 1, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 10, 0, 0.5F, -2.0F, 3.0F, 1, 2, 2, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 3, 12, -0.249F, -0.5F, 3.249F, 1, 1, 1, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 6, 14, -0.75F, -0.51F, 3.75F, 1, 1, 1, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 5, 14, -0.25F, -0.501F, 3.75F, 1, 1, 1, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 2, 10, -0.75F, -0.501F, 3.25F, 1, 1, 1, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 16, 1, -2.0F, 1.5F, 2.0F, 4, 9, 4, 0.0F, true));
			body.cubeList.add(new ModelBox(body, 0, 10, -2.0F, 10.5F, 2.0F, 4, 1, 4, 0.0F, true));
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.addChild(bone3);
			bone3.cubeList.add(new ModelBox(bone3, 0, 10, -1.5F, -13.1F, 2.5F, 3, 1, 3, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 0, 12, -1.749F, -13.25F, 2.749F, 3, 1, 3, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 0, 10, -1.25F, -13.251F, 2.75F, 3, 1, 3, 0.0F, true));
			bone3.cubeList.add(new ModelBox(bone3, 0, 11, -1.75F, -13.252F, 2.25F, 3, 1, 3, 0.0F, true));
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.addChild(bone4);
			bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.5F, -22.75F, 2.5F, 3, 1, 3, 0.0F, true));
			bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.749F, -22.75F, 2.749F, 3, 1, 3, 0.0F, true));
			bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.25F, -22.75F, 2.75F, 3, 1, 3, 0.0F, true));
			bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.25F, -22.75F, 2.25F, 3, 1, 3, 0.0F, true));
			bone4.cubeList.add(new ModelBox(bone4, 21, 5, -1.75F, -22.75F, 2.25F, 3, 1, 3, 0.0F, true));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.addChild(bone);
			bone.cubeList.add(new ModelBox(bone, 0, 4, 1.1F, -16.502F, 1.899F, 1, 1, 4, 0.0F, true));
			bone.cubeList.add(new ModelBox(bone, 0, 4, -1.899F, -16.503F, 5.1F, 4, 1, 1, 0.0F, true));
			bone.cubeList.add(new ModelBox(bone, 0, 4, -2.099F, -16.501F, 5.099F, 4, 1, 1, 0.0F, true));
			bone.cubeList.add(new ModelBox(bone, 0, 4, -2.1F, -16.5F, 1.9F, 4, 1, 4, 0.0F, true));
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 23.0F, 0.0F);
			body.addChild(bone2);
			bone2.cubeList.add(new ModelBox(bone2, 0, 2, 1.1F, -19.502F, 1.899F, 1, 1, 4, 0.0F, true));
			bone2.cubeList.add(new ModelBox(bone2, 0, 2, -1.899F, -19.503F, 5.1F, 4, 1, 1, 0.0F, true));
			bone2.cubeList.add(new ModelBox(bone2, 0, 2, -2.099F, -19.501F, 5.099F, 4, 1, 1, 0.0F, true));
			bone2.cubeList.add(new ModelBox(bone2, 0, 2, -2.1F, -19.5F, 1.9F, 4, 1, 4, 0.0F, true));
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.addChild(bone5);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone6.cubeList.add(new ModelBox(bone6, 0, 0, -1.0F, -16.0F, 5.0F, 1, 1, 1, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			body.render(f5);
			bone6.render(f5);
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
}
