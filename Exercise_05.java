package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
class ThrowEx{
    public static void main(String[] args) {
        try{
            Divide(5,1);
        }catch(ArithmeticException aexc){
            System.out.println("Cannot divide by zero.");
        }
    }
    public static void Divide(int a, int b) throws ArithmeticException{
        int c = a/b;
        System.out.println(c);
    }
}