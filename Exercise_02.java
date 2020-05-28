package labs_examples.arrays.labs;

import javax.swing.undo.CannotRedoException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] arrays = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int array : arrays);{
        }
        // write code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1-10, the system will then print out it's index within the array");
        int i = scanner.nextInt();

        //I could not figure the rest of this out.




    }
}