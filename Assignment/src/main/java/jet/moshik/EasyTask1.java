package jet.moshik;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Trofim Moshik on 12.02.2018.
 *
 * Простые задачи
 * 1. Программа возвращает 2-й по величине элемент набора чисел.
 *
 * На вход принимается целочисленный набор элементов, введеных с системной консоли.
 */
class EasyTask1 {
    /**
     * Метод возвращает второй по величине элемент из набора целых чисел.
     * @param srclist входной список целых чисел
     */
    int getSecMaxNum (List<Integer> srclist) {
        if (srclist.size() == 2) {
            if (srclist.get(0) >= srclist.get(1)) return srclist.get(1);
            else return srclist.get(0);
        }
        List<Integer> list = new ArrayList<Integer>(new HashSet<Integer>(srclist));

        for (int i = list.size()-1; i > 0; i--) { // сортировка пузырьком
            for (int j = 0; j < i; j++) {
                if (list.get(j) < list.get(j+1)) {
                    int t = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, t);
                }
            } // for j
        } // for i
        return list.get(1);
    } // getSecMaxNum()

    /**
     * Запуск.
     * @throws IOException
     */
    void run() throws IOException{
        int res = getSecMaxNum(StandartMethods.getIntArrList());
        System.out.println("The second largest number in the set is " + res);
        System.out.println();
    } // run()

}
