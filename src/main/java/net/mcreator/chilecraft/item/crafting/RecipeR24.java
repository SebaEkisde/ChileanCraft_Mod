
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemEmpanapino;
import net.mcreator.chilecraft.item.ItemEmpanadapinocruda;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR24 extends ElementsChileanCraftMod.ModElement {
	public RecipeR24(ElementsChileanCraftMod instance) {
		super(instance, 457);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemEmpanadapinocruda.block, (int) (1)), new ItemStack(ItemEmpanapino.block, (int) (1)), 0F);
	}
}
