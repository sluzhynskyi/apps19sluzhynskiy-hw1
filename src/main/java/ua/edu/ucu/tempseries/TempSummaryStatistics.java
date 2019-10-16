package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    public double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(double avgTempV) {
        this.avgTemp = avgTempV;
    }

    public double getDevTemp() {
        return devTemp;
    }

    public void setDevTemp(double devTempV) {
        this.devTemp = devTempV;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTempV) {
        this.minTemp = minTempV;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTempV) {
        this.maxTemp = maxTempV;
    }
    private double avgTemp;
    private double devTemp;
    private double minTemp;
    private double maxTemp;
    
}
