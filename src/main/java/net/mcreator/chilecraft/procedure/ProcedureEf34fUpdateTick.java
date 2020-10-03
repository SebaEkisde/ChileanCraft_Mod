package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureEf34fUpdateTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureEf34fUpdateTick(ElementsChileanCraftMod instance) {
		super(instance, 352);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Ef34fUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Ef34fUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Ef34fUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Ef34fUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() > 0.5)) {
			if ((Math.random() > 0.5)) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getStateFromMeta(2), 3);
				} else {
					if ((Math.random() > 0.5)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getStateFromMeta(2), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
					}
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.GRASS.getDefaultState(), 3);
			}
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.GRASS.getDefaultState(), 3);
		}
	}
}
