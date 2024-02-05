import java.util.Arrays;
import java.util.Scanner;

public class Activity9_Cuesta {
    private static String input = "";

    public static int sumArray(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int maxElem(int[] array) {
        int elem = 0;
        for(int num : array) {
            if(num > elem) {
                elem = num;
            }
        }
        return elem;
    }

    public static int sumMulArray(int[][] array) {
        int sum = 0;
        for(int[] row : array) {
            for(int num : row){
                sum += num;
            }
        }
        return sum;
    }

    public static void locElem(int[][] array, int elem) {
        int aNum = 0;
        for(int[] row : array) {
            int elemNum = 0;
            aNum += 1;
            for(int num : row) {
                if(num == elem) {
                    System.out.println("Element found at row " + aNum + ", position " + elemNum);
                    return;
                }
                else {
                    elemNum += 1;
                }
            }
        }
        System.out.println("Element not found in the array");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums;
        int[][] arrays;

        System.out.println("Please choose: \n" +
                "1) Sum of One-Dimensional Array\n" +
                "2) Max Value in Array\n" +
                "3) Sum of Two-Dimensional Arrays\n" +
                "4) Search in Two-Dimensional Array");
        int option = scanner.nextInt();
        input = scanner.nextLine();

        switch (option) {
            case 1:
                nums = new int[]{1, 2, 3, 4, 5};
                System.out.println("Array: " + Arrays.toString(nums) +
                                 "\nSum of Array: " + sumArray(nums));
                break;

            case 2:
                nums = new int[]{51, 12, 35, 42, 50};
                System.out.println("Array " + Arrays.toString(nums) +
                                 "\nMax Value in Array: " + maxElem(nums));
                break;

            case 3:
                arrays = new int[][]{{1,10}, {99,12}, {3,2}, {4,7,51}, {5,45,50}};
                System.out.println("Multi Array " + Arrays.deepToString(arrays) +
                                 "\nSum of MultiArray: " + sumMulArray(arrays));
                break;

            case 4:
                arrays = new int[][]{{1,10}, {99,12}, {3,2}, {4,7,51}, {5,45,50}};
                System.out.println("Multi Array " + Arrays.deepToString(arrays));
                locElem(arrays, 99);
                break;

            default:
                System.out.println("Invalid option.");

        }
    }
}