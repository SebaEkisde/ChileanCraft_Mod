
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemJaivacocida;
import net.mcreator.chilecraft.item.ItemJaiva;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR105 extends ElementsChileanCraftMod.ModElement {
	public RecipeR105(ElementsChileanCraftMod instance) {
		super(instance, 678);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemJaiva.block, (int) (1)), new ItemStack(ItemJaivacocida.block, (int) (1)), 1F);
	}
}
