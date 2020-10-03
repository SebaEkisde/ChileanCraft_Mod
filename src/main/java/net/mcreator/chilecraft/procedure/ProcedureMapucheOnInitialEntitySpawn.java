package net.mcreator.chilecraft.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.item.ItemPonchoMapuche;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMapucheOnInitialEntitySpawn extends ElementsChileanCraftMod.ModElement {
	public ProcedureMapucheOnInitialEntitySpawn(ElementsChileanCraftMod instance) {
		super(instance, 711);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MapucheOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.1)) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(Items.STONE_AXE, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		}
		if ((Math.random() < 0.5)) {
			if ((Math.random() < 0.5)) {
				if ((Math.random() < 0.5)) {
					entity.setCustomNameTag("Koyam");
				} else {
					entity.setCustomNameTag("Antu");
				}
			} else {
				if ((Math.random() < 0.5)) {
					entity.setCustomNameTag("Huilen");
				} else {
					entity.setCustomNameTag("Newen");
				}
			}
		} else {
			if ((Math.random() < 0.5)) {
				if ((Math.random() < 0.5)) {
					entity.setCustomNameTag("Lienantu");
				} else {
					entity.setCustomNameTag("Lincollan");
				}
			} else {
				if ((Math.random() < 0.5)) {
					entity.setCustomNameTag("Nahuel");
				} else {
					entity.setCustomNameTag("Nahuelpan");
				}
			}
		}
		if ((Math.random() < 0.5)) {
			if ((Math.random() < 0.5)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 0, (int) 0, (false), (false)));
			} else {
				if (entity instanceof EntityPlayer) {
					((EntityPlayer) entity).inventory.armorInventory.set(3, new ItemStack(ItemPonchoMapuche.helmet, (int) (1)));
					if (entity instanceof EntityPlayerMP)
						((EntityPlayerMP) entity).inventory.markDirty();
				}
				/* @ItemStack */
			}
		} else {
			if ((Math.random() < 0.5)) {
				if (entity instanceof EntityPlayer) {
					((EntityPlayer) entity).inventory.armorInventory.set(3, new ItemStack(ItemPonchoMapuche.helmet, (int) (1)));
					if (entity instanceof EntityPlayerMP)
						((EntityPlayerMP) entity).inventory.markDirty();
				}
				/* @ItemStack */
				if (entity instanceof EntityPlayer) {
					((EntityPlayer) entity).inventory.armorInventory.set(2, new ItemStack(ItemPonchoMapuche.body, (int) (1)));
					if (entity instanceof EntityPlayerMP)
						((EntityPlayerMP) entity).inventory.markDirty();
				}
				/* @ItemStack */
			} else {
				if (entity instanceof EntityPlayer) {
					((EntityPlayer) entity).inventory.armorInventory.set(2, new ItemStack(ItemPonchoMapuche.body, (int) (1)));
					if (entity instanceof EntityPlayerMP)
						((EntityPlayerMP) entity).inventory.markDirty();
				}
				/* @ItemStack */
			}
		}
	}
}
