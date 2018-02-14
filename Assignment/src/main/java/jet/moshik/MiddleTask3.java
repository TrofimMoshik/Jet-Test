package jet.moshik;

import java.io.IOException;

/**
 * Created by Trofim Moshik on 13.02.2018.
 *
 * Средние задачи
 * 3. Программа возвращает RLE декодированную строку.
 *
 * На вход принимается строка с консоли.
 */
class MiddleTask3 {
    /**
     *
     * @param str исходная строка
     * @return декодированную строку
     */
    String RLDecoding(String str) {
        String decode = "";

        for (int i = 0; i < str.length(); i += 2) {
            if (Character.isDigit(str.charAt(i)))
                for (int j = 0; j < (str.charAt(i) - '0'); j++) {
                    decode += str.charAt(i + 1);
                } // for j
        } // for i
        return decode;
    } // RLDecoding()
    /**
     * Запуск.
     * @throws IOException
     */
    void run() throws IOException {
        System.out.println("Enter the string to decode, please:");
        System.out.println("Decode string is " + RLDecoding(StandartMethods.getString()));
    } // run()
} //MiddleTask3
