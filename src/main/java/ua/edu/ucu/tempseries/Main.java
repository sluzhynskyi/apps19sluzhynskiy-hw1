package ua.edu.ucu.tempseries;

public class Main {
    public static void main(String[] args) {
        TemperatureSeriesAnalysis x1 = new TemperatureSeriesAnalysis();
        x1.addTemps(1, 2);
        System.out.println(x1.average());

        System.out.println("New TEST");
        TemperatureSeriesAnalysis x2 = new TemperatureSeriesAnalysis(new double[]{1});
        System.out.println(x2.average());
        x2.addTemps(1, 2);
        System.out.println(x2.average());
        x2.addTemps(1, 1, 1, 1, 1, 1, 1, 1);
        System.out.println(x2.average());
    }
}
