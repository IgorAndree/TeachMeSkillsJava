package HomeworkSeven.One;

/* 1).Написать иерархию классов «Фигуры».
      Фигура -> Треугольник -> Прямоугольник -> Круг.
      Реализовать ф-ю подсчета площади для каждого типа фигуры и
      подсчет периметра. Площадь треугольника по формуле Герона.
      Создать массив из 5 фигур.
      Вывести на экран сумму периметров и сумму площадей всех фигур в
      массиве. */

// Создаем класс MyMain.
public class MyMain {
    public static void main(String[] args) {
        // Создаем массив объектов Фигуры.
        Shapes[] shapes = new Shapes[5];
        // Инициализируем массив со всеми фигурами.
        shapes[0] = new Triangle(3, 4, 5); // Вводим значения сторон треугольника.
        shapes[1] = new Rectangle(2, 3); //Вводим значения ширины и длинны прямоугольника.
        shapes[2] = new Circle(5); // Вводим значение радиуса круга.
        shapes[3] = new Triangle(6, 8, 10);  // Вводим значения сторон треугольника.
        shapes[4] = new Rectangle(4, 6); // Вводим значение ширины и длинны прямоугольника.

        // Инициализируем переменные для хранения общего периметра и общей площади всех фигур.
        double totalPerimeter = 0;
        double totalArea = 0;
        // Перебераем все фигуры в массиве.
        for (Shapes shape : shapes) {
            // Добавляем периметр и площадь каждой фигуры к итоговым переменным.
            totalPerimeter += shape.perimeter();
            totalArea += shape.area(); // p.s.Цикл for-each как ты и просил).
        }
        // Выводим сумму общего периметра и сумму общуей площади всех фигур в массиве.
        System.out.println();
        System.out.println("The sum of the total perimeter : " + totalPerimeter);
        System.out.println();
        System.out.println("The sum of the total area : " + totalArea);
    }
}