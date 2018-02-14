package jet.moshik;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Trofim Moshik on 14.02.2018.
 */
public class MiddleTask3Test {
    @Test
    public void RLDecoding() throws Exception {
        MiddleTask3 middleTask3 = new MiddleTask3();

        String testDec0 = "aaaabbbdddffggghrrrr";
        String testEnc0 = "4a3b3d2f3g1h4r";

        String testDec1 = "rereereeer";
        String testEnc1 = "1r1e1r2e1r3e1r";

        String testDec2 = "0000011122211100101000";
        String testEnc2 = "503132312011101130";

        String testDec3 = "!!!!@@@##$44$$$$$#.......";
        String testEnc3 = "4!3@2#1$245$1#7.";

        assertEquals(testDec0, middleTask3.RLDecoding(testEnc0));
        assertEquals(testDec1, middleTask3.RLDecoding(testEnc1));
        assertEquals(testDec2, middleTask3.RLDecoding(testEnc2));
        assertEquals(testDec3, middleTask3.RLDecoding(testEnc3));
    }

}