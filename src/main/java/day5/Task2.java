package day5;


public class Task2 {
    public static void main(String[] args) {
Motorbike moto = new Motorbike("Yamaha YZF-R1", "Green", "1998");
        System.out.println("Ваша модель мотоцикла: " + moto.getModel() + ", цвет мотоцикла: " + moto.getColor() + ", год релиза: " + moto.getYearOfRelease());
    }
}

class Motorbike {
    private String model;
    private String color;
    private String yearOfRelease;

    public Motorbike(String model, String color, String yearOfRelease) {
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getYearOfRelease() {
        return yearOfRelease;
    }
}