
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemTaza2;
import net.mcreator.chilecraft.item.ItemTaza;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR7 extends ElementsChileanCraftMod.ModElement {
	public RecipeR7(ElementsChileanCraftMod instance) {
		super(instance, 261);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemTaza.block, (int) (1)), new ItemStack(ItemTaza2.block, (int) (1)), 0F);
	}
}
