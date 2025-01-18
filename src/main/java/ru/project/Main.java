package ru.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();


        int result = combination(n + k - 1, k);
        System.out.println(result);

    }

    public static int combination(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }


    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;

    }
}