package labs_examples.objects_classes_methods.labs.objects;

public class ConstructorExample {
    public static void main(String[] args) {

        OverloadEx a = new OverloadEx("Austin");
        OverloadEx b = new OverloadEx(22);
        OverloadEx c = new OverloadEx(999);

        //System.out.println(a.name + " is " + b.num + " years old, and his favorite number is " +
                //c.num2);

       OverloadEx a2 = new OverloadEx("Tim");
       OverloadEx b2 = new OverloadEx(35);
       OverloadEx c2 = new OverloadEx(1000);

       OverloadEx a3 = new OverloadEx("Ben");
       OverloadEx b3 = new OverloadEx(42);
       OverloadEx b4 = new OverloadEx(1003);

        System.out.println(a2.toString());

    }
}
