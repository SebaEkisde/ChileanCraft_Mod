
package net.mcreator.chilecraft.item;

@ElementsChileanCraftMod.ModElement.Tag
public class ItemPesos2000 extends ElementsChileanCraftMod.ModElement {

	@GameRegistry.ObjectHolder("chilean_craft:pesos_2000")
	public static final Item block = null;

	public ItemPesos2000(ElementsChileanCraftMod instance) {
		super(instance, 799);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chilean_craft:pesos_2000", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("pesos_2000");
			setRegistryName("pesos_2000");
			setCreativeTab(TabChilecraft.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

	}

}
