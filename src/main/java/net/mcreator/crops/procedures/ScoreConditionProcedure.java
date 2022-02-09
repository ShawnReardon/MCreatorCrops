package net.mcreator.crops.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.crops.CropsMod;

import java.util.Map;
import java.util.Calendar;

public class ScoreConditionProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CropsMod.LOGGER.warn("Failed to load dependency world for procedure ScoreCondition!");
			return false;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CropsMod.LOGGER.warn("Failed to load dependency x for procedure ScoreCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CropsMod.LOGGER.warn("Failed to load dependency y for procedure ScoreCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CropsMod.LOGGER.warn("Failed to load dependency z for procedure ScoreCondition!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		BlockState blockFarmland = Blocks.AIR.getDefaultState();
		double numberScore = 0;
		String textTag = "";
		String textNamespace = "";
		textNamespace = "crops";
		textTag = "alien_root";
		blockFarmland = Blocks.FARMLAND.getDefaultState();
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == (blockFarmland).getBlock()
				&& 0 == Calendar.getInstance().get(Calendar.SECOND) % 7 && Math.random() < 0.01) {
			return true;
		}
		return false;
	}
}
