package org.sixthHomework;

import java.util.Arrays;
import java.util.Random;

public class NewList implements INewList{
    @Override
    public void compareList(double firstResultAverage, double secondResultAverage) {
        if(firstResultAverage == secondResultAverage) {
            System.out.println("Средние значения равны");
        } else if (firstResultAverage > secondResultAverage) {
            System.out.println("Первый список имеет большее среднее значение");
        } else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }

    @Override
    public double averageList(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        double resultAverage = Math.round(sum / array.length);
        System.out.println("\nСреднее значение списка = " + resultAverage + ".\n");
        return resultAverage;
    }

    public int[] createList() {
        Random random = new Random();
        int[] array = random.ints(0, 100).distinct().limit(10).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }
}
