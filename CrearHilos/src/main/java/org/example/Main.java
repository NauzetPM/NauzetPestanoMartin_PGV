package org.example;

public class Main {
    public static void main(String[] args) {
    Coche coche=new Coche("+");
    Coche coche1=new Coche("-");
    Coche coche2=new Coche("/");

    //Thread
    /*
    coche.start();
    coche1.start();
    coche2.start();*/
    //Runeable
        new Thread(coche).start();
        new Thread(coche1).start();
        new Thread(coche2).start();

    }
}