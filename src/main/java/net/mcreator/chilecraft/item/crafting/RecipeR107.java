
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemMerluzacocida;
import net.mcreator.chilecraft.item.ItemMerluza;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR107 extends ElementsChileanCraftMod.ModElement {
	public RecipeR107(ElementsChileanCraftMod instance) {
		super(instance, 680);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemMerluza.block, (int) (1)), new ItemStack(ItemMerluzacocida.block, (int) (1)), 1F);
	}
}
