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
import net.minecraft.entity.item.EntityItem;
import net.minecraft.block.state.IBlockState;

import net.mcreator.chilecraft.item.ItemSemillauva;
import net.mcreator.chilecraft.item.ItemSemillatomate;
import net.mcreator.chilecraft.item.ItemSemilaparra;
import net.mcreator.chilecraft.item.ItemMaizsemilla;
import net.mcreator.chilecraft.item.ItemCebollafruit;
import net.mcreator.chilecraft.ElementsChileanCraftMod;

import java.util.Map;

@ElementsChileanCraftMod.ModElement.Tag
public class ProcedureDseeds extends ElementsChileanCraftMod.ModElement {
	public ProcedureDseeds(ElementsChileanCraftMod instance) {
		super(instance, 318);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Dseeds!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Dseeds!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Dseeds!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Dseeds!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((new Object() {
			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), Blocks.TALLGRASS.getStateFromMeta(1)))) {
			if ((Math.random() > 0.5)) {
				if ((Math.random() > 0.5)) {
					if ((Math.random() > 0.5)) {
						if ((Math.random() > 0.5)) {
							if ((Math.random() > 0.5)) {
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMaizsemilla.block, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
							} else {
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemSemillatomate.block, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
							}
						} else {
							if ((Math.random() > 0.5)) {
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemCebollafruit.block, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
							} else {
								if ((Math.random() > 0.5)) {
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemSemilaparra.block, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
								} else {
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemSemillauva.block, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
								}
							}
						}
					} else {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				} else {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}

	@SubscribeEvent
	public void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
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
