package by.Yandr2022.springlearn;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public String toString() {
        return "RockMusic";
    }
}
