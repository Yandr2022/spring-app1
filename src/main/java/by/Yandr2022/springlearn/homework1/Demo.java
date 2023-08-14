package by.Yandr2022.springlearn.homework1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = context.getBean("mp", MusicPlayer.class);
        System.out.println(player.playMusic(Genre.CLASSICAL));
        System.out.println(player.playMusic(Genre.ROCK));
    }
}
