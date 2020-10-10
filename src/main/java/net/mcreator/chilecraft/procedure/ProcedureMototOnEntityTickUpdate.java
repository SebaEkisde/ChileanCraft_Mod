package net.mcreator.chilecraft.procedure;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMototOnEntityTickUpdate extends ElementsChileanCraftMod.ModElement {

	public ProcedureMototOnEntityTickUpdate(ElementsChileanCraftMod instance) {
		super(instance, 795);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MototOnEntityTickUpdate!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if ((!(new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == MobEffects.NAUSEA)
							return true;
					}
				}
				return false;
			}
		}.check()))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 20, (int) 5, (false), (false)));
		}
		if (((entity.getEntityData().getBoolean("c")) == (true))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 5000, (int) 1, (false), (false)));
			entity.getEntityData().setBoolean("c", (false));
		}

	}

}
