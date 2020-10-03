
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemMacruda;
import net.mcreator.chilecraft.item.ItemMa;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR31 extends ElementsChileanCraftMod.ModElement {
	public RecipeR31(ElementsChileanCraftMod instance) {
		super(instance, 432);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemMacruda.block, (int) (1)), new ItemStack(ItemMa.block, (int) (1)), 0F);
	}
}
