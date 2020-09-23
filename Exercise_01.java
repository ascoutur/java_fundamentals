package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class Example1{
    public static void main(String[] args) {
        MyThreads MT = new MyThreads("This thread is named Austin");
        MyThreads MT2 = new MyThreads("This thread is named Couture");
    }

}
class MyThreads implements Runnable{
    Thread thread;

   public MyThreads(String name){
        thread = new Thread(this, name);
        //Start the thread:
        thread.start();
    }

    @Override
    public void run(){
       try{

           Thread.sleep(500);
           System.out.println(thread.getName());
       }
       catch(InterruptedException exc){
           System.out.println("Exception was caught: " + exc);
       }
    }
}
