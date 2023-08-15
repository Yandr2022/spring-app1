package by.Yandr2022.springlearn.part1_SpringCore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context
//                = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
//        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic music1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(music == music1);
//        RockMusic musicR = context.getBean("rockMusic", RockMusic.class);
//        RockMusic music1R = context.getBean("rockMusic", RockMusic.class);
//        System.out.println(musicR == music1R);

//        MusicPlayer1 player = context.getBean("musicPlayer1", MusicPlayer1.class);
//        Music music = context.getBean("rockMusic",Music.class);
//        MusicPlayer player = new MusicPlayer(new ArrayList<Music>(){{
//            add(music);
//            add(context.getBean("classicalMusic", Music.class));
//            add(context.getBean("popMusic", Music.class));
//        }});
//        player.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

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
