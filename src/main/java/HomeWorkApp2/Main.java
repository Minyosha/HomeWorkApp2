/*
Практическое задание к "Java - Урок 2. Основные конструкции".
Boolean метод summWithin10and20 проверяет, находится ли сумма двух чисел в диапазоне от 10 включительно до 20 включительно.
Метод isPositiveOrNegative сообщает положительно или отрицательно число. 0 считается положительным числом.
Boolean метод isNegative сообщает отрицательно ли число.
Boolean метод isLeapYear проверяет год на високосность.
 */
package HomeWorkApp2;

public class Main {
    public static void main(String[] args) {
        System.out.println(summWithin10and20(125, 5));
        isPositiveOrNegative(10);
        System.out.println(isNegative(1));
        printStringNTimes("Тестовая строка", 2);
        System.out.println(isLeapYear(4000));
    }

    private static boolean summWithin10and20(int a, int b) {
        if (((a + b) >= 10) && ((a + b) <= 20)) {
            return true;
        }
        return false;
    }

    private static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void printStringNTimes(String testString, int quantityOfStrings) {
        for (int i = 0; i < quantityOfStrings; i++) {
            System.out.println(testString);
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 400) == 0) {
            return true;
        } else if ((year % 100) == 0) {
            return false;
        } else if ((year % 4) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
