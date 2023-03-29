/* Создать три потока Т1, Т2 и Т3.
   Реализовать выполнение поток в последовательности
   Т3 -> Т2 -> Т1 (используя метод join). */


// Создаем главный класс.
public class MyMain {

    // Создаем основной метод с точкой входа, пробрасывающий общие ошибки.
    public static void main(String[] args) throws InterruptedException {

        System.out.println();

        // Создаем поток Т1.
        Thread t1 = new Thread(() -> System.out.println("Выполнение потока T1..."));

        // Создаем поток Т2.
        Thread t2 = new Thread(() -> {
            try {
                t1.join(); // Дожидаемся завершения потока T1 перед выполнением потока T2.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Выполнение потока T2...");
        });

        // Создаем поток Т3.
        Thread t3 = new Thread(() -> {
            try {
                t2.join(); // Дожидаемся завершения потока T2 перед выполнением потока T3.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Выполнение потока T3...");
        });

        // Запускаем потоки в обратном порядке.
        t3.start();
        t2.start();
        t1.start();

        // Ждем завершения всех потоков.
        t3.join();
        t2.join();
        t1.join();

        System.out.println("Все потоки завершили выполнение!");
    }
}