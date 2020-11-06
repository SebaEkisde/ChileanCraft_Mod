package net.mcreator.chilecraft.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.item.ItemStack;

import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureParticulaa extends ElementsChileanCraftMod.ModElement {
	public ProcedureParticulaa(ElementsChileanCraftMod instance) {
		super(instance, 793);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure Particulaa!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Particulaa!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Particulaa!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Particulaa!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Particulaa!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("flame")) == (true))) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.FLAME, x, (y + 1), z, (int) 5, 3, 3, 3, 1, new int[0]);
		}
		if ((((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("buble")) == (true))) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.WATER_BUBBLE, x, (y + 1), z, (int) 5, 3, 3, 3, 1, new int[0]);
		}
		if ((((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("portal")) == (true))) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.PORTAL, x, (y + 1), z, (int) 5, 3, 3, 3, 1, new int[0]);
		}
		if ((((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("book")) == (true))) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, x, (y + 1), z, (int) 5, 3, 3, 3, 1, new int[0]);
		}
		if ((((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("smoke")) == (true))) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x, (y + 1), z, (int) 5, 3, 3, 3, 1, new int[0]);
		}
		if ((((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("note")) == (true))) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.NOTE, x, (y + 1), z, (int) 5, 3, 3, 3, 1, new int[0]);
		}
	}
}
