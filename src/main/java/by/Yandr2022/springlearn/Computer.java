package by.Yandr2022.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer1 player;

    @Autowired
    public Computer(MusicPlayer1 player) {
        id = 1;
        this.player = player;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", player=" + player +
                '}';
    }
}
