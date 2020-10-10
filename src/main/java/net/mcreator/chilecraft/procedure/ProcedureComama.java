package net.mcreator.chilecraft.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.chilecraft.ElementsChileanCraftMod;
import net.mcreator.chilecraft.ChileanCraftModVariables;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureComama extends ElementsChileanCraftMod.ModElement {
	public ProcedureComama(ElementsChileanCraftMod instance) {
		super(instance, 811);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Comama!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Comama!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((entity.getEntityData().getBoolean("cer")) == (true))) {
			entity.setPositionAndUpdate((ChileanCraftModVariables.WorldVariables.get(world).carcel),
					(ChileanCraftModVariables.WorldVariables.get(world).cale2), (ChileanCraftModVariables.WorldVariables.get(world).cale3));
		}
	}

	@SubscribeEvent
	public void onCommand(CommandEvent event) {
		ICommandSender sender = event.getSender();
		Entity entity = sender.getCommandSenderEntity();
		if (entity != null) {
			int i = (int) sender.getPosition().getX();
			int j = (int) sender.getPosition().getY();
			int k = (int) sender.getPosition().getZ();
			String command = event.getCommand().getName();
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("command", command);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
