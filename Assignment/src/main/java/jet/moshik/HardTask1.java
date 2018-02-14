package jet.moshik;

import java.io.*;

/**
 * Created by Trofim Moshik on 13.02.2018.
 *
 * Сложная задача
 * Программа обрабатывает исходный текстовый файл согласно заданию.
 *
 * Допущения:
 * 1. Программа обрабатывает файлы отформатированные определенным образом.
 * 2. Предполагается, что пути к исходному и выходному файлу вводятся верно и в соответствующем формате.
 * 3. Предполагается, что результат вычисления функций не превышает предел диапазона возможных значений класса Long.
 * 4. В случае расширения количества функций преедполагается добавление соответствующих случаев "case" оператора "switch".
 * 5. На случай расширения количества типов операндов используется приведение аргументов функций к классу Integer.
 *
 */
class HardTask1 {
    /**
     *
     * @param m
     * @param n
     * @return строку - значение функции Аккермана
     */
    private Long ackerman(int m, long n) {
        return m == 0 ? n + 1 : n == 0 ? ackerman(m-1, 1) : ackerman(m-1, ackerman(m, n-1));
    } // ackerman()

    /**
     *
     * @param a
     * @return строку - значение факториала
     */
    private Long factorial(int a) {
        return a == 0 ? 1 : a * factorial(a-1);
    } // factorial()

    /**
     *
     * @param b - номер позиции в последовательности Фибоначчи
     * @return значение позиции
     */
    private Long fibonacci(int b) {
        return b == 1? 1 : b == 2 ? 1 : fibonacci(b-1) + fibonacci(b-2);
    } // fibonacci()
    /**
     * Метод принимает в качестве аргумента путь к исходному файлу.
     * Обрабатывает файл согласно заданию и записывает результат в выходной файл.
     * @param in путь к исходному файлу
     * @param out путь к выходному файлу
     */
    private void writeFile(String in, String out) {
        try(BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(in)));
            FileWriter fout = new FileWriter(out, false)) {
            String str;
            int row = 1;

            while ((str = fin.readLine()) != null) {
                String[] s = str.split(" "); // чтение файла построчно

                switch (s[0]) {
                    case "ACK":
                        fout.append(row + " " + ackerman(Integer.valueOf(s[1]), Long.valueOf(s[2])).toString());
                        fout.append("\r\n");
                        break;
                    case "F":
                        fout.append(row + " " + factorial(Integer.valueOf(s[1])).toString());
                        fout.append("\r\n");
                        break;
                    case "FIB":
                        fout.append(row + " " + fibonacci(Integer.valueOf(s[1])).toString());
                        fout.append("\r\n");
                        break;
                    default:
                        System.out.println("Wrong row format! Number of row is " + row);
                        break;
                } // switch

                row++;
            } // while
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } // try-catch
    } // writeFile
    /**
     * Запуск.
     */
    void run() throws IOException{
        System.out.println("Enter the path to the source file:");
        String in = StandartMethods.getString();
        System.out.println("Enter the path to the result file:");
        String out = StandartMethods.getString();
        writeFile(in, out);
        System.out.println("Program is complete!");
    } // run()
} // HardTask1
