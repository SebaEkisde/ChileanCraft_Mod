
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
public class ItemDoncomedia extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:doncomediahelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:doncomediabody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:doncomedialegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:doncomediaboots")
	public static final Item boots = null;
	public ItemDoncomedia(ElementsChileanCraftMod instance) {
		super(instance, 168);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DONCOMEDIA", "chilean_craft:entesmoji_", 50, new int[]{2, 5, 6, 1}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new Modeldoncomdeiasd().head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/eoji.png";
			}
		}.setUnlocalizedName("doncomediahelmet").setRegistryName("doncomediahelmet").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:doncomediahelmet", "inventory"));
	}
	// Made with Blockbench 3.5.2
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modeldoncomdeiasd extends ModelBase {
		private final ModelRenderer head;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		public Modeldoncomdeiasd() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.cubeList.add(new ModelBox(head, 40, 53, -6.0F, -8.0F, 0.0F, 6, 1, 6, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 40, 53, 0.0F, -8.0F, 0.0F, 6, 1, 6, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 40, 53, 0.0F, -8.0F, -6.0F, 6, 1, 6, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 40, 53, -6.0F, -8.0F, -6.0F, 6, 1, 6, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 37, 38, -0.5F, -18.0F, -4.5F, 5, 10, 4, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 44, 49, -0.5F, -18.0F, -0.5F, 5, 10, 5, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 37, 33, -4.5F, -18.0F, -4.5F, 4, 10, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 0, 33, -4.5F, -7.0F, -4.5F, 9, 7, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 3, 33, -3.5F, -8.0F, 4.7F, 2, 8, 0, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 29, 30, -4.7F, -8.0F, 1.5F, 0, 8, 3, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 5, 53, -0.2F, -7.0F, -5.48F, 5, 5, 5, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 13, 59, -1.2F, -5.0F, -5.48F, 2, 1, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 11, 53, -4.5F, -7.0F, -5.5F, 4, 5, 5, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 23, 53, -4.75F, -6.0F, -3.5F, 1, 4, 5, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 26, 56, -4.75F, -6.0F, -5.5F, 1, 4, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 0, 54, 3.75F, -6.0F, -3.5F, 1, 4, 4, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 2, 56, 3.75F, -6.0F, -5.5F, 1, 4, 2, 0.0F, true));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			head.addChild(bone);
			bone.cubeList.add(new ModelBox(bone, 29, 30, 4.7F, -32.0F, 1.5F, 0, 8, 3, 0.0F, true));
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 3.1416F, 0.0F);
			bone2.cubeList.add(new ModelBox(bone2, 3, 33, -3.4F, -32.0F, -4.7F, 2, 8, 0, 0.0F, true));
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
}
