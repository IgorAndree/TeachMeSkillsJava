public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world.Welcome to Java.");
        System.out.println();
        p1();
        System.out.println();
        p2();
    }

    static void p1() {

        int num = 375;  // Enter any verification number.

        if (num == 0) {//I decided to highlight "0" as a separate number,+
            // although I understand that this is an additional line of code.
            System.out.println("This is a one digit positive number.");
        } else if (num > 0 && num < 10) {
            System.out.println("This is a one digit positive number.");
        } else if (num >= 10 && num < 100) {
            System.out.println("This is a two-digit positive number.");
        } else if (num >= 100 && num < 1000) {
            System.out.println("This is a three-digit positive number.");
        } else if (num >= 0) {
            System.out.println("This is a four-digit or more positive number.");
        }

        if (num < 0) {
            if (num > -10) {//Decided to use a double "if" statement.
                System.out.println("This is a one digit negative number.");
            } else if (num <= -10 && num > -100) {
                System.out.println("This is a two-digit negative number.");
            } else if (num <= -100 && num > -1000) {
                System.out.println("This is a three-digit negative number.");
            } else {
                System.out.println("This is a four-digit or more negative number.");
            }
        }
    }
    static void p2() {

        int a = 3;
        int b = 7;
        int c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle exists.");
        } else {
            System.out.println("Triangle does not exist.");
        }
    }
}



