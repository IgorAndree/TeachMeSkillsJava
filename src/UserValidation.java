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


// Объявляем класс, для проверки пользователя.
 public class UserValidation {

    // Определяем статический метод проверки, который принимает три параметра.
    public static boolean verification(String login, String password, String confirmationPassword)
            throws WrongLoginException, WrongPasswordException {

        /* Если параметр "Login" имеет значение равеное нулю,
           длиннее 20 символов или содержит пробел, выводим исключение. */
        if (login == null || login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Invalid login"); // Неверный логин.
        }

        /* Если параметр "Password" имеет значение равное нулю, длиннее 20 символов, содержит пробел, не содержит
           числа или не соответствует параметру "confirmPassword", выводим исключение. */
        if (password == null || password.length() > 20 || password.contains(" ")
                || !password.matches(".*\\d.*") || !password.equals(confirmationPassword)) {
            throw new WrongPasswordException("Invalid password"); // Неверный пароль.
        }

        // Если ни одно из приведенных выше условий не выполняется, вернуть "true", чтобы указать на успешную проверку.
        return true;

    }

    // Определяем основной метод для ввода и вывода данных.
    public static void main(String[] args) {
        try {

            // Вызов метода проверки с заданными параметрами.
            verification("Username", "Password1", "Password1"); // Вводим проверочные данные.
            System.out.println("Verification passed"); // Проверка пройдена.
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Verification failed: " + e.getMessage()); // Проверка провалилась.

        }
    }

    // Определяем подкласс, "Исключение входа в систему", наследующий базовый класс "Исключение".
    static class WrongLoginException extends Exception {
        public WrongLoginException(String message) {
            super(message); // Полное наследование.
        }
    }

    // Определям подкласс, "Исключение неправильного пароля", наследующий базовый класс "Исключение".
    static class WrongPasswordException extends Exception {
        public WrongPasswordException(String message) {
            super(message); // Полное наследование.
        }
    }
}












