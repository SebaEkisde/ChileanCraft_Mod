
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
public class ItemGorro extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:gorrohelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:gorrobody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:gorrolegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:gorroboots")
	public static final Item boots = null;
	public ItemGorro(ElementsChileanCraftMod instance) {
		super(instance, 158);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GORRO", "chilean_craft:asaito_", 20, new int[]{2, 5, 6, 0}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0.1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new Modelgoro().head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/goroo.png";
			}
		}.setUnlocalizedName("gorrohelmet").setRegistryName("gorrohelmet").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:gorrohelmet", "inventory"));
	}
	// Made with Blockbench
	// Paste this code into your mod.
	public static class Modelgoro extends ModelBase {
		private final ModelRenderer head;
		public Modelgoro() {
			textureWidth = 30;
			textureHeight = 30;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 1.0F, 0.0F);
			head.cubeList.add(new ModelBox(head, 17, 15, -4.5F, -10.0F, -1.5F, 1, 3, 5, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 17, 18, -4.5F, -10.0F, -3.5F, 1, 3, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 17, 16, 3.5F, -10.0F, -3.5F, 1, 3, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 7, 27, -4.0F, -10.0F, -4.5F, 8, 2, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 6, 16, -3.5F, -9.95F, -4.45F, 8, 2, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 6, 16, -4.5F, -8.0F, -4.5F, 9, 1, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 15, 16, 3.5F, -10.0F, -1.5F, 1, 3, 5, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 2, 19, -4.0F, -10.5F, -4.0F, 8, 1, 6, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 5, 22, -4.0F, -10.5F, 2.0F, 8, 1, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 22, 17, 1.5F, -10.0F, 3.5F, 3, 3, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 17, 17, -4.5F, -10.0F, 3.5F, 3, 3, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 22, 27, -1.5F, -8.1F, 3.5F, 3, 1, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 6, 16, -1.5F, -10.0F, 3.5F, 3, 1, 0, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 6, 16, -4.5F, -8.0F, -6.5F, 9, 1, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 7, 22, -4.0F, -8.0F, -7.5F, 8, 1, 1, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 6, 16, -3.0F, -8.001F, -8.0F, 6, 1, 1, 0.0F, true));
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
