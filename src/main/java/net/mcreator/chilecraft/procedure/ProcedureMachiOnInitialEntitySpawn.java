package net.mcreator.chilecraft.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.block.BlockRuda;
import net.mcreator.chilecraft.block.BlockCebolla;
import net.mcreator.chilecraft.block.BlockBailahuen;
import net.mcreator.chilecraft.block.BlockAraucariaplant;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureMachiOnInitialEntitySpawn extends ElementsChileanCraftMod.ModElement {
	public ProcedureMachiOnInitialEntitySpawn(ElementsChileanCraftMod instance) {
		super(instance, 722);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MachiOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.5)) {
			if ((Math.random() < 0.5)) {
				if (entity instanceof EntityLivingBase) {
					ItemStack _setstack = new ItemStack(BlockBailahuen.block, (int) (1));
					_setstack.setCount(1);
					((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
					if (entity instanceof EntityPlayerMP)
						((EntityPlayerMP) entity).inventory.markDirty();
				}
			} else {
				if (entity instanceof EntityLivingBase) {
					ItemStack _setstack = new ItemStack(BlockCebolla.block, (int) (1));
					_setstack.setCount(1);
					((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
					if (entity instanceof EntityPlayerMP)
						((EntityPlayerMP) entity).inventory.markDirty();
				}
			}
		} else {
			if ((Math.random() < 0.5)) {
				if (entity instanceof EntityLivingBase) {
					ItemStack _setstack = new ItemStack(BlockRuda.block, (int) (1));
					_setstack.setCount(1);
					((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
					if (entity instanceof EntityPlayerMP)
						((EntityPlayerMP) entity).inventory.markDirty();
				}
			} else {
				if (entity instanceof EntityLivingBase) {
					ItemStack _setstack = new ItemStack(BlockAraucariaplant.block, (int) (1));
					_setstack.setCount(1);
					((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
					if (entity instanceof EntityPlayerMP)
						((EntityPlayerMP) entity).inventory.markDirty();
				}
			}
		}
		if ((Math.random() < 0.5)) {
			if ((Math.random() < 0.5)) {
				entity.setCustomNameTag("Kuyen");
			} else {
				if ((Math.random() < 0.5)) {
					entity.setCustomNameTag("Rayen");
				} else {
					entity.setCustomNameTag("Rayliwen");
				}
			}
		} else {
			if ((Math.random() < 0.5)) {
				if ((Math.random() < 0.5)) {
					entity.setCustomNameTag("Inara");
				} else {
					entity.setCustomNameTag("Sayen");
				}
			} else {
				entity.setCustomNameTag("Anelei");
			}
		}
	}
}
