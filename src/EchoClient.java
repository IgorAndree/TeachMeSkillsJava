/* Добавить в код возможность получения конкретных ответов от Сервера в случае если
   Клиент задает определенные вопросы. Например:
   a. (клиент) Привет, (сервер) Привет, как тебя зовут?
   b. (клиент) Кирилл, (сервер) Приятно с тобой познакомиться, Кирилл и т.д. */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// Объявляем класс, для пользователя.
public class EchoClient {

    // Объявляем метод с точкой входа, который пробрасывает исключения.
    public static void main(String[] args) throws IOException {

        // Создаем сканер.
        Scanner sc = new Scanner(System.in);

        // Открываем порт.
        Socket socket = new Socket("localhost", 8189);

        // Объявляем переменные для ввода и вывода данных.
        DataInputStream is = new DataInputStream(socket.getInputStream());
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());

        // Выводим сообщение о присоединении клиенту.
        System.out.println("\nДобро пожаловать!");

        // Вечный цикл.
        while (true) {

            // Чтение сообщения от пользователя.
            String msg = sc.nextLine();

            // Отправляем сообщения на сервер.
            os.writeUTF(msg);

            // Очищаем буфер вывода.
            os.flush();

            // Чтение ответа от сервера.
            String response = is.readUTF();

            // Выводим ответ сервера на экран.
            System.out.println("\nСервер : " + response);

            // Проверяем на выход из программы.
            if (msg.equals("Выйти")) {

                // Выводим сообщение клиенту о выходе из программы.
                System.out.println("\nВы вышли из программы!");

                break;
            }
        }
    }
}