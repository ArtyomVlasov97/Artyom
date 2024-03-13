package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
File file1 = new File("C:\\Users\\wwwte\\Downloads\\JavaMarathon2021\\JavaMarathon2021\\test2.txt");
printResult(file1);
    }
    public static void printResult(File file){
        try (Scanner scaner = new Scanner(file)) {
            if(file.length()==0){
                throw new NullPointerException();
            }
            String[] number = scaner.nextLine().split(" ");
            int sum = 0;
            for(String all: number){
                sum+=Integer.parseInt(all);
            }
            float arithmeticMean = (float) sum/number.length;
            System.out.printf(arithmeticMean + "---> %.3f",arithmeticMean);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        } catch (NullPointerException e){
            System.out.println("Файл пуст");
        }

    }
}

