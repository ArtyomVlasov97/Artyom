package day6;

public class Task2 {
    public static void main(String[] args) {
Airplane plane = new Airplane("ВАСО", 2023, 55, 21000);
plane.setYear(2020);
plane.setLength(65);
plane.fillUp(13500);
plane.fillUp(13000);
plane.info();
    }
}
