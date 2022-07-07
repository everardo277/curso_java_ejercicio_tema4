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
        System.out.println("la alarma suena a las : " + hora + " am.");

    }


    public class SmartPhone extends SmartDevice{
        double large;

        public SmartPhone(){

        }

        public SmartPhone(String marca, String modelo, String color, int precio){
            super();
        }

        public SmartPhone(double large) {
            this.large = large;
        }


    }

    public class SmartWatch extends SmartDevice{
        boolean usaCamara;
        public SmartWatch() {
        }

        public SmartWatch(boolean usaCamara) {
            this.usaCamara = usaCamara;
        }
    }

}


