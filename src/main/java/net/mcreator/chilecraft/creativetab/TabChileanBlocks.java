
package net.mcreator.chilecraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.chilecraft.block.BlockParrilla;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class TabChileanBlocks extends ElementsChileanCraftMod.ModElement {
	public TabChileanBlocks(ElementsChileanCraftMod instance) {
		super(instance, 788);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabchilean_blocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockParrilla.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
