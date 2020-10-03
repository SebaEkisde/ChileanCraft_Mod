package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.block.BlockCompos9;
import net.mcreator.chilecraft.block.BlockCompos8;
import net.mcreator.chilecraft.block.BlockCompos7;
import net.mcreator.chilecraft.block.BlockCompos6;
import net.mcreator.chilecraft.block.BlockCompos5;
import net.mcreator.chilecraft.block.BlockCompos3;
import net.mcreator.chilecraft.block.BlockCompos2;
import net.mcreator.chilecraft.block.BlockCompos10;
import net.mcreator.chilecraft.block.BlockCompos1;
import net.mcreator.chilecraft.block.BlockCompo4;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureLockss extends ElementsChileanCraftMod.ModElement {
	public ProcedureLockss(ElementsChileanCraftMod instance) {
		super(instance, 342);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Lockss!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Lockss!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Lockss!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Lockss!");
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
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCompos9.block.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCompos10.block.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCompos8.block.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCompos9.block.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCompos7.block.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCompos8.block.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCompos6.block.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCompos7.block.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCompos5.block.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCompos6.block.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCompo4.block.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCompos5.block.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCompos3.block.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCompo4.block.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCompos2.block.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCompos3.block.getDefaultState(), 3);
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCompos1.block.getDefaultState()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCompos2.block.getDefaultState(), 3);
		}
	}
}
