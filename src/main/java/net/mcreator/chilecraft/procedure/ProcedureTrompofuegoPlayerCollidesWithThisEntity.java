package net.mcreator.chilecraft.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureTrompofuegoPlayerCollidesWithThisEntity extends ElementsChileanCraftMod.ModElement {
	public ProcedureTrompofuegoPlayerCollidesWithThisEntity(ElementsChileanCraftMod instance) {
		super(instance, 785);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TrompofuegoPlayerCollidesWithThisEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 60);
	}
}
