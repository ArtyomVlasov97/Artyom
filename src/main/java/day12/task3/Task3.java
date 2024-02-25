package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("Coldplay",1996));
        list.add(new MusicBand("Imagine Dragons", 2008));
        list.add(new MusicBand("BTS",2013));
        list.add(new MusicBand("Maroon 5",1994));
        list.add(new MusicBand("Muse",1994));
        list.add(new MusicBand("Twenty one pilots",2009));
        list.add(new MusicBand("The Chainsmokers", 2012));
        list.add(new MusicBand("Metallica",1981));
        list.add(new MusicBand("Blackpink", 2016));
        list.add(new MusicBand("Maneskin",2016));
        Collections.shuffle(list);
        //System.out.println(list);
        System.out.println(groupsAfter2000(list));

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for(MusicBand group: bands){
            if(group.getYear()>2000){
                groupsAfter2000.add(group);
            }
        }
        return  groupsAfter2000;
    }
}
