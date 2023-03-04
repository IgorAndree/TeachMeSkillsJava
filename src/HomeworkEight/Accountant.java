package HomeworkEight;

/* 2). Создать классы "Директор", "Рабочий", "Бухгалтер".
       Реализовать интерфейс с методом, который печатает название
       должности и имплементировать этот метод в созданные классы.*/

// Класс, представляющий бухгалтера.
public class Accountant implements Employee {
    // Реализация метода printTitle для бухгалтера.
    public void printTitle() {
        System.out.println("Accountant"); // Выводим "Бухгалтер".
    }
}
