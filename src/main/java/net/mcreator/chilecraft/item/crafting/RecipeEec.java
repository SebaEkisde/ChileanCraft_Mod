
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemGredaball;
import net.mcreator.chilecraft.item.ItemBricc;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeEec extends ElementsChileanCraftMod.ModElement {
	public RecipeEec(ElementsChileanCraftMod instance) {
		super(instance, 390);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemGredaball.block, (int) (1)), new ItemStack(ItemBricc.block, (int) (0)), 0F);
	}
}
