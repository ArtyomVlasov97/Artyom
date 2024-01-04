package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int etazh = scan.nextInt();
       if(etazh >= 1 && etazh<=4) {
           System.out.println("Малоэтажный дом");
       } else if (etazh >= 5 && etazh<=8) {
           System.out.println("Среднеэтажный дом");
       } else if (etazh>=9) {
           System.out.println("Многоэтажный дом");
       } else {
           System.out.println("Ошибка ввода");
       }
    }
}
