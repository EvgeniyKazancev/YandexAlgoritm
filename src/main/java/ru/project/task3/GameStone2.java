package ru.project.task3;

import java.util.Scanner;

public class GameStone2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        GameStone2 gs = new GameStone2();
        gs.winAndLose(n,m);

    }
    public void winAndLose(int n, int m) {
        if (n==0 || m==0) {
            System.out.println("Lose");
        }
        if ((Math.abs(n-m)) % 3 == 0) {
            System.out.println("Lose");
        }else {
            System.out.println("Win");
        }
    }
}