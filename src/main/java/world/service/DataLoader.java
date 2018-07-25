package world.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import world.model.Country;
import world.model.World;

import javax.annotation.PostConstruct;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class DataLoader {
    private final static String fileName = "countries.json";

    @PostConstruct
    @Bean
    public World initialize() {

        Map<String,Country> countries = null;
        try(JsonReader reader = new JsonReader(new FileReader((new ClassPathResource(fileName)).getFile()))) {
            reader.setLenient(true);
            Gson gson = new GsonBuilder().create();
            countries = new HashMap<>();
            reader.beginObject();
            while(reader.hasNext()) {

                String key = reader.nextName();
                Country country = gson.fromJson(reader, Country.class);
                countries.put(key, country);

            }
            reader.endObject();
        } catch(IOException e) {
            e.printStackTrace();
        }

        World world = new World();
        world.setCountryMap(countries);
        return world;
    }
}