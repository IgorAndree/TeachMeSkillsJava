package HomeworkEight;

/* 2). Создать классы "Директор", "Рабочий", "Бухгалтер".
       Реализовать интерфейс с методом, который печатает название
       должности и имплементировать этот метод в созданные классы.*/

// Класс, для проведения манипуляций.
public class Main {
    // Основной метод (точка входа).
    public static void main(String[]args) {
        // Создаем экземпляры классов Director, Worker, Accountant.
        Employee director = new Director();
        Employee worker = new Worker();
        Employee accountant = new Accountant();

        // Вызов метода printTitle для каждого экземпляра.
        director.printTitle(); // Печатает "Директор".
        worker.printTitle(); // Печатает "Рабочий".
        accountant.printTitle(); // Печатает "Бухгалтер".
    }
}
