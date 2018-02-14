package jet.moshik;

import java.io.IOException;

/**
 * Created by Trofim Moshik on 13.02.2018.
 *
 * Простые задачи
 * 4. Программа возвращает список разменов введенной суммы на монеты номиналом 3, 5 и 7 копеек.
 *
 * На вход принимается целое число, введенное с системной консоли.
 */
class EasyTask4 {
    /**
     * Вывод в консоль списка разменов.
     * @param x целое число для размена
     */
    private void printExchangeList(int x) {
        int counts = 0;

        if (x < 5 && x != 3) {
            System.out.println("I have no change for " + x + "!");
            return;
        }

        for (int i = 0; i <= x; i += 3) {
            for (int j = i; j <= x; j += 5) {
                for (int k = j; k <= x; k += 7) {
                    if (k == x) {
                        System.out.println(x + " = " + i/3 + "*3 + " + (j-i)/5 + "*5 + " + (k-j)/7 + "*7");
                        counts++;
                    }
                } // for k перебор монет по 7 копеек
            } // for j перебор монет по 5 копеек
        } // for i перебор монет по 3 копейки

        System.out.println("You can change " + x + " by " + counts + " ways.");
    } // printExchangeList()
    /**
     * Запуск.
     * @throws IOException
     */
    void run() throws IOException {
        printExchangeList(StandartMethods.getInt());
    } // run()
} // EasyTask4
