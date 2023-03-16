// Этот код для приложения JavaFX.
package com.example.vocabulary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

// Создаем класс для проведения манипуляций.
public class HelloApplication extends Application {

    // Переопределяем метод start для создания главного окна приложения.
    @Override
    public void start(Stage stage) throws IOException {
        // Загружаем файл .fxml с помощью FXMLLoader.
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("vocabulary.fxml"));
        // Создаем новую сцену с загруженным файлом FXML и устанавливает размеры.
        Scene scene = new Scene(fxmlLoader.load(), 382, 400);
        // Устанавливаем заголовок главного окна.
        stage.setTitle("Vocabulary");
        // Устанавливаем сцену главного окна в сцену, созданную выше.
        stage.setScene(scene);
        // Отображаем главное окно.
        stage.show();
    }
    // Точка входа приложения.
    public static void main(String[] args) {
        // Запускаем приложение JavaFX.
        launch();
    }
}