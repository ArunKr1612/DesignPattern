package com.corejava.multithreading;

public class MyThread{

    public static void main(String[] args) {

        System.out.println("In main method : "+Thread.currentThread().getName());

        m1();

    }

    static void m1(){

        ThreadDemo t1 = new ThreadDemo();
        t1.run();
        t1.start();

    }
}



class ThreadDemo extends Thread{


    @Override
    public void run() {
        super.run();

        System.out.println("in run method : "+Thread.currentThread().getName());
    }
}