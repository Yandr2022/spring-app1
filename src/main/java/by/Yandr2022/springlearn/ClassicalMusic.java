package by.Yandr2022.springlearn;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public String toString() {
        return "ClassicalMusic";
    }
}
