package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureGorrodelanaBodyTickEventf extends ElementsChileanCraftMod.ModElement {
	public ProcedureGorrodelanaBodyTickEventf(ElementsChileanCraftMod instance) {
		super(instance, 764);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GorrodelanaBodyTickEventf!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GorrodelanaBodyTickEventf!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GorrodelanaBodyTickEventf!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GorrodelanaBodyTickEventf!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GorrodelanaBodyTickEventf!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((!(entity.isSneaking()))) {
			entity.getEntityData().setBoolean("ci", (false));
		}
		if ((entity.isSneaking())) {
			if ((!((entity.getEntityData().getBoolean("ci")) == (true)))) {
				world.playSound((EntityPlayer) null, x, y, z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("chilean_craft:pla")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
				entity.getEntityData().setBoolean("ci", (true));
			}
		}
	}
}
