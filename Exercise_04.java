package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate valyue, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below

        boolean bagFull = false;
        System.out.println(bagFull);

        char letter = 'A';
        System.out.println(letter);

        byte numb = 13;
        System.out.println(numb);

        short snumb = 15000;
        System.out.println(snumb);

        long lnumb = 3200000000l;
        System.out.println(lnumb);

        float flnumb = 320000000000.1f;
        System.out.println(flnumb);

        double dbnumb = 32.03;
        System.out.println(dbnumb);

    }

}