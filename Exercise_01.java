package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class GenEx<A,C>{
    public A a;
    public C c;

    public A getVal(){
        return a;
    }
    public C getVal2(){
        return c;
    }
    public void setVal(A a){
        this.a = a;
    }
    public void setVal2(C c){
        this.c = c;
    }
    //Had to comment the const. out, otherwise I was unable to use the get/sets.
    //GenEx(A a, C c){
        //this.a = a;
        //this.c = c;
    //}
    public void print(){
        System.out.println(a);
        System.out.println(c);
    }

}

class Controller{
    public static void main(String[] args) {
        //Demonstration of int get/set.
        GenEx<Integer, Integer> gx1 = new GenEx<>();
        gx1.setVal(13);
        gx1.setVal2(7);
        int i = gx1.getVal();
        int o = gx1.getVal2();
        System.out.println(i + ", " + o);


        //Demonstration of String get/set.
        GenEx<String, String> gx2 = new GenEx<>();
        gx2.setVal("Austin");
        gx2.setVal2("Couture");
        String s = gx2.getVal();
        String c = gx2.getVal2();
        System.out.println("My name is " + s + " " + c);

        //Constructor Demo - uncomment the block above and this block to use.
        //GenEx<Integer,Integer> gx3 = new GenEx<>(13, 7);
        //gx3.print();
    }
}