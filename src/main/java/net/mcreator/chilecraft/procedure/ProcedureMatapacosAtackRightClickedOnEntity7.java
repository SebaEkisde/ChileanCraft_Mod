package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.entity.EntityMatapacos;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMatapacosAtackRightClickedOnEntity7 extends ElementsChileanCraftMod.ModElement {
	public ProcedureMatapacosAtackRightClickedOnEntity7(ElementsChileanCraftMod instance) {
		super(instance, 516);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MatapacosAtackRightClickedOnEntity7!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MatapacosAtackRightClickedOnEntity7!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MatapacosAtackRightClickedOnEntity7!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MatapacosAtackRightClickedOnEntity7!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MatapacosAtackRightClickedOnEntity7!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		(entity).world.removeEntity(entity);
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMatapacos.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}