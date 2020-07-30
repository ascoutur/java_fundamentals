package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Example4{
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3};
        try{
            System.out.println(num[1]/num[0]);
        }catch(ArithmeticException aexc){
            System.out.println("Exception caught, cannot divide by zero.");
        }try{
            System.out.println(num[4]);
        }catch(ArrayIndexOutOfBoundsException aiexc){
            System.out.println("This element does not exist within the array.");
        }
    }
}