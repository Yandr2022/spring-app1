package by.Yandr2022.springlearn.homework1;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("cm")
public class ClassicalMusic implements Music {
    private final List<String> SONGS = new ArrayList<>() {{
        add("Hungarian Rhapsody");
        add("Seasons");
        add("Moonlight Sonata");
    }};
    @Override
    public String getSong() {
         return SONGS.get(new Random().nextInt(SONGS.size()));
    }


}
