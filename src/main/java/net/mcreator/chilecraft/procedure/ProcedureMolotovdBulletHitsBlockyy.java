package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMolotovdBulletHitsBlockyy extends ElementsChileanCraftMod.ModElement {
	public ProcedureMolotovdBulletHitsBlockyy(ElementsChileanCraftMod instance) {
		super(instance, 423);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MolotovdBulletHitsBlockyy!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MolotovdBulletHitsBlockyy!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MolotovdBulletHitsBlockyy!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MolotovdBulletHitsBlockyy!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", (y + 1));
			$_dependencies.put("z", z);
			ProcedureMolotovdBulletHitsBlock.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			ProcedureMolotovdBulletHitsBlock.executeProcedure($_dependencies);
		}
	}
}
