
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemVienesacocida;
import net.mcreator.chilecraft.item.ItemVienesa;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeRdcraft extends ElementsChileanCraftMod.ModElement {
	public RecipeRdcraft(ElementsChileanCraftMod instance) {
		super(instance, 604);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemVienesa.block, (int) (1)), new ItemStack(ItemVienesacocida.block, (int) (1)), 1F);
	}
}
