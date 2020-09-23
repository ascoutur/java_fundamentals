package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */
class TheController{

    //final number in sequence
    final static int Max = 101;

    public static void main(String[] args) {
        //Object that is shared
        TheController obj = new TheController();

        //Threader th1 = new Threader(new TheController(digit, 1), 99);
        //Threader th2 = new Threader(new TheController(), 100);
        //th1.run();
        //th2.run();
        Thread th3 = new Thread(new Threader(obj,0), "Thread one:");
        Thread th4 = new Thread(new Threader(obj,1), "Thread two:");
        Thread th5 = new Thread(new Threader(obj,2), "Thread three:");
        th3.start();
        th4.start();
        th5.start();
    }
}

class Threader implements Runnable{
    //Thread thread;
    //variable that will be incremented:
    TheController obj;
    int threadNum;
    static int starter = 0;

    Threader(TheController obj, int end){
        this.obj = obj;
        this.threadNum = end;
    }


    @Override
    public void run(){
        while(starter < TheController.Max){
            synchronized (obj){
                if(starter % 3 == threadNum && starter < TheController.Max){
                    System.out.println(Thread.currentThread().getName() +
                            " " + starter++);
                }
            }
        }
    }
}