package midpoint;

import midpoint.core.Managers;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MidpointClient implements ClientModInitializer {

    public static final String NAME = "Midpoint Visuals";
    public static final String VERSION = "0.1.0";

    public static final Logger LOGGER =
            LoggerFactory.getLogger(NAME);

    @Override
    public void onInitializeClient() {

        LOGGER.info("================================");
        LOGGER.info("{} loading...", NAME);
        LOGGER.info("Version: {}", VERSION);

        Managers.initialize();

        LOGGER.info("Core managers initialized");
        LOGGER.info("{} successfully loaded!", NAME);
        LOGGER.info("================================");
    }
}
