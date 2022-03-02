package net.mcreator.crops.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.crops.item.AlienRootSeedsItem;
import net.mcreator.crops.CropsMod;

import java.util.Map;
import java.util.HashMap;

public class AlienBreakTallGrassProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onBlockBreak(BlockEvent.BreakEvent event) {
			Entity entity = event.getPlayer();
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("xpAmount", event.getExpToDrop());
			dependencies.put("x", event.getPos().getX());
			dependencies.put("y", event.getPos().getY());
			dependencies.put("z", event.getPos().getZ());
			dependencies.put("px", entity.getPosX());
			dependencies.put("py", entity.getPosY());
			dependencies.put("pz", entity.getPosZ());
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("blockstate", event.getState());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CropsMod.LOGGER.warn("Failed to load dependency world for procedure AlienBreakTallGrass!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CropsMod.LOGGER.warn("Failed to load dependency x for procedure AlienBreakTallGrass!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CropsMod.LOGGER.warn("Failed to load dependency y for procedure AlienBreakTallGrass!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CropsMod.LOGGER.warn("Failed to load dependency z for procedure AlienBreakTallGrass!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CropsMod.LOGGER.warn("Failed to load dependency entity for procedure AlienBreakTallGrass!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double randomNumber = 0;
		ItemStack itemSeeds = ItemStack.EMPTY;
		BlockState blockTallGrass = Blocks.AIR.getDefaultState();
		BlockState blockDoubleTallGrass = Blocks.AIR.getDefaultState();
		BlockState blockFern = Blocks.AIR.getDefaultState();
		BlockState blockDoubleFern = Blocks.AIR.getDefaultState();
		itemSeeds = new ItemStack(AlienRootSeedsItem.block);
		blockFern = Blocks.FERN.getDefaultState();
		blockTallGrass = Blocks.GRASS.getDefaultState();
		blockDoubleFern = Blocks.LARGE_FERN.getDefaultState();
		blockDoubleTallGrass = Blocks.TALL_GRASS.getDefaultState();
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockTallGrass).getBlock()
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockDoubleTallGrass).getBlock()
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockFern).getBlock()
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockDoubleFern).getBlock()) {
			if (!world.isRemote()) {
				randomNumber = Math.random();
			}
			if ((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0) == true) {
				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) == 1) {
					if (randomNumber >= 0 && randomNumber <= 0.041) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (randomNumber > 0.041 && randomNumber <= 0.083) {
						for (int index0 = 0; index0 < (int) (2); index0++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else if (randomNumber > 0.083 && randomNumber <= 0.125) {
						for (int index1 = 0; index1 < (int) (3); index1++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					}
				} else if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) == 2) {
					if (randomNumber >= 0 && randomNumber <= 0.025) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (randomNumber > 0.025 && randomNumber <= 0.05) {
						for (int index2 = 0; index2 < (int) (2); index2++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else if (randomNumber > 0.05 && randomNumber <= 0.075) {
						for (int index3 = 0; index3 < (int) (3); index3++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else if (randomNumber > 0.075 && randomNumber <= 0.1) {
						for (int index4 = 0; index4 < (int) (4); index4++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else if (randomNumber > 0.075 && randomNumber <= 0.125) {
						for (int index5 = 0; index5 < (int) (5); index5++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					}
				} else if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) == 3) {
					if (randomNumber >= 0 && randomNumber <= 0.017) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (randomNumber > 0.017 && randomNumber <= 0.035) {
						for (int index6 = 0; index6 < (int) (2); index6++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else if (randomNumber > 0.035 && randomNumber <= 0.053) {
						for (int index7 = 0; index7 < (int) (3); index7++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else if (randomNumber > 0.053 && randomNumber <= 0.071) {
						for (int index8 = 0; index8 < (int) (4); index8++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else if (randomNumber > 0.071 && randomNumber <= 0.089) {
						for (int index9 = 0; index9 < (int) (5); index9++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else if (randomNumber > 0.089 && randomNumber <= 0.107) {
						for (int index10 = 0; index10 < (int) (6); index10++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else if (randomNumber > 0.107 && randomNumber <= 0.125) {
						for (int index11 = 0; index11 < (int) (7); index11++) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					}
				}
			} else {
				if (randomNumber >= 0 && randomNumber <= 0.125) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeeds));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
