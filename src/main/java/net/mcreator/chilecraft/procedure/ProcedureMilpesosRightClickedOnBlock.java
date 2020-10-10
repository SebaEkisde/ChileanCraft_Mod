package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.IProperty;

import net.mcreator.chilecraft.item.ItemMilpesos;
import net.mcreator.chilecraft.block.BlockAdminblock;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMilpesosRightClickedOnBlock extends ElementsChileanCraftMod.ModElement {
	public ProcedureMilpesosRightClickedOnBlock(ElementsChileanCraftMod instance) {
		super(instance, 808);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MilpesosRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MilpesosRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MilpesosRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MilpesosRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MilpesosRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockAdminblock.block.getDefaultState().getBlock())) {
			try {
				IBlockState _state = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z));
				for (IProperty<?> property : _state.getProperties().keySet()) {
					if (property.getName().equals("powered")) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), _state.withProperty((PropertyBool) property, (true)), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			try {
				IBlockState _state = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)));
				for (IProperty<?> property : _state.getProperties().keySet()) {
					if (property.getName().equals("powered")) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), _state.withProperty((PropertyBool) property, (true)),
								3);
						break;
					}
				}
			} catch (Exception e) {
			}
			try {
				IBlockState _state = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z));
				for (IProperty<?> property : _state.getProperties().keySet()) {
					if (property.getName().equals("powered")) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), _state.withProperty((PropertyBool) property, (true)), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			try {
				IBlockState _state = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)));
				for (IProperty<?> property : _state.getProperties().keySet()) {
					if (property.getName().equals("powered")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), _state.withProperty((PropertyBool) property, (true)), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			try {
				IBlockState _state = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)));
				for (IProperty<?> property : _state.getProperties().keySet()) {
					if (property.getName().equals("powered")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), _state.withProperty((PropertyBool) property, (true)), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			try {
				IBlockState _state = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)));
				for (IProperty<?> property : _state.getProperties().keySet()) {
					if (property.getName().equals("powered")) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), _state.withProperty((PropertyBool) property, (true)),
								3);
						break;
					}
				}
			} catch (Exception e) {
			}
			try {
				IBlockState _state = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)));
				for (IProperty<?> property : _state.getProperties().keySet()) {
					if (property.getName().equals("powered")) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), _state.withProperty((PropertyBool) property, (true)),
								3);
						break;
					}
				}
			} catch (Exception e) {
			}
			try {
				IBlockState _state = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)));
				for (IProperty<?> property : _state.getProperties().keySet()) {
					if (property.getName().equals("powered")) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), _state.withProperty((PropertyBool) property, (true)),
								3);
						break;
					}
				}
			} catch (Exception e) {
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemMilpesos.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
	}
}
