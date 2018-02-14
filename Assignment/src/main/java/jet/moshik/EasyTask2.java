package jet.moshik;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Trofim Moshik on 12.02.2018.
 *
 * Простые задачи
 * 2. Программа выполняет разложение числа на набор простых множителей.
 *
 * На вход принимается целое число, введенное с системной консоли.
 */
class EasyTask2 {
    /**
     * Проверка на простое число.
     * @param x целое число
     * @return да/нет
     */
    boolean isPrime(int x) {
        if (x <= 0) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) { // если число равняется 1 или не делится без остатка на любое число
            if (x % i == 0) return false;         // от 2 до sqrt(x), то это число простое
        } // fori
        return true;
    } // isPrime()

    /**
     * Разложение числа на простые множители.
     * @param a целое число
     */
    ArrayList<Integer> factorize(int a) {
        int tmp = a; // временная переменная
        ArrayList<Integer> arr = new ArrayList<Integer>(); // список простых мноэителей введенного числа


        for (int i = 2; i <= Math.sqrt(tmp); i++) {
            if (tmp % i == 0 && isPrime(i)) {
                arr.add(i);     // добавляем в список все простые делители
                tmp /= i;
                i = 1;
            }
        } //for i
        arr.add(tmp);
        return arr;
    } // factorize()

    /**
     * Запуск.
     */
    void run() throws IOException{
        int a = StandartMethods.getInt();
        List<Integer> res = factorize(a);

        if (isPrime(a)) {
            System.out.println("Number " + a + " is prime!"); // проверка на простое число
            return;
        }

        System.out.print(a + " = ");        // вывод разложения в консоль
        for (int i = 0; i < res.size() - 1; i++) {
            System.out.print(res.get(i) + " * ");
        } //for i
        System.out.println(res.get(res.size() - 1));
        System.out.println();
    } // run()
} // EasyTask2
