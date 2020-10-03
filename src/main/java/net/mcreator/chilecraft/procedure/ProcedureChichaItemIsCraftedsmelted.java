package net.mcreator.chilecraft.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;
import java.util.Iterator;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureChichaItemIsCraftedsmelted extends ElementsChileanCraftMod.ModElement {
	public ProcedureChichaItemIsCraftedsmelted(ElementsChileanCraftMod instance) {
		super(instance, 594);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ChichaItemIsCraftedsmelted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(((entity instanceof EntityPlayerMP) && ((entity).world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(
								((WorldServer) (entity).world).getAdvancementManager().getAdvancement(new ResourceLocation("chilean_craft:brindo")))
						.isDone()
				: false))) {
			if (entity instanceof EntityPlayerMP) {
				Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
						.getAdvancement(new ResourceLocation("chilean_craft:brindo"));
				AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}
}
