package org.example;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci(10);
        new Thread(fibonacci).start();
    }
}