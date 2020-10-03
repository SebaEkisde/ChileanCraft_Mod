
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.block.BlockTinaja2;
import net.mcreator.chilecraft.block.BlockTinaja;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR4 extends ElementsChileanCraftMod.ModElement {
	public RecipeR4(ElementsChileanCraftMod instance) {
		super(instance, 258);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTinaja.block, (int) (1)), new ItemStack(BlockTinaja2.block, (int) (1)), 0F);
	}
}
