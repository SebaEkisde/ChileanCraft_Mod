package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureBuceoHelmetTickEvent extends ElementsChileanCraftMod.ModElement {
	public ProcedureBuceoHelmetTickEvent(ElementsChileanCraftMod instance) {
		super(instance, 687);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BuceoHelmetTickEvent!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BuceoHelmetTickEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BuceoHelmetTickEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BuceoHelmetTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BuceoHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock())
				|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.WATER.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 60, (int) 0, (false), (false)));
		}
		if ((((world.getBlockState(new BlockPos((int) (x + 0.5), (int) y, (int) (z + 0.5)))).getBlock() == Blocks.FLOWING_WATER.getDefaultState()
				.getBlock())
				|| (((world.getBlockState(new BlockPos((int) (x + 0.5), (int) y, (int) (z + 0.5)))).getBlock() == Blocks.WATER.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x + 0.5), (int) y, (int) (z + 0.5)))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 60, (int) 0, (false), (false)));
		}
		if ((((world.getBlockState(new BlockPos((int) (x + 0.5), (int) y, (int) z))).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock())
				|| (((world.getBlockState(new BlockPos((int) (x + 0.5), (int) y, (int) z))).getBlock() == Blocks.WATER.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x + 0.5), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 60, (int) 0, (false), (false)));
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 0.5)))).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock())
				|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 0.5)))).getBlock() == Blocks.WATER.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 0.5)))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 60, (int) 0, (false), (false)));
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 0.5)))).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock())
				|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 0.5)))).getBlock() == Blocks.WATER.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 0.5)))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 60, (int) 0, (false), (false)));
		}
		if ((((world.getBlockState(new BlockPos((int) (x - 0.5), (int) y, (int) (z - 0.5)))).getBlock() == Blocks.FLOWING_WATER.getDefaultState()
				.getBlock())
				|| (((world.getBlockState(new BlockPos((int) (x - 0.5), (int) y, (int) (z - 0.5)))).getBlock() == Blocks.WATER.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 0.5), (int) y, (int) (z - 0.5)))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 60, (int) 0, (false), (false)));
		}
		if ((((world.getBlockState(new BlockPos((int) (x - 0.5), (int) y, (int) z))).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock())
				|| (((world.getBlockState(new BlockPos((int) (x - 0.5), (int) y, (int) z))).getBlock() == Blocks.WATER.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 0.5), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 60, (int) 0, (false), (false)));
		}
	}
}
