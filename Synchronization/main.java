package Synchronization;
import Synchronization.customStack;


public class main {
    public static void main(String[] args) {
        System.out.println("Main starts!");
        // customStack stack = new customStack(5);

        // Thread push = new Thread(new Runnable() {
        //     public void run() {
        //         for (int i = 0; i < 10; i++)
        //             stack.push(100);
        //     }
        // }, "push");
        // push.start();

        // Thread pop = new Thread(new Runnable() {
        //     public void run() {
        //         for (int i = 0; i < 10; i++)
        //             stack.pop();
        //     }
        // }, "pop");
        // pop.start();



        //volatile keyword:
        

        Thread t1 = new Thread(new Runnable() {
            public void run(){
                singleton x = singleton.createObj();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
                singleton x = singleton.createObj();
            }
        });

        t1.start();
        t2.start();
        System.out.println("Main ends!");
    }
}
