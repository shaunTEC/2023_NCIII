import java.util.Scanner;

public class Activity8_Cuesta {
    private static String input = "";

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static int countOccur(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static String upperLower(String input) {
        StringBuilder swappedCase = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                swappedCase.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swappedCase.append(Character.toUpperCase(c));
            } else {
                swappedCase.append(c);
            }
        }
        return swappedCase.toString();
    }

    public static void stringLimit(String input) {
        String[] words = input.split(" ");
        System.out.println("Words separated by limit:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void stringSearch(String input, String search) {
        if (input.startsWith(search)) {
            System.out.println("String starts with " + search);
        }
        if (input.endsWith(search)) {
            System.out.println("String ends with " + search);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose: \n" +
                "1) Reversed String\n" +
                "2) Count Repeating Character\n" +
                "3) Uppercase Lowercase\n" +
                "4) Substring Delimiter\n" +
                "5) Start or End Substring Search");
        int option = scanner.nextInt();
        input = scanner.nextLine();

        switch (option) {
            case 1:
                System.out.println("Enter String: ");
                input = scanner.nextLine();
                String reversed = reverseString(input);
                System.out.println("Reversed String: " + reversed);
                break;

            case 2:
                System.out.println("Enter String: ");
                input = scanner.nextLine();
                System.out.println("Enter a single character: ");
                char target = scanner.next().charAt(0);
                System.out.println(" Instances of target '" + target + "': " + countOccur(input, target));
                break;

            case 3:
                System.out.println("Enter String: ");
                input = scanner.nextLine();
                System.out.println("Swapped Case String: " + upperLower(input));
                break;

            case 4:
                System.out.println("Enter String: ");
                input = scanner.nextLine();
                stringLimit(input);
                break;

            case 5:
                System.out.println("Enter String: ");
                input = scanner.nextLine();
                System.out.println("Enter Word to Search: ");
                String search = scanner.nextLine();
                stringSearch(input, search);
                break;

            default:
                System.out.println("Invalid option.");

        }
    }
}