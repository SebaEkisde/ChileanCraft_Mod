
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
public class ItemDylan extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:dylanhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("chilean_craft:dylanbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("chilean_craft:dylanlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("chilean_craft:dylanboots")
	public static final Item boots = null;
	public ItemDylan(ElementsChileanCraftMod instance) {
		super(instance, 166);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DYLAN", "chilean_craft:dylan_", 50, new int[]{2, 5, 6, 0}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.cloth.place")), 0.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("dylanhelmet").setRegistryName("dylanhelmet")
				.setCreativeTab(TabChilecraft.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:dylanhelmet", "inventory"));
	}
}
