package thirdHomework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.thirdHomework.FirstTask;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenOddNumberTest {

    FirstTask task;

    @BeforeEach
    void initObject() {
        task = new FirstTask();
    }


    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 12, 122, 345348, 39310, -3838, -2})
    void receiveEvenNumber(int argument){
        boolean tempReceiveEven = task.evenOddNumber(argument);
        assertThat(tempReceiveEven).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 7, 9, 11, 13, 123, 345347, 39309, -3839, -3})
    void receiveOddNumber(int argument){
        boolean tempReceiveOdd = task.evenOddNumber(argument);
        assertThat(tempReceiveOdd).isEqualTo(false);
    }
}
