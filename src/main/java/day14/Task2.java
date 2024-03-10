package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\wwwte\\Downloads\\JavaMarathon2021\\JavaMarathon2021\\people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String name = scanner.nextLine();
                String[] nameAge = name.split(" ");
                if(Integer.parseInt(nameAge[1])<0){
                    throw new IllegalArgumentException();
                } else {
                    list.add(name);
                }
            }
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
