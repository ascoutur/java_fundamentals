package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
class CandyException extends Exception{
    @Override
    public String toString(){
        return "Okay, have a great day then!";

    }
}
class Caller{
    public static void main(String[] args) {
        try{
            CandyPurchase();
        }catch(CandyException cexc){
            System.out.println(cexc.toString());
        }

    }
    public static void CandyPurchase() throws CandyException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to purchase either chocolate or twizzlers?");
        String response = scanner.next();

        if(response.equalsIgnoreCase("no")){
            throw new CandyException();
        }
        System.out.println("Great, take your pick.");
    }
}


