package by.Yandr2022.springlearn.part1_SpringCore.homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.playMusic());
        System.out.println(player.playMusic());
        System.out.println(player.playMusic());
        System.out.println(player.playMusic());
        context.close();


    }
}
