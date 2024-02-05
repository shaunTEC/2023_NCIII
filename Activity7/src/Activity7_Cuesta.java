import java.util.Scanner;

public class Activity7_Cuesta {

    public static void numLoop() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void factorial(int num) {
        int total = 1;
        int originalNum = num;
        while (num > 0) {
            total *= num;
            num--;
        }
        System.out.println(originalNum + "! = " + total);
    }

    public static void password() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("openSesame")) {
            System.out.println("Please enter password: ");
            input = scanner.nextLine();
        }
        System.out.println("Correct password! Welcome.");
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose: \n" +
                "1) Even Number Loop\n" +
                "2) Factorial\n" +
                "3) Password\n" +
                "4) Print Array");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                numLoop();
                break;

            case 2:
                System.out.println("Enter a number to find its factorial: ");
                int num = scanner.nextInt();
                factorial(num);
                break;

            case 3:
                password();
                break;

            case 4:
                int[] array = {1, 2, 3, 4, 5};
                printArray(array);
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }
    }
}
