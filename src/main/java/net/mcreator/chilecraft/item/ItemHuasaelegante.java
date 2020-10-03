
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
public class ItemHuasaelegante extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:huasaelegantehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:huasaelegantebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:huasaelegantelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:huasaeleganteboots")
	public static final Item boots = null;
	public ItemHuasaelegante(ElementsChileanCraftMod instance) {
		super(instance, 161);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HUASAELEGANTE", "chilean_craft:huasaelegante_", 25, new int[]{1, 1, 1, 1}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("huasaelegantebody")
				.setRegistryName("huasaelegantebody").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("huasaelegantelegs")
				.setRegistryName("huasaelegantelegs").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("huasaeleganteboots")
				.setRegistryName("huasaeleganteboots").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("chilean_craft:huasaelegantebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("chilean_craft:huasaelegantelegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("chilean_craft:huasaeleganteboots", "inventory"));
	}
}
