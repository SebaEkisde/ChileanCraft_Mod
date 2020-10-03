
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
public class ItemCopperhelmet extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:copperhelmethelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:copperhelmetbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:copperhelmetlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:copperhelmetboots")
	public static final Item boots = null;
	public ItemCopperhelmet(ElementsChileanCraftMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("COPPERHELMET", "chilean_craft:diamond__", 115, new int[]{2, 5, 6, 2}, 7,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("copperhelmethelmet")
				.setRegistryName("copperhelmethelmet").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("copperhelmetbody")
				.setRegistryName("copperhelmetbody").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("copperhelmetlegs")
				.setRegistryName("copperhelmetlegs").setCreativeTab(TabChilecraft.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("copperhelmetboots")
				.setRegistryName("copperhelmetboots").setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:copperhelmethelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("chilean_craft:copperhelmetbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("chilean_craft:copperhelmetlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("chilean_craft:copperhelmetboots", "inventory"));
	}
}
