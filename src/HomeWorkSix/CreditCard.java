package HomeWorkSix;

// Домашнее задание 6.

public class CreditCard {

    /* 1). Создать класс CreditCard c полями номер счета, текущая сумма на счету.
           Добавьте метод, который позволяет начислять сумму на кредитную карточку.
           Добавьте метод, который позволяет снимать с карточки некоторую сумму.
           Добавьте метод, который выводит текущую информацию о карточке.
           Напишите программу, которая создает три объекта класса CreditCard у
           которых заданы номер счета и начальная сумма.

           Тестовый сценарий для проверки:
           Положите деньги на первые две карточки и снимите с третьей.
           Выведите на экран текущее состояние всех трех карточек. */

    int accountNumber; // Создаем переменную номера счета.
    double initialAmount; // Создаем переменную начальной суммы.

    // Конструктор инициализирующий номер счета и сумму на карте.
    public CreditCard(int accountNumber, double initialAmount) {
        this.accountNumber = accountNumber; // Обращаемся к основному классу.
        this.initialAmount = initialAmount; // Обращаемся к основному классу.
    }

    // Метод снятия суммы с карты.
    public void withdrawFromACard(double amount) {
        if (amount > initialAmount) {
            initialAmount = 0;
        } else {
            initialAmount -= amount; // Вычитание числа с начальной суммы .
        }
    }

    // Метод начисления суммы на карту.
    public void chargeACard(double amount) {
        initialAmount += amount; // Добавление числа к начальной сумме.
    }

    // Метод вывода текущей информации о карте.
    public void displayTheCurrentStateOfTheCard () {
        System.out.println("Account number : " + accountNumber); // Номер счета.
        System.out.println("The current state of the card : " + initialAmount); // Текущее состояние карты.
    }
}