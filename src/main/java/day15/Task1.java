package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
File file = new File ("C:\\Users\\wwwte\\Downloads\\JavaMarathon2021\\JavaMarathon2021\\src\\" +
        "main\\resources\\shoes.csv");
        File file1 = new File("C:\\Users\\wwwte\\Downloads\\JavaMarathon2021\\JavaMarathon2021\\" +
                "src\\main\\resources\\missing_shoes.txt");
        list(file, file1);
    }
    public static void list (File file, File file1) {
        try {
            PrintWriter writer = new PrintWriter(file1);
            Scanner scanner = new Scanner(file);
            if(file.length() == 0) {
                throw new NullPointerException();
            }
            while(scanner.hasNextLine()) {
                String list = scanner.nextLine();
                String[] line = list.split(";");
                if (line.length != 3) {
                    throw new IllegalArgumentException();
                }
                if (Integer.parseInt(line[2]) == 0) {
                    writer.println(line[0] + "; " + line[1] + "; " + line[2]);
                }
            }
            writer.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Файл не соответствует");
        } catch (NullPointerException e){
            System.out.println("Файл пустой");
        }
    }
}
