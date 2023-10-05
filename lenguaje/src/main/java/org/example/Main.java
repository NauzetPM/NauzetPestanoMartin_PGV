package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String cadenaOrdenes=sc.nextLine();
        String arrayOrdenes[]=cadenaOrdenes.split(" ");
        int numeroDeRepeticiones=Integer.parseInt(arrayOrdenes[0]);//pillar numero pasado
        String rutaFichero=arrayOrdenes[1];//pillar la ruta pasada

        File archivo =new File(rutaFichero);
        for (int i = 0; i < numeroDeRepeticiones; i++) {
            try {
                RandomAccessFile raf= new RandomAccessFile(archivo,"rwd");
                FileLock bloqueo = raf.getChannel().lock();
                boolean seguir=true;
                String cadena="";
                while(seguir){
                    int elegirMinusculaMayuscula=(int)(Math.floor(Math.random()*1));
                    char caracter;
                    if(elegirMinusculaMayuscula==1){
                        caracter= (char) ((char)Math.random()*'z'+'a');
                    }else{
                        caracter= (char) ((char)Math.random()*'Z'+'A');
                    }
                    cadena+=caracter;
                    int continuar=(int)(Math.floor(Math.random()*1));
                    if(continuar==1){
                        seguir=false;
                    }
                }
                raf.writeChars(cadena);
                bloqueo.release();
                bloqueo=null;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }
}