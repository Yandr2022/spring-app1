package by.Yandr2022.springlearn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer1 {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private String name;
    private int volume;

    public MusicPlayer1() {

    }

    @Autowired
    public MusicPlayer1(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing " + classicalMusic.getSong() + "\nPlaying " + rockMusic.getSong();
    }

    public ClassicalMusic getClassicalMusic() {
        return classicalMusic;
    }

    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public RockMusic getRockMusic() {
        return rockMusic;
    }

    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer1{" +
                "classicalMusic=" + classicalMusic +
                ", rockMusic=" + rockMusic +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
