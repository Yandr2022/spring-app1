package by.Yandr2022.springlearn.part1_SpringCore;


public class Computer {
    private int id;
    private MusicPlayer1 player;


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
