package ua.edu.ucu.tempseries;


import java.util.Arrays;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysis {
    private double[] temperatureSeries;
    private int len;

    public TemperatureSeriesAnalysis() {
        this.temperatureSeries = new double[]{0};

    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        final int absZero = -273;
        this.len = temperatureSeries.length;
        this.temperatureSeries = Arrays.copyOf(temperatureSeries,
                temperatureSeries.length);
        for (double i : temperatureSeries) {
            if (i < -absZero) {
                throw new InputMismatchException(
                        "Temperature can't be less then absolute zero !!!");
            }
        }
    }


    public double average() {
        isEmpty();
        double sum = 0;
        for (double i : this.temperatureSeries) {
            sum += i;
        }
        return sum / (double) this.len;

    }

    public double deviation() {
        isEmpty();
        double average = this.average();
        double sqSum = 0;
        for (double i : this.temperatureSeries) {
            sqSum += (i - average) * (i - average);
        }
        return Math.sqrt(sqSum / (double) this.len);
    }

    public double min() {
        isEmpty();
        double min = this.temperatureSeries[0];
        for (double i : this.temperatureSeries) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public double max() {
        isEmpty();
        double max = this.temperatureSeries[0];
        for (double i : this.temperatureSeries) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public double findTempClosestToZero() {
        isEmpty();
        final double accuracy = .00001;
        double cls = this.temperatureSeries[0];
        for (double i : this.temperatureSeries) {
            if (Math.abs(i) < Math.abs(cls) ||
                    Math.abs(i - Math.abs(cls)) < accuracy) {
                cls = i;
            }
        }
        return cls;
    }


    public double findTempClosestToValue(double tempValue) {
        isEmpty();
        double[] tempSeries = Arrays.copyOf(this.temperatureSeries, this.len);
        for (int i = 0; i < this.len; i++) {
            this.temperatureSeries[i] -= tempValue;
        }
        double cls = this.findTempClosestToZero();
        cls += tempValue;
        this.temperatureSeries = tempSeries;
        return cls;
    }

    public double[] findTempsLessThen(double tempValue) {
        isEmpty();
        int n = 0;
        int ind = 0;
        for (int i = 0; i < this.len; i++) {
            if (this.temperatureSeries[i] < tempValue) {
                n += 1;
            }
        }
        double[] lessSeries = new double[n];
        for (int i = 0; i < this.len; i++) {
            if (this.temperatureSeries[i] < tempValue) {
                lessSeries[ind] = this.temperatureSeries[i];
                ind++;
            }
        }
        return lessSeries;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        isEmpty();
        int n = 0;
        int ind = 0;
        for (int i = 0; i < this.len; i++) {
            if (this.temperatureSeries[i] >= tempValue) {
                n += 1;
            }
        }
        double[] greaterSeries = new double[n];
        for (int i = 0; i < this.len; i++) {
            if (this.temperatureSeries[i] >= tempValue) {
                greaterSeries[ind] = this.temperatureSeries[i];
                ind++;
            }
        }
        return greaterSeries;
    }

    public TempSummaryStatistics summaryStatistics() {
        isEmpty();
        TempSummaryStatistics summary = new TempSummaryStatistics();
        summary.avgTemp = this.average();
        summary.devTemp = this.deviation();
        summary.maxTemp = this.max();
        summary.minTemp = this.min();
        return summary;
    }

    public int addTemps(double... temps) {
        int n = this.temperatureSeries.length + temps.length;
        double[] tempSeries = Arrays.copyOf(this.temperatureSeries, this.len);
        this.temperatureSeries = new double[n];
        for (int i = 0; i < tempSeries.length; i++) {
            this.temperatureSeries[i] = tempSeries[i];
        }
        for (int i = tempSeries.length, j = 0; i < n; i++, j++) {
            this.temperatureSeries[i] = temps[j];
        }
        return n;
    }

    private void isEmpty() {
        if (this.len == 0) {
            throw new IllegalArgumentException(
                    "Len of series must be at least = 1");
        }
    }
}
