package team.blackmesa.halfcraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import team.blackmesa.halfcraft.util.Constants;
import team.blackmesa.halfcraft.util.HalfCraftRegistry;

@Mod("halfcraft")
public class HalfCraft {
    protected static final Logger LOGGER = LogManager.getLogger();

    public HalfCraft() {
        LOGGER.info("[{}] Initializing...", Constants.MODID);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        GeckoLib.initialize();
        HalfCraftRegistry.registerAll(FMLJavaModLoadingContext.get().getModEventBus());

        LOGGER.info("[{}] Loaded successfully.", Constants.MODID);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // empty
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // empty
    }
}
