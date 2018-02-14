package jet.moshik;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Trofim Moshik on 14.02.2018.
 */
public class MiddleTask1Test {
    @Test
    public void getNMaxNum() throws Exception {
        MiddleTask1 middleTask1 = new MiddleTask1();
        List<Integer> testArr0 = Arrays.asList(20, 5, 15, 10, 5); int testInt0 = 3;
        List<Integer> testArr1 = Arrays.asList(0, 105, 70, 1, 2); int testInt1 = 1;
        List<Integer> testArr2 = Arrays.asList(-68, 3, -15, -1005, -5); int testInt2 = 4;
        List<Integer> testArr3 = Arrays.asList(0, 1, 0, 0, 0); int testInt3 = 2;

        // Тестирование на корректное получение требуемого числа
        assertEquals(10, middleTask1.getNMaxNum(testArr0, testInt0));
        assertEquals(105, middleTask1.getNMaxNum(testArr1, testInt1));
        assertEquals(-68, middleTask1.getNMaxNum(testArr2, testInt2));
        assertEquals(0, middleTask1.getNMaxNum(testArr3, testInt3));
    }

}