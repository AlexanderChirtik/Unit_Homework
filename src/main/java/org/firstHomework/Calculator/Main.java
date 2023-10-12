package org.firstHomework.Calculator;

public class Main {
    public static void main(String[] args) {

        double purchaseAmount = 7000.0;
        int discountAmount = 8;

        Tests.testPurchaseAmountIsNotNull(purchaseAmount);
        Tests.testPurchaseAmountIsPositive(purchaseAmount);
        Tests.testDiscountAmountIsPositive(discountAmount);
        Tests.testDiscountAmountUpLimit(discountAmount);

        System.out.println(Calculator.calculatingDiscount(purchaseAmount, discountAmount));
    }
}