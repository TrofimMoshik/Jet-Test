package jet.moshik;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Trofim Moshik on 14.02.2018.
 */
public class EasyTask1Test {
    /**
     * Тестирование алгоритма получения 2-го по величине числа из набора.
     *
     * @throws Exception
     */
    @org.junit.Test
    public void getSecMaxNum() throws Exception {
        EasyTask1 easyTask1 = new EasyTask1();
        List<Integer> test0 = Arrays.asList(10, 5, 15, 15, 5);
        List<Integer> test1 = Arrays.asList(0, 105, 70, 1, 2);
        List<Integer> test2 = Arrays.asList(-68, 3, -15, -1005, -5);
        List<Integer> test3 = Arrays.asList(0, 1, 0, 0, 0);

        // Тестирование на корректное получение требуемого числа
        assertEquals(10, easyTask1.getSecMaxNum(test0));
        assertEquals(70, easyTask1.getSecMaxNum(test1));
        assertEquals(-5, easyTask1.getSecMaxNum(test2));
        assertEquals(0, easyTask1.getSecMaxNum(test3));
    }//getSecMaxNum()
} //EasyTask1