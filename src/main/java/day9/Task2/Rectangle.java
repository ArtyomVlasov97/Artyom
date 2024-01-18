package day9.Task2;

public class Rectangle extends Figure {
    private double length;
    private double width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length*width;
    }
    public  double perimeter(){
        return (length+width)*2;
    }
}
