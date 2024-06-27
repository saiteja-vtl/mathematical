import java.util.Scanner;

public class MaximumValue {
    public static int findMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the array size from the user
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        // Initialize the array's size using user input
        int[] arr = new int[arr_size];

        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        // Find and print the maximum value in the array
        int maxValue = findMaxValue(arr);
        System.out.println("The maximum value in the array is: " + maxValue);

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}

