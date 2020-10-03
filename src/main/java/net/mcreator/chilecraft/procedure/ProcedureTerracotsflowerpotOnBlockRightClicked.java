package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;

import net.mcreator.chilecraft.block.BlockTerracotsflowerpot;
import net.mcreator.chilecraft.block.BlockTerracotaflowerpotcopihue;
import net.mcreator.chilecraft.block.BlockCopihue;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureTerracotsflowerpotOnBlockRightClicked extends ElementsChileanCraftMod.ModElement {
	public ProcedureTerracotsflowerpotOnBlockRightClicked(ElementsChileanCraftMod instance) {
		super(instance, 481);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TerracotsflowerpotOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TerracotsflowerpotOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TerracotsflowerpotOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TerracotsflowerpotOnBlockRightClicked!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockTerracotaflowerpotcopihue.block.getDefaultState()
				.getBlock())) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(BlockCopihue.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTerracotsflowerpot.block.getDefaultState(), 3);
		}
	}
}
