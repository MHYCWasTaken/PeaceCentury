package mhyc.peaceCentury.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class fermentationBarrelBlock extends Block {
    public fermentationBarrelBlock(BlockBehaviour.Properties blockProperties){
        super(blockProperties);
        this.setRegistryName("fermentation_barrel");
    }
}
