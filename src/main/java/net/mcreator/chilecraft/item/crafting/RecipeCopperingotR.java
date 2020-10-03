
package net.mcreator.chilecraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.item.ItemCopperingot;
import net.mcreator.chilecraft.block.BlockCopperore;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class RecipeCopperingotR extends ElementsChileanCraftMod.ModElement {
	public RecipeCopperingotR(ElementsChileanCraftMod instance) {
		super(instance, 465);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCopperore.block, (int) (1)), new ItemStack(ItemCopperingot.block, (int) (1)), 3F);
	}
}
