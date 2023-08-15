package by.Yandr2022.springlearn.part1_SpringCore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class RockMusic implements Music {
    @Override
    @PostConstruct
    public void doMyInit() {
        System.out.println("Rock music initialization");
    }

    @Override
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Rock music destruction");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public String toString() {
        return "RockMusic";
    }
}
