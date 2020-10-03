package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMolotovdBulletHitsBlock extends ElementsChileanCraftMod.ModElement {
	public ProcedureMolotovdBulletHitsBlock(ElementsChileanCraftMod instance) {
		super(instance, 422);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MolotovdBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MolotovdBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MolotovdBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MolotovdBulletHitsBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), Blocks.AIR.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))), Blocks.AIR.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))), Blocks.AIR.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))), Blocks.AIR.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.FIRE.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))), Blocks.AIR.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.FIRE.getDefaultState(), 3);
		}
	}
}
