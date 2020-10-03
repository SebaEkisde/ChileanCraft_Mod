package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureJjlOnBlockRightClickedm extends ElementsChileanCraftMod.ModElement {
	public ProcedureJjlOnBlockRightClickedm(ElementsChileanCraftMod instance) {
		super(instance, 351);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure JjlOnBlockRightClickedm!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure JjlOnBlockRightClickedm!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure JjlOnBlockRightClickedm!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure JjlOnBlockRightClickedm!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (x + 3));
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			ProcedureJjlOnBlockRightClicked.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (x - 3));
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			ProcedureJjlOnBlockRightClicked.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", (z - 3));
			ProcedureJjlOnBlockRightClicked.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", (z + 3));
			ProcedureJjlOnBlockRightClicked.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (x + 3));
			$_dependencies.put("y", y);
			$_dependencies.put("z", (z + 3));
			ProcedureJjlOnBlockRightClicked.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (x - 3));
			$_dependencies.put("y", y);
			$_dependencies.put("z", (z + 3));
			ProcedureJjlOnBlockRightClicked.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (x - 3));
			$_dependencies.put("y", y);
			$_dependencies.put("z", (z - 3));
			ProcedureJjlOnBlockRightClicked.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (x + 3));
			$_dependencies.put("y", y);
			$_dependencies.put("z", (z - 3));
			ProcedureJjlOnBlockRightClicked.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			ProcedureJjlOnBlockRightClicked.executeProcedure($_dependencies);
		}
	}
}
