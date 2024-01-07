package day5;


public class Task2 {
    public static void main(String[] args) {
Motorbike moto = new Motorbike("Yamaha YZF-R1", "Green", 1998);
        System.out.println("Ваша модель мотоцикла: " + moto.getModel() + ", цвет мотоцикла: " + moto.getColor() + ", год релиза: " + moto.getYearOfRelease());
    }
}
