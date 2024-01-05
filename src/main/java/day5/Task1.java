package day5;

public class Task1 {
    public static void main(String[] args) {
Car auto = new Car();
auto.setModel("Gas3110");
auto.setColor("Black");
auto.setYearOfRelease("1997");
System.out.println("Ваша модель автомобиля: " + auto.getModel() + ", цвет автомобиля: " + auto.getColor() + ", год релиза: " + auto.getYearOfRelease());
    }
}
class Car {
    private String model;
    private String color;
    private String yearOfRelease;

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }
    public void setYearOfRelease(String carYearOfRelease) {
        yearOfRelease = carYearOfRelease;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }
}
