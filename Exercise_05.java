package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] arrays = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        for(int i = arrays.length-1; i >= 0; i-=2){
            System.out.println(i);
        }
    }

}
