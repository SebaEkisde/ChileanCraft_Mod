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
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import net.mcreator.chilecraft.block.BlockAraucaria;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureArqaucaiaa extends ElementsChileanCraftMod.ModElement {
	public ProcedureArqaucaiaa(ElementsChileanCraftMod instance) {
		super(instance, 662);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Arqaucaiaa!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Arqaucaiaa!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Arqaucaiaa!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Arqaucaiaa!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() < 0.5)) {
			if ((Math.random() >= 0.5)) {
				if ((Math.random() >= 0.5)) {
					if (!world.isRemote) {
						Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
								new ResourceLocation("chilean_craft", "ar1"));
						if (template != null) {
							BlockPos spawnTo = new BlockPos((int) (x - 4), (int) y, (int) (z - 4));
							IBlockState iblockstate = world.getBlockState(spawnTo);
							world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
							template.addBlocksToWorldChunk(world, spawnTo,
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
											.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
						}
					}
				} else {
					if (!world.isRemote) {
						Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
								new ResourceLocation("chilean_craft", "ar2"));
						if (template != null) {
							BlockPos spawnTo = new BlockPos((int) (x - 4), (int) y, (int) (z - 4));
							IBlockState iblockstate = world.getBlockState(spawnTo);
							world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
							template.addBlocksToWorldChunk(world, spawnTo,
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
											.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
						}
					}
				}
			} else {
				if ((Math.random() >= 0.5)) {
					if (!world.isRemote) {
						Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
								new ResourceLocation("chilean_craft", "ar3"));
						if (template != null) {
							BlockPos spawnTo = new BlockPos((int) (x - 4), (int) y, (int) (z - 4));
							IBlockState iblockstate = world.getBlockState(spawnTo);
							world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
							template.addBlocksToWorldChunk(world, spawnTo,
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
											.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
						}
					}
				} else {
					if ((Math.random() < 0.5)) {
						if (!world.isRemote) {
							Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
									new ResourceLocation("chilean_craft", "ar4"));
							if (template != null) {
								BlockPos spawnTo = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z - 4));
								IBlockState iblockstate = world.getBlockState(spawnTo);
								world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
								template.addBlocksToWorldChunk(world, spawnTo,
										new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
												.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
							}
						}
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockAraucaria.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), BlockAraucaria.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAraucaria.block.getDefaultState(), 3);
					} else {
						if (!world.isRemote) {
							Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
									new ResourceLocation("chilean_craft", "ar1"));
							if (template != null) {
								BlockPos spawnTo = new BlockPos((int) (x - 4), (int) (y + 5), (int) (z - 4));
								IBlockState iblockstate = world.getBlockState(spawnTo);
								world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
								template.addBlocksToWorldChunk(world, spawnTo,
										new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
												.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
							}
						}
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockAraucaria.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), BlockAraucaria.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), BlockAraucaria.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), BlockAraucaria.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAraucaria.block.getDefaultState(), 3);
					}
				}
			}
		} else {
			if ((Math.random() < 0.5)) {
				if (!world.isRemote) {
					Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
							new ResourceLocation("chilean_craft", "ar2"));
					if (template != null) {
						BlockPos spawnTo = new BlockPos((int) (x - 4), (int) (y + 6), (int) (z - 4));
						IBlockState iblockstate = world.getBlockState(spawnTo);
						world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
						template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
								.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
					}
				}
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockAraucaria.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), BlockAraucaria.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), BlockAraucaria.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), BlockAraucaria.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) z), BlockAraucaria.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAraucaria.block.getDefaultState(), 3);
			} else {
				if (!world.isRemote) {
					Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
							new ResourceLocation("chilean_craft", "ar3"));
					if (template != null) {
						BlockPos spawnTo = new BlockPos((int) (x - 4), (int) (y + 3), (int) (z - 4));
						IBlockState iblockstate = world.getBlockState(spawnTo);
						world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
						template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
								.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
					}
				}
				world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), BlockAraucaria.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockAraucaria.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAraucaria.block.getDefaultState(), 3);
			}
		}
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAraucaria.block.getDefaultState(), 3);
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), BlockAraucaria.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), BlockAraucaria.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 3), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y - 3), (int) z), BlockAraucaria.block.getDefaultState(), 3);
		}
	}
}
