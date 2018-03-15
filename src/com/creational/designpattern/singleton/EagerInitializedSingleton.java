package com.creational.designpattern.singleton;

public class EagerInitializedSingleton {

    private static  EagerInitializedSingleton instance = null;

    static {

        instance = new EagerInitializedSingleton();
    }

    /*private EagerInitializedSingleton() {
        // TO DO
    }*/

    public static EagerInitializedSingleton getInstance(){

        return instance;
    }
}
