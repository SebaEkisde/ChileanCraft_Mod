package net.mcreator.chilecraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.ElementsChileanCraftMod;
import net.mcreator.chilecraft.ChileanCraftModVariables;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMetroCommandExecuted extends ElementsChileanCraftMod.ModElement {
	public ProcedureMetroCommandExecuted(ElementsChileanCraftMod instance) {
		super(instance, 737);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MetroCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MetroCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((((((entity.posZ) > ((ChileanCraftModVariables.WorldVariables.get(world).metro3) - 10))
				&& ((entity.posZ) < ((ChileanCraftModVariables.WorldVariables.get(world).metro3) + 10)))
				&& (((entity.posY) < ((ChileanCraftModVariables.WorldVariables.get(world).metro2) + 10))
						&& ((entity.posY) > ((ChileanCraftModVariables.WorldVariables.get(world).metro2) - 10))))
				&& ((((entity.posX) > ((ChileanCraftModVariables.WorldVariables.get(world).metro1) - 10))
						&& ((entity.posX) < ((ChileanCraftModVariables.WorldVariables.get(world).metro1) + 10)))
						&& (((entity.posY) < ((ChileanCraftModVariables.WorldVariables.get(world).metro2) + 10))
								&& ((entity.posY) > ((ChileanCraftModVariables.WorldVariables.get(world).metro2) - 10)))))) {
			entity.setPositionAndUpdate((ChileanCraftModVariables.WorldVariables.get(world).metro1),
					(ChileanCraftModVariables.WorldVariables.get(world).metro2), (ChileanCraftModVariables.WorldVariables.get(world).metro3));
		}
		if ((!(((((entity.posZ) > ((ChileanCraftModVariables.WorldVariables.get(world).metro3) - 10))
				&& ((entity.posZ) < ((ChileanCraftModVariables.WorldVariables.get(world).metro3) + 10)))
				&& (((entity.posY) < ((ChileanCraftModVariables.WorldVariables.get(world).metro2) + 10))
						&& ((entity.posY) > ((ChileanCraftModVariables.WorldVariables.get(world).metro2) - 10))))
				&& ((((entity.posX) > ((ChileanCraftModVariables.WorldVariables.get(world).metro1) - 10))
						&& ((entity.posX) < ((ChileanCraftModVariables.WorldVariables.get(world).metro1) + 10)))
						&& (((entity.posY) < ((ChileanCraftModVariables.WorldVariables.get(world).metro2) + 10))
								&& ((entity.posY) > ((ChileanCraftModVariables.WorldVariables.get(world).metro2) - 10))))))) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Estas muy lejos del metro"), (true));
			}
		}
	}
}
