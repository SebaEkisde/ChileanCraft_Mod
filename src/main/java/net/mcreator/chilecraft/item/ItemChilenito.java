
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
public class ItemChilenito extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:chilenito")
	public static final Item block = null;
	public ItemChilenito(ElementsChileanCraftMod instance) {
		super(instance, 144);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chilean_craft:chilenito", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(7, 0.4f, false);
			setUnlocalizedName("chilenito");
			setRegistryName("chilenito");
			setCreativeTab(TabChileanFood.tab);
			setMaxStackSize(64);
		}

		@Override
		public int getMaxItemUseDuration(ItemStack stack) {
			return 25;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
