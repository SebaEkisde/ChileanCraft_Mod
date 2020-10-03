
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemReinetas;
import net.mcreator.chilecraft.item.ItemReinetacocinada;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR109 extends ElementsChileanCraftMod.ModElement {
	public RecipeR109(ElementsChileanCraftMod instance) {
		super(instance, 682);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemReinetas.block, (int) (1)), new ItemStack(ItemReinetacocinada.block, (int) (1)), 1F);
	}
}
