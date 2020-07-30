package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
class Example{

    static int a = 2;
    static int b = 0;

    public static void main(String[] args) {
        try{
            int x = a/b;
        }catch(ArithmeticException exc){
            System.out.println("Exception caught, cannot divide by 0.");
        }
    }


}
