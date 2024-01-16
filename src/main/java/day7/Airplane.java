package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    public static void compareAirplanes(Airplane a, Airplane b) {
        if(a.length>b.length) {
            System.out.println("Самолет 1 длинее");
        } else if (a.length< b.length){
            System.out.println("Самолет 2 длинее");
        } else {
            System.out.println("Самолеты одинаковой длины");
        }
    }
    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: "+ length + ", вес: "+ weight + ", количество топлива в баке: " + fuel);
    }

    void fillUp (int up) {
        this.fuel +=up;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    int getFuel() {
        return fuel;
    }
}