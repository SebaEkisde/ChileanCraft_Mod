
package net.mcreator.chilecraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.chilecraft.creativetab.TabChileanFood;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class ItemWebo extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:webo")
	public static final Item block = null;
	public ItemWebo(ElementsChileanCraftMod instance) {
		super(instance, 130);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chilean_craft:webo", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(5, 0.3f, false);
			setUnlocalizedName("webo");
			setRegistryName("webo");
			setCreativeTab(TabChileanFood.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
