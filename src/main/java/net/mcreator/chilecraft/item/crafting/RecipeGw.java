
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemMaizfruit;
import net.mcreator.chilecraft.item.ItemMaizcocido;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeGw extends ElementsChileanCraftMod.ModElement {
	public RecipeGw(ElementsChileanCraftMod instance) {
		super(instance, 317);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemMaizfruit.block, (int) (1)), new ItemStack(ItemMaizcocido.block, (int) (1)), 0F);
	}
}
