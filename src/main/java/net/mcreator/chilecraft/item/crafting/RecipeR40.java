
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.chilecraft.item.ItemCarameo;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR40 extends ElementsChileanCraftMod.ModElement {
	public RecipeR40(ElementsChileanCraftMod instance) {
		super(instance, 497);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.SUGAR, (int) (1)), new ItemStack(ItemCarameo.block, (int) (1)), 1F);
	}
}
