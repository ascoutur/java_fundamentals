package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */
@FunctionalInterface
interface FunInt0{
    void method();
}
class LExamples{
    public static void main(String[] args) {
        //Static ref:
        FunInt0 fI = ThrowAway :: statExample;
        fI.method();
        //Instance method:
        ThrowAway2 t2 = new ThrowAway2();
        FunInt0 fI2 = t2::refMeth;
        fI2.method();
        //Constructor ref:
        FunInt0 fI3 = ThrowAway3::new;
        fI3.method();
    }
}
class ThrowAway{
    public static void statExample(){
        int x = 10;
        int z = 3;
        int i = x + z;
        System.out.println(i);
    }
}
class ThrowAway2{
    public void refMeth(){
        System.out.println("This is an instance method reference.");
    }
}
class ThrowAway3{
    public ThrowAway3() {
        System.out.println("This is a constructor reference.");
    }
}