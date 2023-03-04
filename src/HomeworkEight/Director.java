package HomeworkEight;

/* 2). Создать классы "Директор", "Рабочий", "Бухгалтер".
       Реализовать интерфейс с методом, который печатает название
       должности и имплементировать этот метод в созданные классы.*/

// Класс, представляющий директора.
public class Director implements Employee {
    // Реализация метода printTitle для директора.
    public void printTitle() {
        System.out.println("Director"); // Выводим "Директор".
    }
}
