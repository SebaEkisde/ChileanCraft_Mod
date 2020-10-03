package net.mcreator.chilecraft.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.effect.EntityLightningBolt;

import net.mcreator.chilecraft.block.BlockCopperblockcoaled;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureCopperblockRedstoneOn extends ElementsChileanCraftMod.ModElement {
	public ProcedureCopperblockRedstoneOn(ElementsChileanCraftMod instance) {
		super(instance, 466);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CopperblockRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CopperblockRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CopperblockRedstoneOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CopperblockRedstoneOn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
		if (world instanceof WorldServer)
			((WorldServer) world).spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x, y, z, (int) 1000, 3, 3, 3, 1, new int[0]);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCopperblockcoaled.block.getDefaultState(), 3);
	}
}
