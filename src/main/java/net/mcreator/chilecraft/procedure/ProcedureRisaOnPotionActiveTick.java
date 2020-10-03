package net.mcreator.chilecraft.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureRisaOnPotionActiveTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureRisaOnPotionActiveTick(ElementsChileanCraftMod instance) {
		super(instance, 657);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RisaOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() >= 0.5)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		}
	}
}
