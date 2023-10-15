package org.firstHomework.Calculator;

public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        return purchaseAmount - (purchaseAmount / 100 * discountAmount);
    }
    
}
