package midpoint;

import net.fabricmc.api.ClientModInitializer;

import midpoint.core.MidpointClient;


public class Midpoint implements ClientModInitializer {


    @Override
    public void onInitializeClient() {

        MidpointClient.INSTANCE.initialize();

    }


}
