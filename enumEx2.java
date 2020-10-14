package labs_examples.enumerations.labs;
import labs_examples.enumerations.labs.enum2.Buildings;

public class enumEx2 {
    public static void main(String[] args) {
        for(Buildings b : Buildings.values()){
            System.out.println("A " + b + " has " + b.fCount() + " floor(s).");
        }
    }
}
