package net.mcreator.chilecraft.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.entity.EntityTromposespinas;
import net.mcreator.chilecraft.entity.EntityTrompofuego;
import net.mcreator.chilecraft.entity.EntityTrompo5;
import net.mcreator.chilecraft.entity.EntityTrompo3;
import net.mcreator.chilecraft.entity.EntityTrompo2;
import net.mcreator.chilecraft.entity.EntityTrompo1;
import net.mcreator.chilecraft.entity.EntityTromp;
import net.mcreator.chilecraft.entity.EntityTromo4;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureRr extends ElementsChileanCraftMod.ModElement {
	public ProcedureRr(ElementsChileanCraftMod instance) {
		super(instance, 781);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Rr!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof EntityTromp.EntityCustom)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 600, (int) 1, (false), (false)));
		}
		if ((entity instanceof EntityTrompo1.EntityCustom)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 600, (int) 1, (false), (false)));
		}
		if ((entity instanceof EntityTrompo2.EntityCustom)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 600, (int) 1, (false), (false)));
		}
		if ((entity instanceof EntityTrompo3.EntityCustom)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 600, (int) 1, (false), (false)));
		}
		if ((entity instanceof EntityTromo4.EntityCustom)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 600, (int) 1, (false), (false)));
		}
		if ((entity instanceof EntityTrompo5.EntityCustom)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 600, (int) 1, (false), (false)));
		}
		if ((entity instanceof EntityTrompofuego.EntityCustom)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 600, (int) 1, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 500000, (int) 1, (false), (false)));
		}
		if ((entity instanceof EntityTromposespinas.EntityCustom)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 600, (int) 1, (false), (false)));
		}
	}

	@SubscribeEvent
	public void onEntitySpawned(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();
		int i = (int) entity.posX;
		int j = (int) entity.posY;
		int k = (int) entity.posZ;
		World world = event.getWorld();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
