package net.mcreator.chilecraft.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.entity.EntitySoldado;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.Collection;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureArturopratEntityIsHurt extends ElementsChileanCraftMod.ModElement {
	public ProcedureArturopratEntityIsHurt(ElementsChileanCraftMod instance) {
		super(instance, 691);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ArturopratEntityIsHurt!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ArturopratEntityIsHurt!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ArturopratEntityIsHurt!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ArturopratEntityIsHurt!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ArturopratEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == MobEffects.STRENGTH)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			if ((Math.random() <= 0.05)) {
				if ((Math.random() <= 0.05)) {
					if ((Math.random() <= 0.5)) {
						if ((Math.random() <= 0.5)) {
							if ((Math.random() <= 0.5)) {
								if (!world.isRemote) {
									Entity entityToSpawn = new EntitySoldado.EntityCustom(world);
									if (entityToSpawn != null) {
										entityToSpawn.setLocationAndAngles(x, y, (z + 2), world.rand.nextFloat() * 360F, 0.0F);
										world.spawnEntity(entityToSpawn);
									}
								}
								if (!world.isRemote) {
									Entity entityToSpawn = new EntitySoldado.EntityCustom(world);
									if (entityToSpawn != null) {
										entityToSpawn.setLocationAndAngles(x, y, (z + 2), world.rand.nextFloat() * 360F, 0.0F);
										world.spawnEntity(entityToSpawn);
									}
								}
								if (world instanceof WorldServer)
									((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, y, (z + 2), (int) 8, 3, 3, 3, 1,
											new int[0]);
							} else {
								if (!world.isRemote) {
									Entity entityToSpawn = new EntitySoldado.EntityCustom(world);
									if (entityToSpawn != null) {
										entityToSpawn.setLocationAndAngles((x + 2), y, z, world.rand.nextFloat() * 360F, 0.0F);
										world.spawnEntity(entityToSpawn);
									}
								}
								if (!world.isRemote) {
									Entity entityToSpawn = new EntitySoldado.EntityCustom(world);
									if (entityToSpawn != null) {
										entityToSpawn.setLocationAndAngles((x + 2), y, z, world.rand.nextFloat() * 360F, 0.0F);
										world.spawnEntity(entityToSpawn);
									}
								}
								if (world instanceof WorldServer)
									((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, (x + 2), y, z, (int) 8, 3, 3, 3, 1,
											new int[0]);
							}
						} else {
							if ((Math.random() <= 0.5)) {
								if (!world.isRemote) {
									Entity entityToSpawn = new EntitySoldado.EntityCustom(world);
									if (entityToSpawn != null) {
										entityToSpawn.setLocationAndAngles((x - 2), y, z, world.rand.nextFloat() * 360F, 0.0F);
										world.spawnEntity(entityToSpawn);
									}
								}
								if (!world.isRemote) {
									Entity entityToSpawn = new EntitySoldado.EntityCustom(world);
									if (entityToSpawn != null) {
										entityToSpawn.setLocationAndAngles((x - 2), y, z, world.rand.nextFloat() * 360F, 0.0F);
										world.spawnEntity(entityToSpawn);
									}
								}
								if (world instanceof WorldServer)
									((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, (x - 2), y, z, (int) 8, 3, 3, 3, 1,
											new int[0]);
							} else {
								if (world instanceof WorldServer)
									((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, y, (z - 2), (int) 8, 3, 3, 3, 1,
											new int[0]);
								if (!world.isRemote) {
									Entity entityToSpawn = new EntitySoldado.EntityCustom(world);
									if (entityToSpawn != null) {
										entityToSpawn.setLocationAndAngles(x, y, (z - 2), world.rand.nextFloat() * 360F, 0.0F);
										world.spawnEntity(entityToSpawn);
									}
								}
								if (!world.isRemote) {
									Entity entityToSpawn = new EntitySoldado.EntityCustom(world);
									if (entityToSpawn != null) {
										entityToSpawn.setLocationAndAngles(x, y, (z - 2), world.rand.nextFloat() * 360F, 0.0F);
										world.spawnEntity(entityToSpawn);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
