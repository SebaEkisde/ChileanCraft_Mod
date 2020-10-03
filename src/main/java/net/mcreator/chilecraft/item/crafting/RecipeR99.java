
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemChupedejaiva;
import net.mcreator.chilecraft.item.ItemChupecocido;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR99 extends ElementsChileanCraftMod.ModElement {
	public RecipeR99(ElementsChileanCraftMod instance) {
		super(instance, 672);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemChupedejaiva.block, (int) (1)), new ItemStack(ItemChupecocido.block, (int) (1)), 1F);
	}
}
