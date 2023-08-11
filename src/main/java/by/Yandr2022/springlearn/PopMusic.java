package by.Yandr2022.springlearn;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
    private PopMusic() {
    }

    public static PopMusic getPopMusic(){
        return  new PopMusic();
    }

    @Override
    public void doMyInit() {
        System.out.println("Pop music initialization");
    }

    @Override
    public void doMyDestroy() {
        System.out.println("Pop music destruction");
    }

    @Override
    public String getSong() {
        return "La-la-la";
    }

    @Override
    public String toString() {
        return "PopMusic";
    }
}
