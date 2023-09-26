package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //abrirPorcesoDarOrden("cat","/home/dam2/Escritorio/Prueba//PRUEBAS.txt");
        abrirPorcesoDarOrden("ping","www.Google.com");
        //abrirProceso("xfce4-terminal");
        //abrirProceso("ifconfig");

    }
    public static void abrirProceso(String programa){
        ProcessBuilder processBuilder = new ProcessBuilder(programa);

        try {
            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process= processBuilder.start();
            process.waitFor();
            System.out.println("Fin del proceso");
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al lanzar el proceso");
            e.printStackTrace();
        }
    }
    public static void abrirPorcesoDarOrden(String programa,String orden){
        ProcessBuilder processBuilder = new ProcessBuilder(programa,orden);
        try {
            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process= processBuilder.start();
            process.waitFor();
            System.out.println("Fin del proceso");
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al lanzar el proceso");
            e.printStackTrace();
        }
    }
}