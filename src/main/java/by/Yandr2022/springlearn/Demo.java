package by.Yandr2022.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music bean = context.getBean("musicBean", Music.class);
        MusicPlayer player = new MusicPlayer(bean);
        player.playMusic();
        context.close();
    }
}
