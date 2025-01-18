package ru.project.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        sc.close();
       int count = numberOfIntervals(matrix);
        System.out.println(count);
    }

    public static int numberOfIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[1]));
        int count = 1;
        int lastEnd = intervals[0][1];


        for (int i = 1; i < intervals.length; i++) {
             if (intervals[i][0] > lastEnd) {
                count++;
                lastEnd = intervals[i][1];

            }
        }
        return count;
    }
}
