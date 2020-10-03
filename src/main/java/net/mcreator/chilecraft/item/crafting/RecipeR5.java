
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.block.BlockTg2;
import net.mcreator.chilecraft.block.BlockTg1;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR5 extends ElementsChileanCraftMod.ModElement {
	public RecipeR5(ElementsChileanCraftMod instance) {
		super(instance, 259);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTg1.block, (int) (1)), new ItemStack(BlockTg2.block, (int) (1)), 0F);
	}
}
