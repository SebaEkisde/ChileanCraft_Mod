
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.block.BlockGreda2;
import net.mcreator.chilecraft.block.BlockCompos1;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR extends ElementsChileanCraftMod.ModElement {
	public RecipeR(ElementsChileanCraftMod instance) {
		super(instance, 374);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockGreda2.block, (int) (1)), new ItemStack(BlockCompos1.block, (int) (1)), 0F);
	}
}
