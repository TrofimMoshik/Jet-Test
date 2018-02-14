package jet.moshik;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Trofim Moshik on 14.02.2018.
 */
public class EasyTask3Test {
    @Test
    public void isPalindrome() throws Exception {
    EasyTask3 easyTask3 = new EasyTask3();

    String test0 = "Hello, world!";
    String test1 = "Ernest Hemingway";
    String test2 = "Indiana Jones";

    String test3 = "Madam, I'm Adam";
    String test4 = "Never odd or even";
    String test5 = "A man, a plan, a canal - Panama";

    assertFalse(easyTask3.isPalindrome(test0));
    assertFalse(easyTask3.isPalindrome(test1));
    assertFalse(easyTask3.isPalindrome(test2));

    assertTrue(easyTask3.isPalindrome(test3));
    assertTrue(easyTask3.isPalindrome(test4));
    assertTrue(easyTask3.isPalindrome(test5));
    }
}