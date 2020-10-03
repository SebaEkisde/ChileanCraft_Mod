
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemPasamasado;
import net.mcreator.chilecraft.item.ItemMasa;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR18 extends ElementsChileanCraftMod.ModElement {
	public RecipeR18(ElementsChileanCraftMod instance) {
		super(instance, 430);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemMasa.block, (int) (1)), new ItemStack(ItemPasamasado.block, (int) (1)), 0F);
	}
}
