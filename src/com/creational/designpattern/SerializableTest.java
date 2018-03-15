package com.creational.designpattern;

import com.creational.designpattern.singleton.SerializableSingleton;

import java.io.*;

public class SerializableTest {


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializableSingleton instanceOne = SerializableSingleton.getSerializableSingleton();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("D:\\dev\\Microservices\\CoreJavaPOC\\filename.txt"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "D:\\dev\\Microservices\\CoreJavaPOC\\filename.txt"));
        SerializableSingleton instanceTwo = (SerializableSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());





    }
}
