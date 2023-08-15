package by.Yandr2022.springlearn.part1_SpringCore.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music {
    private final List<String> SONGS = new ArrayList<>() {{
        add("Wind cries Mary");
        add("Hotel California");
        add("We will Rock you");
    }};

    @Override
    public String getSong() {
        return SONGS.get(new Random().nextInt(SONGS.size()));
    }
}
