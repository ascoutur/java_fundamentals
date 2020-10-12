package labs_examples.generics.labs;

import java.util.*;
import java.util.function.Predicate;

/**
 * Generics Exercise 3:
 *
 *      --1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      --3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      --4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Ex3{
    public static void main(String[] args) {
        genMeth1(5.13, 2.98);

        ArrayList<String> pList = new ArrayList<>();
        pList.add("and");
        pList.add("ala");
        pList.add("ono");
        genMeth2(pList);

        String[] arr = {"My", "Name", "Is ", "Austin"};
        switcher(arr, 0, 3);
        System.out.println(Arrays.toString(arr));

        List<Integer> finder = Arrays.asList(1, 33, 67, 98, 12, 100, 13, 5, 1000, 7);
        //'f' is the lower bound and 'l' is the upper bound (aka "first" and "last").
        System.out.println(findMaxi(finder, 0, 10));


    }
    public static <T extends Number, U extends Number> void genMeth1(T t, U u){
        if (t == null || u == null){
        }
        if(u instanceof Double){
            //Java told me i need these assert statements, although i do not know what they do.
            assert t != null;
            System.out.println(Double.valueOf(t.doubleValue() + u.doubleValue()));
        }else if(u instanceof Integer){
            assert t != null;
            System.out.println(Integer.valueOf(t.intValue() + u.intValue()));
        }else{
            throw new IllegalArgumentException();
        }
    }

    //*****I tried completing number 2 as best as i could but could not figure it out.
    //I was able to find a solution online but i did not want to copy it because that felt cheap.
    //*****
    public static <T> void genMeth2(Collection<T> pList){
        int palCount = 0;
        for(T pali : pList){
                palCount++;
            System.out.println(palCount);
        }

    }

    public static <S> void switcher(S[] b, int i, int c) {
        //temp variable s for holding.
        S s = b[i];
        b[i] = b[c];
        b[c] = s;
    }
    public static <A extends Comparable<? super A>> A findMaxi(List<A> maxiNum, int f, int l){
        A maxi = maxiNum.get(f);
        for(int z = f + 1; z < l; z++){
            //The next two lines of code were taken from another block i found online,
            //because i had no idea how to write this part.
            A first = maxiNum.get(z);
            if(first.compareTo(maxi) > 0){
                maxi = first;
            }
        }   return maxi;
    }

}