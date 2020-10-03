package net.mcreator.chilecraft.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureTrompofuegoEntityIsHurt extends ElementsChileanCraftMod.ModElement {
	public ProcedureTrompofuegoEntityIsHurt(ElementsChileanCraftMod instance) {
		super(instance, 742);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TrompofuegoEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 60);
	}
}
