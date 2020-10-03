
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemMachacocinada;
import net.mcreator.chilecraft.item.ItemMacha;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR103 extends ElementsChileanCraftMod.ModElement {
	public RecipeR103(ElementsChileanCraftMod instance) {
		super(instance, 676);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemMacha.block, (int) (1)), new ItemStack(ItemMachacocinada.block, (int) (1)), 1F);
	}
}
