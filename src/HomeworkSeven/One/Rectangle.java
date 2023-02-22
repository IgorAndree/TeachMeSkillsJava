package HomeworkSeven.One;

/* 1).Написать иерархию классов «Фигуры».
      Фигура -> Треугольник -> Прямоугольник -> Круг.
      Реализовать ф-ю подсчета площади для каждого типа фигуры и
      подсчет периметра. Площадь треугольника по формуле Герона.
      Создать массив из 5 фигур.
      Вывести на экран сумму периметров и сумму площадей всех фигур в
      массиве. */

// Создаем подкласс Rectangle,который наследуется от основного класса Shapes.
public class Rectangle extends Shapes {
    // Создаем private переменные ширины и высоты прямоугольника.
    private final double width; // Предложила идешка.
    private final double length; // Предложила идешка.

    // Создаем конструктор для создания нового прямоугольника с заданной шириной и длинной.
    public Rectangle(double width, double length ) {
        this.width = width;
        this.length = length;
    }

    // Переопределяем метод area для вычисления площади прямоугольника.
    public double area() {
        return width * length; // Вычисляет площадь по ширине и длинне.
    }

    // Переопределяем метод perimeter для вычисления периметра прямоугольника.
    public double perimeter() {
        return 2 * (width + length); // Вычисляем периметр по формуле 2 * (ширина + длинна).
    }
}