package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Controller{
    public static void main(String[] args) throws InterruptedException {
        //allows for the method call
        TheColor col = new TheColor();
        col.nameColor();
    }
}

class TheColor {
    //true means the color is purple and the code will run.
    //If this boolean was false nothing will be printed to the console, it will run indefinitely for some reason.
    private boolean isPurple = true;

    public void nameColor() throws InterruptedException {
        synchronized (this) {
            while (!isPurple) {
               wait();
            }
            System.out.println("The color is purple.");
        }
        

    }
    public void guesser(){
        synchronized (this){
            this.isPurple = true;
            notify();
        }
    }

}
