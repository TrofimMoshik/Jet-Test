package jet.moshik;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Trofim Moshik on 14.02.2018.
 */
public class EasyTask5Test {
    @Test
    public void isSubstring() throws Exception {
        EasyTask5 easyTask5 = new EasyTask5();

        String testStr0 = "Ernest Hemingway", testSub0 = "est Hemig";
        String testStr1 = "Indiana Jones", testSub1 = "Joness";
        String testStr2 = "palindrome", testSub2 = "roma";

        String testStr3 = "Third Rome", testSub3 = "Ro";
        String testStr4 = "Sweet kitty", testSub4 = "eet ki";
        String testStr5 = "American History X", testSub5 = "X";

        assertFalse(easyTask5.isSubstring(testStr0, testSub0));
        assertFalse(easyTask5.isSubstring(testStr1, testSub1));
        assertFalse(easyTask5.isSubstring(testStr2, testSub2));

        assertTrue(easyTask5.isSubstring(testStr3, testSub3));
        assertTrue(easyTask5.isSubstring(testStr4, testSub4));
        assertTrue(easyTask5.isSubstring(testStr5, testSub5));
    }

}