package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class Example2{
    public static void main(String[] args) {
        int[] nums = {2, 1, 0, 3};

        try{
            System.out.println(nums[0]/nums[2]);
            System.out.println(nums[4]);
        }catch(ArithmeticException aexc){
            System.out.println("Exception caught cannot divide by 0.");
        }catch(ArrayIndexOutOfBoundsException aexcs){
            System.out.println("This element is not within the array.");
        }

    }
}


