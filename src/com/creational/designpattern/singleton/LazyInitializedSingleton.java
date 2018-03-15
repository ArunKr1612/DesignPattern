package com.creational.designpattern.singleton;

public class LazyInitializedSingleton {


    private static LazyInitializedSingleton initializedSingleton ;

    private LazyInitializedSingleton() {
        //TO DO
    }

    public static LazyInitializedSingleton getInitializedSingleton(){

        if (initializedSingleton == null){

            initializedSingleton = new LazyInitializedSingleton();

        }
        return  initializedSingleton;
    }
}
