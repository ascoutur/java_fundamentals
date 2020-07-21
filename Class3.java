package labs_examples.packages.labs.package2.package3;

import static labs_examples.packages.labs.package2.Class2.sayHi;
//import static labs_examples.packages.labs.package2.Class2.sayProtected;

public class Class3 {
    public static void main(String[] args) {
        sayHi();
        //sayProtected();
        //As demonstrated here, sayProtected(); has a protected modifier, so even though I imported it, it is not
        //visible in a different package by a non-subclass(class3).
        sayWhat();
        sayNotProtected();
    }

    public static void sayWhat(){
        System.out.println("What");
    }
    public static void sayNotProtected(){
        System.out.println("Not Protected");
    }
}
