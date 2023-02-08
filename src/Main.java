public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world.Welcome to Java.");
        System.out.println();
        p1();
        System.out.println();
        p2();
        System.out.println();
        p3();
        System.out.println();
        p4();
    }
    static void p1() {

        int num = 375; // Enter any verification number.

        if (num == 0) { //I decided to highlight "0" as a separate number,+
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

        int a = 3; // Enter any verification number.
        int b = 7; // Enter any verification number.
        int c = 5; // Enter any verification number.

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle exists.");
        } else {
            System.out.println("Triangle does not exist.");
        }
    }
    static void p3() {

        int num = 375; // Enter any verification number.
        int result;

        if (num > 0) {
            result = num + 1;
        } else if (num < 0) {
            result = num - 2;
        } else {
            result = 10; // since in this case the number is only "0".
        }
        System.out.println(result);
    }
    static void p4(){

        int FirstNumber= 3; // Enter any verification number.
        int SecondNumber=7; // Enter any verification number.
        int ThirdNumber=5; // Enter any verification number.
        int StartingPoint = 0; // Only "0" as it is used to keep track of the number of positive integers.

          if (FirstNumber > 0) {
              StartingPoint ++;
        } if (SecondNumber > 0) {
            StartingPoint ++;
        } if (ThirdNumber > 0) {
            StartingPoint ++;
        }
        System.out.println(StartingPoint);
    }
}



