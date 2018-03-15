
package com.creational.designpattern.bilder;


public class Computer {

    //Required parameters.
    private String RAM;
    private String HDD;

    //Optional parameters.
    private boolean isGraphicsCardEnable;
    private boolean isBluetoothEnable;


    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public boolean isGraphicsCardEnable() {
        return isGraphicsCardEnable;
    }

    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }

    private Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.isGraphicsCardEnable = builder.isGraphicsCardEnable;
        this.isBluetoothEnable = builder.isBluetoothEnable;
    }

    //Creating Builder class

    public static class ComputerBuilder{

        //Required parameters.
        private String RAM;
        private String HDD;

        //Optional parameters.
        private boolean isGraphicsCardEnable;
        private boolean isBluetoothEnable;

        public ComputerBuilder(String RAM, String HDD) {
            this.RAM = RAM;
            this.HDD = HDD;
        }

        //for optional parameters we have to create setter method.


        public ComputerBuilder setGraphicsCardEnable(boolean isGraphicsCardEnable) {
            this.isGraphicsCardEnable = isGraphicsCardEnable;
            return  this;
        }

        public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable) {
            this.isBluetoothEnable = isBluetoothEnable;
            return this;
        }

        public Computer build(){

            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", isGraphicsCardEnable=" + isGraphicsCardEnable +
                ", isBluetoothEnable=" + isBluetoothEnable +
                '}';
    }
}





