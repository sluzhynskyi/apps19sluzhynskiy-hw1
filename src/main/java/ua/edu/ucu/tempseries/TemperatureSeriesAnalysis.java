package ua.edu.ucu.tempseries;

import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysis {
    double[] temperatureSeries;
    int len;

    public TemperatureSeriesAnalysis() {
        this.temperatureSeries = new double[]{0};

    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        this.len = temperatureSeries.length;
        this.temperatureSeries = temperatureSeries;
        for (double i :
                temperatureSeries) {
            if (i < -273) {
                throw new InputMismatchException("Temperature can't be less then absolute zero !!!");
            }
        }
    }


    public double average() {
        is_empty();
        double sum = 0;
        for (double i :
                this.temperatureSeries) {
            sum += i;
        }
        return sum / (double) this.len;

    }

    public double deviation() {
        is_empty();
        double average = this.average();
        double sq_sum = 0;
        for (double i :
                this.temperatureSeries) {
            sq_sum += Math.pow(i - average, 2);
        }
        return Math.sqrt(sq_sum / (double) this.len);
    }

    public double min() {
        is_empty();
        double min = this.temperatureSeries[0];
        for (double i : this.temperatureSeries) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public double max() {
        is_empty();
        double max = this.temperatureSeries[0];
        for (double i : this.temperatureSeries) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public double findTempClosestToZero() {
        is_empty();
        double cls = this.temperatureSeries[0];
        for (double i :
                this.temperatureSeries) {
            if ((Math.abs(i) < Math.abs(cls)) || (i == Math.abs(cls))) {
                cls = i;
            }
        }
        return cls;
    }


    public double findTempClosestToValue(double tempValue) {
        is_empty();
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
        is_empty();
        int N = 0;
        int ind = 0;
        for (int i = 0; i < this.len; i++) {
            if (this.temperatureSeries[i] < tempValue) {
                N += 1;
            }
        }
        double[] lessSeries = new double[N];
        for (int i = 0; i < this.len; i++) {
            if (this.temperatureSeries[i] < tempValue) {
                lessSeries[ind] = this.temperatureSeries[i];
            }
        }
        return lessSeries;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        is_empty();
        int N = 0;
        int ind = 0;
        for (int i = 0; i < this.len; i++) {
            if (this.temperatureSeries[i] >= tempValue) {
                N += 1;
            }
        }
        double[] greaterSeries = new double[N];
        for (int i = 0; i < this.len; i++) {
            if (this.temperatureSeries[i] >= tempValue) {
                greaterSeries[ind] = this.temperatureSeries[i];
            }
        }
        return greaterSeries;
    }

    public TempSummaryStatistics summaryStatistics() {
        is_empty();
        TempSummaryStatistics summary = new TempSummaryStatistics();
        summary.avgTemp = this.average();
        summary.devTemp = this.deviation();
        summary.maxTemp = this.max();
        summary.minTemp = this.min();
    }

    public int addTemps(double... temps) {
        int N = this.temperatureSeries.length + temps.length;
        double[] tempSeries = Arrays.copyOf(this.temperatureSeries, this.len);
        this.temperatureSeries = new double[N];
        for (int i = 0; i < tempSeries.length; i++) {
            this.temperatureSeries[i] = tempSeries[i];
        }
        for (int i = tempSeries.length, j = 0; i < N; i++, j++) {
            this.temperatureSeries[i] = temps[j];
        }
        return N;
    }

    private void is_empty() {
        if (this.len == 0) {
            throw new IllegalArgumentException("Len of series must be at least = 1");
        }
    }
}
