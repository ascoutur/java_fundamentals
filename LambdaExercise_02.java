package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */
class BuiltIn{
    public static void main(String[] args) {
        Predicate<Integer> pEx = (i) -> i > 100;
        System.out.println(pEx.test(36));

        DoublePredicate pEx2 = (i) -> i % 2.0 == 0;
        System.out.println(pEx2.test(10));

        Supplier<Double> supEx = () -> Math.random();
        System.out.println(supEx.get());

        Consumer<Integer> bcEx = (x) -> System.out.println(x);
        bcEx.accept(13);
        bcEx.accept(7);

        IntToDoubleFunction iEx = (x) -> x;
        System.out.println(iEx.applyAsDouble(13));

        IntBinaryOperator ibEx = (x, y) -> x/y;
        System.out.println(ibEx.applyAsInt(700,10));

        IntFunction intEx = (x) -> x*x;
        System.out.println(intEx.apply(10));

        ToDoubleBiFunction<Integer, Integer> tdbEx = (x, z) -> x & z;
        System.out.println(tdbEx.applyAsDouble(2, 7));

        UnaryOperator<Double> uEx = (x) -> x * 927492;
        System.out.println(uEx.apply(7.0));

        String st1 = "Hello";
        String st2 = "Helloo";
        BooleanSupplier bsEx = () -> st1.equalsIgnoreCase(st2);
        System.out.println(bsEx.getAsBoolean());
    }
}