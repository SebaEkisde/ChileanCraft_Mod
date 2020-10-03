package net.mcreator.chilecraft.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.item.ItemUvaa;
import net.mcreator.chilecraft.item.ItemTomatelimachino;
import net.mcreator.chilecraft.item.ItemPipeno1;
import net.mcreator.chilecraft.item.ItemPioeno2;
import net.mcreator.chilecraft.item.ItemPinonC;
import net.mcreator.chilecraft.item.ItemPinon;
import net.mcreator.chilecraft.item.ItemPasamasado;
import net.mcreator.chilecraft.item.ItemPapafrita;
import net.mcreator.chilecraft.item.ItemMasa;
import net.mcreator.chilecraft.item.ItemMaizcocido;
import net.mcreator.chilecraft.item.ItemLaminas;
import net.mcreator.chilecraft.item.ItemJugomanzan;
import net.mcreator.chilecraft.item.ItemJugo1;
import net.mcreator.chilecraft.item.ItemJgo1varoja;
import net.mcreator.chilecraft.item.ItemChicha;
import net.mcreator.chilecraft.item.ItemCebollasada;
import net.mcreator.chilecraft.block.BlockCebolla;
import net.mcreator.chilecraft.block.BlockBailahuen;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedurePipaOnBlockRightClicked extends ElementsChileanCraftMod.ModElement {
	public ProcedurePipaOnBlockRightClicked(ElementsChileanCraftMod instance) {
		super(instance, 418);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PipaOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PipaOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PipaOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PipaOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PipaOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((!((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemPinonC.block, (int) (1)).getItem()))
				&& ((!((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemPinon.block, (int) (1)).getItem()))
						&& ((!((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
								.getItem() == new ItemStack(BlockBailahuen.block, (int) (1)).getItem())) && ((((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
										.getItem() == new ItemStack(BlockCebolla.block, (int) (1)).getItem()) && (!((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
												.getItem() == new ItemStack(ItemMasa.block, (int) (1)).getItem())))
										&& ((!((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
												.getItem() == new ItemStack(ItemPasamasado.block, (int) (1)).getItem())) && ((!((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
														.getItem() == new ItemStack(ItemLaminas.block, (int) (1)).getItem())) && (!((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
																.getItem() == new ItemStack(ItemPapafrita.block, (int) (1)).getItem()))))))))) {
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemJugo1.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemJugo1.block, (int) (1)).getMetadata())
					&& (!((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0)))) {
				if ((!((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0))) {
					if (((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 0)) {
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv != null && (inv instanceof TileEntityLockableLoot)) {
								ItemStack _setstack = new ItemStack(ItemCebollasada.block, (int) (1));
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
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJugo1.block, (int) (1)).getItem(), -1, (int) 1,
									null);
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					}
				}
			}
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemJugo1.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemJugo1.block, (int) (1)).getMetadata())
					&& (!((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0)))) {
				if (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0)) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemCebollasada.block, (int) (1));
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
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
					if (entity instanceof EntityPlayer) {
						ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
					}
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJugo1.block, (int) (1)).getItem(), -1, (int) 1, null);
				}
			}
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemJugo1.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemJugo1.block, (int) (1)).getMetadata())
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(ItemCebollasada.block, (int) (1));
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
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJugo1.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getMetadata())
					&& ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemUvaa.block, (int) (1))
							.getItem()))) {
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemPipeno1.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof TileEntityLockableLoot)
						((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
				}
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getMetadata())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemUvaa.block, (int) (1))
						.getItem()))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemPipeno1.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getMetadata())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemUvaa.block, (int) (1))
						.getItem()))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemPipeno1.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemJugomanzan.block, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(ItemJugomanzan.block, (int) (1)).getMetadata())
				&& ((!((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemPinonC.block, (int) (1))
						.getItem())) && ((!((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemPinon.block, (int) (1))
								.getItem())) && ((!((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
										.getItem() == new ItemStack(BlockBailahuen.block, (int) (1)).getItem())) && (!((((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
												.getItem() == new ItemStack(BlockCebolla.block, (int) (1)).getItem()) && (!((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
														.getItem() == new ItemStack(ItemMaizcocido.block, (int) (1)).getItem())))
												&& ((!((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
														.getItem() == new ItemStack(ItemTomatelimachino.block, (int) (1)).getItem()))
														&& ((!((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
																.getItem() == new ItemStack(ItemUvaa.block, (int) (1)).getItem()))
																&& (!((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
																		.getItem() == new ItemStack(ItemCebollasada.block, (int) (1))
																				.getItem()))))))))))) {
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemJugomanzan.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemJugomanzan.block, (int) (1)).getMetadata())
					&& (!((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0)))) {
				if ((!((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0))) {
					if (((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 0)) {
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv != null && (inv instanceof TileEntityLockableLoot)) {
								ItemStack _setstack = new ItemStack(ItemMasa.block, (int) (1));
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
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJugomanzan.block, (int) (1)).getItem(), -1,
									(int) 1, null);
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					}
				}
			}
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemJugomanzan.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemJugomanzan.block, (int) (1)).getMetadata())
					&& (!((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0)))) {
				if (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0)) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemMasa.block, (int) (1));
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
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
					if (entity instanceof EntityPlayer) {
						ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
					}
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJugomanzan.block, (int) (1)).getItem(), -1, (int) 1,
								null);
				}
			}
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemJugomanzan.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemJugomanzan.block, (int) (1)).getMetadata())
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(ItemMasa.block, (int) (1));
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
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJugomanzan.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemJgo1varoja.block, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(ItemJgo1varoja.block, (int) (1)).getMetadata())
				&& ((!((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemUvaa.block, (int) (1)).getItem()))
						&& ((!((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
								.getItem() == new ItemStack(ItemCebollasada.block, (int) (1)).getItem())) && ((!((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
										.getItem() == new ItemStack(ItemMaizcocido.block, (int) (1)).getItem())) && (!((((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
												.getItem() == new ItemStack(ItemTomatelimachino.block, (int) (1)).getItem()) && (!((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
														.getItem() == new ItemStack(ItemMasa.block, (int) (1)).getItem())))
												&& ((!((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
														.getItem() == new ItemStack(ItemPasamasado.block, (int) (1)).getItem()))
														&& ((!((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
																.getItem() == new ItemStack(ItemLaminas.block, (int) (1)).getItem()))
																&& (!((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
																		.getItem() == new ItemStack(ItemPapafrita.block, (int) (1))
																				.getItem()))))))))))) {
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemJgo1varoja.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemJgo1varoja.block, (int) (1)).getMetadata())
					&& (!((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0)))) {
				if ((!((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0))) {
					if (((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 0)) {
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv != null && (inv instanceof TileEntityLockableLoot)) {
								ItemStack _setstack = new ItemStack(ItemPinonC.block, (int) (1));
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
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJgo1varoja.block, (int) (1)).getItem(), -1,
									(int) 1, null);
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					}
				}
			}
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemJgo1varoja.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemJgo1varoja.block, (int) (1)).getMetadata())
					&& (!((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0)))) {
				if (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0)) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemPinonC.block, (int) (1));
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
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
					if (entity instanceof EntityPlayer) {
						ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
					}
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJgo1varoja.block, (int) (1)).getItem(), -1, (int) 1,
								null);
				}
			}
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemJgo1varoja.block, (int) (1)).getItem()
					&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getMetadata() == new ItemStack(ItemJgo1varoja.block, (int) (1)).getMetadata())
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof TileEntityLockableLoot)) {
						ItemStack _setstack = new ItemStack(ItemPinonC.block, (int) (1));
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
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJgo1varoja.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getMetadata())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemPinon.block, (int) (1))
						.getItem()))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemPioeno2.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getMetadata())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemPinon.block, (int) (1))
						.getItem()))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemPioeno2.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getMetadata())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemPinon.block, (int) (1))
						.getItem()))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemPioeno2.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getMetadata())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemPapafrita.block, (int) (1))
						.getItem()))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemChicha.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureChichaItemIsCraftedsmelted.executeProcedure($_dependencies);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getMetadata())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemPapafrita.block, (int) (1))
						.getItem()))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemChicha.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureChichaItemIsCraftedsmelted.executeProcedure($_dependencies);
			}
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()
				&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getMetadata() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getMetadata())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemPapafrita.block, (int) (1))
						.getItem()))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemChicha.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureChichaItemIsCraftedsmelted.executeProcedure($_dependencies);
			}
		}
	}
}
