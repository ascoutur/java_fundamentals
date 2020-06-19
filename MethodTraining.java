package labs_examples.objects_classes_methods.labs.methods;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class MethodTraining {
    public static void main(String[] args) throws IOException {
        int a = 1;
        int b = 2;

        System.out.println(a);
        System.out.println(b);

        passByVal(a,b);

        System.out.println(a);
        System.out.println(b);

        //create a cookieJar object, then invoke the removeCookie method to
        //remove a cookie from the count. print new count to the console.
        CookieJar cookieJar = new CookieJar(5);
        System.out.println(cookieJar);
        RemoveCookie(cookieJar);
        System.out.println(cookieJar);

        //numChecker returns largest number within the argument:
        numChecker(1, 2, 3, 4);
        CChecker("hEllo");
        //asciiPrint();
        primeChecker(5);
        myArray(4, 3, 5, 6, 9, 0);
        alMethod(5,1,5);
        revMethod();
    }

    public static int addition(int a, int b){
        return a+b;
    }
    public static int addition(int a, int b, int c){
        return a+b+c;
    }

    //Pass by value:
    public static void passByVal(int a, int b){
        a = a + 1;
        System.out.println(a);
        b = b + 2;
        System.out.println(b);
    }
    //Pass by reference(Creation of the cookie jar class):
    public static class CookieJar{
        int num;

        //created cookie jar constructor
        public CookieJar(int num){
            this.num = num;
        }

        //toString method to be able to print the cookieJar object to the console
        @Override
        public String toString() {
            return "CookieJar{" +
                    "num=" + num +
                    '}';
        }
    }
    //This method removes a cookie from the cookieJar object
    public static void RemoveCookie(CookieJar cookieJar){
        cookieJar.num --;
    }

    public static void numChecker(int a, int b, int c, int d) {
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));


    }
    public static void CChecker(String str){
        //initialize values vcount to count vowels and ccount for consonants
        int vcount = 0;
        int ccount = 0;
        //make sure string str is converted to all lowercase
        str = str.toLowerCase();
        //for-loop to iterate through the string, and initialize a char primitive variable, ch, and make it equal to i.
        //if ch is equal to one of the vowels listed, vcount is incremented by 1, if not (else if), ccount checks
        //for all letters a-z, depending on how many are found, ccount is then incremented by 1 per letter.
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u'){
                vcount++;
            }
            else if((ch >= 'a' && ch <= 'z')){
                ccount++;
            }
        }
        //print out information
        System.out.println("The number of consonants is: " + ccount);
    }
    public static void asciiPrint() throws IOException {
        BufferedImage image = new BufferedImage(144, 32, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("Dialog", Font.PLAIN, 24));
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("Hello World!", 6, 24);
        ImageIO.write(image, "png", new File("text.png"));
        for (int y = 0; y < 32; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < 144; x++)
                sb.append(image.getRGB(x, y) == -16777216 ? " " : image.getRGB(x, y) == -1 ? "#" : "*");
            if (sb.toString().trim().isEmpty()) continue;
            System.out.println(sb);
        }
    }
    public static void primeChecker(int n){
        int i,m = 0,flag = 0;
        m = n/2;
        if(n == 0 || n == 1){
            System.out.println(n+ " is not a prime number.");
        }else{
            for(i=2; i<=m; i++){
                if(n%i == 0 ){
                    System.out.println(n+ " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)  { System.out.println(n+ " is a prime number."); }
        }
    }
    public static void myArray(int a, int b, int c, int d, int e, int f){

        int[] lists = new int[]{a, b, c, d, e, f};
        for(int i = 0; i < lists.length; i++);

        int largest = 0;
        for(int j = 0; j < lists.length; j++) {
            if (lists[j] > largest) {
                largest = lists[j];
            }
        }
            int smallest = largest;

            for (int k = 0; k < lists.length; k++) {
                if (lists[k] < smallest) {
                    smallest = lists[k];
                }
            }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

    }
    public static void alMethod(int maxNum, int divisor1, int divisor2){

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i <= maxNum; i++){
            if(maxNum%divisor1 == 0){
                if(maxNum%divisor2 == 0){
                    nums.add(i);
                }
            }
        }
        System.out.println(nums);
        System.out.println("If you are receiving empty brackets, it is because your d1 and d2 variables cannot go" +
                " into maxNum.");
    }
    public static void revMethod(){
        int[] nums2 = {0, 1, 2, 3, 4};
        int temp;
        for(int i = 0; i < nums2.length / 2; i++){
            temp = nums2[i];
            nums2[i] = nums2[nums2.length - i - 1];
            nums2[nums2.length - i - 1] = temp;
        }
            for(int i : nums2){
                System.out.print(i + " ");
            }
    }


}

