package Part2;

import java.util.ArrayList;
import java.util.List;

/*   Создать коллекцию класса ArrayList наполнить ее элементами
     рандомными элементами типа Integer.
     С помощью Stream'ов:
   - Удалить дубликаты
   - Вывести все четные элементы в диапазоне от 7 до 17 (включительно).
   - Каждый элемент умножить на 2
   - Отсортировать и вывести на экран первых 4 элемента
   - Вывести количество элементов в стрим
   - Вывести среднее арифметическое всех чисел в стрим */

public class ArrayListStreamExample {

    public static void main(String[] args) {

        // Создаем и заполняем ArrayList случайными целыми числами.
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 10));
        }

        System.out.println();

        // Выводим исходный список.
        System.out.println("Список 20 случайных чисел : " + list);

        // Удаляем дубликаты.
        List<Integer> uniqueList = list.stream().distinct().toList();
        System.out.println("Список этих чисел без дубликатов : " + uniqueList);

        // Выводим четные элементы от 7 до 17 (включительно).
        List<Integer> evenList = uniqueList.stream().filter(i -> i % 2 == 0 && i >= 7 && i <= 17).toList();
        System.out.println("Все четные числа от 7 до 17 включительно : " + evenList);

        // Умножаем каждый элемент на 2.
        List<Integer> doubledList = uniqueList.stream().map(i -> i * 2).toList();
        System.out.println("Список чисел без дубликатов умноженные на 2 : " + doubledList);

        // Сортируем и выводим первые 4 элемента.
        List<Integer> sortedList = uniqueList.stream().sorted().limit(4).toList();
        System.out.println("Первых 4 отсортированных числа: " + sortedList);

        // Подсчитываем количество элементов.
        long count = uniqueList.size();
        System.out.println("Количество чисел без дубликатов : " + count);

        // Вычисляем среднее арифметическое.
        double average = uniqueList.stream().mapToInt(i -> i).average().orElse(Double.NaN);
        System.out.println("Среднее арифметическое чисел без дубликатов : " + average);
    }
}
