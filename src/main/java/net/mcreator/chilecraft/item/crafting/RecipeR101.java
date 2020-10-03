
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemChoritococido;
import net.mcreator.chilecraft.item.ItemChorito;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR101 extends ElementsChileanCraftMod.ModElement {
	public RecipeR101(ElementsChileanCraftMod instance) {
		super(instance, 674);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemChorito.block, (int) (1)), new ItemStack(ItemChoritococido.block, (int) (1)), 1F);
	}
}
