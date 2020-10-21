package labs_examples.lambdas.labs;

import java.sql.SQLOutput;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *
 *      --1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      --2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      --3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      --4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      --5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      --6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      --7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */
@FunctionalInterface
interface FunctionalInt1{
    void method1();
}
@FunctionalInterface
interface FunctionalInt2{
    int method2(int i);
}
@FunctionalInterface
interface FunctionalInt3{
    void method3(int i, int x);
}

class Controller{
    public static void main(String[] args) {

        //lambda of FunInt1:
        FunctionalInt1 f1 = () -> System.out.println("Hello");
        f1.method1();
        //anon class of f1:
        FunctionalInt1 f12 = new FunctionalInt1() {
            @Override
            public void method1() {
                int i = 1;
                System.out.println(i);
            }
        };
        f12.method1();

        //lambda of FunInt2:
        FunctionalInt2 f2 = (int i) -> i + 5;
        System.out.println(f2.method2(5));
        //anon class of f2:
        FunctionalInt2 f22 = new FunctionalInt2() {
            @Override
            public int method2(int i) {
                return i + 5;
            }
        };
        System.out.println(f22.method2(5));

        //lambda of FunInt3:
        FunctionalInt3 f3 = (int i, int x) -> System.out.println(i + x);
        f3.method3(10, 3);
        //anon class of f3:
        FunctionalInt3 f32 = new FunctionalInt3() {
            @Override
            public void method3(int i, int x) {
                System.out.println(i + x);
            }
        };
        f32.method3(3, 10);

        //built-in test:
        BiPredicate<Integer, Integer> bpTest = (i, x) -> i > x;
        System.out.println(bpTest.test(5,2));

    }
}