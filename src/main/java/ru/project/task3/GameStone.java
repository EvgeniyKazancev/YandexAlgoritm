package ru.project.task3;

import java.util.Scanner;

public class GameStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String result = canWin(n, m);
        System.out.println(result);
    }

//    public static String fast(int n, int m) {
//        if (n % 2 == 0 && m % 2 == 0) {
//          return   "Lose";
//        } else {
//          return   "Win";
//        }
//    }

//    public static String longes(int n, int m) {
//        String[][] rock = new String[n + 1][m + 1];
//        rock[0][0] = "Lose";
//
//        for (int i = 1; i <= n; i++) {
//            if (rock[i - 1][0].equals("W")) {
//                rock[i][0] = "Lose";
//            } else {
//                rock[i][0] = "Win";
//            }
//
//        }
//
//        for (int j = 1; j <= m; j++) {
//            if (rock[0][j - 1].equals("Win")) {
//                rock[0][j] = "Lose";
//            } else {
//                rock[0][j] = "Win";
//            }
//        }
//
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (rock[i - 1][j - 1].equals("Win") && rock[i][j - 1].equals("Win") && rock[i - 1][j].equals("Win") && rock[i - 1][j - 2].equals("Win")) {
//                    rock[i][j] = "Lose";
//                } else {
//                    rock[i][j] = "Win";
//                }
//            }
//        }
//        return rock[n][m];
//
//    }

    public static String canWin(int n, int m) {

        boolean[][] dp = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {

                if (i >= 1 && !dp[i - 1][j]) {
                    dp[i][j] = true;
                } else if (i >= 2 && !dp[i - 2][j]) {
                    dp[i][j] = true;
                } else if (j >= 1 && !dp[i][j - 1]) { //
                    dp[i][j] = true;
                } else if (j >= 2 && !dp[i][j - 2]) {
                    dp[i][j] = true;
                } else if (i >= 1 && j >= 1 && !dp[i - 1][j - 1]) {
                    dp[i][j] = true;
                } else if (i >= 1 && j >= 2 && !dp[i - 1][j - 2]) {
                    dp[i][j] = true;
                } else if (i >= 2 && j >= 1 && !dp[i - 2][j - 1]) {
                    dp[i][j] = true;
                }
            }
        }
               return dp[n][m] ? "Win" : "Lose";

    }

}