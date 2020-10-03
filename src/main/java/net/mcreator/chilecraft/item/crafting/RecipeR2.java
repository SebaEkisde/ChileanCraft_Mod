
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.block.BlockPlato2;
import net.mcreator.chilecraft.block.BlockPlato;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR2 extends ElementsChileanCraftMod.ModElement {
	public RecipeR2(ElementsChileanCraftMod instance) {
		super(instance, 256);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPlato.block, (int) (1)), new ItemStack(BlockPlato2.block, (int) (1)), 0F);
	}
}
