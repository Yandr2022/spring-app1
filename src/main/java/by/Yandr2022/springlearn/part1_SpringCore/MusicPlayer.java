package by.Yandr2022.springlearn.part1_SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {

    private List<Music> musicList= new ArrayList<>();;
    private String name;
    private int volume;

    public MusicPlayer() {

    }
@Autowired
    public MusicPlayer(@Qualifier(value = "classicalMusic") List<Music> music) {
        this.musicList = new ArrayList<>(music);
    }

    public void playMusic() {
        for (Music m : musicList) {
            System.out.println("Playing " + m.getSong());
        }

    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
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
        return "MusicPlayer{" +
                "music=" + musicList +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
