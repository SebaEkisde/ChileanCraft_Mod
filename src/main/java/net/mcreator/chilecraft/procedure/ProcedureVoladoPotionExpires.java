package net.mcreator.chilecraft.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureVoladoPotionExpires extends ElementsChileanCraftMod.ModElement {
	public ProcedureVoladoPotionExpires(ElementsChileanCraftMod instance) {
		super(instance, 629);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VoladoPotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).capabilities.isFlying = (false);
			((EntityPlayer) entity).sendPlayerAbilities();
		}
	}
}
