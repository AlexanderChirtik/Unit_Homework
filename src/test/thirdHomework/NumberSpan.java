package thirdHomework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.thirdHomework.SecondTask;

import static org.assertj.core.api.Assertions.assertThat;
public class NumberSpan {

    SecondTask task;

    @BeforeEach
    void initObject() {
        task = new SecondTask();
    }

    @Test
    void checkValueLessThanTwentySix() {
        boolean result = task.numberInInterval(25);
        assertThat(result).isEqualTo(false);
    }

    @Test
    void checkValueMoreThanNinetyNine() {
        boolean result = task.numberInInterval(100);
        assertThat(result).isEqualTo(false);
    }

    @Test
    void checkValueIsBetweenTwoNumbers() {
        boolean result = task.numberInInterval(99);
        assertThat(result).isEqualTo(true);
    }
}
