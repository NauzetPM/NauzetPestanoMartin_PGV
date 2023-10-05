package org.example;

public class Fibonacci implements Runnable{
    private int n;
    public Fibonacci(int n) {
        this.n=n;
    }

    @Override
    public void run() {
        int num1=1;
        int num2=1;
        for (int i = 0; i <= n; i++) {
            int aux=num1+num2;;
            num1=num2;
            num2=aux;
            System.out.println(num1);
        }
    }
}
