package com.ejercicio;

public class SmartDevice {

    String marca;
    String modelo;
    String color;
    int precio;

    public SmartDevice (){

    }

    public SmartDevice(String marca, String modelo, String color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public void sonarAlarma(int hora){
        System.out.println("ademas en este reloj configuro la alarma despertador a las : " + hora + " am.");

    }



    }




