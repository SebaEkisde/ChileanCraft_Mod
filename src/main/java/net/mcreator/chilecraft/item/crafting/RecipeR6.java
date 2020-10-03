
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.block.BlockPlatobaji;
import net.mcreator.chilecraft.block.BlockPlao;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeR6 extends ElementsChileanCraftMod.ModElement {
	public RecipeR6(ElementsChileanCraftMod instance) {
		super(instance, 260);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPlatobaji.block, (int) (1)), new ItemStack(BlockPlao.block, (int) (1)), 0F);
	}
}
