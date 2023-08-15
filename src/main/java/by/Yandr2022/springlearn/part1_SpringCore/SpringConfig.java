package by.Yandr2022.springlearn.part1_SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("by.Yandr2022.springlearn.part1_SpringCore")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {


    @Bean()
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public MusicPlayer1 musicPlayer(){
        return new MusicPlayer1(classicalMusic(),rockMusic());
    }
    @Bean()
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
