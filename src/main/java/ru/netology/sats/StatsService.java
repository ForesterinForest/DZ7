package ru.netology.sats;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }


    public long avereageSale(long[] sales) {
        return sumSales(sales) / sales.length;

    }

    public int calcMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }

        }
        return monthMaximum + 1;
    }

    public int calcMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }

        }
        return monthMinimum + 1;
    }

    public int calcMonthsbellowAverage(long[] sales) {
        int counter = 0;
        long average = avereageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;

    }

    public int calcMonthsbelmaxAverage(long[] sales) {
        int counter = 0;
        long average = avereageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;

    }


}




