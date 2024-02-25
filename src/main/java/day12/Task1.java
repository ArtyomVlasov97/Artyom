package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
List<String> auto = new ArrayList<>();
auto.add("BMW");
auto.add("Audi");
auto.add("Renault");
auto.add("Mercedes");
auto.add("Range Rover");
for(String allAuto: auto){
    System.out.println(allAuto);
}
auto.add(3,"VAZ");
auto.remove(0);
        for(String allAuto: auto){
            System.out.println(allAuto);
        }
    }
}
