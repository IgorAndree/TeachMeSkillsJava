package Part1.Paragraph3;

import java.util.Scanner;

/* Создать обобщенный функциональный интерфейс.
   Написать класс с одним методом.
   В этом методе реализуйте логику:
   - если в консоль введена цифра 1, то: использования интерфейса
   со строковым типом и передать в метод интерфейса логику реверса
   строки(вывода строки в обратном порядке).
   - если в консоль введена цифра 2, то: использования интерфейса
   с целочисленным типом и передать в метод интерфейса логику
   нахождения факториала числа. */


// Объявляем открытый класс.
public class MyFunctionalClass {

    // Объявляем основной метод, который является точкой входа в программу.
    public static void main(String[] args) {

        // Создаем новый объект Scanner для чтения пользовательского ввода с консоли.
        Scanner scr = new Scanner(System.in);

        // Читаем целочисленное значение от пользователя и сохраняем его в переменной userInput.
        int userInput = scr.nextInt();

        /* Если пользователь ввел 1, создаем объект MyFunctionalInterface с типами ввода и вывода String,
           и реализуем метод PerformAction с помощью лямбда-выражения, которое переворачивает входную строку. */
        if (userInput == 1) {
            MyFunctionalInterface<String, String> stringReversal = (String s) -> {
                StringBuilder sb = new StringBuilder(s);
                return sb.reverse().toString();
            };

            // Читаем строку, введенную пользователем, и сохраняем ее в переменной inputString.
            String inputString = scr.next();

            // Вызываем метод PerformAction для объекта stringReversal с параметром inputString, и выводим вывод на консоль.
            System.out.println(stringReversal.performAction(inputString));

            /* Если пользователь ввел 2, создаем объект MyFunctionalInterface с типами ввода и вывода Integer,
               и реализуем метод PerformAction, используя цикл для вычисления факториала входного целого числа. */
        } else if (userInput == 2) {
            MyFunctionalInterface<Integer, Integer> factorial = (Integer n) -> {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result *= i;
                }
                return result;
            };

            // Чтение целочисленного ввода от пользователя и сохранение его в переменной inputInt.
            int inputInt = scr.nextInt();

            // Вызываем метод PerformAction для факториала с параметром inputInt, и выводим вывод на консоль.
            System.out.println(factorial.performAction(inputInt));
        }

        // Закрываем сканер, чтобы освободить ресурсы.
        scr.close();
    }
}