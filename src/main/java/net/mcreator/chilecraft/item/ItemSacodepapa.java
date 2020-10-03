
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

import net.mcreator.chilecraft.procedure.ProcedureSacodepapaBootsTickEvent;
import net.mcreator.chilecraft.creativetab.TabChilecraft;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ItemSacodepapa extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:sacodepapahelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:sacodepapabody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:sacodepapalegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:sacodepapaboots")
	public static final Item boots = null;
	public ItemSacodepapa(ElementsChileanCraftMod instance) {
		super(instance, 209);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SACODEPAPA", "chilean_craft:chile_", 25, new int[]{1, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new Modelsaco12().bone;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/jjj.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureSacodepapaBootsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("sacodepapabody").setRegistryName("sacodepapabody").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("chilean_craft:sacodepapabody", "inventory"));
	}
	// Made with Blockbench 3.5.2
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelsaco12 extends ModelBase {
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		public Modelsaco12() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 12.0F, 0.0F);
			bone.cubeList.add(new ModelBox(bone, 37, 4, 6.0F, -4.0F, -5.0F, 1, 16, 10, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 43, 4, -7.0F, -4.0F, -6.0F, 14, 16, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 33, 3, -7.0F, -4.0F, -5.0F, 1, 16, 10, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 43, 4, -8.0F, -4.0F, -3.0F, 1, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 36, 4, 2.0F, 11.1F, -5.0F, 4, 1, 10, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 36, 4, -2.0F, 11.1F, -5.0F, 4, 1, 10, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 35, 4, -6.0F, 11.1F, -5.0F, 4, 1, 10, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 43, 4, -7.0F, -4.0F, 5.0F, 14, 16, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 43, 4, 7.0F, -4.0F, -3.0F, 1, 1, 6, 0.0F, false));
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 12.0F, 1.0F);
			bone.addChild(bone2);
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
		}
	}

	// Made with Blockbench 3.5.2
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelsaxoc extends ModelBase {
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		public Modelsaxoc() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 18.0F, 1.0F);
			bone.cubeList.add(new ModelBox(bone, 0, 0, 6.0F, -10.0F, -5.0F, 1, 16, 8, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -10.0F, -6.0F, 14, 16, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -10.0F, -5.0F, 1, 16, 8, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -10.0F, -4.0F, 1, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, 5.0F, -5.0F, 12, 1, 8, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -10.0F, 3.0F, 14, 16, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, 7.0F, -10.0F, -4.0F, 1, 1, 6, 0.0F, false));
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 6.0F, 0.0F);
			bone.addChild(bone2);
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
		}
	}
}
