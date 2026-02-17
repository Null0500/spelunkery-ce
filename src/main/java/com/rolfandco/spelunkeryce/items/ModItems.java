package com.rolfandco.spelunkeryce.items;

import com.rolfandco.spelunkeryce.Spelunkery;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.rolfandco.spelunkeryce.blocks.ModBlocks.BLOCKS;
import static com.rolfandco.spelunkeryce.blocks.ModBlocks.registerBlock;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Spelunkery.MODID);

    public static final DeferredBlock<Block> SCORCHED_IRON_BLOCK = registerBlock("scorched_iron_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).destroyTime(10))
    );

    public static void register (IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
