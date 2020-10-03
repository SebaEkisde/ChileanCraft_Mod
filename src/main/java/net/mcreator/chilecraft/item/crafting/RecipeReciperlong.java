
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemLongacocida;
import net.mcreator.chilecraft.item.ItemLonga;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeReciperlong extends ElementsChileanCraftMod.ModElement {
	public RecipeReciperlong(ElementsChileanCraftMod instance) {
		super(instance, 505);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemLonga.block, (int) (1)), new ItemStack(ItemLongacocida.block, (int) (1)), 1F);
	}
}
