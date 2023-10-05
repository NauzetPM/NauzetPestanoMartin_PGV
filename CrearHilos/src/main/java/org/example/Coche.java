package org.example;

/*public class Coche extends Thread{
    private String symbol;

    public Coche(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(symbol);
        }
    }

}*/
public class Coche implements Runnable{
    private String symbol;

    public Coche(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(symbol);
        }
    }

}