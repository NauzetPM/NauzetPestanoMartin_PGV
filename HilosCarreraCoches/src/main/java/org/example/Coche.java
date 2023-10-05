package org.example;

import static java.lang.Thread.*;

public class Coche implements Runnable{
    public String nombre;
    private static boolean primero=false;
    public Coche(String nombre) {
        this.nombre=nombre;

    }

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            int esperar= (int) (Math.round(Math.random()));
            if(esperar==0){
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(!primero){
                primero=true;
                System.out.println("Gana El hilo es:"+currentThread()+"coche:"+nombre);
            }
            //System.out.println("El hilo es:"+currentThread()+"coche:"+nombre+"va por:" +i);
        }

    }
}
