package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> list1 = new ArrayList<>();
        list1.add(new MusicArtist("Адам Левин",1979));
        list1.add(new MusicArtist("Джесси Кармайкл",1979));
        list1.add(new MusicArtist("Микки Мэдден",1979));
        MusicBand band1 = new MusicBand("Maroon 5",1994,list1);
        List<MusicArtist> list2 = new ArrayList<>();
        list2.add(new MusicArtist("Тайлер Джозеф",1988));
        list2.add(new MusicArtist("Джош Дан",1988));
        MusicBand band2 = new MusicBand("Twenty one pilots",2009,list2);
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();

    }
}
