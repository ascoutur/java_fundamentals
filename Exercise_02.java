package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
class ThreadEx2{
    public static void main(String[] args) {
        MyThread2 MT1 = new MyThread2("Hello");
        MyThread2 MT2 = new MyThread2("Hello2");
        MyThread2 MT3 = new MyThread2("Hello3");

        //**Setting MT2 as top priority**
        MT2.setPriority(Thread.MAX_PRIORITY);
    }
}

class MyThread2 extends Thread{
    MyThread2(String name){
        //Parent class constructor
        super(name);
        start();
    }
    //Did not use a try catch again because I used a simple SOUT, no loops.
    public void run(){
        System.out.println(currentThread().getName());

    }
}