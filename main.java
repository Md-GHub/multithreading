import Threads.*;

class main{
    public static void main(String[] args) {

        System.out.println("Main Thread Starts!");

        
        /*
         * if atleast one user threads is running the program will continue running
         * if all user threads are dead and dusted then all the daemon threads will been destroyed
         */
        Thread1 thread1 = new Thread1("Thread1");
        Thread1 thread2 = new Thread1("Daemon");
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();


        /*
         * also we have overloaded constructor to create threads with name
         */

         Thread1 thread3 = new Thread1("Thread2");
         thread3.start();

         /*
          * implementing Threads using runnable interfaces;
          * we have another constructor inside the Thread class where we can pass argument of runnable class
         */
        Thread thread4 = new Thread(new Thread2(),"Runnable Thread");
        thread4.start();

        System.out.println("Main Thread Stops!");
    }
}