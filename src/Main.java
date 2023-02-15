import java.util.Scanner;

// Домашнее задание 5
public class Main {

// Условия задания 5.

    public static void main(String[] args) {

    /* 1).Создать двухмерный массив из целых чисел.
          С помощью циклов "пройти" по всему массиву и увеличить каждый
          элемент на заданное число. Пусть число, на которое будет
          увеличиваться каждый элемент, задается из консоли. */
          createA2DArray();
          System.out.println();

    /* 2).Шахматная доска
          Создать программу для раскраски шахматной доски с помощью цикла.
          Создать двумерный массив String'ов 8х8. С помощью циклов задать
          элементам циклам значения B(Black) или W(White). Результат работы
          программы:
          W B W B W B W B
          B W B W B W B W
          W B W B W B W B
          B W B W B W B W
          W B W B W B W B
          B W B W B W B W
          W B W B W B W B
          B W B W B W B W */
          createAChessboard();
    }

// Решение задания 5.

    /* 1).Создать двухмерный массив из целых чисел.
          С помощью циклов "пройти" по всему массиву и увеличить каждый
          элемент на заданное число. Пусть число, на которое будет
          увеличиваться каждый элемент, задается из консоли. */
    private static void createA2DArray() {

        // Создаем двумерный массив целых чисел.
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // p.s. Этот метод создания для меня более удобен и понятен).

        // Предлогаем пользователю ввести число для увеличения каждого элемента.
        Scanner scr = new Scanner(System.in); // Открываем сканнер.
        System.out.print("Enter a number to increment each element: ");
        int increment = scr.nextInt();
        scr.close(); // Закрываем сканнер.

        // Используем вложенные циклы для увеличения каждого элемента в массиве на заданное число.
        for (int i = 0; i < array.length; i++) {
            for (int s = 0; s < array[i].length; s++) {
                array[i][s] += increment;
            }
        }

        // Выводим обновленный массив.
        for (int i = 0; i < array.length; i++) {
            for (int s = 0; s < array[i].length; s++) {
                System.out.print(array[i][s] + " "); // Отступ.
            }
            System.out.println();
        }
    }

    /* 2).Шахматная доска
          Создать программу для раскраски шахматной доски с помощью цикла.
          Создать двумерный массив String'ов 8х8. С помощью циклов задать
          элементам циклам значения B(Black) или W(White). Результат работы
          программы:
          W B W B W B W B
          B W B W B W B W
          W B W B W B W B
          B W B W B W B W
          W B W B W B W B
          B W B W B W B W
          W B W B W B W B
          B W B W B W B W */
    private static void createAChessboard(){

    }
}



