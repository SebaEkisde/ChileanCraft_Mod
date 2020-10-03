package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.chilecraft.item.ItemTaza;
import net.mcreator.chilecraft.item.ItemGredaball;
import net.mcreator.chilecraft.block.BlockTinaja;
import net.mcreator.chilecraft.block.BlockTg1;
import net.mcreator.chilecraft.block.BlockPlatobaji;
import net.mcreator.chilecraft.block.BlockPlato;
import net.mcreator.chilecraft.block.BlockGreda2;
import net.mcreator.chilecraft.block.BlockCerdo1;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureTorn9UpdateTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureTorn9UpdateTick(ElementsChileanCraftMod instance) {
		super(instance, 252);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Torn9UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Torn9UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Torn9UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Torn9UpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
				&& (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
						.getMetadata())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
						.getItem() && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
								.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
										.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
								&& (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem() && (new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
												.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
										&& (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
														.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
												&& (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
																.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																		.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																		&& (new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																				.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1))
																						.getMetadata())
																		&& ((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
																				&& (new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof TileEntityLockableLoot)
																							return ((TileEntityLockableLoot) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																						.getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
																								.getMetadata())))))))))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) < 64) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
						&& (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
								.getMetadata())
						|| ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(ItemTaza.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
										.getMetadata() == new ItemStack(ItemTaza.block, (int) (1)).getMetadata()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemTaza.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (9), _setstack);
				}
			}
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
				&& (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
						.getMetadata())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
						.getItem() && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
								.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
										.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
								&& (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
												.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
										&& (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
														.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
												&& (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
																.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																		.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																		&& (new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																				.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1))
																						.getMetadata())
																		&& ((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
																				&& (new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof TileEntityLockableLoot)
																							return ((TileEntityLockableLoot) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																						.getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
																								.getMetadata())))))))))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) < 64) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
						&& (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
								.getMetadata())
						|| ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(BlockCerdo1.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
										.getMetadata() == new ItemStack(BlockCerdo1.block, (int) (1)).getMetadata()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(BlockCerdo1.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (9), _setstack);
				}
			}
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
				&& (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
						.getMetadata())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
						.getItem() && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
										.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
								&& (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem() && (new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
												.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
										&& (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
														.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
												&& (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
																.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																		.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																		.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																		&& (new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1))
																						.getMetadata())
																		&& ((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																				.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
																				&& (new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof TileEntityLockableLoot)
																							return ((TileEntityLockableLoot) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																						.getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
																								.getMetadata())))))))))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) < 64) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
						&& (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
								.getMetadata())
						|| ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
								.getItem() == new ItemStack(BlockPlatobaji.block, (int) (1)).getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
										.getMetadata() == new ItemStack(BlockPlatobaji.block, (int) (1)).getMetadata()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(BlockPlatobaji.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (9), _setstack);
				}
			}
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
				&& (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
						.getMetadata())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
						.getItem() && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
										.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
								&& (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem() && (new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
												.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
										&& (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
														.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
												&& (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
																.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																		.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																		.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																		&& (new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1))
																						.getMetadata())
																		&& ((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																				.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																				&& (new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof TileEntityLockableLoot)
																							return ((TileEntityLockableLoot) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																						.getMetadata() == new ItemStack(ItemGredaball.block,
																								(int) (1)).getMetadata())))))))))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) < 64) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
						&& (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
								.getMetadata())
						|| ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(BlockPlato.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
										.getMetadata() == new ItemStack(BlockPlato.block, (int) (1)).getMetadata()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(BlockPlato.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (9), _setstack);
				}
			}
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
				&& (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
						.getMetadata())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
						.getItem() && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
										.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
								&& (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
												.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
										&& (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
														.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
												&& (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
																.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																		.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																		.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																		&& (new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1))
																						.getMetadata())
																		&& ((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																				.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																				&& (new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof TileEntityLockableLoot)
																							return ((TileEntityLockableLoot) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																						.getMetadata() == new ItemStack(ItemGredaball.block,
																								(int) (1)).getMetadata())))))))))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) < 64) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
						&& (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
								.getMetadata())
						|| ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(BlockTinaja.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
										.getMetadata() == new ItemStack(BlockTinaja.block, (int) (1)).getMetadata()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(BlockTinaja.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (9), _setstack);
				}
			}
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
				&& (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getMetadata() == new ItemStack(ItemGredaball.block, (int) (1))
						.getMetadata())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
						.getItem() && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
										.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
								&& (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
												.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
										&& (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
														.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
												&& (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
																.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																&& (new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																		.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																		.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																		&& (new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1))
																						.getMetadata())
																		&& ((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																				.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																				&& (new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof TileEntityLockableLoot)
																							return ((TileEntityLockableLoot) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																						.getMetadata() == new ItemStack(ItemGredaball.block,
																								(int) (1)).getMetadata())))))))))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) < 64) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
						&& (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
								.getMetadata())
						|| ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(BlockTg1.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
										.getMetadata() == new ItemStack(BlockTg1.block, (int) (1)).getMetadata()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (6), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(BlockTg1.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (9), _setstack);
				}
			}
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
				&& (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getMetadata() == new ItemStack(ItemGredaball.block, (int) (1))
						.getMetadata())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
						.getItem() && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemGredaball.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
										.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
								&& (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem() && (new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
												.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
										&& (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem() && (new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
														.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata())
												&& (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem() && (new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
																.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																&& (new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																		.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1)).getMetadata())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																		.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																		&& (new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getMetadata() == new ItemStack(ItemGredaball.block, (int) (1))
																						.getMetadata())
																		&& ((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																				.getItem() == new ItemStack(ItemGredaball.block, (int) (1)).getItem()
																				&& (new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof TileEntityLockableLoot)
																							return ((TileEntityLockableLoot) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																						.getMetadata() == new ItemStack(ItemGredaball.block,
																								(int) (1)).getMetadata())))))))))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) < 64) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()
						&& (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getMetadata() == new ItemStack(Blocks.AIR, (int) (1))
								.getMetadata())
						|| ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(BlockGreda2.block, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
										.getMetadata() == new ItemStack(BlockGreda2.block, (int) (1)).getMetadata()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (6), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(BlockGreda2.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (9), _setstack);
				}
			}
		}
	}
}
