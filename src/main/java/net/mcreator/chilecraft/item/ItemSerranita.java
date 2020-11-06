
package net.mcreator.chilecraft.item;

@ElementsChileanCraftMod.ModElement.Tag
public class ItemSerranita extends ElementsChileanCraftMod.ModElement {

	@GameRegistry.ObjectHolder("chilean_craft:serranita")
	public static final Item block = null;

	public ItemSerranita(ElementsChileanCraftMod instance) {
		super(instance, 815);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chilean_craft:serranita", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {

		public ItemFoodCustom() {
			super(10, 0.6f, false);
			setUnlocalizedName("serranita");
			setRegistryName("serranita");

			setCreativeTab(TabChileanFood.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

	}

}
