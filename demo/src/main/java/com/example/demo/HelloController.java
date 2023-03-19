package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField keyField;

    @FXML
    private TextField valueField;

    @FXML
    private ListView<String> keyListView;

    @FXML
    private ListView<String> valueListView;

    @FXML
    private Button addButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button closeButton;

    private final HashMap<String, String> dictionary = new HashMap<>();

    private final ObservableList<String> keyList = FXCollections.observableArrayList();
    private final ObservableList<String> valueList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        loadDictionaryFromFile();
        keyListView.setItems(keyList);
        valueListView.setItems(valueList);

        keyListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                keyField.setText(newVal);
                valueField.setText(dictionary.get(newVal));
            }
        });

        addButton.setOnAction(event -> {
            String key = keyField.getText();
            String value = valueField.getText();
            if (!key.isEmpty() && !value.isEmpty()) {
                dictionary.put(key, value);
                keyList.add(key);
                valueList.add(value);
                keyField.clear();
                valueField.clear();
            }
        });

        editButton.setOnAction(event -> {
            String key = keyField.getText();
            String value = valueField.getText();
            if (!key.isEmpty() && !value.isEmpty()) {
                int index = keyListView.getSelectionModel().getSelectedIndex();
                if (index >= 0) {
                    String oldKey = keyList.get(index);
                    dictionary.remove(oldKey);
                    dictionary.put(key, value);
                    keyList.set(index, key);
                    valueList.set(index, value);
                    keyField.clear();
                    valueField.clear();
                }
            }
        });

        deleteButton.setOnAction(event -> {
            int index = keyListView.getSelectionModel().getSelectedIndex();
            if (index >= 0) {
                String key = keyList.get(index);
                dictionary.remove(key);
                keyList.remove(index);
                valueList.remove(index);
                keyField.clear();
                valueField.clear();
            }
        });

        closeButton.setOnAction(event -> {
            saveDictionaryToFile();
            System.exit(0);
        });
    }

    /**
     * Loads the dictionary data from a file into the HashMap and ListView.
     */
    private void loadDictionaryFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String key = parts[0];
                    String value = parts[1];
                    dictionary.put(key, value);
                    keyList.add(key);
                    valueList.add(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Saves the dictionary data from the HashMap into a file.
     */
    private void saveDictionaryToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("dictionary.txt"))) {
            for (String key : dictionary.keySet()) {
                String value = dictionary.get(key);
                writer.println(key + ":" + value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
