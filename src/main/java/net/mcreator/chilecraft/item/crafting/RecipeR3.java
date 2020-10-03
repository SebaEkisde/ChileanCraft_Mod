
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.block.BlockCerdo2;
import net.mcreator.chilecraft.block.BlockCerdo1;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR3 extends ElementsChileanCraftMod.ModElement {
	public RecipeR3(ElementsChileanCraftMod instance) {
		super(instance, 257);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCerdo1.block, (int) (1)), new ItemStack(BlockCerdo2.block, (int) (1)), 0F);
	}
}
