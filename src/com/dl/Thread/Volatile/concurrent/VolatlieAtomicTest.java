package com.dl.Thread.Volatile.concurrent;

public class VolatlieAtomicTest {

    public static volatile int num=0;
    public static synchronized void increase(){num++;}

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads=new Thread[10];
        for(int i=0 ;i< threads.length;i++){
            threads[i] =new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i =0; i < 1000 ; i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        for (Thread t : threads){
            t.join();
        }

        System.out.println(num);
    }
}
