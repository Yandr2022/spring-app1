package by.Yandr2022.springlearn.part1_SpringCore.homework1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mp")
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rm") Music music1, @Qualifier("cm") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic(Genre genre) {
        return genre == Genre.CLASSICAL ? music2.getSong() : music1.getSong();
    }


    @Override
    public String toString() {
        return "MusicPlayer1{" +
                "music1=" + music1 +
                ", music2=" + music2 +
                '}';
    }
}
