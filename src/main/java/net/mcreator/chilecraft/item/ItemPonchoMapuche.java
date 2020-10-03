
package net.mcreator.chilecraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.chilecraft.creativetab.TabChilecraft;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class ItemPonchoMapuche extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:poncho_mapuchehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:poncho_mapuchebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:poncho_mapuchelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:poncho_mapucheboots")
	public static final Item boots = null;
	public ItemPonchoMapuche(ElementsChileanCraftMod instance) {
		super(instance, 163);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PONCHO_MAPUCHE", "chilean_craft:2020-08-07-122424-mapuche_", 30,
				new int[]{2, 5, 1, 1}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("poncho_mapuchehelmet")
				.setRegistryName("poncho_mapuchehelmet").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("poncho_mapuchebody")
				.setRegistryName("poncho_mapuchebody").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:poncho_mapuchehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("chilean_craft:poncho_mapuchebody", "inventory"));
	}
}
