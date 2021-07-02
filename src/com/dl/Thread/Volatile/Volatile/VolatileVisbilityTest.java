package com.dl.Thread.Volatile.Volatile;

/**/
public class VolatileVisbilityTest {
    /**/
    private static  boolean initfalse = false;

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
