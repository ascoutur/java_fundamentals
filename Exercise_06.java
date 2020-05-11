package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // Formula for V is pi*r^2*h
        // SA is 2pi*r*h + 2pi*r^2
        // pi will be rounded to 2 digits for ease of use
        // so, 3.14 only

        double r = 3.14;
        int h = 5;
        double pi = 3.14;

        // V = Volume
        double V = pi * (r * r) * h;
        System.out.println(V);

        // SA is Surface Area
        double SA = (2 * pi * r * h) + (2 * V);
        System.out.println(SA);

    }
}