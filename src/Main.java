/* 2). Создать класс, в котором будет статический метод.
       Этот метод принимает на вход три параметра: Login,Password,confirmPassword.
       Все поля имеют тип данных String.
       Длина login должна быть меньше 20 символов и не должен содержать пробелы.
       Если login не соответствует этим требованиям, необходимо выбросить
       WrongLoginException.
       Длина password должна быть меньше 20 символов, не должен содержать
       пробелы и должен содержать хотя бы одну цифру.
       Также password и confirmPassword должны быть равны.
       Если password не соответствует этим требованиям, необходимо
       выбросить WrongPasswordException.
       Метод возвращает true, если значения верны или false в другом случае. */


// Объявляем класс, для проведения манипуляций.
 public class Main {

    // Определяем основной метод для ввода и вывода данных.
    public static void main(String[] args) {
        try {

            // Вызов метода проверки с заданными параметрами.
            UserVerification.verification("Username", "Password1", "Password1"); // Вводим проверочные данные.
            System.out.println("Verification passed"); // Проверка пройдена.
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Verification failed: " + e.getMessage()); // Проверка провалилась.
        }
    }
}














