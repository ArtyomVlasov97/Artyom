package day5;

public class Task1 {
    public static void main(String[] args) {
Car auto = new Car();
auto.setModel("Gas3110");
auto.setColor("Black");
auto.setYearOfRelease(1997);
System.out.println("Ваша модель автомобиля: " + auto.getModel() + ", цвет автомобиля: " + auto.getColor() + ", год релиза: " + auto.getYearOfRelease());
    }
}

