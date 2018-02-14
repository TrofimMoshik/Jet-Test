package jet.moshik;

import java.io.IOException;

/**
 * Created by Trofim Moshik on 13.02.2018.
 *
 * Средние задачи
 * 2. Программа возвращает RLE закодированную строку.
 *
 * На вход принимается строка с консоли.
 */
class MiddleTask2 {
    /**
     * @param str строка для кодирования
     * @return закодированную строку
     */
    String RLEncoding (String str) {
        int count = 0;
        char current = str.charAt(0);
        String encode = "";

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) count++;
                else {
                    encode += Integer.toString(count + 1) + current;
                    count = 0;
                    current = str.charAt(i + 1);
                }
            } else encode += Integer.toString(count + 1) + current;
        } // for i
        return encode;

    } // RLEencoding
    /**
     * Запуск.
     * @throws IOException
     */
    void run() throws IOException{
        System.out.println("Enter the string to encode, please:");
        System.out.println("Encode string is " + RLEncoding(StandartMethods.getString()));
    } // run()
} // MiddleTask2
