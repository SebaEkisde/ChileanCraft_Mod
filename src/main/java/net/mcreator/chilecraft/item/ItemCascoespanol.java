
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
public class ItemCascoespanol extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:cascoespanolhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:cascoespanolbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:cascoespanollegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:cascoespanolboots")
	public static final Item boots = null;
	public ItemCascoespanol(ElementsChileanCraftMod instance) {
		super(instance, 147);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CASCOESPANOL", "chilean_craft:armor_ultra", 25, new int[]{2, 5, 6, 3}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new Modelcasccococococ().head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/cscodrfg.png";
			}
		}.setUnlocalizedName("cascoespanolhelmet").setRegistryName("cascoespanolhelmet").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:cascoespanolhelmet", "inventory"));
	}
	// Made with Blockbench
	// Paste this code into your mod.
	public static class Modelcasccococococ extends ModelBase {
		private final ModelRenderer head;
		private final ModelRenderer bone7;
		private final ModelRenderer bone9;
		private final ModelRenderer bone10;
		private final ModelRenderer bone8;
		private final ModelRenderer bone;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone2;
		public Modelcasccococococ() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.cubeList.add(new ModelBox(head, 35, 45, 3.1F, -7.9F, -4.5F, 1, 4, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 42, 52, 2.1F, -7.2F, -4.5F, 1, 2, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 42, 52, -3.1F, -7.2F, -4.5F, 1, 2, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 35, 50, -4.1F, -7.9F, -4.5F, 1, 4, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 42, 52, -1.0F, -8.79F, -4.506F, 2, 1, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 42, 52, -0.6F, -9.2F, -4.55F, 2, 1, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 31, 44, -1.33F, -9.2F, -4.56F, 2, 1, 9, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 42, 52, -0.5F, -13.05F, -0.441F, 1, 2, 2, 0.0F, true));
			head.cubeList.add(new ModelBox(head, 42, 52, -0.5F, -13.05F, -1.21F, 1, 2, 1, 0.0F, true));
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone7, -1.1345F, 0.0F, 0.0F);
			head.addChild(bone7);
			bone7.cubeList.add(new ModelBox(bone7, 42, 52, -0.487F, -18.0848F, -31.1874F, 1, 6, 3, 0.0F, true));
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone9, -0.6109F, 0.0F, 0.0F);
			head.addChild(bone9);
			bone9.cubeList.add(new ModelBox(bone9, 42, 52, -0.489F, -31.2617F, -19.9628F, 1, 6, 2, 0.0F, true));
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone10, 0.6109F, 0.0F, 0.0F);
			head.addChild(bone10);
			bone10.cubeList.add(new ModelBox(bone10, 42, 52, -0.49F, -31.0217F, 18.2552F, 1, 6, 2, 0.0F, true));
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone8, 1.1345F, 0.0F, 0.0F);
			head.addChild(bone8);
			bone8.cubeList.add(new ModelBox(bone8, 42, 52, -0.5F, -17.7548F, 28.3247F, 1, 5, 3, 0.0F, true));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone, 0.0F, 0.0F, -0.8727F);
			head.addChild(bone);
			bone.cubeList.add(new ModelBox(bone, 19, 39, 17.134F, -21.2144F, -5.0F, 8, 1, 10, 0.0F, true));
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone3, 0.0F, 0.0F, 1.2217F);
			bone.addChild(bone3);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone4, 0.0F, 0.0F, 0.5236F);
			bone.addChild(bone4);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone5, 0.0F, 0.0F, -0.2618F);
			bone.addChild(bone5);
			bone5.cubeList.add(new ModelBox(bone5, 19, 39, 28.66F, -12.8F, -4.53F, 2, 3, 9, 0.0F, true));
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(bone6, 0.0F, 0.0F, -1.1345F);
			bone.addChild(bone6);
			bone6.cubeList.add(new ModelBox(bone6, 19, 39, 28.66F, 9.8F, -4.501F, 2, 3, 9, 0.0F, true));
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone2, 0.0F, 0.0F, 0.8727F);
			head.addChild(bone2);
			bone2.cubeList.add(new ModelBox(bone2, 18, 42, -25.134F, -21.2144F, -5.01F, 8, 1, 10, 0.0F, true));
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
