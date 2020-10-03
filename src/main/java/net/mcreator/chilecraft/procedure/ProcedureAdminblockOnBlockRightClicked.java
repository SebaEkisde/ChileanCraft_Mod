package net.mcreator.chilecraft.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.chilecraft.block.BlockCopperblock;
import net.mcreator.chilecraft.block.BlockBrdisds;
import net.mcreator.chilecraft.block.BlockAraucaria;
import net.mcreator.chilecraft.ElementsChileanCraftMod;
import net.mcreator.chilecraft.ChileanCraftModVariables;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureAdminblockOnBlockRightClicked extends ElementsChileanCraftMod.ModElement {
	public ProcedureAdminblockOnBlockRightClicked(ElementsChileanCraftMod instance) {
		super(instance, 736);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AdminblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AdminblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AdminblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AdminblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AdminblockOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockCopperblock.block.getDefaultState()
				.getBlock())) {
			ChileanCraftModVariables.WorldVariables.get(world).metro1 = (double) x;
			ChileanCraftModVariables.WorldVariables.get(world).syncData(world);
			ChileanCraftModVariables.WorldVariables.get(world).metro2 = (double) y;
			ChileanCraftModVariables.WorldVariables.get(world).syncData(world);
			ChileanCraftModVariables.WorldVariables.get(world).metro3 = (double) z;
			ChileanCraftModVariables.WorldVariables.get(world).syncData(world);
			{
				MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new TextComponentString("Posicion de metro establecida"));
			}
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockBrdisds.block.getDefaultState().getBlock())) {
			ChileanCraftModVariables.WorldVariables.get(world).carcel = (double) x;
			ChileanCraftModVariables.WorldVariables.get(world).syncData(world);
			ChileanCraftModVariables.WorldVariables.get(world).cale2 = (double) y;
			ChileanCraftModVariables.WorldVariables.get(world).syncData(world);
			ChileanCraftModVariables.WorldVariables.get(world).cale3 = (double) z;
			ChileanCraftModVariables.WorldVariables.get(world).syncData(world);
			{
				MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new TextComponentString("carcel establecida"));
			}
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockAraucaria.block.getDefaultState().getBlock())) {
			{
				MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new TextComponentString("funador creado"));
			}
			{
				ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
				if (!_stack.hasTagCompound())
					_stack.setTagCompound(new NBTTagCompound());
				_stack.getTagCompound().setBoolean("funador", (true));
			}
		}
	}
}
