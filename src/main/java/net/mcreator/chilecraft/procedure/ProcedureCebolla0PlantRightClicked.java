package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
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
public class ProcedureCebolla0PlantRightClicked extends ElementsChileanCraftMod.ModElement {
	public ProcedureCebolla0PlantRightClicked(ElementsChileanCraftMod instance) {
		super(instance, 339);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Cebolla0PlantRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Cebolla0PlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Cebolla0PlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Cebolla0PlantRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Cebolla0PlantRightClicked!");
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCebolla6.block.getDefaultState()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla7.block.getDefaultState(), 3);
			}
			if ((new Object() {
				public boolean blockEquals(IBlockState a, IBlockState b) {
					try {
						return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
					} catch (Exception e) {
						return (a.getBlock() == b.getBlock());
					}
				}
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCebolla5.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla6.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCebolla4.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla5.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCebolla3.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla4.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCebolla2.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla3.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCebolla1.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla2.block.getDefaultState(), 3);
				} else {
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
			}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockCebolla0.block.getDefaultState()))) {
				if ((Math.random() > 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla1.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCebolla2.block.getDefaultState(), 3);
				}
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.DYE, (int) (1), 15).getItem(), 15, (int) 1, null);
		}
	}
}
