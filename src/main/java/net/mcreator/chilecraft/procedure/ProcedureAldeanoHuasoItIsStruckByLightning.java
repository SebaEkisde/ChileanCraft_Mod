package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureAldeanoHuasoItIsStruckByLightning extends ElementsChileanCraftMod.ModElement {
	public ProcedureAldeanoHuasoItIsStruckByLightning(ElementsChileanCraftMod instance) {
		super(instance, 542);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AldeanoHuasoItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AldeanoHuasoItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AldeanoHuasoItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AldeanoHuasoItIsStruckByLightning!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AldeanoHuasoItIsStruckByLightning!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		(entity).world.removeEntity(entity);
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityWitch(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
