package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

    @Ignore
    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.average();
        
        assertEquals(expResult, actualResult, 0.00001);        
    }

    // DEVIATION TESTS

    @Test
    public void testDeviationWithTwoElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {2, 4};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1;

        // call tested method
        double actualResult = seriesAnalysis.deviation();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.deviation();
    }

    @Ignore
    @Test
    public void testDeviation() {
        double[] temperatureSeries = {13.0, -23.0, 21.0, 10.0, -4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 15.473848907108;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }

    // MIN TESTS

    @Test
    public void testMinWithTwoElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {2, 4};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 2;

        // call tested method
        double actualResult = seriesAnalysis.min();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.min();
    }

    @Ignore
    @Test
    public void testMin() {
        double[] temperatureSeries = {13.0, -23.0, 21.0, 10.0, -4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -23.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);
    }

    // MAX TESTS

    @Test
    public void testMaxWithTwoElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {2, 4};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 4;

        // call tested method
        double actualResult = seriesAnalysis.max();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testMaxWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.max();
    }

    @Ignore
    @Test
    public void testMax() {
        double[] temperatureSeries = {13.0, -23.0, 21.0, 10.0, -4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 21.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);
    }

    // findTempClosestToZero TEST

    @Test
    public void testFindTempClosestToZeroWithTwoElements() {
        // setup input data and expected result
        double[] temperatureSeries = {2, 4};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 2;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToZero();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToZero();
    }

    @Ignore
    @Test
    public void testFindTempClosestToZero() {
        double[] temperatureSeries = {13.0, -23.0, 21.0, 10.0, -4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 4.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }

    // findTempClosestToValue TESTS

    @Test
    public void testFindTempClosestToValueWithTwoElements() {
        // setup input data and expected result
        double[] temperatureSeries = {2, 4};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 2;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToValue(2.9);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToValueWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToValue(2);
    }

    @Ignore
    @Test
    public void testFindTempClosestToValue() {
        double[] temperatureSeries = {13.0, -23.0, 21.0, 10.0, -4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 13;

        double actualResult = seriesAnalysis.findTempClosestToValue(12.4);

        assertEquals(expResult, actualResult, 0.00001);
    }

    // findTempsLessThen TESTS


    @Test
    public void testFindTempsLessThenWithTwoElements() {
        // setup input data and expected result
        double[] temperatureSeries = {2, 4};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = new double[]{2};

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsLessThen(3.3);

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempsLessThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempsLessThen(2);
    }

    @Ignore
    @Test
    public void testFindTempsLessThen() {
        double[] temperatureSeries = {13.0, -23.0, 21.0, 10.0, -4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = new double[]{-23.0, 10.0, -4.0};

        double[] actualResult = seriesAnalysis.findTempsLessThen(12.4);

        assertArrayEquals(expResult, actualResult, 0.00001);
    }
    // findTempsGreaterThen TESTS


    @Test
    public void testFindTempsGreaterThenWithTwoElements() {
        // setup input data and expected result
        double[] temperatureSeries = {2, 4};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = new double[]{4};

        // call tested method
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(3.3);

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult, 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempsGreaterThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempsGreaterThen(2);
    }

    @Ignore
    @Test
    public void testFindTempsGreaterThen() {
        double[] temperatureSeries = {13.0, -23.0, 21.0, 10.0, -4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = new double[]{13, 21.0};

        double[] actualResult = seriesAnalysis.findTempsGreaterThen(12.4);

        assertArrayEquals(expResult, actualResult, 0.00001);
    }

    // summaryStatistics TESTS

    @Test
    public void testSummaryStatisticsWithTwoElements() {
        // setup input data and expected result
        double[] temperatureSeries = {2, 4};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expMax = 4;
        double expMin = 2;
        double expDev = 1;
        double expAvg = 3;


        // call tested method
        TempSummaryStatistics summary = seriesAnalysis.summaryStatistics();

        // compare expected result with actual result
        assertEquals(expAvg, summary.getAvgTemp(), 0.00001);
        assertEquals(expDev, summary.getDevTemp(), 0.00001);
        assertEquals(expMax, summary.getMaxTemp(), 0.00001);
        assertEquals(expMin, summary.getMinTemp(), 0.00001);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testSummaryStatisticsWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // call tested method
        TempSummaryStatistics summary = seriesAnalysis.summaryStatistics();

    }

    @Ignore
    @Test
    public void estSummaryStatistics() {
        double[] temperatureSeries = {13.0, -23.0, 21.0, 10.0, -4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expMax = 21;
        double expMin = -23;
        double expDev = 15.473848907108;
        double expAvg = 3.4;
        TempSummaryStatistics summary = seriesAnalysis.summaryStatistics();

        // compare expected result with actual result
        assertEquals(expAvg, summary.getAvgTemp(), 0.00001);
        assertEquals(expDev, summary.getDevTemp(), 0.00001);
        assertEquals(expMax, summary.getMaxTemp(), 0.00001);
        assertEquals(expMin, summary.getMinTemp(), 0.00001);
    }

    // addTemps TESTS

    @Test
    public void testAddTemps() {
        // setup input data and expected result
        double[] temperatureSeries = {2, 4};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 6;


        // call tested method
        int actualResult = seriesAnalysis.addTemps(6, 4, 8, -12.0);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);

    }


}
