
package net.mcreator.chilecraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBase;

import net.mcreator.chilecraft.creativetab.TabChilecraft;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class ItemHuaso extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:huasohelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:huasobody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:huasolegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:huasoboots")
	public static final Item boots = null;
	public ItemHuaso(ElementsChileanCraftMod instance) {
		super(instance, 159);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HUASO", "chilean_craft:huaso_", 46, new int[]{1, 1, 1, 1}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.cloth.place")), 0.3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new Modelshuplalanigga().head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/eo.png";
			}
		}.setUnlocalizedName("huasohelmet").setRegistryName("huasohelmet").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("huasobody").setRegistryName("huasobody")
				.setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("huasolegs").setRegistryName("huasolegs")
				.setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new Modelbotasfinale().bone5;
				armorModel.bipedRightLeg = new Modelbotasfinale().bone2;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/bota.png";
			}
		}.setUnlocalizedName("huasoboots").setRegistryName("huasoboots").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:huasohelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("chilean_craft:huasobody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("chilean_craft:huasolegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("chilean_craft:huasoboots", "inventory"));
	}
	// Made with Blockbench
	// Paste this code into your mod.
	public static class Modelshuplalanigga extends ModelBase {
		private final ModelRenderer head;
		public Modelshuplalanigga() {
			textureWidth = 32;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.cubeList.add(new ModelBox(head, 0, 19, -4.5F, -7.5F, -4.5F, 9, 1, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 0, 19, -4.5F, -10.5F, -4.5F, 9, 1, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 0, 21, -4.5F, -9.5F, -4.5F, 9, 2, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 3, 21, -7.5F, -7.0F, 0.5F, 7, 1, 7, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 1, 20, -7.5F, -7.0F, -7.5F, 7, 1, 8, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 0, 20, -0.5F, -7.0F, -7.5F, 8, 1, 8, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 0, 19, -0.5F, -7.0F, -0.5F, 8, 1, 8, 0.0F, true));
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
	}

	// Made with Blockbench
	// Paste this code into your mod.
	public static class Modelbotasfinale extends ModelBase {
		private final ModelRenderer bone2;
		private final ModelRenderer bone;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone7;
		private final ModelRenderer bone8;
		public Modelbotasfinale() {
			textureWidth = 64;
			textureHeight = 32;
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 12.0F, 0.0F);
			bone2.cubeList.add(new ModelBox(bone2, 54, 0, -4.1F, 10.01F, -3.0F, 4, 2, 2, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 54, 0, -4.2F, 3.75F, -1.75F, 1, 6, 4, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 54, 0, -4.201F, 3.75F, -2.2F, 1, 6, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 48, 1, -3.849F, 3.749F, -1.751F, 4, 6, 4, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 51, 1, -3.85F, 3.748F, -2.201F, 4, 6, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 54, 0, -4.1025F, 9.01F, -0.9F, 4, 3, 3, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 54, 0, -4.11F, 9.02F, -1.0F, 4, 3, 3, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 54, 0, -4.1003F, 9.01F, 0.5F, 4, 3, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 54, 0, -4.101F, 9.0F, -2.05F, 4, 2, 3, 0.0F, false));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 27.0F, 0.0F);
			setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
			bone2.addChild(bone);
			bone.cubeList.add(new ModelBox(bone, 40, 2, -0.7F, -17.9889F, 4.3823F, 1, 1, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 40, 2, -4.3F, -17.9889F, 4.3823F, 1, 1, 3, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 40, 2, -3.502F, -17.9899F, 6.3833F, 3, 1, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 40, 2, -2.5F, -17.9899F, 7.3823F, 1, 1, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 40, 2, -2.502F, -18.4889F, 7.8823F, 1, 2, 2, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 51, 2, -4.1001F, -16.7389F, 2.9323F, 4, 2, 2, 0.0F, false));
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone3, 1.0472F, 0.0F, 0.0F);
			bone.addChild(bone3);
			bone3.cubeList.add(new ModelBox(bone3, 40, 2, -2.5F, -1.9823F, 18.5889F, 1, 2, 2, 0.0F, false));
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone4, -1.0472F, 0.0F, 0.0F);
			bone.addChild(bone4);
			bone4.cubeList.add(new ModelBox(bone4, 40, 2, -2.501F, -17.4066F, -11.7066F, 1, 2, 2, 0.0F, false));
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 12.0F, 0.0F);
			bone5.cubeList.add(new ModelBox(bone5, 54, 0, 0.01F, 10.01F, -3.0F, 4, 2, 2, 0.0F, false));
			bone5.cubeList.add(new ModelBox(bone5, 54, 0, -0.2F, 3.75F, -1.75F, 1, 6, 4, 0.0F, false));
			bone5.cubeList.add(new ModelBox(bone5, 54, 0, -0.201F, 3.75F, -2.2F, 1, 6, 1, 0.0F, false));
			bone5.cubeList.add(new ModelBox(bone5, 48, 0, 0.121F, 3.749F, -1.751F, 4, 6, 4, 0.0F, false));
			bone5.cubeList.add(new ModelBox(bone5, 54, 0, 0.2F, 3.748F, -2.201F, 4, 6, 1, 0.0F, false));
			bone5.cubeList.add(new ModelBox(bone5, 54, 0, 0.01F, 9.01F, -0.9F, 4, 3, 3, 0.0F, false));
			bone5.cubeList.add(new ModelBox(bone5, 54, 0, -0.01F, 9.02F, -0.901F, 4, 3, 3, 0.0F, false));
			bone5.cubeList.add(new ModelBox(bone5, 54, 0, -0.1003F, 9.01F, 0.5F, 4, 3, 1, 0.0F, false));
			bone5.cubeList.add(new ModelBox(bone5, 54, 0, 0.0F, 9.0F, -2.05F, 4, 2, 3, 0.0F, false));
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, 27.0F, 0.0F);
			setRotationAngle(bone6, 0.2618F, 0.0F, 0.0F);
			bone5.addChild(bone6);
			bone6.cubeList.add(new ModelBox(bone6, 40, 2, 3.3F, -17.9889F, 4.3823F, 1, 1, 3, 0.0F, false));
			bone6.cubeList.add(new ModelBox(bone6, 40, 2, -0.3F, -17.9889F, 4.3823F, 1, 1, 3, 0.0F, false));
			bone6.cubeList.add(new ModelBox(bone6, 40, 2, 0.498F, -17.9899F, 6.3833F, 3, 1, 1, 0.0F, false));
			bone6.cubeList.add(new ModelBox(bone6, 40, 2, 1.5F, -17.9899F, 7.3823F, 1, 1, 1, 0.0F, false));
			bone6.cubeList.add(new ModelBox(bone6, 40, 2, 1.498F, -18.4889F, 7.8823F, 1, 2, 2, 0.0F, false));
			bone6.cubeList.add(new ModelBox(bone6, 51, 2, 0.0F, -16.7389F, 2.9323F, 4, 2, 2, 0.0F, false));
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone7, 1.0472F, 0.0F, 0.0F);
			bone6.addChild(bone7);
			bone7.cubeList.add(new ModelBox(bone7, 40, 2, 1.5F, -1.9823F, 18.5889F, 1, 2, 2, 0.0F, false));
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone8, -1.0472F, 0.0F, 0.0F);
			bone6.addChild(bone8);
			bone8.cubeList.add(new ModelBox(bone8, 40, 2, 1.499F, -17.4066F, -11.7066F, 1, 2, 2, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			bone2.render(f5);
			bone5.render(f5);
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
