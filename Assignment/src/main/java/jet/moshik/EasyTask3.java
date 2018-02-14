package jet.moshik;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Trofim Moshik on 12.02.2018.
 *
 * Простые задачи
 * 3. Программа выполняет проверку является ли строка палиндромом
 *
 * На вход принимается строка.
 */
class EasyTask3 {
    /**
     * Проверка на символ для удаления
     * @param ch проверяемый символ
     * @return да/нет
     */
    boolean isSymbToDel(char ch) {
        char[] symbToDel = {    // пробел, знаки пунктуации, специальные символы
            ' ', '.', ',', '!', '?', '-', ':', ';',  '\'', '\"', '(', ')',
            '~', '@', '#', '$', '%', '&', '*', '_', '=', '+',
            '[', ']', '{', '}', '>', '/', '<', '`', '^', '\\'
        };

        for (int i = 0; i < symbToDel.length; i++) {
            if (ch == symbToDel[i]) return true;
        }
        return false;
    } // isSymbToDel
    /**
     * Проверка на палиндром
     * @param str Проверяемая строка
     * @return да/нет
     */
    boolean isPalindrome(String str) {
        ArrayList<Character> cleanList = new ArrayList<Character>(); // список только для букв
        str = str.toLowerCase(); // приводим строку к нижнему регистру

        for (int i = 0; i < str.length(); i++) {        // удаление пробелов, знаков пунктуации и специальных символов из строки
            if (!isSymbToDel(str.charAt(i))) cleanList.add(str.charAt(i));
        } // for i

        for (int i = 0; i < cleanList.size(); i++) {        // проверка на палиндром
            if (!(cleanList.get(i) == cleanList.get(cleanList.size() - 1 - i))) return false;
        } // for i
        return true;
    } // isPalindrome()

    /**
     * Запуск.
     * @throws IOException
     */
    void run() throws IOException {
        if (isPalindrome(StandartMethods.getString())) System.out.println("This is palindrome!");
        else System.out.println("This is not palindrome!");
    } // run()
} // EasyTask3
