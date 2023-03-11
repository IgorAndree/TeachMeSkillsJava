/* 1). Написать программу со следующим функционалом:
       На вход передать строку (будем считать, что это номер документа).
       Номер документа имеет формат хххх-yyy-хххх-yyy-хуху, где x — это число,
       а y — это буква.
       - Вывести на экран в одну строку два первых блока по 4 цифры.
       - Вывести на экран номер документа, но блоки из трех букв заменить
       на *** (каждая буква заменятся на *).
       - Вывести на экран только одни буквы из номера документа в
       формате yyy/yyy/y/y в нижнем регистре.
       - Вывести на экран буквы из номера документа в формате
       "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
       класса StringBuilder).
       - Проверить содержит ли номер документа последовательность abc и
       вывети сообщение содержит или нет(причем, abc и ABC считается
       одинаковой последовательностью).
       - Проверить начинается ли номер документа с последовательности 555.
       - Проверить заканчивается ли номер документа на
       последовательность 1a2b.
       Все эти методы реализовать в отдельном классе в статических методах,
       которые на вход (входным параметром) будут принимать вводимую на
       вход программы строку. */


// Класс, предоставляющий различные методы для управления строкой номера документа.
public class DocumentUtils {
    // Основной метод для проверки методов.
    public static void main(String[] args) {
        // Номер документа.
        String documentNumber = "1234-abc-5678-xyz-1a2b";

        // Отображает первые два цифровых блока номера документа.
        DocumentUtils.outputOfTheFirstTwoDigitalBlocks(documentNumber);
        // Маскирует буквы номера документа звездочками.
        DocumentUtils.outputMaskingLettersWithAsterisks(documentNumber);
        // Выводит буквы из номера документа в нижнем регистре.
        DocumentUtils.displayLettersInLowerCase(documentNumber);
        // Выводит буквы из номера документа в верхнем регистре.
        DocumentUtils.displayLettersInUpperCase(documentNumber);
        // Проверяет, содержит ли номер документа определенную последовательность символов.
        DocumentUtils.checkForASpecificSequenceOfCharacters(documentNumber);
        // Проверяет, начинается ли номер документа с определенной последовательности символов.
        DocumentUtils.checkTheBeginningWithACertainSequenceOfCharacters(documentNumber);
        // Проверяет, заканчивается ли номер документа определенной последовательностью символов.
        DocumentUtils.checkIfItEndsWithACertainSequenceOfCharacters(documentNumber);
    }

    // Метод для отображения первых двух цифровых блоков номера документа.
    public static void outputOfTheFirstTwoDigitalBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + "-" + blocks[2]);
    }

    // Метод маскировки букв номера документа звездочками.
    public static void outputMaskingLettersWithAsterisks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.print(blocks[0] + "-***-");
        System.out.print(blocks[2] + "-***-");
        System.out.println(blocks[4]);
    }

    // Метод отображения букв из номера документа в нижнем регистре.
    public static void displayLettersInLowerCase(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        String letters = blocks[1] + "/" + blocks[3] + "/" + blocks[4].charAt(1) + "/" + blocks[4].charAt(3);
        System.out.println(letters.toLowerCase());
    }

    // Метод отображения букв из номера документа в верхнем регистре.
    public static void displayLettersInUpperCase(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder sbd = new StringBuilder("Letters:");
        sbd.append(blocks[1].toUpperCase());
        sbd.append("/");
        sbd.append(blocks[3].toUpperCase());
        sbd.append("/");
        sbd.append(blocks[4].toUpperCase().charAt(1));
        sbd.append("/");
        sbd.append(blocks[4].toUpperCase().charAt(3));
        System.out.println(sbd);
    }

    // Метод проверки, содержит ли номер документа определенную последовательность символов.
    public static void checkForASpecificSequenceOfCharacters(String documentNumber) {
        boolean contains = documentNumber.toLowerCase().contains("abc");
        System.out.println(contains ? "Document number contains 'abc' sequence" :
                                      "Document number does not contain 'abc' sequence");
    }

    // Метод проверки, начинается ли номер документа с определенной последовательности символов.
    public static void checkTheBeginningWithACertainSequenceOfCharacters(String documentNumber) {
        boolean startsWith = documentNumber.startsWith("555");
        System.out.println(startsWith ? "Document number starts with '555' sequence" :
                                        "Document number does not start with '555' sequence");
    }

    // Метод проверки, заканчивается ли номер документа определенной последовательностью символов.
    public static void checkIfItEndsWithACertainSequenceOfCharacters(String documentNumber) {
        boolean endsWith = documentNumber.endsWith("1a2b");
        System.out.println(endsWith ? "Document number ends with '1a2b' sequence" :
                                      "Document number does not end with '1a2b' sequence");
    }
}





