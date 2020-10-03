package net.mcreator.chilecraft.procedure;

import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureEf34fOnBlockRightClicked extends ElementsChileanCraftMod.ModElement {
	public ProcedureEf34fOnBlockRightClicked(ElementsChileanCraftMod instance) {
		super(instance, 349);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Ef34fOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Ef34fOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Ef34fOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Ef34fOnBlockRightClicked!");
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
						if ((Math.random() > 0.5)) {
							if ((new Object() {
								public boolean blockEquals(IBlockState a, IBlockState b) {
									try {
										return (a.getBlock() == b.getBlock())
												&& (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
									} catch (Exception e) {
										return (a.getBlock() == b.getBlock());
									}
								}
							}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))), Blocks.AIR.getDefaultState()))) {
								if (!world.isRemote) {
									Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
											new ResourceLocation("chilean_craft", "ar1"));
									if (template != null) {
										BlockPos spawnTo = new BlockPos((int) x, (int) y, (int) (z + 1));
										IBlockState iblockstate = world.getBlockState(spawnTo);
										world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
										template.addBlocksToWorldChunk(world, spawnTo,
												new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
														.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
									}
								}
							}
						} else {
							if ((new Object() {
								public boolean blockEquals(IBlockState a, IBlockState b) {
									try {
										return (a.getBlock() == b.getBlock())
												&& (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
									} catch (Exception e) {
										return (a.getBlock() == b.getBlock());
									}
								}
							}.blockEquals((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))), Blocks.AIR.getDefaultState()))) {
								if (!world.isRemote) {
									Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
											new ResourceLocation("chilean_craft", "ar1"));
									if (template != null) {
										BlockPos spawnTo = new BlockPos((int) (x + 1), (int) y, (int) z);
										IBlockState iblockstate = world.getBlockState(spawnTo);
										world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
										template.addBlocksToWorldChunk(world, spawnTo,
												new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
														.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
									}
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
						}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))), Blocks.AIR.getDefaultState()))) {
							if (!world.isRemote) {
								Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
										new ResourceLocation("chilean_craft", "ar1"));
								if (template != null) {
									BlockPos spawnTo = new BlockPos((int) x, (int) y, (int) (z - 1));
									IBlockState iblockstate = world.getBlockState(spawnTo);
									world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
									template.addBlocksToWorldChunk(world, spawnTo,
											new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
													.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
								}
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
					}.blockEquals((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))), Blocks.AIR.getDefaultState()))) {
						if (!world.isRemote) {
							Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
									new ResourceLocation("chilean_craft", "ar1"));
							if (template != null) {
								BlockPos spawnTo = new BlockPos((int) (x - 1), (int) y, (int) z);
								IBlockState iblockstate = world.getBlockState(spawnTo);
								world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
								template.addBlocksToWorldChunk(world, spawnTo,
										new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
												.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
							}
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
