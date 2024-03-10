package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> person = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String name = scanner.nextLine();
                String[] nameAge = name.split(" ");
                if(Integer.parseInt(nameAge[1])<0){
                    throw new IllegalArgumentException();
                } else {
                    Person polo = new Person(nameAge[0], Integer.parseInt(nameAge[1]));
                    person.add(polo);
                }
            }
            return person;
        } catch (FileNotFoundException e) {
        System.out.println("Файл не найден");
    } catch (IllegalArgumentException e) {
        System.out.println("Некорректный входной файл");
    }
        return null;
        }
    }
