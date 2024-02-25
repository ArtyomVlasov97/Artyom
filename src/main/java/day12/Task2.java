package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
List<Integer> numbers = new ArrayList<>();
fromTo(0,30,numbers);
        fromTo(300,350,numbers);
        System.out.println(numbers);
    }
    public static void fromTo(int a, int b, List<Integer> numbers){
        for(int i = a; i<b; i++){
            numbers.add(i);
        }
    }
}
