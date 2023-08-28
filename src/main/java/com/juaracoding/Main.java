package com.juaracoding;

public class Main {
    public static void main(String[] args) {


        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("BIZZBUZZ");
            } else if (num % 3 == 0) {
                System.out.println("BIZZ");
            } else if (num % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(num);
            }

        }

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 9; j++) {
                if (j % 2 == 1) {
                    System.out.print(j);
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}

