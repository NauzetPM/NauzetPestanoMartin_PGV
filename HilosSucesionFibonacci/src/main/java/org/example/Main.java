package org.example;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci(10);

        //Runnabbe

        /*new Thread(fibonacci).start();*/

        //Thread
        fibonacci.start();

    }
}