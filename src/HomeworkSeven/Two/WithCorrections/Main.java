package HomeworkSeven.Two.WithCorrections;

/* 2). Создать класс Машина со следующими параметрами: модель, цвет, год
       производства, максимальная скорость (используем принципы инкапсуляции). В
       основном классе создать два массива объектов класса машина с разными
       моделями машин (по 4 объекта в каждом). Через сравнение всех моделей
       машин, вывести самую старую модель и самую быструю. */

public class Main {
    public static void main(String[] args) {
        // Создаем массив cars1 с 4 объектами Car.
        Cars[] cars1 = {
                new Audi("AUDI", "Amber", 2020, 200), // Вводим все данные машины.
                new Bmw("BMW", "Black", 2022, 220), // Вводим все данные машины.
                new Citroen("CITROEN ", "Coral", 2017, 170), // Вводим все данные машины.
                new Dodge("DODGE", "Dark", 2018, 180) // Вводим все данные машины.
        };

        // Создаем массив cars2 с 4 объектами Car.
        Cars[] cars2 = {
                new Eagle("EAGLE ", "Emerald", 2023, 230), // Вводим все данные машины.
                new Ford("FORD", "Fuchsia", 2019, 190), // Вводим все данные машины.
                new Gaz("GAZ", "Gold", 2016, 160), // Вводим все данные машины.
                new Honda("HONDA", "Hot", 2021, 210) // Вводим все данные машины.
        };
        // Находим самые старые и быстрые модели.
        Cars oldestCar = cars1[0];
        Cars fastestCar = cars1[0];

        for (Cars car : cars1) {
            // Проверяем,меньше ли год выпуска текущей модели, чем год выпуска самой старой модели.
            if (car.getYearProduction() < oldestCar.getYearProduction()) {
                oldestCar = car; // Обновляем самую старую модель до текущей модели.
            }

            // Проверяем,превышает ли максимальная скорость текущей модели максимальную скорость самой быстрой модели.
            if (car.getMaxSpeed() > fastestCar.getMaxSpeed()) {
                fastestCar = car; // Обновляем самую быструю модель до текущей модели.
            }
        }

        for (Cars car : cars2) {
            // Проверяем, меньше ли год выпуска текущей модели, чем год выпуска самой старой модели.
            if (car.getYearProduction() < oldestCar.getYearProduction()) {
                oldestCar = car; // Обновляем самую старую модель до текущей модели.
            }

            // Проверяем,превышает ли максимальная скорость текущей модели максимальную скорость самой быстрой модели.
            if (car.getMaxSpeed() > fastestCar.getMaxSpeed()) {
                fastestCar = car; // Обновляем самую быструю модель до текущей модели.
            }
        }

        // Выводим самые старые и быстрые модели.
        System.out.println();
        System.out.println("The oldest model : " + oldestCar.getModel()); // Самая старая модель.
        System.out.println();
        System.out.println("The fastest model : " + fastestCar.getModel()); // Самая быстрая модель.
    }
}


