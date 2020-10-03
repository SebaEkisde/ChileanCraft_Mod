package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;

import net.mcreator.chilecraft.item.ItemVienesa;
import net.mcreator.chilecraft.item.ItemSopaipilaa;
import net.mcreator.chilecraft.item.ItemSeedscebolla;
import net.mcreator.chilecraft.item.ItemReinetas;
import net.mcreator.chilecraft.item.ItemR22;
import net.mcreator.chilecraft.item.ItemQuesocabra;
import net.mcreator.chilecraft.item.ItemQueso;
import net.mcreator.chilecraft.item.ItemPinon;
import net.mcreator.chilecraft.item.ItemP9nao;
import net.mcreator.chilecraft.item.ItemOil;
import net.mcreator.chilecraft.item.ItemMerluza;
import net.mcreator.chilecraft.item.ItemManjar;
import net.mcreator.chilecraft.item.ItemMaizfruit;
import net.mcreator.chilecraft.item.ItemMacha;
import net.mcreator.chilecraft.item.ItemLonga;
import net.mcreator.chilecraft.item.ItemJaiva;
import net.mcreator.chilecraft.item.ItemEmpanadacrda;
import net.mcreator.chilecraft.item.ItemCuajo;
import net.mcreator.chilecraft.item.ItemChorito;
import net.mcreator.chilecraft.item.ItemCanedecabra;
import net.mcreator.chilecraft.item.ItemCaballlo;
import net.mcreator.chilecraft.item.ItemC2;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureOllaUpdateTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureOllaUpdateTick(ElementsChileanCraftMod instance) {
		super(instance, 446);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OllaUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OllaUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OllaUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OllaUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FIRE.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.FIRE.getDefaultState().getBlock()))) {
			if ((((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) != 64) && ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemOil.block, (int) (1)).getItem())
					&& (((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemSopaipilaa.block, (int) (1))
							.getItem()) || ((((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof TileEntityLockableLoot)
										return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									return ItemStack.EMPTY;
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(ItemEmpanadacrda.block, (int) (1)).getItem()) || ((new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											TileEntity inv = world.getTileEntity(pos);
											if (inv instanceof TileEntityLockableLoot)
												return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
											return ItemStack.EMPTY;
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
											.getItem() == new ItemStack(Items.EGG, (int) (1)).getItem()))
									|| ((new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											TileEntity inv = world.getTileEntity(pos);
											if (inv instanceof TileEntityLockableLoot)
												return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
											return ItemStack.EMPTY;
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
											.getItem() == new ItemStack(Items.POTATO, (int) (1)).getItem()))))
					&& ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
							.getItem())))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEe.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEe.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEe.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEe.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEe.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEe.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEe.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEe.executeProcedure($_dependencies);
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
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
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (2), _setstack);
					}
				}
			}
			if ((((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) != 64) && ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem())
					&& (!((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())))
					&& (((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())
							&& (((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof TileEntityLockableLoot)
										return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									return ItemStack.EMPTY;
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(ItemMaizfruit.block, (int) (1)).getItem()) || (((new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											TileEntity inv = world.getTileEntity(pos);
											if (inv instanceof TileEntityLockableLoot)
												return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
											return ItemStack.EMPTY;
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
											.getItem() == new ItemStack(ItemPinon.block, (int) (1)).getItem()) || (((new Object() {
												public ItemStack getItemStack(BlockPos pos, int sltid) {
													TileEntity inv = world.getTileEntity(pos);
													if (inv instanceof TileEntityLockableLoot)
														return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
													return ItemStack.EMPTY;
												}
											}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
													.getItem() == new ItemStack(ItemSeedscebolla.block, (int) (1)).getItem()) || (((new Object() {
														public ItemStack getItemStack(BlockPos pos, int sltid) {
															TileEntity inv = world.getTileEntity(pos);
															if (inv instanceof TileEntityLockableLoot)
																return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
															return ItemStack.EMPTY;
														}
													}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
															.getItem() == new ItemStack(ItemCanedecabra.block, (int) (1)).getItem())
															|| (((new Object() {
																public ItemStack getItemStack(BlockPos pos, int sltid) {
																	TileEntity inv = world.getTileEntity(pos);
																	if (inv instanceof TileEntityLockableLoot)
																		return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																	return ItemStack.EMPTY;
																}
															}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
																	.getItem() == new ItemStack(ItemC2.block, (int) (1)).getItem())
																	|| ((((new Object() {
																		public ItemStack getItemStack(BlockPos pos, int sltid) {
																			TileEntity inv = world.getTileEntity(pos);
																			if (inv instanceof TileEntityLockableLoot)
																				return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																			return ItemStack.EMPTY;
																		}
																	}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
																			.getItem() == new ItemStack(ItemCaballlo.block, (int) (1)).getItem())
																			|| ((new Object() {
																				public ItemStack getItemStack(BlockPos pos, int sltid) {
																					TileEntity inv = world.getTileEntity(pos);
																					if (inv instanceof TileEntityLockableLoot)
																						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																					return ItemStack.EMPTY;
																				}
																			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
																					.getItem() == new ItemStack(ItemLonga.block, (int) (1))
																							.getItem()))
																			|| (((new Object() {
																				public ItemStack getItemStack(BlockPos pos, int sltid) {
																					TileEntity inv = world.getTileEntity(pos);
																					if (inv instanceof TileEntityLockableLoot)
																						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																					return ItemStack.EMPTY;
																				}
																			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
																					.getItem() == new ItemStack(ItemVienesa.block, (int) (1))
																							.getItem())
																					|| (((new Object() {
																						public ItemStack getItemStack(BlockPos pos, int sltid) {
																							TileEntity inv = world.getTileEntity(pos);
																							if (inv instanceof TileEntityLockableLoot)
																								return ((TileEntityLockableLoot) inv)
																										.getStackInSlot(sltid);
																							return ItemStack.EMPTY;
																						}
																					}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																							(int) (1)))
																									.getItem() == new ItemStack(Items.EGG, (int) (1))
																											.getItem())
																							|| (((new Object() {
																								public ItemStack getItemStack(BlockPos pos,
																										int sltid) {
																									TileEntity inv = world.getTileEntity(pos);
																									if (inv instanceof TileEntityLockableLoot)
																										return ((TileEntityLockableLoot) inv)
																												.getStackInSlot(sltid);
																									return ItemStack.EMPTY;
																								}
																							}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																									(int) (1)))
																											.getItem() == new ItemStack(ItemC2.block,
																													(int) (1)).getItem())
																									|| ((((new Object() {
																										public ItemStack getItemStack(BlockPos pos,
																												int sltid) {
																											TileEntity inv = world.getTileEntity(pos);
																											if (inv instanceof TileEntityLockableLoot)
																												return ((TileEntityLockableLoot) inv)
																														.getStackInSlot(sltid);
																											return ItemStack.EMPTY;
																										}
																									}.getItemStack(
																											new BlockPos((int) x, (int) y, (int) z),
																											(int) (1))).getItem() == new ItemStack(
																													ItemCaballlo.block, (int) (1))
																															.getItem())
																											|| ((new Object() {
																												public ItemStack getItemStack(
																														BlockPos pos, int sltid) {
																													TileEntity inv = world
																															.getTileEntity(pos);
																													if (inv instanceof TileEntityLockableLoot)
																														return ((TileEntityLockableLoot) inv)
																																.getStackInSlot(
																																		sltid);
																													return ItemStack.EMPTY;
																												}
																											}.getItemStack(
																													new BlockPos((int) x, (int) y,
																															(int) z),
																													(int) (1)))
																															.getItem() == new ItemStack(
																																	ItemLonga.block,
																																	(int) (1))
																																			.getItem()))
																											|| (((new Object() {
																												public ItemStack getItemStack(
																														BlockPos pos, int sltid) {
																													TileEntity inv = world
																															.getTileEntity(pos);
																													if (inv instanceof TileEntityLockableLoot)
																														return ((TileEntityLockableLoot) inv)
																																.getStackInSlot(
																																		sltid);
																													return ItemStack.EMPTY;
																												}
																											}.getItemStack(
																													new BlockPos((int) x, (int) y,
																															(int) z),
																													(int) (1)))
																															.getItem() == new ItemStack(
																																	Items.FISH,
																																	(int) (1), 0)
																																			.getItem())
																													|| (((new Object() {
																														public ItemStack getItemStack(
																																BlockPos pos,
																																int sltid) {
																															TileEntity inv = world
																																	.getTileEntity(
																																			pos);
																															if (inv instanceof TileEntityLockableLoot)
																																return ((TileEntityLockableLoot) inv)
																																		.getStackInSlot(
																																				sltid);
																															return ItemStack.EMPTY;
																														}
																													}.getItemStack(
																															new BlockPos((int) x,
																																	(int) y, (int) z),
																															(int) (1)))
																																	.getItem() == new ItemStack(
																																			Items.FISH,
																																			(int) (1),
																																			1).getItem())
																															|| (((new Object() {
																																public ItemStack getItemStack(
																																		BlockPos pos,
																																		int sltid) {
																																	TileEntity inv = world
																																			.getTileEntity(
																																					pos);
																																	if (inv instanceof TileEntityLockableLoot)
																																		return ((TileEntityLockableLoot) inv)
																																				.getStackInSlot(
																																						sltid);
																																	return ItemStack.EMPTY;
																																}
																															}.getItemStack(
																																	new BlockPos(
																																			(int) x,
																																			(int) y,
																																			(int) z),
																																	(int) (1)))
																																			.getItem() == new ItemStack(
																																					Items.PORKCHOP,
																																					(int) (1))
																																							.getItem())
																																	|| ((((new Object() {
																																		public ItemStack getItemStack(
																																				BlockPos pos,
																																				int sltid) {
																																			TileEntity inv = world
																																					.getTileEntity(
																																							pos);
																																			if (inv instanceof TileEntityLockableLoot)
																																				return ((TileEntityLockableLoot) inv)
																																						.getStackInSlot(
																																								sltid);
																																			return ItemStack.EMPTY;
																																		}
																																	}.getItemStack(
																																			new BlockPos(
																																					(int) x,
																																					(int) y,
																																					(int) z),
																																			(int) (1)))
																																					.getItem() == new ItemStack(
																																							Items.BEEF,
																																							(int) (1))
																																									.getItem())
																																			|| ((new Object() {
																																				public ItemStack getItemStack(
																																						BlockPos pos,
																																						int sltid) {
																																					TileEntity inv = world
																																							.getTileEntity(
																																									pos);
																																					if (inv instanceof TileEntityLockableLoot)
																																						return ((TileEntityLockableLoot) inv)
																																								.getStackInSlot(
																																										sltid);
																																					return ItemStack.EMPTY;
																																				}
																																			}.getItemStack(
																																					new BlockPos(
																																							(int) x,
																																							(int) y,
																																							(int) z),
																																					(int) (1)))
																																							.getItem() == new ItemStack(
																																									Items.CHICKEN,
																																									(int) (1))
																																											.getItem()))
																																			|| (((new Object() {
																																				public ItemStack getItemStack(
																																						BlockPos pos,
																																						int sltid) {
																																					TileEntity inv = world
																																							.getTileEntity(
																																									pos);
																																					if (inv instanceof TileEntityLockableLoot)
																																						return ((TileEntityLockableLoot) inv)
																																								.getStackInSlot(
																																										sltid);
																																					return ItemStack.EMPTY;
																																				}
																																			}.getItemStack(
																																					new BlockPos(
																																							(int) x,
																																							(int) y,
																																							(int) z),
																																					(int) (1)))
																																							.getItem() == new ItemStack(
																																									Items.RABBIT,
																																									(int) (1))
																																											.getItem())
																																					|| (((new Object() {
																																						public ItemStack getItemStack(
																																								BlockPos pos,
																																								int sltid) {
																																							TileEntity inv = world
																																									.getTileEntity(
																																											pos);
																																							if (inv instanceof TileEntityLockableLoot)
																																								return ((TileEntityLockableLoot) inv)
																																										.getStackInSlot(
																																												sltid);
																																							return ItemStack.EMPTY;
																																						}
																																					}.getItemStack(
																																							new BlockPos(
																																									(int) x,
																																									(int) y,
																																									(int) z),
																																							(int) (1)))
																																									.getItem() == new ItemStack(
																																											Items.MUTTON,
																																											(int) (1))
																																													.getItem())
																																							|| (((new Object() {
																																								public ItemStack getItemStack(
																																										BlockPos pos,
																																										int sltid) {
																																									TileEntity inv = world
																																											.getTileEntity(
																																													pos);
																																									if (inv instanceof TileEntityLockableLoot)
																																										return ((TileEntityLockableLoot) inv)
																																												.getStackInSlot(
																																														sltid);
																																									return ItemStack.EMPTY;
																																								}
																																							}.getItemStack(
																																									new BlockPos(
																																											(int) x,
																																											(int) y,
																																											(int) z),
																																									(int) (1)))
																																											.getItem() == new ItemStack(
																																													ItemReinetas.block,
																																													(int) (1))
																																															.getItem())
																																									|| (((new Object() {
																																										public ItemStack getItemStack(
																																												BlockPos pos,
																																												int sltid) {
																																											TileEntity inv = world
																																													.getTileEntity(
																																															pos);
																																											if (inv instanceof TileEntityLockableLoot)
																																												return ((TileEntityLockableLoot) inv)
																																														.getStackInSlot(
																																																sltid);
																																											return ItemStack.EMPTY;
																																										}
																																									}.getItemStack(
																																											new BlockPos(
																																													(int) x,
																																													(int) y,
																																													(int) z),
																																											(int) (1)))
																																													.getItem() == new ItemStack(
																																															ItemMerluza.block,
																																															(int) (1))
																																																	.getItem())
																																											|| (((new Object() {
																																												public ItemStack getItemStack(
																																														BlockPos pos,
																																														int sltid) {
																																													TileEntity inv = world
																																															.getTileEntity(
																																																	pos);
																																													if (inv instanceof TileEntityLockableLoot)
																																														return ((TileEntityLockableLoot) inv)
																																																.getStackInSlot(
																																																		sltid);
																																													return ItemStack.EMPTY;
																																												}
																																											}.getItemStack(
																																													new BlockPos(
																																															(int) x,
																																															(int) y,
																																															(int) z),
																																													(int) (1)))
																																															.getItem() == new ItemStack(
																																																	ItemJaiva.block,
																																																	(int) (1))
																																																			.getItem())
																																													|| (((new Object() {
																																														public ItemStack getItemStack(
																																																BlockPos pos,
																																																int sltid) {
																																															TileEntity inv = world
																																																	.getTileEntity(
																																																			pos);
																																															if (inv instanceof TileEntityLockableLoot)
																																																return ((TileEntityLockableLoot) inv)
																																																		.getStackInSlot(
																																																				sltid);
																																															return ItemStack.EMPTY;
																																														}
																																													}.getItemStack(
																																															new BlockPos(
																																																	(int) x,
																																																	(int) y,
																																																	(int) z),
																																															(int) (1)))
																																																	.getItem() == new ItemStack(
																																																			ItemMacha.block,
																																																			(int) (1))
																																																					.getItem())
																																															|| ((new Object() {
																																																public ItemStack getItemStack(
																																																		BlockPos pos,
																																																		int sltid) {
																																																	TileEntity inv = world
																																																			.getTileEntity(
																																																					pos);
																																																	if (inv instanceof TileEntityLockableLoot)
																																																		return ((TileEntityLockableLoot) inv)
																																																				.getStackInSlot(
																																																						sltid);
																																																	return ItemStack.EMPTY;
																																																}
																																															}.getItemStack(
																																																	new BlockPos(
																																																			(int) x,
																																																			(int) y,
																																																			(int) z),
																																																	(int) (1)))
																																																			.getItem() == new ItemStack(
																																																					ItemChorito.block,
																																																					(int) (1))
																																																							.getItem()))))))))))))))))))))))))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEf.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEf.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEf.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEf.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEf.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEf.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEf.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					ProcedureEf.executeProcedure($_dependencies);
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
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
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (2), _setstack);
					}
				}
			}
			if ((((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) != 64) && ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.MILK_BUCKET, (int) (1)).getItem())
					&& ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Items.SUGAR, (int) (1)).getItem()))
					&& (((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())
							&& ((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof TileEntityLockableLoot) {
										ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 8))))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (8));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
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
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (2), _setstack);
					}
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(ItemManjar.block, (int) (1));
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
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) + 5));
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (0), _setstack);
					}
				}
			}
			if ((((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) != 64) && ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.MILK_BUCKET, (int) (1)).getItem())
					&& ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemCuajo.block, (int) (1))
							.getItem()))
					&& ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
							.getItem())))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
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
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (2), _setstack);
					}
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(ItemQueso.block, (int) (1));
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
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) + 1));
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (0), _setstack);
					}
				}
			}
			if ((((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) != 64) && ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemR22.block, (int) (1)).getItem())
					&& ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemCuajo.block, (int) (1))
							.getItem()))
					&& ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
							.getItem())))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
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
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (2), _setstack);
					}
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(ItemQuesocabra.block, (int) (1));
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
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) + 1));
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (0), _setstack);
					}
				}
			}
			if ((((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) != 64) && (((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemSeedscebolla.block, (int) (1))
					.getItem()) && ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Items.BEEF, (int) (1)).getItem()))
					|| (((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemSeedscebolla.block, (int) (1))
							.getItem()) && ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof TileEntityLockableLoot)
										return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									return ItemStack.EMPTY;
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.BEEF, (int) (1))
									.getItem())))
					&& ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
							.getItem())))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(ItemP9nao.block, (int) (1));
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
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
						((TileEntityLockableLoot) inv).setInventorySlotContents((int) (0), _setstack);
					}
				}
			}
		}
	}
}
