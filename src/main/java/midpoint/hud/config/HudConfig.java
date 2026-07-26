package midpoint.hud.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import midpoint.hud.Huds;
import midpoint.hud.element.HudElement;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;


public class HudConfig {

    private static final Gson GSON =
            new GsonBuilder()
                    .setPrettyPrinting()
                    .create();


    private static final File FILE =
            new File("config/midpoint/hud.json");


    public static void save() {

        try {

            FILE.getParentFile().mkdirs();

            Map<String, PositionData> data = new HashMap<>();

            for (HudElement element : Huds.MANAGER.getElements()) {

                data.put(
                        element.getClass().getSimpleName(),
                        new PositionData(
                                element.getX(),
                                element.getY()
                        )
                );

            }


            FileWriter writer = new FileWriter(FILE);

            GSON.toJson(data, writer);

            writer.close();


        } catch (Exception e) {

            e.printStackTrace();

        }

    }



    public static void load() {

        try {

            if (!FILE.exists())
                return;


            FileReader reader = new FileReader(FILE);

            Map<String, PositionData> data =
                    GSON.fromJson(reader, Map.class);


            reader.close();


        } catch (Exception e) {

            e.printStackTrace();

        }

    }



    private static class PositionData {

        float x;
        float y;


        PositionData(float x, float y) {

            this.x = x;
            this.y = y;

        }
    }
}
