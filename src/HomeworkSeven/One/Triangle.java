package HomeworkSeven.One;

/* 1).Написать иерархию классов «Фигуры».
      Фигура -> Треугольник -> Прямоугольник -> Круг.
      Реализовать ф-ю подсчета площади для каждого типа фигуры и
      подсчет периметра. Площадь треугольника по формуле Герона.
      Создать массив из 5 фигур.
      Вывести на экран сумму периметров и сумму площадей всех фигур в
      массиве. */

// Создаем подкласс Triangle,который наследуется от основного класса Shapes.
public class Triangle extends Shapes {
    // Создаем private переменные сторон треугольника.
    private final double  a; // Предложила идешка.
    private final double b; // Предложила идешка.
    private final double c; // Предложила идешка.

    // Создаем конструктор для создания нового треугольника с заданными длинами сторон.
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Переопределяем метод area для вычисления площади треугольника по формуле Герона.
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Используем формулу Герона для вычисления площади.
    }

    // Переопределяем метод perimeter для вычисления периметра треугольника.
    public double perimeter() {
        return a + b + c; // Сумма трех сторон.
    }
}