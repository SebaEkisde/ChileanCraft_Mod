
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

import net.mcreator.chilecraft.procedure.ProcedureGorrodelanaBodyTickEventf;
import net.mcreator.chilecraft.creativetab.TabChilecraft;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ItemGorrodelana extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:gorrodelanahelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:gorrodelanabody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:gorrodelanalegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:gorrodelanaboots")
	public static final Item boots = null;
	public ItemGorrodelana(ElementsChileanCraftMod instance) {
		super(instance, 164);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GORRODELANA", "chilean_craft:2020-08-11-011239-gorrodelana_", 25,
				new int[]{2, 5, 6, 1}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("gorrodelanahelmet")
				.setRegistryName("gorrodelanahelmet").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new Modelchin12().bone;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "chilean_craft:textures/chin.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
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
					ProcedureGorrodelanaBodyTickEventf.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("gorrodelanabody").setRegistryName("gorrodelanabody").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:gorrodelanahelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("chilean_craft:gorrodelanabody", "inventory"));
	}
	// Made with Blockbench 3.5.2
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelchin12 extends ModelBase {
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone7;
		private final ModelRenderer bone8;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bone9;
		private final ModelRenderer bone10;
		public Modelchin12() {
			textureWidth = 128;
			textureHeight = 128;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 12.0F, 0.0F);
			bone.cubeList.add(new ModelBox(bone, 83, 0, -3.0F, -10.01F, 4.0F, 6, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 79, 24, 2.2F, -10.02F, 4.0F, 1, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 79, 30, 2.2F, -0.8F, 4.0F, 1, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 65, 27, -3.1F, -0.8F, 4.0F, 1, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 72, 28, -3.1F, -10.02F, 4.0F, 1, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 104, 42, -1.0F, -10.5F, 6.0F, 2, 1, 2, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 75, 31, -0.5F, -13.01F, 6.5F, 1, 3, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 66, 55, -2.0F, -11.5F, 5.0F, 4, 0, 4, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 65, 55, -2.0F, -12.0F, 5.0F, 4, 0, 4, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 65, 56, -2.0F, -11.75F, 5.0F, 4, 0, 4, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 110, 58, -1.0F, -12.25F, 6.0F, 2, 1, 2, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 83, 0, -3.0F, -7.9F, 11.01F, 6, 6, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 99, 25, -2.5F, -7.0F, 3.0F, 5, 4, 8, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 100, 27, -2.498F, -8.95F, 5.0F, 5, 8, 4, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 83, 0, -3.0F, -0.9F, 4.0F, 6, 1, 6, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 83, 0, -3.0F, -7.85F, 1.9F, 6, 5, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 71, 24, 2.1F, -7.85F, 1.8F, 1, 6, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 85, 32, -3.1F, -7.85F, 1.8F, 1, 6, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 74, 28, 2.1F, -7.9F, 11.1F, 1, 6, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 76, 30, -3.1F, -7.9F, 11.1F, 1, 6, 1, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 83, 0, -2.99F, -3.0F, 1.91F, 6, 1, 1, 0.0F, false));
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 9.0F, 18.0F);
			bone.addChild(bone2);
			setRotationAngle(bone2, 0.7854F, 0.0F, 0.0F);
			bone2.cubeList.add(new ModelBox(bone2, 83, 0, -2.99F, -19.2F, 6.7F, 6, 3, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 84, 24, 2.1F, -19.2F, 6.8F, 1, 3, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 74, 29, -3.1F, -19.2F, 6.8F, 1, 3, 1, 0.0F, false));
			bone2.cubeList.add(new ModelBox(bone2, 111, 26, -2.497F, -19.2F, 4.3358F, 5, 3, 3, 0.0F, false));
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 0.7071F, 3.5355F);
			bone2.addChild(bone5);
			setRotationAngle(bone5, 0.1745F, 0.0F, 0.0F);
			bone5.cubeList.add(new ModelBox(bone5, 80, 29, -2.99F, -27.9071F, 3.8645F, 2, 5, 1, 0.0F, false));
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(5.0F, -0.7071F, 2.1213F);
			bone2.addChild(bone6);
			setRotationAngle(bone6, 0.1745F, 0.0F, 0.0F);
			bone6.cubeList.add(new ModelBox(bone6, 77, 26, -4.01F, -26.2929F, 5.0787F, 2, 5, 1, 0.0F, false));
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(5.0F, 0.0F, 11.3137F);
			bone2.addChild(bone7);
			setRotationAngle(bone7, 0.9599F, 0.0F, 0.0F);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(0.0F, 2.8284F, 1.4142F);
			bone2.addChild(bone8);
			setRotationAngle(bone8, 0.4363F, 0.0F, 0.0F);
			bone8.cubeList.add(new ModelBox(bone8, 82, 37, -2.97F, -24.6284F, 5.8858F, 2, 2, 1, 0.0F, false));
			bone8.cubeList.add(new ModelBox(bone8, 75, 35, 0.99F, -24.6284F, 5.8858F, 2, 2, 1, 0.0F, false));
			bone8.cubeList.add(new ModelBox(bone8, 83, 0, 0.99F, -22.8284F, 5.8858F, 2, 1, 1, 0.0F, false));
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 16.0F, 10.0F);
			bone.addChild(bone3);
			setRotationAngle(bone3, 0.7854F, 0.0F, 0.0F);
			bone3.cubeList.add(new ModelBox(bone3, 83, 0, -2.99F, -18.5F, 7.0F, 6, 3, 1, 0.0F, false));
			bone3.cubeList.add(new ModelBox(bone3, 72, 30, 2.1F, -18.5F, 6.9F, 1, 3, 1, 0.0F, false));
			bone3.cubeList.add(new ModelBox(bone3, 79, 35, -3.1F, -18.5F, 6.9F, 1, 3, 1, 0.0F, false));
			bone3.cubeList.add(new ModelBox(bone3, 97, 27, -2.499F, -18.49F, 7.03F, 5, 3, 4, 0.0F, false));
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 5.0F, -7.0F);
			bone.addChild(bone4);
			setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
			bone4.cubeList.add(new ModelBox(bone4, 83, 0, -2.99F, -17.5F, 7.55F, 6, 2, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 111, 27, -2.499F, -18.5F, 5.1358F, 5, 3, 3, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 83, 0, -2.99F, -18.4F, -2.8F, 6, 3, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 80, 25, -3.101F, -18.41F, -2.81F, 1, 3, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 80, 27, 2.1F, -18.41F, -2.81F, 1, 3, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 79, 37, 2.1F, -17.4F, 7.65F, 1, 2, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 73, 38, -3.1F, -17.4F, 7.65F, 1, 2, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 71, 32, 2.1F, -18.35F, 7.65F, 1, 1, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 71, 33, -3.1F, -18.35F, 7.65F, 1, 1, 1, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 112, 29, -2.497F, -18.45F, -2.75F, 5, 3, 3, 0.0F, false));
			bone4.cubeList.add(new ModelBox(bone4, 83, 0, -2.98F, -18.3F, 7.551F, 6, 1, 1, 0.0F, false));
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			bone.render(f5);
			bone9.render(f5);
			bone10.render(f5);
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
