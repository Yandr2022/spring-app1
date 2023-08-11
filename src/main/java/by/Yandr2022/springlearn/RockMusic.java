package by.Yandr2022.springlearn;

public class RockMusic implements Music {
    @Override
    public void doMyInit() {
        System.out.println("Rock music initialization");
    }

    @Override
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
