package com.creational.designpattern;

import com.creational.designpattern.singleton.EagerInitializedSingleton;

public class TestMain {


    public static void main(String[] args) {

       EagerInitializedSingleton instance1 =  EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 =  EagerInitializedSingleton.getInstance();

        System.out.println("instance1 Hashcode = [" + instance1.hashCode() + "]");
        System.out.println("instance2 Hashcode = [" + instance2.hashCode() + "]");

    }
}
