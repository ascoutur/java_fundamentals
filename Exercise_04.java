package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] tD = new int[4][4];

        for(int inner = 1; inner < tD.length; inner++){
            for(int outter = 0; outter < tD[inner].length; outter++){
                tD[inner][outter] = inner * 2;
                System.out.print(tD[inner][outter]);
            }
            System.out.println();
        }
    }

}
