package com.corejava.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i=1 ;i<=10 ;i++){

            Runnable runnable = new WorkerThread(" "+i);
            executorService.execute(runnable);

        }

        executorService.shutdown();
        while (!executorService.isTerminated()){

        }

        System.out.println("Finished all Thread..");

    }
}


class WorkerThread implements Runnable{

    private String command;


    public WorkerThread(String command) {
        this.command = command;
    }

    private void processCommand(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"  Start.command : "+command);

        processCommand();

        System.out.println(Thread.currentThread().getName()+"  End.command : "+command);


    }

    @Override
    public String toString() {
        return this.command;
    }
}
