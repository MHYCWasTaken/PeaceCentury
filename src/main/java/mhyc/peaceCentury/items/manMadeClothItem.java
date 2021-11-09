package mhyc.peaceCentury.items;

import mhyc.peaceCentury.PeaceCentury;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;

public class manMadeClothItem extends Item {
    public manMadeClothItem(Item.Properties itemProperties){
        super(itemProperties);
        this.setRegistryName("man_made_cloth");
        //ResourceLocation("peace_century", "man_made_cloth.json");

    }
}
