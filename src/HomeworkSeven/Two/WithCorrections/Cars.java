package HomeworkSeven.Two.WithCorrections;

/* 2). Создать класс Машина со следующими параметрами: модель, цвет, год
       производства, максимальная скорость (используем принципы инкапсуляции). В
       основном классе создать два массива объектов класса машина с разными
       моделями машин (по 4 объекта в каждом). Через сравнение всех моделей
       машин, вывести самую старую модель и самую быструю. */


public class Cars { // Инкапсуляция.
    private  String model; // Модель.
    private  String color; // Цвет.
    private  int yearProduction; // Год выпуска.
    private  int maxSpeed; // Максимальная скорость.

    public Cars(String model, String color, int yearProduction, int maxSpeed) {
        // Создаем конструктор для создания нового объекта Car с заданными параметрами.
        this.model = model; // Модель
        this.color = color; // Цвет
        this.yearProduction = yearProduction; // Год выпуска
        this.maxSpeed = maxSpeed; // Максимальная скорость.
    }

    public String getModel() {
        // Метод передачи свойства модели.
        return model;
    }

    public String getColor() {
        // Метод передачи свойства цвета. // p.s.Не понял зачем это указывать,ведь мы это никуда не выводим.
        return color;
    }

    public int getYearProduction() {
        // Метод передачи свойства года выпуска.
        return yearProduction;
    }

    public int getMaxSpeed() {
        // Метод передачи свойства максимальной скорости.
        return maxSpeed;
    }
}


