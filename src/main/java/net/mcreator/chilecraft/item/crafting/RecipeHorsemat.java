
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemCaballo32;
import net.mcreator.chilecraft.item.ItemCaballlo;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeHorsemat extends ElementsChileanCraftMod.ModElement {
	public RecipeHorsemat(ElementsChileanCraftMod instance) {
		super(instance, 440);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemCaballlo.block, (int) (1)), new ItemStack(ItemCaballo32.block, (int) (1)), 0F);
	}
}
