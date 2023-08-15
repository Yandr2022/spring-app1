package by.Yandr2022.springlearn.part1_SpringCore.homework2;


import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List <Music> music;


    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String playMusic() {
        return music.get(new Random().nextInt(music.size())).getSong();
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                '}';
    }
}
