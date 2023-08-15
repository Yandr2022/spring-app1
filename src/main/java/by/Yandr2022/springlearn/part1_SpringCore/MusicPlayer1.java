package by.Yandr2022.springlearn.part1_SpringCore;


import org.springframework.beans.factory.annotation.Value;


public class MusicPlayer1 {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public MusicPlayer1(Music music1, Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic() {
        return "Playing " + music1.getSong() + "; Playing " + music2.getSong();
    }


    @Override
    public String toString() {
        return "MusicPlayer1{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", music1=" + music1 +
                ", music2=" + music2 +
                '}';
    }
}
