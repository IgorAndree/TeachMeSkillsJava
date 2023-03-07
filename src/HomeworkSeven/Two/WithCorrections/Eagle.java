package HomeworkSeven.Two.WithCorrections;

/* 2). Создать класс Машина со следующими параметрами: модель, цвет, год
       производства, максимальная скорость (используем принципы инкапсуляции). В
       основном классе создать два массива объектов класса машина с разными
       моделями машин (по 4 объекта в каждом). Через сравнение всех моделей
       машин, вывести самую старую модель и самую быструю. */


public class Eagle extends Cars { // Наследование.

    // Полиморфизм.
    public Eagle(String model, String color, int yearProduction, int maxSpeed) {
        super(model, color, yearProduction, maxSpeed);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public int getYearProduction() {
        return super.getYearProduction();
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }
}
