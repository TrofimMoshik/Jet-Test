package jet.moshik;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Trofim Moshik on 14.02.2018.
 */
public class EasyTask2Test {
    @Test
    public void isPrime() throws Exception {
        // Тестирование на определение простого числа
        EasyTask2 easyTask2 = new EasyTask2();

        int test0 = -1;
        int test1 = 0;
        int test2 = 25;

        int test3 = 1;
        int test4 = 2;
        int test5 = 3;
        int test6 = 113;

        assertFalse(easyTask2.isPrime(test0));
        assertFalse(easyTask2.isPrime(test1));
        assertFalse(easyTask2.isPrime(test2));

        assertTrue(easyTask2.isPrime(test3));
        assertTrue(easyTask2.isPrime(test4));
        assertTrue(easyTask2.isPrime(test5));
        assertTrue(easyTask2.isPrime(test6));
    }
}