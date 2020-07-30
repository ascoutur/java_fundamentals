package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */
class reThrow{
    public static void main(String[] args) {
        try{
            //Call the Caller method and finally handle the exception here.
            Caller();
        }catch(ArrayIndexOutOfBoundsException aaiexc){
            System.out.println("Exception from Caller caught and dealt with here in main.");
        }
    }

    public static void Caller() throws ArrayIndexOutOfBoundsException{
        //Call the method here, and throw the exception back up to main.
        sayHi();
    }

    public static void sayHi() throws ArrayIndexOutOfBoundsException{
        //Choose from array wordbank to say Hi, however the option is not there. This means an error will occur.
        String[] str = {"Bye"};
        try{
            System.out.println(str[1]);
        }catch (ArrayIndexOutOfBoundsException aiexc){
            System.out.println("'Hi' is not present in this array.");
            System.out.println("...Now re-throwing this exception to the 'Caller' method.");
            throw aiexc;
            //The line above is what is responsible for "re-throwing" the error to the "caller" method.
        }

    }
}
