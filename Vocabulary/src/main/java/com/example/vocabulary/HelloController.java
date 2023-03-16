// Этот код определяет класс контроллера для приложения JavaFX, которое управляет простым списком словаря.
package com.example.vocabulary;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

// Создаем класс для создания принципа работы словаря.
public class HelloController {

    @FXML
    private TextField wordTextField; // Текстовое поле для ввода новых слов.

    @FXML
    private ListView<String> vocabularyListView; // Представление списка для отображения слов словаря.

    private final LinkedList<String> vocabularyList = new LinkedList<>(); // Связный список для хранения слов.

    private final String FILE_NAME = "dictionary.txt"; // Имя файла, в котором будет сохранен список слов из словаря.

    @FXML
    private void initialize() { // Инициализируем контроллер при запуске приложения.
        loadVocabularyFromFile(); // Загружаем список словарей из файла.
        vocabularyListView.getItems().addAll(vocabularyList); // Добавляем список слов к списку.
    }

    @FXML
    private void handleAddButtonAction() { // Обрабатываем добавление нового слова в список словаря.
        String word = wordTextField.getText().trim(); // Получаем слово, введенное в текстовое поле.
        if (!word.isEmpty()) { // Проверяем, не пустое ли слово.
            vocabularyList.add(word); // Добавляем слово в список словаря.
            vocabularyListView.getItems().add(word); // Добавляем слово в список.
            wordTextField.clear(); // Очищаем текстовое поле.
            saveVocabularyToFile(); // Сохраняем словарь в файл
        }
    }

    @FXML
    private void handleDeleteButtonAction() { // Обрабатываем удаление слова из списка словаря.
        int selectedIndex = vocabularyListView.getSelectionModel().getSelectedIndex(); // Получаем выбранный индекс из списка.
        if (selectedIndex >= 0) { // Проверяем, выделено ли слово.
            vocabularyList.remove(selectedIndex); // Удаляем слово из списка словаря.
            vocabularyListView.getItems().remove(selectedIndex); // Удаляем слово из списка.
            saveVocabularyToFile(); // Сохраняем словарь в файл.
        }
    }

    private void loadVocabularyFromFile() { // Загружаем список словаря из файла.
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) { // Используем блок try-with-resources для чтения из файла.
            while (scanner.hasNextLine()) { // Читаем каждую строку файла.
                String line = scanner.nextLine().trim(); // Удаляем все начальные или конечные пробелы.
                if (!line.isEmpty()) { // Проверяем, не пустая ли строка.
                    vocabularyList.add(line); // Добавляем слово в список словаря.
                }
            }
        } catch (FileNotFoundException e) { // Перехватываем исключение, если файла не существует.

        }
    }

    private void saveVocabularyToFile() { // Сохраняем словарь в файл
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) { // Использует блок try-with-resources для записи в файл.
            for (String word : vocabularyList) { // Перебираем каждое слово в списке словаря.
                writer.println(word); // Записываем слово в файл.
            }
        } catch (IOException e) { // Перехватываем исключение, если есть ошибка записи в файл.
            e.printStackTrace(); // Печатаем трассировку стека исключения.
        }
    }
}
