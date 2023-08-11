package by.Yandr2022.springlearn;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "La-la-la";
    }

    @Override
    public String toString() {
        return "PopMusic";
    }
}
