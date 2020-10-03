package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.item.ItemBona;
import net.mcreator.chilecraft.entity.EntityMatapacos;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureBonaMobIsHitWithItem extends ElementsChileanCraftMod.ModElement {
	public ProcedureBonaMobIsHitWithItem(ElementsChileanCraftMod instance) {
		super(instance, 399);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BonaMobIsHitWithItem!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BonaMobIsHitWithItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BonaMobIsHitWithItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BonaMobIsHitWithItem!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BonaMobIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((entity instanceof EntityWolf)) {
			(entity).world.removeEntity(entity);
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBona.block, (int) (1)).getItem(), -1, (int) 1, null);
			if (!world.isRemote) {
				world.createExplosion(null, (int) x, (int) y, (int) z, (float) 2, true);
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityMatapacos.EntityCustom(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
