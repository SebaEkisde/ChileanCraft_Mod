package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.block.BlockParrak;
import net.mcreator.chilecraft.block.BlockP9;
import net.mcreator.chilecraft.block.BlockP8;
import net.mcreator.chilecraft.block.BlockP7;
import net.mcreator.chilecraft.block.BlockP6;
import net.mcreator.chilecraft.block.BlockP5;
import net.mcreator.chilecraft.block.BlockP3;
import net.mcreator.chilecraft.block.BlockP2;
import net.mcreator.chilecraft.block.BlockP1;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureSemilaparraUpdateTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureSemilaparraUpdateTick(ElementsChileanCraftMod instance) {
		super(instance, 402);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SemilaparraUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SemilaparraUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SemilaparraUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SemilaparraUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() > 0.5)) {
			if ((Math.random() > 0.5)) {
				if ((Math.random() > 0.5)) {
					if ((new Object() {
						public boolean blockEquals(IBlockState a, IBlockState b) {
							try {
								return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
							} catch (Exception e) {
								return (a.getBlock() == b.getBlock());
							}
						}
					}.blockEquals(BlockP8.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if ((world.isDaytime())) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockP9.block.getDefaultState(), 3);
							}
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
					}.blockEquals(BlockP7.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if ((world.isDaytime())) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockP8.block.getDefaultState(), 3);
							}
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
					}.blockEquals(BlockP6.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if ((world.isDaytime())) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockP7.block.getDefaultState(), 3);
							}
						}
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
				}.blockEquals(BlockP5.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
					if ((world.isDaytime())) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockP6.block.getDefaultState(), 3);
						}
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
				}.blockEquals(BlockP3.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
					if ((world.isDaytime())) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockP5.block.getDefaultState(), 3);
						}
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
				}.blockEquals(BlockP2.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
					if ((world.isDaytime())) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockP3.block.getDefaultState(), 3);
						}
					}
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
			}.blockEquals(BlockP1.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if ((world.isDaytime())) {
					if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockP2.block.getDefaultState(), 3);
					}
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
			}.blockEquals(BlockParrak.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if ((world.isDaytime())) {
					if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockP1.block.getDefaultState(), 3);
					}
				}
			}
		}
	}
}
