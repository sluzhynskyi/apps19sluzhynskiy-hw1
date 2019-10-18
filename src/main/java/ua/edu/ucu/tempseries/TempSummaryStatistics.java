package ua.edu.ucu.tempseries;

public final class TempSummaryStatistics {
    private double avgTemp;
    private double devTemp;
    private double minTemp;
    private double maxTemp;


    public double getAvgTemp() { return avgTemp; }


    public double getDevTemp() {
        return devTemp;
    }


    public double getMinTemp() {
        return minTemp;
    }


    public double getMaxTemp() {
        return maxTemp;
    }

    public TempSummaryStatistics(double avg, double dev, double min, double max){
        this.avgTemp = avg;
        this.devTemp = dev;
        this.minTemp = min;
        this.maxTemp = max;
    }
}
