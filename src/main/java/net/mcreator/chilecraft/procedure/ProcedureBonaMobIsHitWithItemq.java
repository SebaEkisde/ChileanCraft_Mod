package net.mcreator.chilecraft.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.item.ItemBona;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureBonaMobIsHitWithItemq extends ElementsChileanCraftMod.ModElement {
	public ProcedureBonaMobIsHitWithItemq(ElementsChileanCraftMod instance) {
		super(instance, 400);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BonaMobIsHitWithItemq!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof EntityWolf)) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBona.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
	}
}
