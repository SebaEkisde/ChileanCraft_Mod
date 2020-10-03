package net.mcreator.chilecraft.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.Collection;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureTrompOnEntityTickUpdate extends ElementsChileanCraftMod.ModElement {
	public ProcedureTrompOnEntityTickUpdate(ElementsChileanCraftMod instance) {
		super(instance, 706);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TrompOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.1)) {
			if ((Math.random() < 0.5)) {
				if ((!(new Object() {
					boolean check() {
						if (entity instanceof EntityLivingBase) {
							Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
							for (PotionEffect effect : effects) {
								if (effect.getPotion() == MobEffects.SPEED)
									return true;
							}
						}
						return false;
					}
				}.check()))) {
					entity.attackEntityFrom(DamageSource.GENERIC, (float) 20);
				}
			}
		}
	}
}
