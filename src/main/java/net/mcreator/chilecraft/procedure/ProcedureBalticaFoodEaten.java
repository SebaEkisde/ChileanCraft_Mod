package net.mcreator.chilecraft.procedure;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureBalticaFoodEaten extends ElementsChileanCraftMod.ModElement {

	public ProcedureBalticaFoodEaten(ElementsChileanCraftMod instance) {
		super(instance, 814);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BalticaFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 290, (int) 1));

	}

}
