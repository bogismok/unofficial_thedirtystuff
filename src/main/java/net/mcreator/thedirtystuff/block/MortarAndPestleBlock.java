
package net.mcreator.thedirtystuff.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.thedirtystuff.procedures.MortarAndPestleOnBlockRightClickedProcedure;
import net.mcreator.thedirtystuff.block.entity.MortarAndPestleBlockEntity;

public class MortarAndPestleBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 4);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public MortarAndPestleBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 5, 7, 7, 7)), Shapes.or(box(5, 3.5, 7, 11, 4, 11), box(7, 3.5, 5, 11, 4, 7)), BooleanOp.ONLY_FIRST);
				case NORTH -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 9, 11, 7, 11)), Shapes.or(box(5, 3.5, 5, 11, 4, 9), box(5, 3.5, 9, 9, 4, 11)), BooleanOp.ONLY_FIRST);
				case EAST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 9, 7, 7, 11)), Shapes.or(box(7, 3.5, 5, 11, 4, 11), box(5, 3.5, 5, 7, 4, 9)), BooleanOp.ONLY_FIRST);
				case WEST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 5, 11, 7, 7)), Shapes.or(box(5, 3.5, 5, 9, 4, 11), box(9, 3.5, 7, 11, 4, 11)), BooleanOp.ONLY_FIRST);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 5, 7, 7, 7)), Shapes.or(box(5, 3.5, 7, 11, 4, 11), box(7, 3.5, 5, 11, 4, 7)), BooleanOp.ONLY_FIRST);
				case NORTH -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 9, 11, 7, 11)), Shapes.or(box(5, 3.5, 5, 11, 4, 9), box(5, 3.5, 9, 9, 4, 11)), BooleanOp.ONLY_FIRST);
				case EAST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 9, 7, 7, 11)), Shapes.or(box(7, 3.5, 5, 11, 4, 11), box(5, 3.5, 5, 7, 4, 9)), BooleanOp.ONLY_FIRST);
				case WEST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 5, 11, 7, 7)), Shapes.or(box(5, 3.5, 5, 9, 4, 11), box(9, 3.5, 7, 11, 4, 11)), BooleanOp.ONLY_FIRST);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 5, 7, 7, 7)), Shapes.or(box(5, 3.5, 7, 11, 4, 11), box(7, 3.5, 5, 11, 4, 7)), BooleanOp.ONLY_FIRST);
				case NORTH -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 9, 11, 7, 11)), Shapes.or(box(5, 3.5, 5, 11, 4, 9), box(5, 3.5, 9, 9, 4, 11)), BooleanOp.ONLY_FIRST);
				case EAST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 9, 7, 7, 11)), Shapes.or(box(7, 3.5, 5, 11, 4, 11), box(5, 3.5, 5, 7, 4, 9)), BooleanOp.ONLY_FIRST);
				case WEST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 5, 11, 7, 7)), Shapes.or(box(5, 3.5, 5, 9, 4, 11), box(9, 3.5, 7, 11, 4, 11)), BooleanOp.ONLY_FIRST);
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 5, 7, 7, 7)), Shapes.or(box(5, 3.5, 7, 11, 4, 11), box(7, 3.5, 5, 11, 4, 7)), BooleanOp.ONLY_FIRST);
				case NORTH -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 9, 11, 7, 11)), Shapes.or(box(5, 3.5, 5, 11, 4, 9), box(5, 3.5, 9, 9, 4, 11)), BooleanOp.ONLY_FIRST);
				case EAST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 9, 7, 7, 11)), Shapes.or(box(7, 3.5, 5, 11, 4, 11), box(5, 3.5, 5, 7, 4, 9)), BooleanOp.ONLY_FIRST);
				case WEST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 5, 11, 7, 7)), Shapes.or(box(5, 3.5, 5, 9, 4, 11), box(9, 3.5, 7, 11, 4, 11)), BooleanOp.ONLY_FIRST);
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 5, 7, 7, 7)), Shapes.or(box(5, 1, 7, 11, 4, 11), box(7, 1, 5, 11, 4, 7)), BooleanOp.ONLY_FIRST);
			case NORTH -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 9, 11, 7, 11)), Shapes.or(box(5, 1, 5, 11, 4, 9), box(5, 1, 9, 9, 4, 11)), BooleanOp.ONLY_FIRST);
			case EAST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(5, 4, 9, 7, 7, 11)), Shapes.or(box(7, 1, 5, 11, 4, 11), box(5, 1, 5, 7, 4, 9)), BooleanOp.ONLY_FIRST);
			case WEST -> Shapes.join(Shapes.or(box(3, 0, 3, 13, 4, 13), box(9, 4, 5, 11, 7, 7)), Shapes.or(box(5, 1, 5, 9, 4, 11), box(9, 1, 7, 11, 4, 11)), BooleanOp.ONLY_FIRST);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.DESTROY;
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		MortarAndPestleOnBlockRightClickedProcedure.execute(world, x, y, z, blockstate, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new MortarAndPestleBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof MortarAndPestleBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof MortarAndPestleBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
