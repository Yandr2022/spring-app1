package by.Yandr2022.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

//        MusicPlayer1 player = context.getBean("musicPlayer1", MusicPlayer1.class);
//        Music music = context.getBean("rockMusic",Music.class);
//        MusicPlayer player = new MusicPlayer(new ArrayList<Music>(){{
//            add(music);
//            add(context.getBean("classicalMusic", Music.class));
//            add(context.getBean("popMusic", Music.class));
//        }});
//        player.playMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
////        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(player);
////        System.out.println(player1);
//        player.playMusic();
//        System.out.println(player == player1);
//        player.setVolume(80);
//        System.out.println(player);
//        System.out.println(player1);
        context.close();
    }
}
