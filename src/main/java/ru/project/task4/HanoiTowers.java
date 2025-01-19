package ru.project.task4;

import java.util.Scanner;

public class HanoiTowers {

    public static void main(String[] args) {

        HanoiTowers hn = new HanoiTowers();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int) Math.pow(2,n) - 1);
        hn.hanoiTower(n, 1, 3);

    }

    public void hanoiTower(int n, int from, int to) {


        if (n == 1) {
            System.out.println(from + " " + to);
            return;
        }
        if (n > 1) {
            int unusedPeg = 6 - from - to;
            hanoiTower(n - 1, from, unusedPeg);
            System.out.println(from + " " + to);
            hanoiTower(n - 1, unusedPeg, to);

        }

    }
}
