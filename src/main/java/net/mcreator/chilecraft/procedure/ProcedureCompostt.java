package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.item.ItemUvaroja;
import net.mcreator.chilecraft.item.ItemUvaa;
import net.mcreator.chilecraft.item.ItemTomatelimachino;
import net.mcreator.chilecraft.item.ItemSemillauva;
import net.mcreator.chilecraft.item.ItemSemillatomate;
import net.mcreator.chilecraft.item.ItemSemilaparra;
import net.mcreator.chilecraft.item.ItemSeedscebolla;
import net.mcreator.chilecraft.item.ItemPinon;
import net.mcreator.chilecraft.item.ItemMorita;
import net.mcreator.chilecraft.item.ItemMaizsemilla;
import net.mcreator.chilecraft.item.ItemMaizfruit;
import net.mcreator.chilecraft.item.ItemCebollafruit;
import net.mcreator.chilecraft.block.BlockRuda;
import net.mcreator.chilecraft.block.BlockLeavesaraucary;
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
import net.mcreator.chilecraft.block.BlockCebolla;
import net.mcreator.chilecraft.block.BlockBailahuen;
import net.mcreator.chilecraft.block.BlockAnanuca;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureCompostt extends ElementsChileanCraftMod.ModElement {
	public ProcedureCompostt(ElementsChileanCraftMod instance) {
		super(instance, 343);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Compostt!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Compostt!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Compostt!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Compostt!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Compostt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 0).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 0).getMetadata())
				|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 1).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 1).getMetadata())
						|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 2).getItem()
								&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 2).getMetadata())
								|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 3).getItem()
										&& ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 3).getMetadata())
										|| ((((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 4).getItem()
												&& ((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 4).getMetadata())
												|| (((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 5).getItem()
														&& ((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 5)
																		.getMetadata()))))))) {
			if ((Math.random() > 0.8)) {
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
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 1).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 1).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.SAPLING, (int) (1), 1).getItem(), 1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 2).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 2).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.SAPLING, (int) (1), 2).getItem(), 2, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 3).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 3).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.SAPLING, (int) (1), 3).getItem(), 3, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 4).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 4).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.SAPLING, (int) (1), 4).getItem(), 4, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 5).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 5).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.SAPLING, (int) (1), 5).getItem(), 5, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.SAPLING, (int) (1), 0).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.SAPLING, (int) (1), 0).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.SAPLING, (int) (1), 0).getItem(), 0, (int) 1, null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.LEAVES, (int) (1), 0).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Blocks.LEAVES, (int) (1), 0).getMetadata())
				|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Blocks.LEAVES, (int) (1), 1).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(Blocks.LEAVES, (int) (1), 1).getMetadata())
						|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Blocks.LEAVES, (int) (1), 2).getItem()
								&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getMetadata() == new ItemStack(Blocks.LEAVES, (int) (1), 2).getMetadata())
								|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(Blocks.LEAVES, (int) (1), 3).getItem()
										&& ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.LEAVES, (int) (1), 3).getMetadata())
										|| ((((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.LEAVES2, (int) (1), 0).getItem()
												&& ((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.LEAVES2, (int) (1), 0).getMetadata())
												|| ((((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.LEAVES2, (int) (1), 1).getItem()
														&& ((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)
																		.getMetadata() == new ItemStack(Blocks.LEAVES2, (int) (1), 1).getMetadata())
														|| (((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)
																		.getItem() == new ItemStack(BlockLeavesaraucary.block, (int) (1)).getItem()
																&& ((entity instanceof EntityLivingBase)
																		? ((EntityLivingBase) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)
																				.getMetadata() == new ItemStack(BlockLeavesaraucary.block, (int) (1))
																						.getMetadata())))))))) {
			if ((Math.random() > 0.7)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureLockss.executeProcedure($_dependencies);
				}
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.LEAVES, (int) (1), 0).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.LEAVES, (int) (1), 0).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.LEAVES, (int) (1), 0).getItem(), 0, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.LEAVES, (int) (1), 1).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.LEAVES, (int) (1), 1).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.LEAVES, (int) (1), 1).getItem(), 1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.LEAVES, (int) (1), 2).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.LEAVES, (int) (1), 2).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.LEAVES, (int) (1), 2).getItem(), 2, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.LEAVES, (int) (1), 3).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.LEAVES, (int) (1), 3).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.LEAVES, (int) (1), 3).getItem(), 3, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.LEAVES2, (int) (1), 0).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.LEAVES2, (int) (1), 0).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.LEAVES2, (int) (1), 0).getItem(), 0, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.LEAVES2, (int) (1), 1).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.LEAVES2, (int) (1), 1).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.LEAVES2, (int) (1), 1).getItem(), 1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(BlockLeavesaraucary.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(BlockLeavesaraucary.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(BlockLeavesaraucary.block, (int) (1)).getItem(), -1, (int) 1,
							null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.DEADBUSH, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Blocks.DEADBUSH, (int) (1)).getMetadata())
				|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Blocks.TALLGRASS, (int) (1), 0).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(Blocks.TALLGRASS, (int) (1), 0).getMetadata())
						|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Blocks.TALLGRASS, (int) (1), 1).getItem()
								&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getMetadata() == new ItemStack(Blocks.TALLGRASS, (int) (1), 1).getMetadata())
								|| (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(Blocks.TALLGRASS, (int) (1), 2).getItem()
										&& ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.TALLGRASS, (int) (1), 2).getMetadata()))))) {
			if ((Math.random() > 0.8)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureLockss.executeProcedure($_dependencies);
				}
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.DEADBUSH, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.DEADBUSH, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.DEADBUSH, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.TALLGRASS, (int) (1), 0).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.TALLGRASS, (int) (1), 0).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.TALLGRASS, (int) (1), 0).getItem(), 0, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.TALLGRASS, (int) (1), 1).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.TALLGRASS, (int) (1), 1).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.TALLGRASS, (int) (1), 1).getItem(), 1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.TALLGRASS, (int) (1), 2).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.TALLGRASS, (int) (1), 2).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.TALLGRASS, (int) (1), 2).getItem(), 2, (int) 1, null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.YELLOW_FLOWER, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Blocks.YELLOW_FLOWER, (int) (1)).getMetadata())
				|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 0).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 0).getMetadata())
						|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 1).getItem()
								&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 1).getMetadata())
								|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 2).getItem()
										&& ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 2).getMetadata())
										|| ((((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 3).getItem()
												&& ((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY)
																.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 3).getMetadata())
												|| ((((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 4).getItem()
														&& ((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 4)
																		.getMetadata())
														|| ((((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)
																		.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 5).getItem()
																&& ((entity instanceof EntityLivingBase)
																		? ((EntityLivingBase) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)
																				.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 5)
																						.getMetadata())
																|| ((((entity instanceof EntityLivingBase)
																		? ((EntityLivingBase) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)
																				.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 6).getItem()
																		&& ((entity instanceof EntityLivingBase)
																				? ((EntityLivingBase) entity).getHeldItemMainhand()
																				: ItemStack.EMPTY)
																						.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1),
																								6).getMetadata())
																		|| ((((entity instanceof EntityLivingBase)
																				? ((EntityLivingBase) entity).getHeldItemMainhand()
																				: ItemStack.EMPTY)
																						.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 7)
																								.getItem()
																				&& ((entity instanceof EntityLivingBase)
																						? ((EntityLivingBase) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY)
																								.getMetadata() == new ItemStack(Blocks.RED_FLOWER,
																										(int) (1), 7).getMetadata())
																				|| ((((entity instanceof EntityLivingBase)
																						? ((EntityLivingBase) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY)
																								.getItem() == new ItemStack(BlockAnanuca.block,
																										(int) (1)).getItem()
																						&& ((entity instanceof EntityLivingBase)
																								? ((EntityLivingBase) entity).getHeldItemMainhand()
																								: ItemStack.EMPTY)
																										.getMetadata() == new ItemStack(
																												BlockAnanuca.block, (int) (1))
																														.getMetadata())
																						|| ((((entity instanceof EntityLivingBase)
																								? ((EntityLivingBase) entity).getHeldItemMainhand()
																								: ItemStack.EMPTY)
																										.getItem() == new ItemStack(
																												BlockCebolla.block, (int) (1))
																														.getItem()
																								&& ((entity instanceof EntityLivingBase)
																										? ((EntityLivingBase) entity)
																												.getHeldItemMainhand()
																										: ItemStack.EMPTY)
																												.getMetadata() == new ItemStack(
																														BlockCebolla.block, (int) (1))
																																.getMetadata())
																								|| ((((entity instanceof EntityLivingBase)
																										? ((EntityLivingBase) entity)
																												.getHeldItemMainhand()
																										: ItemStack.EMPTY).getItem() == new ItemStack(
																												BlockBailahuen.block, (int) (1))
																														.getItem()
																										&& ((entity instanceof EntityLivingBase)
																												? ((EntityLivingBase) entity)
																														.getHeldItemMainhand()
																												: ItemStack.EMPTY)
																														.getMetadata() == new ItemStack(
																																BlockBailahuen.block,
																																(int) (1))
																																		.getMetadata())
																										|| ((((entity instanceof EntityLivingBase)
																												? ((EntityLivingBase) entity)
																														.getHeldItemMainhand()
																												: ItemStack.EMPTY)
																														.getItem() == new ItemStack(
																																BlockRuda.block,
																																(int) (1)).getItem()
																												&& ((entity instanceof EntityLivingBase)
																														? ((EntityLivingBase) entity)
																																.getHeldItemMainhand()
																														: ItemStack.EMPTY)
																																.getMetadata() == new ItemStack(
																																		BlockRuda.block,
																																		(int) (1))
																																				.getMetadata())
																												|| (((entity instanceof EntityLivingBase)
																														? ((EntityLivingBase) entity)
																																.getHeldItemMainhand()
																														: ItemStack.EMPTY)
																																.getItem() == new ItemStack(
																																		Blocks.RED_FLOWER,
																																		(int) (1), 8)
																																				.getItem()
																														&& ((entity instanceof EntityLivingBase)
																																? ((EntityLivingBase) entity)
																																		.getHeldItemMainhand()
																																: ItemStack.EMPTY)
																																		.getMetadata() == new ItemStack(
																																				Blocks.RED_FLOWER,
																																				(int) (1),
																																				8).getMetadata()))))))))))))))) {
			if ((Math.random() > 0.9)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureLockss.executeProcedure($_dependencies);
				}
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.YELLOW_FLOWER, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.YELLOW_FLOWER, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.YELLOW_FLOWER, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 0).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 0).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_FLOWER, (int) (1), 0).getItem(), 0, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(BlockRuda.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(BlockRuda.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(BlockRuda.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 1).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 1).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_FLOWER, (int) (1), 1).getItem(), 1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 2).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 2).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_FLOWER, (int) (1), 2).getItem(), 2, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 3).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 3).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_FLOWER, (int) (1), 3).getItem(), 3, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 4).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 4).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_FLOWER, (int) (1), 4).getItem(), 4, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 5).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 5).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_FLOWER, (int) (1), 5).getItem(), 5, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 6).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 6).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_FLOWER, (int) (1), 6).getItem(), 6, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 7).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 7).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_FLOWER, (int) (1), 7).getItem(), 7, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 8).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_FLOWER, (int) (1), 8).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_FLOWER, (int) (1), 8).getItem(), 8, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(BlockBailahuen.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(BlockBailahuen.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(BlockBailahuen.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(BlockCebolla.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(BlockCebolla.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(BlockCebolla.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(BlockAnanuca.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(BlockAnanuca.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(BlockAnanuca.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 0).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 0).getMetadata())
				|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 1).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 1).getMetadata())
						|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 2).getItem()
								&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 2).getMetadata())
								|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 3).getItem()
										&& ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 3).getMetadata())
										|| ((((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 4).getItem()
												&& ((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY)
																.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 4).getMetadata())
												|| (((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 5).getItem()
														&& ((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY).getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 5)
																		.getMetadata()))))))) {
			if ((Math.random() > 0.6)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureLockss.executeProcedure($_dependencies);
				}
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 0).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 0).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 0).getItem(), 0, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 1).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 1).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 1).getItem(), 1, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 2).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 2).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 2).getItem(), 2, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 3).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 3).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 3).getItem(), 3, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 4).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 4).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 4).getItem(), 4, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 5).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 5).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.DOUBLE_PLANT, (int) (1), 5).getItem(), 5, (int) 1,
							null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.BROWN_MUSHROOM, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Blocks.BROWN_MUSHROOM, (int) (1)).getMetadata())
				|| (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Blocks.RED_MUSHROOM, (int) (1)).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(Blocks.RED_MUSHROOM, (int) (1)).getMetadata()))) {
			if ((Math.random() > 0.8)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureLockss.executeProcedure($_dependencies);
				}
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.BROWN_MUSHROOM, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.BROWN_MUSHROOM, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.BROWN_MUSHROOM, (int) (1)).getItem(), -1, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.RED_MUSHROOM, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.RED_MUSHROOM, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.RED_MUSHROOM, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.APPLE, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.APPLE, (int) (1)).getMetadata())
				|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.WHEAT, (int) (1)).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(Items.WHEAT, (int) (1)).getMetadata())
						|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Items.CARROT, (int) (1)).getItem()
								&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getMetadata() == new ItemStack(Items.CARROT, (int) (1)).getMetadata())
								|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(Items.POTATO, (int) (1)).getItem()
										&& ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getMetadata() == new ItemStack(Items.POTATO, (int) (1)).getMetadata())
										|| ((((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem() == new ItemStack(Items.POISONOUS_POTATO, (int) (1)).getItem()
												&& ((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY)
																.getMetadata() == new ItemStack(Items.POISONOUS_POTATO, (int) (1)).getMetadata())
												|| ((((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getItem() == new ItemStack(Items.BREAD, (int) (1)).getItem()
														&& ((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)
																		.getMetadata() == new ItemStack(Items.BREAD, (int) (1)).getMetadata())
														|| ((((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY).getItem() == new ItemStack(Items.REEDS, (int) (1)).getItem()
																&& ((entity instanceof EntityLivingBase)
																		? ((EntityLivingBase) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)
																				.getMetadata() == new ItemStack(Items.REEDS, (int) (1)).getMetadata())
																|| ((((entity instanceof EntityLivingBase)
																		? ((EntityLivingBase) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY).getItem() == new ItemStack(Items.EGG, (int) (1)).getItem()
																		&& ((entity instanceof EntityLivingBase)
																				? ((EntityLivingBase) entity).getHeldItemMainhand()
																				: ItemStack.EMPTY)
																						.getMetadata() == new ItemStack(Items.EGG, (int) (1))
																								.getMetadata())
																		|| ((((entity instanceof EntityLivingBase)
																				? ((EntityLivingBase) entity).getHeldItemMainhand()
																				: ItemStack.EMPTY)
																						.getItem() == new ItemStack(Items.MELON, (int) (1)).getItem()
																				&& ((entity instanceof EntityLivingBase)
																						? ((EntityLivingBase) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY)
																								.getMetadata() == new ItemStack(Items.MELON,
																										(int) (1)).getMetadata())
																				|| ((((entity instanceof EntityLivingBase)
																						? ((EntityLivingBase) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY)
																								.getItem() == new ItemStack(ItemTomatelimachino.block,
																										(int) (1)).getItem()
																						&& ((entity instanceof EntityLivingBase)
																								? ((EntityLivingBase) entity).getHeldItemMainhand()
																								: ItemStack.EMPTY)
																										.getMetadata() == new ItemStack(
																												ItemTomatelimachino.block, (int) (1))
																														.getMetadata())
																						|| ((((entity instanceof EntityLivingBase)
																								? ((EntityLivingBase) entity).getHeldItemMainhand()
																								: ItemStack.EMPTY)
																										.getItem() == new ItemStack(
																												ItemMaizfruit.block, (int) (1))
																														.getItem()
																								&& ((entity instanceof EntityLivingBase)
																										? ((EntityLivingBase) entity)
																												.getHeldItemMainhand()
																										: ItemStack.EMPTY)
																												.getMetadata() == new ItemStack(
																														ItemMaizfruit.block,
																														(int) (1)).getMetadata())
																								|| ((((entity instanceof EntityLivingBase)
																										? ((EntityLivingBase) entity)
																												.getHeldItemMainhand()
																										: ItemStack.EMPTY).getItem() == new ItemStack(
																												ItemSeedscebolla.block, (int) (1))
																														.getItem()
																										&& ((entity instanceof EntityLivingBase)
																												? ((EntityLivingBase) entity)
																														.getHeldItemMainhand()
																												: ItemStack.EMPTY)
																														.getMetadata() == new ItemStack(
																																ItemSeedscebolla.block,
																																(int) (1))
																																		.getMetadata())
																										|| ((((entity instanceof EntityLivingBase)
																												? ((EntityLivingBase) entity)
																														.getHeldItemMainhand()
																												: ItemStack.EMPTY)
																														.getItem() == new ItemStack(
																																ItemUvaa.block,
																																(int) (1)).getItem()
																												&& ((entity instanceof EntityLivingBase)
																														? ((EntityLivingBase) entity)
																																.getHeldItemMainhand()
																														: ItemStack.EMPTY)
																																.getMetadata() == new ItemStack(
																																		ItemUvaa.block,
																																		(int) (1))
																																				.getMetadata())
																												|| ((((entity instanceof EntityLivingBase)
																														? ((EntityLivingBase) entity)
																																.getHeldItemMainhand()
																														: ItemStack.EMPTY)
																																.getItem() == new ItemStack(
																																		ItemMorita.block,
																																		(int) (1))
																																				.getItem()
																														&& ((entity instanceof EntityLivingBase)
																																? ((EntityLivingBase) entity)
																																		.getHeldItemMainhand()
																																: ItemStack.EMPTY)
																																		.getMetadata() == new ItemStack(
																																				ItemMorita.block,
																																				(int) (1))
																																						.getMetadata())
																														|| ((((entity instanceof EntityLivingBase)
																																? ((EntityLivingBase) entity)
																																		.getHeldItemMainhand()
																																: ItemStack.EMPTY)
																																		.getItem() == new ItemStack(
																																				ItemUvaroja.block,
																																				(int) (1))
																																						.getItem()
																																&& ((entity instanceof EntityLivingBase)
																																		? ((EntityLivingBase) entity)
																																				.getHeldItemMainhand()
																																		: ItemStack.EMPTY)
																																				.getMetadata() == new ItemStack(
																																						ItemUvaroja.block,
																																						(int) (1))
																																								.getMetadata())
																																|| (((entity instanceof EntityLivingBase)
																																		? ((EntityLivingBase) entity)
																																				.getHeldItemMainhand()
																																		: ItemStack.EMPTY)
																																				.getItem() == new ItemStack(
																																						Items.BEETROOT,
																																						(int) (1))
																																								.getItem()
																																		&& ((entity instanceof EntityLivingBase)
																																				? ((EntityLivingBase) entity)
																																						.getHeldItemMainhand()
																																				: ItemStack.EMPTY)
																																						.getMetadata() == new ItemStack(
																																								Items.BEETROOT,
																																								(int) (1))
																																										.getMetadata()))))))))))))))))) {
			if ((Math.random() > 0.5)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureLockss.executeProcedure($_dependencies);
				}
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.APPLE, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.APPLE, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.APPLE, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.WHEAT, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.WHEAT, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.WHEAT, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.CARROT, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.CARROT, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.CARROT, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.POTATO, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.POTATO, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.POTATO, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.POISONOUS_POTATO, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.POISONOUS_POTATO, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.POISONOUS_POTATO, (int) (1)).getItem(), -1, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.BREAD, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.BREAD, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.BREAD, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.REEDS, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.REEDS, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.REEDS, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.EGG, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.EGG, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.EGG, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.MELON, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.MELON, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.MELON, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.BEETROOT, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.BEETROOT, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.BEETROOT, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemMorita.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemMorita.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemMorita.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemMaizfruit.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemMaizfruit.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemMaizfruit.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemUvaa.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemUvaa.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemUvaa.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemSeedscebolla.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemSeedscebolla.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemSeedscebolla.block, (int) (1)).getItem(), -1, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemTomatelimachino.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemTomatelimachino.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemTomatelimachino.block, (int) (1)).getItem(), -1, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemUvaroja.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemUvaroja.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemUvaroja.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.WHEAT_SEEDS, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.WHEAT_SEEDS, (int) (1)).getMetadata())
				|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.PUMPKIN_SEEDS, (int) (1)).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(Items.PUMPKIN_SEEDS, (int) (1)).getMetadata())
						|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Items.MELON_SEEDS, (int) (1)).getItem()
								&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getMetadata() == new ItemStack(Items.MELON_SEEDS, (int) (1)).getMetadata())
								|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(Items.BEETROOT_SEEDS, (int) (1)).getItem()
										&& ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getMetadata() == new ItemStack(Items.BEETROOT_SEEDS, (int) (1)).getMetadata())
										|| ((((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem() == new ItemStack(ItemPinon.block, (int) (1)).getItem()
												&& ((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getMetadata() == new ItemStack(ItemPinon.block, (int) (1)).getMetadata())
												|| ((((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getItem() == new ItemStack(ItemMaizsemilla.block, (int) (1)).getItem()
														&& ((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY).getMetadata() == new ItemStack(ItemMaizsemilla.block, (int) (1))
																		.getMetadata())
														|| ((((entity instanceof EntityLivingBase)
																? ((EntityLivingBase) entity).getHeldItemMainhand()
																: ItemStack.EMPTY)
																		.getItem() == new ItemStack(ItemSemillatomate.block, (int) (1)).getItem()
																&& ((entity instanceof EntityLivingBase)
																		? ((EntityLivingBase) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)
																				.getMetadata() == new ItemStack(ItemSemillatomate.block, (int) (1))
																						.getMetadata())
																|| ((((entity instanceof EntityLivingBase)
																		? ((EntityLivingBase) entity).getHeldItemMainhand()
																		: ItemStack.EMPTY)
																				.getItem() == new ItemStack(ItemCebollafruit.block, (int) (1))
																						.getItem()
																		&& ((entity instanceof EntityLivingBase)
																				? ((EntityLivingBase) entity).getHeldItemMainhand()
																				: ItemStack.EMPTY)
																						.getMetadata() == new ItemStack(ItemCebollafruit.block,
																								(int) (1)).getMetadata())
																		|| ((((entity instanceof EntityLivingBase)
																				? ((EntityLivingBase) entity).getHeldItemMainhand()
																				: ItemStack.EMPTY)
																						.getItem() == new ItemStack(ItemSemillauva.block, (int) (1))
																								.getItem()
																				&& ((entity instanceof EntityLivingBase)
																						? ((EntityLivingBase) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY)
																								.getMetadata() == new ItemStack(ItemSemillauva.block,
																										(int) (1)).getMetadata())
																				|| ((((entity instanceof EntityLivingBase)
																						? ((EntityLivingBase) entity).getHeldItemMainhand()
																						: ItemStack.EMPTY)
																								.getItem() == new ItemStack(ItemSemilaparra.block,
																										(int) (1)).getItem()
																						&& ((entity instanceof EntityLivingBase)
																								? ((EntityLivingBase) entity).getHeldItemMainhand()
																								: ItemStack.EMPTY)
																										.getMetadata() == new ItemStack(
																												ItemSemilaparra.block, (int) (1))
																														.getMetadata())
																						|| (((entity instanceof EntityLivingBase)
																								? ((EntityLivingBase) entity).getHeldItemMainhand()
																								: ItemStack.EMPTY)
																										.getItem() == new ItemStack(Items.DYE,
																												(int) (1), 3).getItem()
																								&& ((entity instanceof EntityLivingBase)
																										? ((EntityLivingBase) entity)
																												.getHeldItemMainhand()
																										: ItemStack.EMPTY)
																												.getMetadata() == new ItemStack(
																														Items.DYE, (int) (1), 3)
																																.getMetadata())))))))))))) {
			if ((Math.random() > 0.8)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureLockss.executeProcedure($_dependencies);
				}
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.DYE, (int) (1), 3).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.DYE, (int) (1), 3).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.DYE, (int) (1), 3).getItem(), 3, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemSemilaparra.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemSemilaparra.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemSemilaparra.block, (int) (1)).getItem(), -1, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.WHEAT_SEEDS, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.WHEAT_SEEDS, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.WHEAT_SEEDS, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.PUMPKIN_SEEDS, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.PUMPKIN_SEEDS, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.PUMPKIN_SEEDS, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.MELON_SEEDS, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.MELON_SEEDS, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.MELON_SEEDS, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.BEETROOT_SEEDS, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.BEETROOT_SEEDS, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.BEETROOT_SEEDS, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemPinon.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemPinon.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemPinon.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemMaizsemilla.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemMaizsemilla.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemMaizsemilla.block, (int) (1)).getItem(), -1, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemSemillatomate.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemSemillatomate.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemSemillatomate.block, (int) (1)).getItem(), -1, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemCebollafruit.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemCebollafruit.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemCebollafruit.block, (int) (1)).getItem(), -1, (int) 1,
							null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemSemillauva.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemSemillauva.block, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemSemillauva.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.CACTUS, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Blocks.CACTUS, (int) (1)).getMetadata())
				|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Blocks.MELON_BLOCK, (int) (1)).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(Blocks.MELON_BLOCK, (int) (1)).getMetadata())
						|| (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Blocks.PUMPKIN, (int) (1)).getItem()
								&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getMetadata() == new ItemStack(Blocks.PUMPKIN, (int) (1)).getMetadata())))) {
			if ((Math.random() > 0.5)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureLockss.executeProcedure($_dependencies);
				}
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.CACTUS, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.CACTUS, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.CACTUS, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.PUMPKIN, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.PUMPKIN, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.PUMPKIN, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.MELON_BLOCK, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Blocks.MELON_BLOCK, (int) (1)).getMetadata())) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.MELON_BLOCK, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
	}
}
