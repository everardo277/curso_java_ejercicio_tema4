package com.ejercicio;

public class Main {

    public static void main(String[] args) {
        SmartPhone telefonoRedmi = new SmartPhone("Xiaomi","note 11", "gris", 300);
        System.out.println("Estas son las caracterisiticas de mi teléfono movil: ");
        System.out.println(telefonoRedmi.toString());
         telefonoRedmi = new SmartPhone(15.5);
        System.out.println("ademas mi  telefono mide :" + telefonoRedmi.large +  " centimetros de largo");

        SmartWatch relojInteligente = new SmartWatch("Samsung","Galaxy Watch 3", "Negro",250,false);
        System.out.println("Estas son las caracterisiticas de mi reloj inteligente: ");
        System.out.println(relojInteligente.toString());
        relojInteligente.sonarAlarma(5);


    }
}
