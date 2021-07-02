package com.dl.Thread.Volatile.Volatile;

/**/
public class VolatileVisbility {
    /*加了volatile*/
    //保证多个线程修改同一个共享变量能够感知
    private static volatile boolean initfalse = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("waiting data ...");
                while(!initfalse){

                }
                System.out.println("============success");
            }
        }).start();

        Thread.sleep(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                preparedate();
            }
        }).start();

    }

    public static void preparedate(){
        System.out.println("prepareing data ...");
        initfalse=true;
        System.out.println("prepareing data end...");
    }
}
