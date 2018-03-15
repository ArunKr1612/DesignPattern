package com.creational.designpattern.singleton;

public class ThreadSafeSingleton {


    private static  ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {
        //TO DO
    }

    public static ThreadSafeSingleton getThreadSafeSingleton(){

        if (threadSafeSingleton == null){

            synchronized (ThreadSafeSingleton.class){

                if (threadSafeSingleton == null) {

                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return  threadSafeSingleton;
    }
}
