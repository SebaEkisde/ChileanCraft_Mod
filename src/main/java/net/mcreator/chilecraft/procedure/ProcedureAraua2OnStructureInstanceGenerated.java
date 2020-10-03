package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureAraua2OnStructureInstanceGenerated extends ElementsChileanCraftMod.ModElement {
	public ProcedureAraua2OnStructureInstanceGenerated(ElementsChileanCraftMod instance) {
		super(instance, 669);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Araua2OnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Araua2OnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Araua2OnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Araua2OnStructureInstanceGenerated!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) y, (int) z),
				world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock(), true);
		world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 1), (int) z),
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock(), true);
		world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - 1), (int) z),
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock(), true);
	}
}
