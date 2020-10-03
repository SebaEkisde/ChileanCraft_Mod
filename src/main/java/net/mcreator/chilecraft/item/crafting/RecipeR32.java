
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemC3;
import net.mcreator.chilecraft.item.ItemC2;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR32 extends ElementsChileanCraftMod.ModElement {
	public RecipeR32(ElementsChileanCraftMod instance) {
		super(instance, 380);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemC2.block, (int) (1)), new ItemStack(ItemC3.block, (int) (1)), 0F);
	}
}
