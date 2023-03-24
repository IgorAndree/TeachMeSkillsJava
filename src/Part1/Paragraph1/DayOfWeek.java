package Part1.Paragraph1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Написать программу для вывода на консоль названия дня недели по введенной дате.

public class DayOfWeek {
    public static void main(String[] args) {

        // Создаем объект Scanner для чтения ввода из консоли.
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        // Предлагаем пользователю ввести дату в указанном формате.
        System.out.print("Введите дату в формате число-месяц-год : ");
        String inputDate = scanner.nextLine();

        // Создаем объект SimpleDateFormat для анализа входной строки даты в объект Date.
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {

            // Разбираем входную строку даты в объект Date, используя объект SimpleDateFormat.
            Date date = format.parse(inputDate);

            /* Создаем объект SimpleDateFormat для форматирования даты как названия дня недели
               используя спецификатор формата "EEEE". */
            String dayOfWeek = new SimpleDateFormat("EEEE").format(date);

            // Выводим на консоль название дня недели для введенной даты.
            System.out.println("День недели этой даты " + inputDate + " это : " + dayOfWeek);
        } catch (Exception e) {

            // Если при вводе даты возникнет исключение, отображаем сообщение об ошибке.
            System.out.println("Неверный ввод! Введите дату в формате число-месяц-год.");
        }
    }
}