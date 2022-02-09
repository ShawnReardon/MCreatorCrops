package net.mcreator.crops.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.crops.item.AlienRootSeedsItem;
import net.mcreator.crops.item.AlienRootItem;
import net.mcreator.crops.CropsMod;

import java.util.Map;

public class AlienRootFullyGrownExplosionDropsProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CropsMod.LOGGER.warn("Failed to load dependency world for procedure AlienRootFullyGrownExplosionDrops!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CropsMod.LOGGER.warn("Failed to load dependency x for procedure AlienRootFullyGrownExplosionDrops!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CropsMod.LOGGER.warn("Failed to load dependency y for procedure AlienRootFullyGrownExplosionDrops!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CropsMod.LOGGER.warn("Failed to load dependency z for procedure AlienRootFullyGrownExplosionDrops!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double randomNumber = 0;
		ItemStack itemSeed = ItemStack.EMPTY;
		ItemStack itemCrop = ItemStack.EMPTY;
		itemSeed = new ItemStack(AlienRootSeedsItem.block);
		itemCrop = new ItemStack(AlienRootItem.block);
		if (!world.isRemote()) {
			randomNumber = Math.random();
		}
		if (randomNumber > 0.809 && randomNumber <= 1) {
			for (int index0 = 0; index0 < (int) (3); index0++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemSeed));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if (randomNumber > 0.39 && randomNumber <= 0.809) {
			for (int index1 = 0; index1 < (int) (2); index1++) {
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
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), (itemCrop));
			entityToSpawn.setPickupDelay((int) 10);
			world.addEntity(entityToSpawn);
		}
	}
}
