package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.block.BlockAraucariaegenretor;
import net.mcreator.chilecraft.block.BlockAraucaria;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureAraucariaegenretorUpdateTick extends ElementsChileanCraftMod.ModElement {
	public ProcedureAraucariaegenretorUpdateTick(ElementsChileanCraftMod instance) {
		super(instance, 353);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AraucariaegenretorUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AraucariaegenretorUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AraucariaegenretorUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AraucariaegenretorUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))), Blocks.DIRT.getStateFromMeta(0))) || (new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))), Blocks.DIRT.getStateFromMeta(2))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAraucaria.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockAraucaria.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), BlockAraucaria.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), BlockAraucaria.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), BlockAraucaria.block.getDefaultState(), 3);
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureArqaucaiaa.executeProcedure($_dependencies);
			}
		}
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockAraucariaegenretor.block.getDefaultState()))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		}
	}
}
