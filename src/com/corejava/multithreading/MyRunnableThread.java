package com.corejava.multithreading;

public class MyRunnableThread {


    public static void main(String[] args) {


        System.out.println("In Main method : "+Thread.currentThread().getName());
        m2();

    }

    static void m2(){

        RunnableThread runnable = new RunnableThread();
        Thread thread = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        thread.start();
        t1.start();
    }
}


class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("In run method : "+Thread.currentThread().getName());
        for (int i=0;i<4 ;i++){

            System.out.println(Thread.currentThread().getName());
        }
    }
}