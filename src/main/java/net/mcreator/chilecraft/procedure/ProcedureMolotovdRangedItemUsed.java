package net.mcreator.chilecraft.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.item.ItemMolotovd;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMolotovdRangedItemUsed extends ElementsChileanCraftMod.ModElement {
	public ProcedureMolotovdRangedItemUsed(ElementsChileanCraftMod instance) {
		super(instance, 665);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MolotovdRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemMolotovd.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
