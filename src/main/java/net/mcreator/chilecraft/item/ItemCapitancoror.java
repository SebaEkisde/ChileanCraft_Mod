
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
public class ItemCapitancoror extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:capitancororhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:capitancororbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:capitancororlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:capitancororboots")
	public static final Item boots = null;
	public ItemCapitancoror(ElementsChileanCraftMod instance) {
		super(instance, 169);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CAPITANCOROR", "chilean_craft:entesmoji_", 80, new int[]{2, 5, 6, 3}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new Modelcapitan().head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/coro.png";
			}
		}.setUnlocalizedName("capitancororhelmet").setRegistryName("capitancororhelmet").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:capitancororhelmet", "inventory"));
	}
	// Made with Blockbench 3.5.2
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelcapitan extends ModelBase {
		private final ModelRenderer head;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		public Modelcapitan() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.cubeList.add(new ModelBox(head, 0, 33, -4.5F, -7.0F, -4.5F, 9, 7, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 0, 38, -4.5F, -8.0F, -4.5F, 9, 1, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 15, 38, 2.75F, -8.25F, 2.75F, 2, 1, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 15, 38, -4.75F, -8.25F, 2.75F, 2, 1, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 45, 41, -3.99F, -9.0F, 0.5F, 4, 1, 3, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 45, 41, -3.99F, -9.0F, -3.5F, 2, 1, 4, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 50, 40, 3.03F, -9.5F, -3.5F, 1, 1, 4, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 50, 41, -3.97F, -9.5F, -3.5F, 1, 1, 4, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 37, 36, 0.01F, -9.0F, -3.5F, 4, 1, 7, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 39, 51, -3.98F, -10.0F, -3.7F, 8, 2, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 45, 48, -3.99F, -9.0F, -3.71F, 8, 1, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 44, 56, -2.5F, -11.0F, -2.5F, 5, 2, 5, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 60, 55, -0.5F, -12.0F, -0.5F, 1, 1, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 46, 56, -1.0F, -10.0F, 2.5F, 2, 2, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 36, 55, -1.0F, -9.0F, 3.5F, 2, 6, 2, 0.0F, true));
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
