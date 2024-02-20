package Inheritance;

public class Circle extends Shape{
    private double radius=6;
    public double getPerimeter(){

        return 2*3.14*radius;
    }
    public double getArea(){

        return 3.14*radius*radius;
    }
}
