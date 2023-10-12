package org.firstHomework.Calculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    public static void testDiscountAmountIsPositive(int discountAmount) {
        assertThat(discountAmount).isNotNegative();
    }

    public static void testDiscountAmountUpLimit(int discountAmount) {
        assertThat(discountAmount).isLessThanOrEqualTo(100);
    }

    public static void testPurchaseAmountIsPositive(double purchaseAmount) {
        assertThat(purchaseAmount).isNotNegative();
    }

    public static void testPurchaseAmountIsNotNull(double purchaseAmount) {
        assertThat(purchaseAmount).isNotZero();
    }
}
