package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.gui.GuiAldeanoHuasoGui1;
import net.mcreator.chilecraft.ElementsChileanCraftMod;
import net.mcreator.chilecraft.ChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureAldeanoHuasoRightClickedOnEntity extends ElementsChileanCraftMod.ModElement {
	public ProcedureAldeanoHuasoRightClickedOnEntity(ElementsChileanCraftMod instance) {
		super(instance, 541);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AldeanoHuasoRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AldeanoHuasoRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AldeanoHuasoRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AldeanoHuasoRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AldeanoHuasoRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(ChileanCraftMod.instance, GuiAldeanoHuasoGui1.GUIID, world, x, y, z);
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.villager.trading")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
	}
}
