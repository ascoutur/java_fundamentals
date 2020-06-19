package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(2,2));
        System.out.println(divide(4,2));
        joke();
        convert(5);
        varargs("hello", "there", "friend");

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a*b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a/b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("Whether we wanted it or not, we've stepped into a war with the Cabal on Mars. " +
                "So let's get to taking out their command, one by one. Valus Ta'aurc. From what I can gather he " +
                "commands the Siege Dancers from an Imperial Land Tank outside of Rubicon. He's well protected, but " +
                "with the right team, we can punch through those defenses, take this beast out, " +
                "and break their grip on Freehold.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static void convert(int a){
        double result = a * 31536000;
        System.out.println(result + "seconds.");
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static void varargs(String ...v){
        for(String word : v){
        }
        System.out.println(v.length);
    }





}
