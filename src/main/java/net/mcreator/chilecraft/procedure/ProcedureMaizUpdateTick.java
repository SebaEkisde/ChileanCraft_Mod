package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.block.BlockMaiz6;
import net.mcreator.chilecraft.block.BlockMaiz5;
import net.mcreator.chilecraft.block.BlockMaiz4;
import net.mcreator.chilecraft.block.BlockMaiz3;
import net.mcreator.chilecraft.block.BlockMaiz2;
import net.mcreator.chilecraft.block.BlockMaiz04;
import net.mcreator.chilecraft.block.BlockMaiz03;
import net.mcreator.chilecraft.block.BlockMaiz02;
import net.mcreator.chilecraft.block.BlockMaiz01;
import net.mcreator.chilecraft.block.BlockMaiz0;
import net.mcreator.chilecraft.block.BlockMaiz;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMaizUpdateTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureMaizUpdateTick(ElementsChileanCraftMod instance) {
		super(instance, 286);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MaizUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MaizUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MaizUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MaizUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() > 0.5)) {
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
						}.blockEquals(BlockMaiz5.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz6.block.getDefaultState(), 3);
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
						}.blockEquals(BlockMaiz4.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz5.block.getDefaultState(), 3);
							}
						}
					} else {
						if ((new Object() {
							public boolean blockEquals(IBlockState a, IBlockState b) {
								try {
									return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
								} catch (Exception e) {
									return (a.getBlock() == b.getBlock());
								}
							}
						}.blockEquals(BlockMaiz3.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz4.block.getDefaultState(), 3);
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
						}.blockEquals(BlockMaiz2.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz3.block.getDefaultState(), 3);
							}
						}
					}
				} else {
					if ((new Object() {
						public boolean blockEquals(IBlockState a, IBlockState b) {
							try {
								return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
							} catch (Exception e) {
								return (a.getBlock() == b.getBlock());
							}
						}
					}.blockEquals(BlockMaiz.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz2.block.getDefaultState(), 3);
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
					}.blockEquals(BlockMaiz04.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz.block.getDefaultState(), 3);
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
					}.blockEquals(BlockMaiz03.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz04.block.getDefaultState(), 3);
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
					}.blockEquals(BlockMaiz02.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz03.block.getDefaultState(), 3);
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
					}.blockEquals(BlockMaiz01.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz02.block.getDefaultState(), 3);
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
					}.blockEquals(BlockMaiz01.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz02.block.getDefaultState(), 3);
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
					}.blockEquals(BlockMaiz0.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz01.block.getDefaultState(), 3);
						}
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
	}
}
