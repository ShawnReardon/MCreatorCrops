package net.mcreator.crops.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.crops.item.AlienRootSeedsItem;
import net.mcreator.crops.block.AlienRoot0Block;
import net.mcreator.crops.CropsMod;

import java.util.Map;
import java.util.HashMap;

public class AlienRootSeedsGlobalBlockRightClickedProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
			PlayerEntity entity = event.getPlayer();
			if (event.getHand() != entity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			BlockState state = world.getBlockState(event.getPos());
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("direction", event.getFace());
			dependencies.put("blockstate", state);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CropsMod.LOGGER.warn("Failed to load dependency world for procedure AlienRootSeedsGlobalBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CropsMod.LOGGER.warn("Failed to load dependency x for procedure AlienRootSeedsGlobalBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CropsMod.LOGGER.warn("Failed to load dependency y for procedure AlienRootSeedsGlobalBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CropsMod.LOGGER.warn("Failed to load dependency z for procedure AlienRootSeedsGlobalBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CropsMod.LOGGER.warn("Failed to load dependency entity for procedure AlienRootSeedsGlobalBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemSeeds = ItemStack.EMPTY;
		BlockState blockStag0 = Blocks.AIR.getDefaultState();
		BlockState blockFarmland = Blocks.AIR.getDefaultState();
		itemSeeds = new ItemStack(AlienRootSeedsItem.block);
		blockStag0 = AlienRoot0Block.block.getDefaultState();
		blockFarmland = Blocks.FARMLAND.getDefaultState();
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == (itemSeeds).getItem()
				&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == (blockFarmland).getBlock()
				&& (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.AIR) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
				BlockState _bs = (blockStag0);
				world.setBlockState(_bp, _bs, 3);
			}
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = (itemSeeds);
				_setstack.setCount(
						(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getCount()
								- 1));
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
