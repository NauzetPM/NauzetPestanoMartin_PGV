package org.example;

public class Main {
    public static void main(String[] args) {


        Coche coche=new Coche("A1");
        Coche coche1=new Coche("A2");
        Coche coche2=new Coche("A3");
        Coche coche3=new Coche("A4");
        Coche coche4=new Coche("A5");
        new Thread(coche).start();
        new Thread(coche1).start();
        new Thread(coche2).start();
        new Thread(coche3).start();
        new Thread(coche4).start();


    }
}