package by.Yandr2022.springlearn;

public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("Classical music initialization");
    }

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
