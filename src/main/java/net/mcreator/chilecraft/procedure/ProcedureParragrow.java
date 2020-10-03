package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.block.BlockParra9;
import net.mcreator.chilecraft.block.BlockParra8;
import net.mcreator.chilecraft.block.BlockParra7;
import net.mcreator.chilecraft.block.BlockParra6;
import net.mcreator.chilecraft.block.BlockParra5;
import net.mcreator.chilecraft.block.BlockParra4;
import net.mcreator.chilecraft.block.BlockParra3;
import net.mcreator.chilecraft.block.BlockParra2;
import net.mcreator.chilecraft.block.BlockParra1;
import net.mcreator.chilecraft.block.BlockParra;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureParragrow extends ElementsChileanCraftMod.ModElement {
	public ProcedureParragrow(ElementsChileanCraftMod instance) {
		super(instance, 335);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Parragrow!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Parragrow!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Parragrow!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Parragrow!");
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
					}.blockEquals(BlockParra8.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockParra9.block.getDefaultState(), 3);
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
					}.blockEquals(BlockParra7.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockParra8.block.getDefaultState(), 3);
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
					}.blockEquals(BlockParra6.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockParra7.block.getDefaultState(), 3);
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
					}.blockEquals(BlockParra5.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockParra6.block.getDefaultState(), 3);
						}
					}
				} else {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
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
			}.blockEquals(BlockParra4.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockParra5.block.getDefaultState(), 3);
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
			}.blockEquals(BlockParra3.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockParra4.block.getDefaultState(), 3);
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
			}.blockEquals(BlockParra2.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockParra3.block.getDefaultState(), 3);
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
			}.blockEquals(BlockParra1.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockParra2.block.getDefaultState(), 3);
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
			}.blockEquals(BlockParra.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
				if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockParra1.block.getDefaultState(), 3);
				}
			}
		} else {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
