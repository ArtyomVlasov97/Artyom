package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        while (true) {
            if(b==0) {
                break;
            }
            System.out.println(a/b);
            a = scan.nextDouble();
            b = scan.nextDouble();
        }
    }
}

