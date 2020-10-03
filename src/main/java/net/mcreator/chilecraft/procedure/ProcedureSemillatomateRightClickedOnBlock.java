package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.item.ItemSemillatomate;
import net.mcreator.chilecraft.block.BlockTomate0;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureSemillatomateRightClickedOnBlock extends ElementsChileanCraftMod.ModElement {
	public ProcedureSemillatomateRightClickedOnBlock(ElementsChileanCraftMod instance) {
		super(instance, 304);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SemillatomateRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SemillatomateRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SemillatomateRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SemillatomateRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SemillatomateRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FARMLAND.getDefaultState().getBlock())
				&& (new Object() {
					public boolean blockEquals(IBlockState a, IBlockState b) {
						try {
							return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
						} catch (Exception e) {
							return (a.getBlock() == b.getBlock());
						}
					}
				}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))), Blocks.AIR.getDefaultState())))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockTomate0.block.getDefaultState(), 3);
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemSemillatomate.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
	}
}
