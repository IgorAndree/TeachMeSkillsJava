/* Создать три потока Т1, Т2 и Т3.
   Реализовать выполнение поток в последовательности
   Т3 -> Т2 -> Т1 (используя метод join). */


// Создаем главный класс.
public class Main {

    // Создаем основной метод с точкой входа, пробрасывающий общие ошибки.
    public static void main(String[] args) throws InterruptedException {

        System.out.println();

        // Создаем поток Т3.
        Thread t3 = new Thread(() -> System.out.println("Выполнение потока T3..."));

        // Создаем поток Т2.
        Thread t2 = new Thread(() -> {
            try {
                t3.join(); // Дожидаемся завершения потока T3 перед выполнением потока T2.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Выполнение потока T2...");
        });

        // Создаем поток Т1.
        Thread t1 = new Thread(() -> {
            try {
                t2.join(); // Дожидаемся завершения потока T2 перед выполнением потока T1.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Выполнение потока T1...");
        });

        // Запускаем потоки.
        t1.start();
        t2.start();
        t3.start();

        // Ждем завершения всех потоков.
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Все потоки завершили выполнение!");
    }
}