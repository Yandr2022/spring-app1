package by.Yandr2022.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player);
//        System.out.println(player1);
        player.playMusic();
//        System.out.println(player == player1);
//        player.setVolume(80);
//        System.out.println(player);
//        System.out.println(player1);
        context.close();
    }
}
