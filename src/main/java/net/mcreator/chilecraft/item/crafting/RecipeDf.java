
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemSeedscebolla;
import net.mcreator.chilecraft.item.ItemCebollasada;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeDf extends ElementsChileanCraftMod.ModElement {
	public RecipeDf(ElementsChileanCraftMod instance) {
		super(instance, 322);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSeedscebolla.block, (int) (1)), new ItemStack(ItemCebollasada.block, (int) (1)), 0F);
	}
}
