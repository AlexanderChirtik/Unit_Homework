package org.sixthHomework;

public class Main {
    public static void main(String[] args) {
        NewList list = new NewList();

        int[] firstList = list.createList();
        double firstListAverage = list.averageList(firstList);

        int[] secondList = list.createList();
        double secondListAverage = list.averageList(secondList);

        list.compareList(firstListAverage, secondListAverage);
    }
}
