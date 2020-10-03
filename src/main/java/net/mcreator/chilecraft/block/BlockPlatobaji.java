
package net.mcreator.chilecraft.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.NonNullList;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.chilecraft.item.ItemGredaball;
import net.mcreator.chilecraft.creativetab.TabChileanBlocks;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

@ElementsChileanCraftMod.ModElement.Tag
public class BlockPlatobaji extends ElementsChileanCraftMod.ModElement {
	@GameRegistry.ObjectHolder("chilean_craft:platobaji")
	public static final Block block = null;
	public BlockPlatobaji(ElementsChileanCraftMod instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("platobaji"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("chilean_craft:platobaji", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("platobaji");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 0);
			setHardness(0.8F);
			setResistance(3.5F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabChileanBlocks.tab);
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.1D, 0D, 0.1D, 0.9D, 0.3D, 0.9D);
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
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(ItemGredaball.block, (int) (3)));
		}
	}
}
