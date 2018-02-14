package jet.moshik;

import java.io.IOException;

/**
 * Created by Trofim Moshik on 13.02.2018.
 *
 * Простые задачи
 * 5. Программа находит подстроку в строке.
 *
 * На вход принимаются две строки.
 */
class EasyTask5 {
    /**
     * Поиск подстроки в исходной строке.
     * @param str исходная строка
     * @param sub искомая подстрока
     * @return да/нет
     */
    boolean isSubstring(String str, String sub){
        int j = 0;
        str = str.toLowerCase();
        sub = sub.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sub.charAt(j)) j++;
            else j = 0;
            if (j == sub.length()) return true;
        } // for i
        return false;
    } // isSubstring()
    /**
     * Запуск.
     * @throws IOException
     */
    void run() throws IOException {
        System.out.println("Enter the string:");
        String string = StandartMethods.getString();
        System.out.println("Enter the substring:");
        String substring = StandartMethods.getString();
        if (isSubstring(string, substring)) System.out.println("Entered string has this substring!");
        else System.out.println("Entered string has not this substring!");
    } // run()
} // EasyTask5
