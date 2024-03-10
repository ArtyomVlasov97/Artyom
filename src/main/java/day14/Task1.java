package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        File file1 = new File("C:\\Users\\wwwte\\Downloads\\JavaMarathon2021\\JavaMarathon2021\\test.txt");
        printSumDigits(file1);
    }
    public static void printSumDigits(File file) {
        try {
           Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] string = line.split(" ");
            if(string.length !=10){
                throw new IllegalArgumentException();
            }
            int sum=0;
            for(String number: string){
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }

        }
    }
