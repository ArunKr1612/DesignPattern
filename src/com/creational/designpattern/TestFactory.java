package com.creational.designpattern;

import com.creational.designpattern.factory.Computer;
import com.creational.designpattern.factory.ComputerFactory;

public class TestFactory {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("pc","4GB","1TB","i7Intel");

        Computer server = ComputerFactory.getComputer("server","64GB","256TB","Cenitron");

        System.out.println("pc config : "+pc.toString());

        System.out.println("server config : "+server.toString());
    }
}

