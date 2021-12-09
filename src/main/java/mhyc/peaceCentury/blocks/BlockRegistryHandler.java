package mhyc.peaceCentury.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder("peace_century")
public class BlockRegistryHandler {

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(
                new fermentationBarrelBlock(new BlockBehaviour.Properties())
        );
    }
}
