public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world.Welcome to Java.");
        System.out.println();
        p1();
    }

    static void p1() {
        int num = 0;  // replace this line with the actual number you want to use

        if (num == 0) {
            System.out.println("This is a single positive number");
        } else if (num > 0 && num < 10) {
            System.out.println("This is a single positive number");
        } else if (num >= 10 && num < 100) {
            System.out.println("This is a two-digit positive number");
        } else if (num >= 100 && num < 1000) {
            System.out.println("This is a three-digit positive number");
        } else if (num >= 0) {
            System.out.println("This is a four-digit or more positive number");
        }

        if (num < 0) {
            if (num > -10) {
                System.out.println("This is a single negative number");
            } else if (num <= -10 && num > -100) {
                System.out.println("This is a two-digit negative number");
            } else if (num <= -100 && num > -1000) {
                System.out.println("This is a three-digit negative number");
            } else {
                System.out.println("This is a four-digit or more negative number");
            }
        }
    }
}


