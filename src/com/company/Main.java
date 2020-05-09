package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        for (int i = a; i > 0; i--) {
            for (int j = i; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println("  ");
        }

    }
}
