
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemPinonC;
import net.mcreator.chilecraft.item.ItemPinon;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipePinonr extends ElementsChileanCraftMod.ModElement {
	public RecipePinonr(ElementsChileanCraftMod instance) {
		super(instance, 277);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemPinon.block, (int) (1)), new ItemStack(ItemPinonC.block, (int) (1)), 0F);
	}
}
