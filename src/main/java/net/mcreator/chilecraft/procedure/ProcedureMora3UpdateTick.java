package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.block.BlockMora6;
import net.mcreator.chilecraft.block.BlockMora5;
import net.mcreator.chilecraft.block.BlockMora4;
import net.mcreator.chilecraft.block.BlockMora3;
import net.mcreator.chilecraft.block.BlockMora2;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMora3UpdateTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureMora3UpdateTick(ElementsChileanCraftMod instance) {
		super(instance, 385);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Mora3UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Mora3UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Mora3UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Mora3UpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() > 0.5)) {
			if ((new Object() {
				public boolean blockEquals(IBlockState a, IBlockState b) {
					try {
						return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
					} catch (Exception e) {
						return (a.getBlock() == b.getBlock());
					}
				}
			}.blockEquals(BlockMora3.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMora2.block.getDefaultState(), 3);
				}
			}
			if ((new Object() {
				public boolean blockEquals(IBlockState a, IBlockState b) {
					try {
						return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
					} catch (Exception e) {
						return (a.getBlock() == b.getBlock());
					}
				}
			}.blockEquals(BlockMora4.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMora3.block.getDefaultState(), 3);
				}
			}
			if ((new Object() {
				public boolean blockEquals(IBlockState a, IBlockState b) {
					try {
						return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
					} catch (Exception e) {
						return (a.getBlock() == b.getBlock());
					}
				}
			}.blockEquals(BlockMora5.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMora4.block.getDefaultState(), 3);
				}
			}
			if ((new Object() {
				public boolean blockEquals(IBlockState a, IBlockState b) {
					try {
						return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
					} catch (Exception e) {
						return (a.getBlock() == b.getBlock());
					}
				}
			}.blockEquals(BlockMora6.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMora5.block.getDefaultState(), 3);
				}
			}
		}
	}
}
