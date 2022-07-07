package com.ejercicio;

public class SmartPhone extends SmartDevice {

    double large;

    public SmartPhone(){

    }

    public SmartPhone(String marca, String modelo, String color, int precio){

        super(marca, modelo, color, precio);

    }

    public SmartPhone(double large) {
        this.large = large;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
