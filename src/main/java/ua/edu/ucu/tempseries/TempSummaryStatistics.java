package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    public void setAvgTemp(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public void setDevTemp(double devTemp) {
        this.devTemp = devTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    private double avgTemp;

    public double getAvgTemp() {
        return avgTemp;
    }

    public double getDevTemp() {
        return devTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    private double devTemp;
    private double minTemp;
    private double maxTemp;
}
