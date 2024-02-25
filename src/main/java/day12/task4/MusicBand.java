package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;
    public MusicBand(String name, int year, List <String> bands){
        this.name=name;
        this.year = year;
        this.members=bands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> bands) {
        this.members = bands;
    }
    public static void transferMembers(MusicBand group1,MusicBand group2){
        for(String group: group1.getMembers()){
            group2.getMembers().add(group);
        }
        group1.getMembers().clear();
    }
    public void printMembers(){
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
