package net.mcreator.chilecraft.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.item.ItemMorita;
import net.mcreator.chilecraft.block.BlockMora6;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureSemla extends ElementsChileanCraftMod.ModElement {
	public ProcedureSemla(ElementsChileanCraftMod instance) {
		super(instance, 360);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Semla!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Semla!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Semla!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Semla!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Semla!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), Blocks.GRASS.getDefaultState())) && ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))), Blocks.AIR.getDefaultState()))
				&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(ItemMorita.block, (int) (1)).getItem()
						&& ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getMetadata() == new ItemStack(ItemMorita.block, (int) (1)).getMetadata())))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockMora6.block.getDefaultState(), 3);
		}
	}

	@SubscribeEvent
	public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		EntityPlayer entity = event.getEntityPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
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
