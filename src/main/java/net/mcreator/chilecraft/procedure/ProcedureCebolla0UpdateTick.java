package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.block.BlockCebolla7;
import net.mcreator.chilecraft.block.BlockCebolla6;
import net.mcreator.chilecraft.block.BlockCebolla5;
import net.mcreator.chilecraft.block.BlockCebolla4;
import net.mcreator.chilecraft.block.BlockCebolla3;
import net.mcreator.chilecraft.block.BlockCebolla2;
import net.mcreator.chilecraft.block.BlockCebolla1;
import net.mcreator.chilecraft.block.BlockCebolla0;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureCebolla0UpdateTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureCebolla0UpdateTick(ElementsChileanCraftMod instance) {
		super(instance, 313);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Cebolla0UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Cebolla0UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Cebolla0UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Cebolla0UpdateTick!");
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
					}.blockEquals(BlockCebolla6.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla7.block.getDefaultState(), 3);
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
					}.blockEquals(BlockCebolla5.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla6.block.getDefaultState(), 3);
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
					}.blockEquals(BlockCebolla4.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla5.block.getDefaultState(), 3);
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
					}.blockEquals(BlockCebolla3.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla4.block.getDefaultState(), 3);
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
					}.blockEquals(BlockCebolla2.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla3.block.getDefaultState(), 3);
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
					}.blockEquals(BlockCebolla1.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla2.block.getDefaultState(), 3);
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
					}.blockEquals(BlockCebolla0.block.getDefaultState(), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))))) {
						if (((world.getLightFromNeighbors(new BlockPos((int) x, (int) y, (int) z))) >= 10)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla1.block.getDefaultState(), 3);
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
