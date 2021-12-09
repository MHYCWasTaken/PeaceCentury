package mhyc.peaceCentury.items;

import net.minecraft.world.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder("peace_century")
public class ItemRegistryHandler {
    @SubscribeEvent
    public static void onRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                new manMadeClothItem((new Item.Properties()).tab(CreativeModeTab.TAB_MISC)),
                new granitePowderItem((new Item.Properties()).tab(CreativeModeTab.TAB_MISC)),
                new dioritePowderItem((new Item.Properties()).tab(CreativeModeTab.TAB_MISC))
        );
    }
}
