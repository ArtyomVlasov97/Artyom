package day0;

import java.util.Random;
import java.util.Scanner;

public class Prosto {
    public static void main(String[] args) {
        int[][] a = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
        int sum = 0;
        int ind = 0;
        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }
            if (rowSum >= sum) {
                sum = rowSum;
                ind = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой чисел: " + ind);
    }}