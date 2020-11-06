package net.mcreator.chilecraft.procedure;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureSe extends ElementsChileanCraftMod.ModElement {

	public ProcedureSe(ElementsChileanCraftMod instance) {
		super(instance, 822);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Se!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemPesos200.block, (int) (1)))
				: false)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemSerranita.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemPesos200.block, (int) (1)).getItem(), -1, (int) 1, null);
		}

	}

}
