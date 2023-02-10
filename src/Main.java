import java.util.Random;
import java.util.Scanner;

// Домашнее задание 4.
public class Main {
    public static void main(String[] args) {

    /* 0). Создайте массив целых чисел. Напишете программу, которая выводит
           сообщение о том, входит ли заданное число в массив или нет. Пусть
           число для поиска задается с консоли (класс Scanner). */
        enteringANumberIntoAnArray();
        System.out.println();

    /* 1). Создайте массив целых чисел. Удалите все вхождения
          заданного числа из массива.
          Пусть число задается с консоли (класс Scanner). Если такого числа нет
        - выведите сообщения об этом.
          В результате должен быть новый массив без указанного числа. */
        showThatThereIsNoNumber();
        System.out.println();

    /* 2). Создайте и заполните массив случайным числами и выведете
          максимальное, минимальное и среднее значение.
          Для генерации случайного числа используйте метод Math.random().
          Пусть будет возможность создавать массив произвольного
          размера. Пусть размер массива вводится с консоли. */
        generateRandomNumber();
        System.out.println();

     /* 3). Создайте 2 массива из 5 чисел.
           Выведите массивы на консоль в двух отдельных строках.
           Посчитайте среднее арифметическое элементов каждого массива и
           сообщите, для какого из массивов это значение оказалось больше (либо
           сообщите, что их средние арифметические равны). */
        subtractTheArithmeticMean();


    }


    /* 0). Создайте массив целых чисел. Напишете программу, которая выводит
           сообщение о том, входит ли заданное число в массив или нет. Пусть
           число для поиска задается с консоли (класс Scanner). */
    private static void enteringANumberIntoAnArray() {

        int[] arrs = {1,2,3,4,5};// Создаем массив.
        Scanner scr = new Scanner(System.in);// Открываем сканнер.
        System.out.print("Enter a number from 1 to 5 inclusive : ");
        int number = scr.nextInt(); // Инициализируем переменную со сканнером.

        for (int i = 0; i < arrs.length; i++) // Открываем цикл.
        {
            if (arrs[i] == number) {
                System.out.println(number + " : is in the array."); // В случае этого цикла.
                return; // Возращаем цикл.
            }
            }
        System.out.println(number + " : is not in the array."); // Во всех остальных случаях.
        scr.close();// Закрываем сканнер.
    }



    /* 1). Создайте массив целых чисел. Удалите все вхождения
          заданного числа из массива.
          Пусть число задается с консоли (класс Scanner). Если такого числа нет
        - выведите сообщения об этом.
          В результате должен быть новый массив без указанного числа. */
    private static void showThatThereIsNoNumber() {

        Scanner scr = new Scanner(System.in);// Открываем сканнер.
        System.out.println("Enter the size of the array :");
        int size = scr.nextInt(); // Инициализируем переменную со сканнером.
        int[] array = new int[size]; // Создаем массив.

        System.out.println("Enter the elements of the array :");
        for (int p = 0; p < size; p++) // Открываем цикл.
        {
            array[p] = scr.nextInt(); // Инициализируем массив со сканнером.
        }

        System.out.println("Enter the elements you want to remove :");
        int removeNumber = scr.nextInt(); // Инициализируем переменную со сканнером.

        int newSize = 0; // Инициализируем новую переменную.
        for (int p = 0; p < size; p++) // Открываем цикл.
        {
            if (array[p] != removeNumber) // Не равно.
            {
                array[newSize++] = array[p];
            }
        }

        if (newSize == 0) {
            System.out.println("The array is now empty.");
        } else {
            System.out.println("The new array without the specified number is :");
            for (int p = 0; p < newSize; p++) // Открываем цикл.
            {
                System.out.print(array[p] + " ");
                scr.close(); // Закрываем сканнер.
            }
        }
    }

    /* 2). Создайте и заполните массив случайным числами и выведете
          максимальное, минимальное и среднее значение.
          Для генерации случайного числа используйте метод Math.random().
          Пусть будет возможность создавать массив произвольного
          размера. Пусть размер массива вводится с консоли. */
    private static void generateRandomNumber() {

        Scanner scr = new Scanner(System.in);// Открываем сканнер.
        System.out.println("Enter the size of the array : ");
        int size = scr.nextInt(); // Инициализируем переменную со сканнером.
        int[] array = new int[size]; // Создаем массив.
        scr.close(); // Закрываем сканнер.
        Random random = new Random(); // Инициализируем рандом.

        for (int f = 0; f < size; f++) // Открываем цикл.
        {
            array[f] = random.nextInt(100); /* Задаем в массив рандом. Положительное число
                                                     от 0 до 99 включительно.*/
        }

        int maximumValue = array[0]; // Максимальное значение.
        int minimumValue = array[0]; // Минимальное значение.
        int sum = 0; // Сумма.
        for (int f = 0; f < size; f++) // Открываем цикл.
        {
            maximumValue = Math.max(maximumValue, array[f]);
            minimumValue = Math.min(minimumValue, array[f]);
            sum += array[f];
        }

        double averageValue = (double) sum / size; // Выводим двойное среднее значение.
        System.out.println("The maximum value in the array is : " + maximumValue);
        System.out.println("The minimum value in the array is : " + minimumValue);
        System.out.println("The average value in the array is : " + averageValue);

    }

    /* 3). Создайте 2 массива из 5 чисел.
           Выведите массивы на консоль в двух отдельных строках.
           Посчитайте среднее арифметическое элементов каждого массива и
           сообщите, для какого из массивов это значение оказалось больше (либо
           сообщите, что их средние арифметические равны). */
    private static void subtractTheArithmeticMean() {

        Scanner scr = new Scanner(System.in); // Открываем сканнер.
        scr.close(); // Закрываем сканнер.
        Random random = new Random(); // Иниацилизируем рандом.

        int[] array1 = new int[5]; // Инициализируем массив 1.
        int[] array2 = new int[5]; // Инициализируем массив 2.

        for (int s = 0; s < 5; s++) {
            array1[s] = random.nextInt(100); // Положительное число от 0 до 99 включительно.
            array2[s] = random.nextInt(100); // Положительное число от 0 до 99 включительно.
        }

        System.out.println("Array 1: ");
        for (int s = 0; s < 5; s++) // Открываем цикл.
        {
            System.out.print(array1[s] + " ");
        }
        System.out.println();

        System.out.println("Array 2: ");
        for (int s = 0; s < 5; s++) // Открываем цикл.
        {
            System.out.print(array2[s] + " ");
        }
        System.out.println();

        int sum1 = 0; // Сумма 1.
        for (int s = 0; s < 5; s++) // Открываем цикл.
        {
            sum1 += array1[s];
        }
        double average1 = (double) sum1 / 5; // Выводим двойное среднее значение суммы 1.

        int sum2 = 0; // Сумма 2.
        for (int s = 0; s < 5; s++) // Открываем цикл.
        {
            sum2 += array2[s];
        }
        double average2 = (double) sum2 / 5; // Выводим двойное среднее значение суммы 2.

        if (average1 > average2) {
            System.out.println("The arithmetic mean of array 1 is greater.");
        } else if (average1 < average2) {
            System.out.println("The arithmetic mean of array 2 is greater.");
        } else {
            System.out.println("The arithmetic means of both arrays are equal.");
        }
    }
}

































