package net.mcreator.chilecraft.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureCondition extends ElementsChileanCraftMod.ModElement {
	public ProcedureCondition(ElementsChileanCraftMod instance) {
		super(instance, 689);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Condition!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return (!(entity.getEntityData().getBoolean("tagName")));
	}
}
