package day6;

public class Task1 {
    public static void main(String[] args) {
Car auto = new Car();
auto.info();
auto.setYearOfRelease(1997);
System.out.println(auto.yearDifference(1900));
Motorbike bike = new Motorbike("Yamaha YZF-R1", "Green", 1998);
bike.info();
System.out.println(bike.yearDifference(2023));
    }
}
