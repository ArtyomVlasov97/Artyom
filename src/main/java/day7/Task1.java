package day7;

public class Task1 {
    public static void main(String[] args) {
    Airplane boeing = new Airplane("LOKOL", 2010, 63, 55000);
    Airplane plane = new Airplane("ВАСО", 2023, 55, 21000);
Airplane.compareAirplanes(boeing, plane);
    }
}