package jet.moshik;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Trofim Moshik on 13.02.2018.
 *
 * Средние задачи
 * 1. Программа возвращает N-ый по величине элемент набора чисел
 *
 * На вход принимается целочисленный набор элементов и номер элемента для выдачи.
 */
class MiddleTask1 {
    /**
     * Метод возвращает N-ый по величине элемент из набора целых чисел.
     * @param list входной список целых чисел
     * @param n N-ый по величине элемент
     * @return N-ый элемент
     */
    int getNMaxNum (List<Integer> list, int n) {
        for (int i = list.size()-1; i > 0; i--) { // сортировка пузырьком
            for (int j = 0; j < i; j++) {
                if (list.get(j) < list.get(j+1)) {
                    int t = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, t);
                }
            } // for j
        } // for i
        return list.get(n-1);
    } // getNMaxNum()

    /**
     * Запуск.
     */
    void run() throws IOException{
        int n;
        ArrayList<Integer> srclist = StandartMethods.getIntArrList();
        List<Integer> list = new ArrayList<Integer>(new HashSet<Integer>(srclist));

        while (true) {
            n = StandartMethods.getInt();
            if (n < 1 || n >= list.size()) System.out.println("This is not correct position! Try again!");
            else break;
        } // while

        System.out.println(n + " largest number in the set is " + getNMaxNum(list, n));
        System.out.println();
    } //run()
} // MiddleTask1
