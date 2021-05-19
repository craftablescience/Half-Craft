package team.blackmesa.halfcraft.util;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import team.blackmesa.halfcraft.items.CrowbarItem;

public class HalfCraftRegistry {
    // Registers
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MODID);

    // Items
    public static final RegistryObject<Item> CROWBAR = ITEMS.register(Constants.Items.CROWBAR, CrowbarItem::new);

    public static void registerAll(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
