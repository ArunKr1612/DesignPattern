package com.creational.designpattern.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{


    private static SerializableSingleton serializableSingleton;

    private SerializableSingleton() {
        // TODO
    }

    public static SerializableSingleton getSerializableSingleton(){
        serializableSingleton = new SerializableSingleton();

        return  serializableSingleton;
    }

    protected Object readResolve(){

        return  serializableSingleton;
    }
}
