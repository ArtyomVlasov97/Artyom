package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] masiv = new int[12][8];
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv[i].length; j++) {
                masiv[i][j] = (int) (Math.random() * 50);
            }
        }
            int index = 0;
            int sum = 0;
            for(int i = 0; i <masiv.length; i++) {
                int sum1 = 0;
                for (int j = 0; j < masiv[i].length; j++) {
                    sum1 = sum1 + masiv[i][j];
                    }
                if (sum1>=sum) {
                    sum = sum + sum1;
                    index = index + i;
                }
                }
            System.out.println(index);
            }
        }


