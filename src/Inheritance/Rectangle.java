package Inheritance;

public class Rectangle extends Shape{
    private double length=6;
    private double width=6;
    public double getPerimeter(){

        return 2*(length+width);
    }
    public double getArea(){

        return length*width;
    }
}
