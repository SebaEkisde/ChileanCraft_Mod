package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.block.BlockTomate8;
import net.mcreator.chilecraft.block.BlockTomate7;
import net.mcreator.chilecraft.block.BlockTomate6;
import net.mcreator.chilecraft.block.BlockTomate5;
import net.mcreator.chilecraft.block.BlockTomate4;
import net.mcreator.chilecraft.block.BlockTomate3;
import net.mcreator.chilecraft.block.BlockTomate2;
import net.mcreator.chilecraft.block.BlockTomate1;
import net.mcreator.chilecraft.block.BlockTomate0;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureTomatep extends ElementsChileanCraftMod.ModElement {
	public ProcedureTomatep(ElementsChileanCraftMod instance) {
		super(instance, 302);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Tomatep!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Tomatep!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Tomatep!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Tomatep!");
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
						}.blockEquals(BlockTomate7.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTomate8.block.getDefaultState(), 3);
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
						}.blockEquals(BlockTomate6.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTomate7.block.getDefaultState(), 3);
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
						}.blockEquals(BlockTomate5.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTomate6.block.getDefaultState(), 3);
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
						}.blockEquals(BlockTomate4.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
							if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTomate5.block.getDefaultState(), 3);
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
					}.blockEquals(BlockTomate3.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTomate4.block.getDefaultState(), 3);
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
					}.blockEquals(BlockTomate2.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTomate3.block.getDefaultState(), 3);
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
					}.blockEquals(BlockTomate1.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTomate2.block.getDefaultState(), 3);
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
					}.blockEquals(BlockTomate0.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTomate1.block.getDefaultState(), 3);
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
		} else {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
