package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfRelease;
    void info () {
        System.out.println("Это автомобиль");
    }
 int yearDifference(int inputYear) {
        int year = Math.abs(inputYear - yearOfRelease);
        return year;
 }
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
    public void setYearOfRelease(int carYearOfRelease) {
        yearOfRelease = carYearOfRelease;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
