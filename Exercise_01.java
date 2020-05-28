package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers, the system will then calculate the sum and average of them.");
        int i = scanner.nextInt();
        int a = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int[] nums = {i, a, s, d, f, g, h, j, k, l};
        for(int num : nums){

        }
        double x = (i + a + s + d + f + g + h + j + k + l);
        System.out.println("Sum: " + x);

        double z = (x/10);
        System.out.println("Average: " + z);
    }
}
