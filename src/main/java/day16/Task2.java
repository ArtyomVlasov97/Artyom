package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
File file1 = new File("C:\\Users\\wwwte\\Downloads\\JavaMarathon2021\\JavaMarathon2021\\file1.txt");
File file2 = new File("C:\\Users\\wwwte\\Downloads\\JavaMarathon2021\\JavaMarathon2021\\file2.txt");
printResult(file2);
        try {
            PrintWriter writer1 = new PrintWriter(file1);
            Random random = new Random();
            for(int i = 0; i < 1000; i++){
                writer1.print(random.nextInt(100) + " ");
            }
       writer1.close();

            Scanner scanner = new Scanner(file1);
            PrintWriter writer2 = new PrintWriter(file2);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] str = line.split(" ");
                int index = 0;
                for (int i = 0; i < 50; i++){
                    int sum = 0;
                    for (int j = index; j<index+20; j++){
                        sum+=Integer.parseInt(str[j]);
                    }
                    float arithmeticMean = (float)sum/20;
                    writer2.println(arithmeticMean + " ");
                    index+=20;
                }
            }
            writer2.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл отсутствует");
        }
    }
    public static void printResult(File file){
        try (Scanner scanner = new Scanner(file)){
            float sum = 0;
            while (scanner.hasNextLine()) {
                sum += Float.parseFloat(scanner.nextLine());
                }
            System.out.println((int)sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл отсутствует");
        }
    }
}
