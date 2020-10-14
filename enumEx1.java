package labs_examples.enumerations.labs;
import labs_examples.enumerations.labs.enum1.Colors;


public class enumEx1 {
    public static void main(String[] args) {
    //I did not make a constructor for this, not sure how I came upon this solution but
    //it makes sense for me.
        colors = Colors.PURPLE;
        colCall2();

    }

    static Colors colors;

     public static void colCall2(){
        switch(colors){

            case PURPLE:
                System.out.println("The best color.");
                break;
            case RED:
                System.out.println("The second best color.");
                break;
            case GREEN:
                System.out.println("The third best color.");
                break;
        }
    }

}
