
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
public class ItemChupedejaiva extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:chupedejaiva")
	public static final Item block = null;
	public ItemChupedejaiva(ElementsChileanCraftMod instance) {
		super(instance, 91);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chilean_craft:chupedejaiva", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(9, 0.2f, false);
			setUnlocalizedName("chupedejaiva");
			setRegistryName("chupedejaiva");
			setCreativeTab(TabChileanFood.tab);
			setMaxStackSize(1);
		}

		@Override
		public int getMaxItemUseDuration(ItemStack stack) {
			return 49;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
