package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;

import net.mcreator.chilecraft.item.ItemUvaroja;
import net.mcreator.chilecraft.block.BlockP7;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureP9PlantRightClickedw extends ElementsChileanCraftMod.ModElement {
	public ProcedureP9PlantRightClickedw(ElementsChileanCraftMod instance) {
		super(instance, 412);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure P9PlantRightClickedw!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure P9PlantRightClickedw!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure P9PlantRightClickedw!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure P9PlantRightClickedw!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockP7.block.getDefaultState(), 3);
		if (!world.isRemote) {
			EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemUvaroja.block, (int) (1)));
			entityToSpawn.setPickupDelay(10);
			world.spawnEntity(entityToSpawn);
		}
	}
}
