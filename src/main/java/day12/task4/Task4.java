package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
List<String> name1 = new ArrayList<>();
        name1.add("John John");
        name1.add("Poul Poul");
        name1.add("Loki Loki");
        MusicBand group1 = new MusicBand("Maroon 5",1994, name1);
        List<String> name2 = new ArrayList<>();
        name2.add("Ko Ko");
        name2.add("Na Na");
        name2.add("Mo Mo");
        MusicBand group2 = new MusicBand("Twenty one pilots",2009, name2);
        group1.printMembers();
        group2.printMembers();
        MusicBand.transferMembers(group1,group2);
        group1.printMembers();
        group2.printMembers();
    }
}
