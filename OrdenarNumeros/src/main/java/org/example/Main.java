package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            integers.add(Integer.parseInt(sc.nextLine()));
        }
        Collections.sort(integers);

        System.out.println(integers);
    }
}