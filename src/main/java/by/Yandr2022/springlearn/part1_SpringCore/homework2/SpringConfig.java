package by.Yandr2022.springlearn.part1_SpringCore.homework2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
@ComponentScan("by.Yandr2022.springlearn.homework2")
public class SpringConfig {

    @Bean()
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(music());
    }

    @Bean
    public List<Music> music() {
        return new ArrayList<>() {{
            add(rockMusic());
            add(classicalMusic());
            add(popMusic());
        }};
    }

}
