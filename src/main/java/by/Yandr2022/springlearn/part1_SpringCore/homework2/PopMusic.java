package by.Yandr2022.springlearn.part1_SpringCore.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PopMusic implements Music {

    private final List<String> SONGS = new ArrayList<>() {{
        add("La-la-la");
        add("Tu-tu-tu");
        add("u-U-u-U");
    }};
    @Override
    public String getSong() {
        return SONGS.get(new Random().nextInt(SONGS.size()));
    }

}
