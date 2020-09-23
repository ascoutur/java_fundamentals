package labs_examples.multi_threading.labs;


/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

//****READ****
    /* Right now my application is utilizing synchronization in the form of
    a synchronized method. In order to utilize the synchronized block version
    you must do the following. first uncomment the loop and loop2 objects.
    Then comment out the Loop.looper(); method caller because it is unusable at this point.
    Next, uncomment out the synchronized block in the looper method. In order
    for this to work you must also remove both the static and synchronized
    keywords from the method name. It should then function the same. The
    first thread will count from 1-4 then the second method will take over.
    I realize this is not optimal however this is the best I could do.
     */

class threadEx3{
    public static void main(String[] args) {
        TheThreads TH1 = new TheThreads("Thread one");
        TheThreads TH2 = new TheThreads("Thread two");

       /* Looper loop = new Looper();
        loop.looper(1);
        Looper loop2 = new Looper();
        loop2.looper(1);
        */

    }
}

class TheThreads implements Runnable{
    Thread thread;

    public TheThreads(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public synchronized void run(){
        Looper.looper(1);


    }
}

class Looper{
    static synchronized void looper(int i){
        //synchronized(this){
        try{
            for(i = 1; i < 7; i++){
                System.out.println(Thread.currentThread().getName()
                        + " " + i);
                Thread.sleep(750);
            }
        }
        catch(InterruptedException iexc){
            System.out.println("Exception: " + iexc + " caught.");
        }

    }
    //}
}