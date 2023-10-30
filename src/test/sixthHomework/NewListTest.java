package sixthHomework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sixthHomework.NewList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NewListTest {
    int[] firstList;
    int[] secondList;
    int[] thirdList;
    NewList mylistMock;
    double secondAverageList;
    double firstAverageList;

    @BeforeEach
    void setUp() {

        mylistMock = mock(NewList.class);
        firstList = new int[]{1,1,1,1,1};
        secondList = new int[]{1,1,1,1,1};
        thirdList = new int[]{1,2,1,3,4};
        firstAverageList = 2.0;
        secondAverageList = 1.0;

    }

    /**
     * Mock-тест - проверка метода сравнения средних значений двух списков при их равенстве
     */
    @Test
    void testCompareList() {
        double firstAverage = mylistMock.averageList(secondList);
        double secondAverage = mylistMock.averageList(firstList);
        mylistMock.compareList(firstAverage, secondAverage);
    }

    /**
     * Unit, Mock-тест - проверка метода вычисления среднего значения списка при неравенстве всех элементов в списке
     */
    @Test
    void testAverageListInequality() {
        when(mylistMock.averageList(thirdList)).thenReturn(firstAverageList);
        assertThat(mylistMock.averageList(thirdList)).isEqualTo(2.0);
    }

    /**
     * Unit, Mock-тест - проверка метода вычисления среднего значения списка при равенстве всех элементов в списке
     */
    @Test
    void testAverageListEquality() {
        when(mylistMock.averageList(secondList)).thenReturn(secondAverageList);
        assertThat(mylistMock.averageList(secondList)).isEqualTo(1.0);
    }

    /**
     *  Unit и Mock - проверка метода создания списка на получение определенной длины
     */
    @Test
    void testLengthCreateList() {
        when(mylistMock.createList()).thenReturn(thirdList);
        assertThat(mylistMock.createList().length).isEqualTo(5);
    }

    /**
     * Unit Mock-тест - проверка создания нового списка в классе NewList на соответсвие содержания
     */
    @Test
    void testCreateMyList(){
        when(mylistMock.createList()).thenReturn(new int[]{1,1,1,1,1});
        assertThat(mylistMock.createList()).isEqualTo(firstList);
    }
}
