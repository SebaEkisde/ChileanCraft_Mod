
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemSopaipilaa;
import net.mcreator.chilecraft.item.ItemPaa;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeE21 extends ElementsChileanCraftMod.ModElement {
	public RecipeE21(ElementsChileanCraftMod instance) {
		super(instance, 435);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSopaipilaa.block, (int) (1)), new ItemStack(ItemPaa.block, (int) (1)), 0F);
	}
}
