package com.ejercicio;

public class SmartWatch extends SmartDevice {

    boolean usaCamara;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String color, int precio, boolean usaCamara) {
        super(marca, modelo, color, precio);
        this.usaCamara = usaCamara;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", usaCamara=" + usaCamara +
                '}';
    }
}
