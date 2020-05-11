package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 5;
        a = a + 5;
        System.out.println(a);

        // Note: 'a' is now 10, not 5.

        int b;
        b = a - 3;
        System.out.println(b);

        int c;
        c = a / 2;
        System.out.println(c);

        int d;
        d = a * 2;
        System.out.println(d);

        int e;
        e = a % 2;
        System.out.println(e);
    }

}
