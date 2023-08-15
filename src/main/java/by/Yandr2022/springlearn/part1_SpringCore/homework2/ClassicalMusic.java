package by.Yandr2022.springlearn.part1_SpringCore.homework2;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


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
