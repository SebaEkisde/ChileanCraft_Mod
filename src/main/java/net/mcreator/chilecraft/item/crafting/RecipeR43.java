
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemCanedecabra;
import net.mcreator.chilecraft.item.ItemC2;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR43 extends ElementsChileanCraftMod.ModElement {
	public RecipeR43(ElementsChileanCraftMod instance) {
		super(instance, 379);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemCanedecabra.block, (int) (1)), new ItemStack(ItemC2.block, (int) (1)), 0F);
	}
}
