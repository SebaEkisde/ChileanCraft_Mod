
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
public class ItemRapanui extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:rapanuihelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:rapanuibody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:rapanuilegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:rapanuiboots")
	public static final Item boots = null;
	public ItemRapanui(ElementsChileanCraftMod instance) {
		super(instance, 165);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RAPANUI", "chilean_craft:2020-09-05-184455-rapanui_", 24, new int[]{2, 5, 6, 1},
				0, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("rapanuihelmet")
				.setRegistryName("rapanuihelmet").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("rapanuibody").setRegistryName("rapanuibody")
				.setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("rapanuilegs").setRegistryName("rapanuilegs")
				.setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:rapanuihelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("chilean_craft:rapanuibody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("chilean_craft:rapanuilegs", "inventory"));
	}
}
