package ru.netology.stats.homework.strings.and.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void shouldCalculateAllSales() {
        StatsService service = new ru.netology.stats.homework.strings.and.arrays.StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAll = 180;
        int actualAll = service.sumSales(sales);

        Assertions.assertEquals(expectedAll, actualAll);
    }

    @Test
    public void shouldAveragePerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averagePerMonth(sales);

        Assertions.assertEquals(actualAverage, expectedAverage);
    }

    @Test
    public void shouldMaxSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSalesPerMonth(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldMinSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverage = 5;
        int actualBelowAverage = service.belowAverage(sales);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void shouldAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverage = 5;
        int actualAboveAverage = service.aboveAverage(sales);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);


    }

}