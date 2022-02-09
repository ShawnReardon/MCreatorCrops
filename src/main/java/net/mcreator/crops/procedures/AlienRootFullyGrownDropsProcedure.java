package net.mcreator.crops.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.crops.item.AlienRootSeedsItem;
import net.mcreator.crops.item.AlienRootItem;
import net.mcreator.crops.CropsMod;

import java.util.Map;

public class AlienRootFullyGrownDropsProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CropsMod.LOGGER.warn("Failed to load dependency world for procedure AlienRootFullyGrownDrops!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CropsMod.LOGGER.warn("Failed to load dependency x for procedure AlienRootFullyGrownDrops!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CropsMod.LOGGER.warn("Failed to load dependency y for procedure AlienRootFullyGrownDrops!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CropsMod.LOGGER.warn("Failed to load dependency z for procedure AlienRootFullyGrownDrops!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CropsMod.LOGGER.warn("Failed to load dependency entity for procedure AlienRootFullyGrownDrops!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double randomNumber = 0;
		ItemStack itemSeed = ItemStack.EMPTY;
		ItemStack itemCrop = ItemStack.EMPTY;
		itemSeed = new ItemStack(AlienRootSeedsItem.block);
		itemCrop = new ItemStack(AlienRootItem.block);
		if (!world.isRemote()) {
			randomNumber = Math.random();
		}
		if ((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0)) {
			if (EnchantmentHelper.getEnchantmentLevel(Enchantments.PROTECTION,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) == 1) {
				if (randomNumber > 0.575 && randomNumber <= 1) {
					for (int index0 = 0; index0 < (int) (4); index0++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.216 && randomNumber <= 0.575) {
					for (int index1 = 0; index1 < (int) (3); index1++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.216 && randomNumber <= 0.575) {
					for (int index2 = 0; index2 < (int) (2); index2++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.037 && randomNumber <= 0.216) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (EnchantmentHelper.getEnchantmentLevel(Enchantments.PROTECTION,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) == 2) {
				if (randomNumber > 0.937 && randomNumber <= 1) {
					for (int index3 = 0; index3 < (int) (5); index3++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.709 && randomNumber <= 0.937) {
					for (int index4 = 0; index4 < (int) (4); index4++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.367 && randomNumber <= 0.709) {
					for (int index5 = 0; index5 < (int) (3); index5++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.11 && randomNumber <= 0.367) {
					for (int index6 = 0; index6 < (int) (2); index6++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.014 && randomNumber <= 0.11) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else {
				if (randomNumber > 0.962 && randomNumber <= 1) {
					for (int index7 = 0; index7 < (int) (6); index7++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.806 && randomNumber <= 0.962) {
					for (int index8 = 0; index8 < (int) (5); index8++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.513 && randomNumber <= 0.806) {
					for (int index9 = 0; index9 < (int) (4); index9++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.22 && randomNumber <= 0.513) {
					for (int index10 = 0; index10 < (int) (3); index10++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.055 && randomNumber <= 0.22) {
					for (int index11 = 0; index11 < (int) (2); index11++) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (randomNumber > 0.006 && randomNumber <= 0.055) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		} else {
			if (randomNumber > 0.809 && randomNumber <= 1) {
				for (int index12 = 0; index12 < (int) (3); index12++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (randomNumber > 0.39 && randomNumber <= 0.809) {
				for (int index13 = 0; index13 < (int) (2); index13++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (randomNumber > 0.076 && randomNumber <= 0.39) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		}
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemCrop));
			entityToSpawn.setPickupDelay((int) 10);
			world.addEntity(entityToSpawn);
		}
	}
}
