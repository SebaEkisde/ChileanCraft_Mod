package net.mcreator.chilecraft.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.item.ItemSangche;
import net.mcreator.chilecraft.item.ItemMilpesos;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureCca extends ElementsChileanCraftMod.ModElement {
	public ProcedureCca(ElementsChileanCraftMod instance) {
		super(instance, 619);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Cca!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemMilpesos.block, (int) (1)))
				: false)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemSangche.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemMilpesos.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
	}
}
