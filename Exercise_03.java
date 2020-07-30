package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Example3{
    public static void main(String[] args) {
        String[] str = {"Bye", "What?", "Why?"};

        try{
            System.out.println("When greeting someone you say" + str[3]);
        }catch(ArrayIndexOutOfBoundsException aexc){
            System.out.println("Exception caught, this element does not exist.");
        }finally{
            System.out.println("When greeting someone you say Hi.");
        }
    }
}