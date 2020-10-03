
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemSopaipilaa;
import net.mcreator.chilecraft.item.ItemPaa;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR340 extends ElementsChileanCraftMod.ModElement {
	public RecipeR340(ElementsChileanCraftMod instance) {
		super(instance, 780);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSopaipilaa.block, (int) (1)), new ItemStack(ItemPaa.block, (int) (1)), 1F);
	}
}
