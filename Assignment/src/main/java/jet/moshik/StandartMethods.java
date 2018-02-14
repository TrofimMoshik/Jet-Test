package jet.moshik;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Trofim Moshik on 12.02.2018.
 *
 * Набор методов, используемых в приложении.
 */
class StandartMethods {

    /**
     * Консольное меню с выбором задачи.
     */
    static void printMenu() throws IOException {
        boolean isExit = false;
        String choice;

        while (!isExit) {
            System.out.println();
            System.out.println("Enter num of the task, please. For quit press \"Enter\"");
            System.out.println("1. Easy level, task 1");
            System.out.println("2. Easy level, task 2");
            System.out.println("3. Easy level, task 3");
            System.out.println("4. Easy level, task 4");
            System.out.println("5. Easy level, task 5");
            System.out.println("6. Middle level, task 1");
            System.out.println("7. Middle level, task 2");
            System.out.println("8. Middle level, task 3");
            System.out.println("9. Middle level, task 4 (undone)");
            System.out.println("10. Hard level, task 1");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextLine();

            switch (choice) {
                case "":
                    isExit = true;
                    break;
                case "1":
                    System.out.println("This program returns second largest number from set of numbers.");
                    EasyTask1 et1 = new EasyTask1();
                    et1.run();
                    break;
                case "2":
                    System.out.println("This program decomposes the input number into prime factors.");
                    EasyTask2 et2 = new EasyTask2();
                    et2.run();
                    break;
                case "3":
                    System.out.println("This program checks a string on palindrome");
                    System.out.println("Enter a string, please:");
                    EasyTask3 et3 = new EasyTask3();
                    et3.run();
                    break;
                case "4":
                    System.out.println("This program returns list of exchanges of the entered amount for coins with a value 3, 5 and 7.");
                    EasyTask4 et4 = new EasyTask4();
                    et4.run();
                    break;
                case "5":
                    System.out.println("This program finds substring in string.");
                    EasyTask5 et5 = new EasyTask5();
                    et5.run();
                    break;
                case "6":
                    System.out.println("This program returns N largest number from set of numbers.");
                    MiddleTask1 mt1 = new MiddleTask1();
                    mt1.run();
                    break;
                case "7":
                    System.out.println("This program returns RL encode string.");
                    MiddleTask2 mt2 = new MiddleTask2();
                    mt2.run();
                    break;
                case "8":
                    System.out.println("This program returns RL decode string.");
                    MiddleTask3 mt3 = new MiddleTask3();
                    mt3.run();
                    break;
                case "9":
                    System.out.println("This program returns amount of exchanges for n1..nk coins");
                    MiddleTask4 mt4 = new MiddleTask4();
                    mt4.run();
                    break;
                case "10":
                    System.out.println("This program processes a text file according to the conditions.");
                    HardTask1 ht1 = new HardTask1();
                    ht1.run();
                    break;
                default:
                    System.out.println("Incorrect symbol, try again.");
                    System.out.println();
                    break;
            } // switch
        } // while
    } // printMenu()

    /**
     *
     * @return возвращает целочисленный список, введеный с консоли
     * @throws IOException
     */
    static ArrayList<Integer> getIntArrList() throws IOException{
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a set of numbers (at least two) line by line. To end of input press \"Enter\"");

        while (true) {
            String input = scan.nextLine();
            boolean isValid = true; // предполагается, что вводится целое число

            if ("".equals(input)) { // конец ввода при нажатии "Enter"
                if (array.size() < 2) { // если введено не менее 2 целых чисел
                    System.out.println("Incoming set of numbers is too small! Enter the next number:");
                    continue;
                }
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i); // посимвольная проверка ввода
                if (input.length() > 1 && i == 0 && ch == '-') continue; // проверка на отрицательное число
                if (!(ch >= '0' && ch <= '9')) {
                    isValid = false;
                    break;
                }
            } //for i
            if (isValid) array.add(Integer.valueOf(input));
            else System.out.println("This is not a number! Try again!");
        } //while
        return array;
    } // getIntArrList()

    /**
     *
     * @return возвращает целое число, введенное с консоли
     * @throws IOException
     */
    static Integer getInt() throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number:");

        while (true) {
            String input = scan.nextLine();
            boolean isValid = true; // предполагается, что вводится целое число

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i); // посимвольная проверка ввода
                if (input.length() > 1 && i == 0 && ch == '-') continue; // проверка на отрицательное число
                if (!(ch >= '0' && ch <= '9')) {
                    isValid = false;
                    break;
                }
            } //for i
            if (isValid) return Integer.valueOf(input);
            else System.out.println("This is not a number! Try again!");
        } //while
    } // getInt()

    /**
     *
     * @return возвращает строку с консоли
     * @throws IOException
     */
    static String getString() throws IOException {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    } // getString
} // StandartMethods
