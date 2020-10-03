package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.item.ItemMaizsemilla;
import net.mcreator.chilecraft.item.ItemMaizfruit;
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
public class ProcedureMaiz3PlantRightClicked extends ElementsChileanCraftMod.ModElement {
	public ProcedureMaiz3PlantRightClicked(ElementsChileanCraftMod instance) {
		super(instance, 305);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Maiz3PlantRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Maiz3PlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Maiz3PlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Maiz3PlantRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Maiz3PlantRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.DYE, (int) (1), 15).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.DYE, (int) (1), 15).getMetadata())) {
			if ((new Object() {
				public boolean blockEquals(IBlockState a, IBlockState b) {
					try {
						return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
					} catch (Exception e) {
						return (a.getBlock() == b.getBlock());
					}
				}
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz5.block.getDefaultState()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz6.block.getDefaultState(), 3);
			}
			if ((new Object() {
				public boolean blockEquals(IBlockState a, IBlockState b) {
					try {
						return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
					} catch (Exception e) {
						return (a.getBlock() == b.getBlock());
					}
				}
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz4.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz6.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz5.block.getDefaultState(), 3);
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz3.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz5.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz2.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz4.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz3.block.getDefaultState(), 3);
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz2.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz3.block.getDefaultState(), 3);
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz04.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz2.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz03.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz04.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz02.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz03.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz01.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz02.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz0.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz01.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz02.block.getDefaultState(), 3);
				}
			}
		}
		if ((!((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.DYE, (int) (1), 15).getItem(), 15, (int) 1, null);
		}
		if ((!(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.DYE, (int) (1), 15).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.DYE, (int) (1), 15).getMetadata()))) {
			if ((new Object() {
				public boolean blockEquals(IBlockState a, IBlockState b) {
					try {
						return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
					} catch (Exception e) {
						return (a.getBlock() == b.getBlock());
					}
				}
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz3.block.getDefaultState()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz.block.getDefaultState(), 3);
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizfruit.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizsemilla.block, (int) (1)));
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz4.block.getDefaultState()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz.block.getDefaultState(), 3);
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizfruit.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizfruit.block, (int) (1)));
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz5.block.getDefaultState()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz.block.getDefaultState(), 3);
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizfruit.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizfruit.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizsemilla.block, (int) (1)));
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockMaiz6.block.getDefaultState()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockMaiz.block.getDefaultState(), 3);
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizfruit.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizfruit.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizfruit.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
