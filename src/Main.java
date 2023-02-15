// Домашнее задание 1 - 2.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world.Welcome to Java.");
        System.out.println();
// Домашнее задание 3.

        /* 1) В переменную записываем число. Надо вывести на экран сколько в этом
              числе цифр и положительное оно или отрицательное. Например, "это
              однозначное положительное число". Достаточно будет определить, является ли
              число однозначным, "двухзначным или трехзначным и более. */
        definitionOfNumber();
        System.out.println();

        /* 2) Треугольник существует только тогда, когда сумма любых двух его сторон
              больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
              стороны предполагаемого треугольника. Требуется сравнить длину каждого
              отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
              окажется больше суммы двух других, то треугольника с такими сторонами не
              существует */
        comparisonOfSidesOfATtriangle();
        System.out.println();

        /* 3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
              Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
              10. Вывести полученное число. */
        additionAndSubtractionOfANumber();
        System.out.println();

        // 4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
        findPositiveNumbers();
        System.out.println();

        // 5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
        findPositiveAndNegativeNumbers();
        System.out.println();

        // 6) Даны 2 числа. Вывести большее из них.
        outputOfALargerNumber();
        System.out.println();

        /* 7) (Дополнительно) В переменную записываете количество программистов. В
              зависимости от количества программистов необходимо вывести правильно
              окончание. Например:
            • 2 программиста
            • 1 программист
            • 10 программистов
            • и т.д. */
        correctEndingOutputEng();
        System.out.println();

        /* 7) (Дополнительно) В переменную записываете количество программистов. В
              зависимости от количества программистов необходимо вывести правильно
              окончание. Например:
            • 2 программиста
            • 1 программист
            • 10 программистов
            • и т.д. */
        correctEndingOutputRus();
    }


    /* 1) В переменную записываем число. Надо вывести на экран сколько в этом
          числе цифр и положительное оно или отрицательное. Например, "это
          однозначное положительное число". Достаточно будет определить, является ли
          число однозначным, "двухзначным или трехзначным и более. */
    static void definitionOfNumber() {

        int numeric = 375; // Введите любой проверочный номер.

        if (numeric == 0) { // Решил выделить "0" отдельной цифрой, хотя понимаю, что это дополнительная строчка кода.
            System.out.println("This is a one digit positive number.");
        } else if (numeric > 0 && numeric < 10) {
            System.out.println("This is a one digit positive number.");
        } else if (numeric >= 10 && numeric < 100) {
            System.out.println("This is a two-digit positive number.");
        } else if (numeric >= 100 && numeric < 1000) {
            System.out.println("This is a three-digit positive number.");
        } else if (numeric >= 0) {
            System.out.println("This is a four-digit or more positive number.");
        }

        if (numeric < 0) {
            if (numeric > -10) {// Решил использовать двойной оператор "if".
                System.out.println("This is a one digit negative number.");
            } else if (numeric <= -10 && numeric > -100) {
                System.out.println("This is a two-digit negative number.");
            } else if (numeric <= -100 && numeric > -1000) {
                System.out.println("This is a three-digit negative number.");
            } else {
                System.out.println("This is a four-digit or more negative number.");
            }
        }
    }

    /* 2) Треугольник существует только тогда, когда сумма любых двух его сторон
          больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
          стороны предполагаемого треугольника. Требуется сравнить длину каждого
          отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
          окажется больше суммы двух других, то треугольника с такими сторонами не
          существует */
    static void comparisonOfSidesOfATtriangle() {

        int a = 3; // Введите любое проверочное число.
        int b = 7; // Введите любое проверочное число.
        int c = 10; // Введите любое проверочное число.

        //if (a + b > c && a + c > b && b + c > a) - Так я сразу сделал.
        if (a + b >= c && a + c >= b && b + c >= a) /* А так надо было сделать т.к. в задаче ничего небыло указано
                                                       о равенстве сторон */
        {
            System.out.println("Triangle exists.");
        } else {
            System.out.println("Triangle does not exist.");
        }
    }

    /* 3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
          Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
          10. Вывести полученное число. */
    static void additionAndSubtractionOfANumber() {

        int number = 0; // Введите любое проверочное число.
        int result;

        if (number >= 0) {
            result = number + 1;
        } else if (number < 0) {
            result = number - 2;
        } else {
            result = 10; // Так как в данном случае число только "0".
        }
        System.out.println(result);
    }

    // 4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
    static void findPositiveNumbers() {

        int firstNumber = 0; // Введите любое проверочное число.
        int secondNumber = 7; // Введите любое проверочное число.
        int thirdNumber = 5; // Введите любое проверочное число.
        int quantivtyOfPositieNumbers = 0; /* Только "0", так как он используется для отслеживания
                                              количества положительных целых чисел.*/

        if (firstNumber >= 0) {
            quantivtyOfPositieNumbers++;
        }
        if (secondNumber >= 0) {
            quantivtyOfPositieNumbers++;
        }
        if (thirdNumber >= 0) {
            quantivtyOfPositieNumbers++;
        }
        System.out.println(quantivtyOfPositieNumbers);
    }

    // 5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
    static void findPositiveAndNegativeNumbers() {

        int firstNumber = 0; // Введите любое проверочное число.
        int secondNumber = 7; // Введите любое проверочное число.
        int thirdNumber = -5; // Введите любое проверочное число.
        int positive = 0; // Только "0", так как он используется для отслеживания количества положительных целых чисел.
        int negative = 0; // Только "0", так как он используется для отслеживания количества отрицательных целых чисел.

        if (firstNumber >= 0) {
            positive++;
        } else if (firstNumber < 0) {
            negative++;
        }

        if (secondNumber >=0) {
            positive++;
        } else if (secondNumber < 0) {
            negative++;
        }

        if (thirdNumber >= 0) {
            positive++;
        } else if (thirdNumber < 0) {
            negative++;
        }

        System.out.println("Positive numbers:" + positive);
        System.out.println("Negative numbers:" + negative);
    }

    // 6) Даны 2 числа. Вывести большее из них.
    static void outputOfALargerNumber() {

        int firstNumber = 3; // Введите любое проверочное число.
        int secondNumber = 75; // Введите любое проверочное число.
        int largerNumber; // Переменная для вывода большего значения.

        if (firstNumber > secondNumber) {
            largerNumber = firstNumber;
        } else {
            largerNumber = secondNumber;
        }

        System.out.println("The Larger number is:" + largerNumber);
    }

    /* 7) (Дополнительно) В переменную записываете количество программистов. В
          зависимости от количества программистов необходимо вывести правильно
          окончание. Например:
        • 2 программиста
        • 1 программист
        • 10 программистов
        • и т.д. */
    static void correctEndingOutputEng() {

        int quantityOfProgrammers = 375; // Введите любое проверочное число.
        int pluralization = (quantityOfProgrammers == 1) ? 1 : 2; /* Здесь я использовал «тернарный оператор»,
                                                                     для сравнения количества программистов.*/

        if (quantityOfProgrammers == 0) {
            System.out.println("No programmers");
        } else
            System.out.println(quantityOfProgrammers + " Programmer" + ((pluralization == 2) ? "s" : ""));

    }

    /* 7) (Дополнительно) В переменную записываете количество программистов. В
          зависимости от количества программистов необходимо вывести правильно
          окончание. Например:
        • 2 программиста
        • 1 программист
        • 10 программистов
        • и т.д. */
    static void correctEndingOutputRus() {

        int quantityOfProgrammers = 17; // Введите число от 0 до 20 включительно.

        if (quantityOfProgrammers == 0) {
            System.out.println("Нет программистов");
        } else if (quantityOfProgrammers == 1) {
            System.out.println(quantityOfProgrammers + " программист");
        } else if (quantityOfProgrammers >= 2 && quantityOfProgrammers <= 4) {
            System.out.println(quantityOfProgrammers + " программиста");
        } else if (quantityOfProgrammers >= 5 && quantityOfProgrammers <= 20) {
            System.out.println(quantityOfProgrammers + " программистов");
        } else
            System.out.println("Неверное число");
    }
}
