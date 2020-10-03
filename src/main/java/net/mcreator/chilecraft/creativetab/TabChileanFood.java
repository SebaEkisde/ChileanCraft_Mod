
package net.mcreator.chilecraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.chilecraft.item.ItemEmpanapino;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class TabChileanFood extends ElementsChileanCraftMod.ModElement {
	public TabChileanFood(ElementsChileanCraftMod instance) {
		super(instance, 787);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabchilean_food") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemEmpanapino.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
