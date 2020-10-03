package net.mcreator.chilecraft.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureRudaMobplayerCollidesWithPlant extends ElementsChileanCraftMod.ModElement {
	public ProcedureRudaMobplayerCollidesWithPlant(ElementsChileanCraftMod instance) {
		super(instance, 392);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RudaMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof EntityMob)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
		}
	}
}
