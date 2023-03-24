package Part1.Paragraph2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Написать программу для вывода на экран дату следующего вторника.

public class NextTuesdayDate {
    public static void main(String[] args) {

        // Создаем экземпляр календаря.
        Calendar calendar = Calendar.getInstance();

        // Получаем сегодняшнюю дату.
        Date today = calendar.getTime();

        // Устанавливаем календарь на следующий вторник.
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        if (calendar.getTime().before(today)) {

            // Если следующий вторник уже прошел, добавляем неделю.
            calendar.add(Calendar.WEEK_OF_YEAR, 1);
        }

        // Форматируем дату как "чч-мм-гггг".
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String nextTuesdayDate = dateFormat.format(calendar.getTime());
        System.out.println();

        // Отображаем дату следующего вторника.
        System.out.println("Следующий вторник будет : " + nextTuesdayDate);
    }
}
