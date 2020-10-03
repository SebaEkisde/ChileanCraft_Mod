package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureAraucariaplantUpdateTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureAraucariaplantUpdateTick(ElementsChileanCraftMod instance) {
		super(instance, 443);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AraucariaplantUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AraucariaplantUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AraucariaplantUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AraucariaplantUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() >= 0.8)) {
			if ((Math.random() >= 0.8)) {
				if ((Math.random() >= 0.5)) {
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("world", world);
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						ProcedureArbol.executeProcedure($_dependencies);
					}
				}
			}
		}
	}
}
