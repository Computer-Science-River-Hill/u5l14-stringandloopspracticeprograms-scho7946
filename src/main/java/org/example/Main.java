package org.example; //DO NOT DELETE
import java.util.Scanner;

/**
 * String and Loop Practice
 * Sua Cho
 **/


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Further Substring Fun");
            System.out.println("2. Run of Integers");
            System.out.println("3. Sum of a Range of Integers");
            System.out.println("4. Repeatedly Echo a Word");
            System.out.println("5. Words Separated by Dots");
            System.out.println("6. Adding Up Integers");
            System.out.println("7. Shipping Cost Calculator");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {
                case 1:
                    substring_fun(input);
                    break;
                case 2:
                    run_of_integers(input);
                    break;
                case 3:
                    sum_of_range(input);
                    break;
                case 4:
                    echo_word(input);
                    break;
                case 5:
                    words_with_dots(input);
                    break;
                case 6:
                    add_integers(input);
                    break;
                case 7:
                    shipping_cost(input);
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        input.close();
    }
    public static void substring_fun(Scanner input) {
        System.out.print("Enter a string: ");
        String original = input.nextLine();
        System.out.print("Enter beginning index: ");
        int start = input.nextInt();
        System.out.print("Enter ending index: ");
        int end = input.nextInt();
        input.nextLine(); 
        System.out.println("\nOriginal string:");
        System.out.println(original);
        System.out.println("\nSubstring:");
        if (start >= 0 && end <= original.length() && start < end) {
            System.out.println(original.substring(start, end));
        } else {
            System.out.println("Invalid indices.");
        }
    }
    public static void run_of_integers(Scanner input) {
        System.out.print("Enter Start: ");
        int start = input.nextInt();
        System.out.print("Enter End: ");
        int end = input.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
    public static void sum_of_range(Scanner input) {
        System.out.print("Enter low: ");
        int low = input.nextInt();
        System.out.print("Enter high: ");
        int high = input.nextInt();
        int sumHigh = (high * (high + 1)) / 2;
        int sumLow = ((low - 1) * low) / 2;
        int total = sumHigh - sumLow;
        System.out.println("Sum = " + total);
    }
    public static void echo_word(Scanner input) {
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        int times = word.length();
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
    public static void words_with_dots(Scanner input) {
        System.out.print("Enter first word: ");
        String word1 = input.nextLine();
        System.out.print("Enter second word: ");
        String word2 = input.nextLine();
        int totalLength = word1.length() + word2.length();
        int dotsNeeded = 30 - totalLength;
        System.out.print(word1);
        for (int i = 0; i < dotsNeeded; i++) {
            System.out.print(".");
        }
        System.out.println(word2);
    }
    public static void add_integers(Scanner input) {
        System.out.print("How many integers will be added: ");
        int count = input.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            int num = input.nextInt();
            sum += num;
        }
        System.out.println("The sum is " + sum);
    }
    public static void shipping_cost(Scanner input) {
        while (true) {
            System.out.print("Weight of Order: ");
            double weight = input.nextDouble();
            if (weight <= 0) {
                System.out.println("bye");
                break;
            }
            double cost = 3.00;
            if (weight > 10) {
                cost += (weight - 10) * 0.25;
            }
            System.out.printf("Shipping Cost: $%.2f\n", cost);
        }
    }
}
