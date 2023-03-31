/* Добавить в код возможность получения конкретных ответов от Сервера в случае если
   Клиент задает определенные вопросы. Например:
   a. (клиент) Привет, (сервер) Привет, как тебя зовут?
   b. (клиент) Кирилл, (сервер) Приятно с тобой познакомиться, Кирилл и т.д. */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

// Объявляем класс, для сервера.
public class EchoServer {

    // Хэш-таблица для хранения вопросов и ответов.
    private final HashMap<String, String> questionsAndAnswers;

    // Конструктор класса сервер.
    public EchoServer() {

        // Инициализируем хэш-таблицу.
        questionsAndAnswers = new HashMap<>();

        // Добавляем вопросы и ответы в хэш-таблицу.
        questionsAndAnswers.put("Привет", "Привет, как тебя зовут?");
        questionsAndAnswers.put("Меня зовут Игорь", "Очень приятно Игорь, есть какие либо вопросы?");
        questionsAndAnswers.put("Что делаешь?", "Я жду вопросы от клиента.");

        // Создаем серверный сокет.
        try (ServerSocket server = new ServerSocket(8189)) {

            while (true) {

                // Ожидаем подключения клиента.
                Socket socket = server.accept();
                new Thread(() -> {
                    try {

                        // Обрабатываем подключение клиента.
                        handle(socket);

                        // Обрабатываем ошибки.
                    } catch (IOException ioException) {

                        // Выводим сообщение в случае сбоя системы.
                        System.out.println("\nСоединение с клиентом было прервано!");

                    }
                    // Запускаем поток.
                }).start();
            }

        } catch (IOException msg) {
            msg.printStackTrace();
        }
    }


    // Объявляем метод для соединения, пробрасывающий исключения.
    private void handle(Socket socket) throws IOException {

        // Объявляем переменные для ввода и вывода данных.
        DataInputStream is;
        DataOutputStream os;
        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());

        // Выводим сообщение о подключении клиента.
        System.out.println("\nКлиент присоединился!");

        while (true) {

            // Чтение сообщения от клиента.
            String msg = is.readUTF();

            // Выводим сообщения от клиента.
            System.out.println("\nКлиент : " + msg);

            // Проверяем на выход из программы.
            if (msg.equals("Выйти")) {

                // Выводим сообщение серверу о выходе клиента из программы.
                System.out.println("\nКлиент вышел(");

                // Вывод о прощании сервера с клиентом.
                os.writeUTF("До скорой встречи)");
                os.flush();
                break;
            }
            // Проверяем наличия ключа в хэш-таблице.
            if (questionsAndAnswers.containsKey(msg)) {
                // Отправляем ответ на запрос из хэш-таблицы.
                os.writeUTF(questionsAndAnswers.get(msg));
                os.flush();
            } else {

                // Отправляем сообщения обратно клиенту.
                os.writeUTF(msg);
                os.flush();
            }
        }
    }

    // Объявляем метод с точкой входа.
    public static void main(String[] args) {

        // Создаем новый объект класса сервер.
        new EchoServer();
    }
}