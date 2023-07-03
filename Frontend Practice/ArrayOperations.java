import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values and store them in the array
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display the contents of the array
        System.out.println("Array Contents:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Calculate and display the sum
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);

        // Find and display the maximum and minimum values
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Calculate and display the average
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);

        // Check if a value exists in the array
        System.out.print("Enter an additional integer value: ");
        int value = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                found = true;
                System.out.println("Value " + value + " found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Value " + value + " not found in the array.");
        }
    }
}
