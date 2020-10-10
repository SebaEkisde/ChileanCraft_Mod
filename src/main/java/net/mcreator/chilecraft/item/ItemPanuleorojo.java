
package net.mcreator.chilecraft.item;

@ElementsChileanCraftMod.ModElement.Tag
public class ItemPanuleorojo extends ElementsChileanCraftMod.ModElement {

	@GameRegistry.ObjectHolder("chilean_craft:panuleorojohelmet")
	public static final Item helmet = null;

	@GameRegistry.ObjectHolder("chilean_craft:panuleorojobody")
	public static final Item body = null;

	@GameRegistry.ObjectHolder("chilean_craft:panuleorojolegs")
	public static final Item legs = null;

	@GameRegistry.ObjectHolder("chilean_craft:panuleorojoboots")
	public static final Item boots = null;

	public ItemPanuleorojo(ElementsChileanCraftMod instance) {
		super(instance, 791);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PANULEOROJO", "chilean_craft:2020-09-30-224350-dibujoe_", 23,
				new int[]{2, 5, 6, 1}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				0f);

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("panuleorojohelmet")
				.setRegistryName("panuleorojohelmet").setCreativeTab(TabChilecraft.tab));

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("chilean_craft:panuleorojohelmet", "inventory"));

	}

}
