package by.Yandr2022.springlearn.part1_SpringCore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Classical music initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Classical music destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public String toString() {
        return "ClassicalMusic";
    }
}
