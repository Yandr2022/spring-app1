package by.Yandr2022.springlearn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer1 {
    private Music music1;
    private Music music2;

    public MusicPlayer1(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2 ) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic() {
        return "Playing " + music1.getSong() + "; Playing " + music2.getSong();
    }


    @Override
    public String toString() {
        return "MusicPlayer1{" +
                "music1=" + music1 +
                ", music2=" + music2 +
                '}';
    }
}
