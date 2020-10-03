
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemPastel;
import net.mcreator.chilecraft.item.ItemPaasteld;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR44 extends ElementsChileanCraftMod.ModElement {
	public RecipeR44(ElementsChileanCraftMod instance) {
		super(instance, 456);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemPaasteld.block, (int) (1)), new ItemStack(ItemPastel.block, (int) (1)), 0F);
	}
}
