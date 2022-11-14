package ru.netology.stats.homework.strings.and.arrays;

class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    } //  "Сумма всех продаж"

    public int averagePerMonth(long[] sales) {

        return sumSales(sales) / sales.length;
    }   // "Средняя сумма продаж в месяц"

    public int maxSalesPerMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }  // "Продажи на максимальную сумму"

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }  // "Продажи на минимальную сумму"

    public int belowAverage(long[] sales) {
        int below = 0;
        for (long sale : sales) {
            if (sale < averagePerMonth(sales)) {
                below = below + 1;
            }

        }
        return below;
    }  // "Количество месяцев, в которых продажи были ниже среднего"

    public int aboveAverage(long[] sales) {
        int above = 0;
        for (long sale : sales) {
            if (sale > averagePerMonth(sales)) {
                above = above + 1;
            }

        }
        return above;
    }  // "Количество месяцев, в которых продажи были выше среднего"
}