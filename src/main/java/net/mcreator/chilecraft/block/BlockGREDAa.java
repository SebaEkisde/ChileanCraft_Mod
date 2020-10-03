
package net.mcreator.chilecraft.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.NonNullList;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.chilecraft.item.ItemGredaball;
import net.mcreator.chilecraft.creativetab.TabChileanBlocks;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Random;

@ElementsChileanCraftMod.ModElement.Tag
public class BlockGREDAa extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:gredaa")
	public static final Block block = null;
	public BlockGREDAa(ElementsChileanCraftMod instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("gredaa"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("chilean_craft:gredaa", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == 0)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		for (int i = 0; i < 9; i++) {
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(58) + 49;
			int z = chunkZ + random.nextInt(16);
			(new WorldGenMinable(block.getDefaultState(), 7, new com.google.common.base.Predicate<IBlockState>() {
				public boolean apply(IBlockState blockAt) {
					boolean blockCriteria = false;
					IBlockState require;
					require = Blocks.DIRT.getStateFromMeta(0);
					try {
						if ((blockAt.getBlock() == require.getBlock())
								&& (blockAt.getBlock().getMetaFromState(blockAt) == require.getBlock().getMetaFromState(require)))
							blockCriteria = true;
					} catch (Exception e) {
						if (blockAt.getBlock() == require.getBlock())
							blockCriteria = true;
					}
					require = Blocks.DIRT.getStateFromMeta(1);
					try {
						if ((blockAt.getBlock() == require.getBlock())
								&& (blockAt.getBlock().getMetaFromState(blockAt) == require.getBlock().getMetaFromState(require)))
							blockCriteria = true;
					} catch (Exception e) {
						if (blockAt.getBlock() == require.getBlock())
							blockCriteria = true;
					}
					require = Blocks.DIRT.getStateFromMeta(2);
					try {
						if ((blockAt.getBlock() == require.getBlock())
								&& (blockAt.getBlock().getMetaFromState(blockAt) == require.getBlock().getMetaFromState(require)))
							blockCriteria = true;
					} catch (Exception e) {
						if (blockAt.getBlock() == require.getBlock())
							blockCriteria = true;
					}
					return blockCriteria;
				}
			})).generate(world, random, new BlockPos(x, y, z));
		}
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.SAND);
			setUnlocalizedName("gredaa");
			setSoundType(SoundType.GROUND);
			setHarvestLevel("shovel", 0);
			setHardness(0.8F);
			setResistance(3.5F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabChileanBlocks.tab);
		}

		@Override
		public int tickRate(World world) {
			return 7;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction,
				net.minecraftforge.common.IPlantable plantable) {
			return true;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(ItemGredaball.block, (int) (4)));
		}
	}
}
