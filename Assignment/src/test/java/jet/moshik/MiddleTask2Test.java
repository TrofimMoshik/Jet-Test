package jet.moshik;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Trofim Moshik on 14.02.2018.
 */
public class MiddleTask2Test {
    @Test
    public void RLEncoding() throws Exception {
    MiddleTask2 middleTask2 = new MiddleTask2();

    String testStr0 = "aaaabbbdddffggghrrrr";
    String testEnc0 = "4a3b3d2f3g1h4r";

    String testStr1 = "rereereeer";
    String testEnc1 = "1r1e1r2e1r3e1r";

    String testStr2 = "0000011122211100101000";
    String testEnc2 = "503132312011101130";

    String testStr3 = "!!!!@@@##$44$$$$$#.......";
    String testEnc3 = "4!3@2#1$245$1#7.";

    assertEquals(testEnc0, middleTask2.RLEncoding(testStr0));
    assertEquals(testEnc1, middleTask2.RLEncoding(testStr1));
    assertEquals(testEnc2, middleTask2.RLEncoding(testStr2));
    assertEquals(testEnc3, middleTask2.RLEncoding(testStr3));
    }
}