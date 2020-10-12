package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */
class GenMethod{
    public static <T> void arrayMaker(ArrayList<T> arrayMaker) {

    //** To change this to any other primitive type simply change the sum variable, arrayList type,
        // and the type within the casting, i originally had a type mismatch which had me stumped.
        double sum = 0;
        for (int i = 0; i < arrayMaker.size(); i++) {
            double element = (double)
            arrayMaker.get(i);
            sum += element;
        }
        System.out.println(sum);


    }
    public static void main(String[] args) {
        ArrayList<Double> UArray = new ArrayList<>();
            UArray.add(1.023);
            UArray.add(5.0);
            UArray.add(10.121);


        arrayMaker(UArray);

    }
}

