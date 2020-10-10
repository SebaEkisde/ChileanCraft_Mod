package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.world.GameType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;
import net.mcreator.chilecraft.ChileanCraftModVariables;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureArma extends ElementsChileanCraftMod.ModElement {
	public ProcedureArma(ElementsChileanCraftMod instance) {
		super(instance, 744);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Arma!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Arma!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		entity.getEntityData().setBoolean("cer", (true));
		entity.setPositionAndUpdate((ChileanCraftModVariables.WorldVariables.get(world).carcel),
				((ChileanCraftModVariables.WorldVariables.get(world).cale2) + 1), (ChileanCraftModVariables.WorldVariables.get(world).cale3));
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).setGameType(GameType.ADVENTURE);
	}
}
